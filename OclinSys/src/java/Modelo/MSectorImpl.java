/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Clase.Sector;
import Factory.ConnectionDb;
import Factory.FactoryConnectionDb;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tatiana Montilla
 */
public class MSectorImpl implements MSector {

    ConnectionDb conn;

    @Override
    public List<Sector> list() {
        this.conn = FactoryConnectionDb.open(FactoryConnectionDb.PGSQL);
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM  direccion.sector");
        List<Sector> list = new ArrayList<Sector>();
        try {
            ResultSet rs = this.conn.query(sql.toString());
            while (rs.next()) {
                Sector sector = new Sector();
                sector.setIdsector(rs.getInt("idsector"));
                sector.setSector(rs.getString("secor"));
                sector.setIdmunicipio(rs.getInt("idmunicipio_municipio"));

                list.add(sector);
            }

        } catch (Exception e) {
        } finally {
            this.conn.close();
        }
        return list;
    }

    @Override
    public boolean save(Sector sector) {
        this.conn = FactoryConnectionDb.open(FactoryConnectionDb.PGSQL);
        boolean save = false;
        try {
            if (sector.getIdsector() == 0) {//nuevo
                StringBuilder sql = new StringBuilder();
                sql.append("INSERT INTO  direccion.sector (sector,idmunicipio_municipio) VALUES('").append(sector.getSector());
                sql.append("', ").append(sector.getIdmunicipio()).append(")");
                this.conn.execute(sql.toString());

            } else {//actualizar
                StringBuilder sql = new StringBuilder();
                sql.append("UPDATE direccion.sector set sector = ").append(sector.getSector());
                sql.append(", idmunicipio_municipio= '").append(sector.getIdmunicipio());
                sql.append("',WHERE idmunicipio = ").append(sector.getIdsector());
                this.conn.execute(sql.toString());
            }
            save = true;
        } catch (Exception e) {
        } finally {
            this.conn.close();
        }
        return save;
    }

    @Override
    public boolean delete(int idsector) {
        this.conn = FactoryConnectionDb.open(FactoryConnectionDb.PGSQL);
        boolean delete = false;

        try {
            StringBuilder sql = new StringBuilder();
            sql.append("DELETE FROM direccion.sector WHERE idsector = ").append(idsector);
            this.conn.execute(sql.toString());

        } catch (Exception e) {
        } finally {
            this.conn.close();

        }
        return delete;
    }

    @Override
    public Sector search(String secor) {
     this.conn = FactoryConnectionDb.open(FactoryConnectionDb.PGSQL);
        Sector r = new Sector();
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT s.secor,m.municipio from direccion.sector as s,direccion.municipio as m WHERE s.idmunicipio_municipio= m.idmunicipio and s.secor like \n" +
" '").append(secor).append("%';");
        try {
            ResultSet rs = this.conn.query(sql.toString());
            while (rs.next()) {

                r.setMunicipio(rs.getString("municipio"));
                r.setSector(rs.getString("secor"));
            }
        } catch (Exception e) {
        } finally {
            this.conn.close();
        }
        return r;
    }       }



