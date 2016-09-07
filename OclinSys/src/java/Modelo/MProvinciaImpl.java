/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Clase.Provincia;
import Factory.ConnectionDb;
import Factory.FactoryConnectionDb;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alucard
 */
public class MProvinciaImpl implements MProvincia {

    ConnectionDb conn;

    @Override
    public List<Provincia> list() {

        this.conn = FactoryConnectionDb.open(FactoryConnectionDb.PGSQL);
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM  direccion.provincia");
        List<Provincia> list = new ArrayList<Provincia>();
        try {
            ResultSet rs = this.conn.query(sql.toString());
            while (rs.next()) {
                Provincia provincia = new Provincia();
                provincia.setIdprovincia(rs.getInt("idprovincia"));
                provincia.setProvincia(rs.getString("provincia"));
                provincia.setIdregion(rs.getInt("idregion_region"));

                list.add(provincia);
            }

        } catch (Exception e) {
        } finally {
            this.conn.close();
        }
        return list;
    }

    @Override
    public boolean save(Provincia provincia) {
        this.conn = FactoryConnectionDb.open(FactoryConnectionDb.PGSQL);
        boolean save = false;
        try {
            if (provincia.getIdprovincia() == 0) {//nuevo
                StringBuilder sql = new StringBuilder();
                sql.append("INSERT INTO  direccion.provincia (provincia,idregion_region) VALUES('").append(provincia.getProvincia());
                sql.append("', ").append(provincia.getIdregion()).append(")");
                this.conn.execute(sql.toString());

            } else {//actualizar
                StringBuilder sql = new StringBuilder();
                sql.append("UPDATE direccion.provincia set provincia = ").append(provincia.getProvincia());
                sql.append(", idregion_region= '").append(provincia.getIdregion());
                sql.append("',WHERE idregion = ").append(provincia.getIdprovincia());
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
    public boolean delete(int idprovincia) {
        this.conn = FactoryConnectionDb.open(FactoryConnectionDb.PGSQL);
        boolean delete = false;

        try {
            StringBuilder sql = new StringBuilder();
            sql.append("DELETE FROM direccion.provincia WHERE idprovincia = ").append(idprovincia);
            this.conn.execute(sql.toString());

        } catch (Exception e) {
        } finally {
            this.conn.close();

        }
        return delete;

    }

    @Override
    public Provincia search(String provincia) {
        this.conn = FactoryConnectionDb.open(FactoryConnectionDb.PGSQL);
        Provincia r = new Provincia();
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT r.region,p.pais from direccion.pais as p,direccion.region as r WHERE r.idpais_pais= p.idpais and r.region like '").append(provincia).append("%';");
        try {
            ResultSet rs = this.conn.query(sql.toString());
            while (rs.next()) {

                r.setPais(rs.getString("pais"));
                r.setProvincia(rs.getString("provincia"));
            }
        } catch (Exception e) {
        } finally {
            this.conn.close();
        }
        return r;
    }
}


