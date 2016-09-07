/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Clase.Municipio;
import Factory.ConnectionDb;
import Factory.FactoryConnectionDb;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alucard
 */
public class MMunicipioImpl implements MMunicipio {

    ConnectionDb conn;

    @Override
    public List<Municipio> list() {

        this.conn = FactoryConnectionDb.open(FactoryConnectionDb.PGSQL);
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM  direccion.municipio");
        List<Municipio> list = new ArrayList<Municipio>();
        try {
            ResultSet rs = this.conn.query(sql.toString());
            while (rs.next()) {
                Municipio municipio = new Municipio();
                municipio.setIdmunicipio(rs.getInt("idmunicipio"));
                municipio.setMunicipio(rs.getString("municipio"));
                municipio.setIdprovincia(rs.getInt("idprovincia_provincia"));

                list.add(municipio);
            }

        } catch (Exception e) {
        } finally {
            this.conn.close();
        }
        return list;
    }


    @Override
    public boolean save(Municipio municipio) {
        this.conn = FactoryConnectionDb.open(FactoryConnectionDb.PGSQL);
        boolean save = false;
        try {
            if (municipio.getIdmunicipio()== 0) {//nuevo
                StringBuilder sql = new StringBuilder();
                sql.append("INSERT INTO  direccion.municipio (municipio,idprovincia_provincia) VALUES('").append(municipio.getMunicipio());
                sql.append("', ").append(municipio.getIdprovincia()).append(")");
                this.conn.execute(sql.toString());

            } else {//actualizar
                StringBuilder sql = new StringBuilder();
                sql.append("UPDATE direccion.municipio set municipio = ").append(municipio.getMunicipio());
                sql.append(", idprovincia_provincia= '").append(municipio.getIdprovincia());
                sql.append("',WHERE idmunicipio = ").append(municipio.getIdmunicipio());
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
    public boolean delete(int idmunicipio) {
        this.conn = FactoryConnectionDb.open(FactoryConnectionDb.PGSQL);
        boolean delete = false;

        try {
            StringBuilder sql = new StringBuilder();
            sql.append("DELETE FROM direccion.municipio WHERE idmunicipio = ").append(idmunicipio);
            this.conn.execute(sql.toString());

        } catch (Exception e) {
        } finally {
            this.conn.close();

        }
        return delete;
    }

    @Override
    public Municipio search(String municipio) {
        this.conn = FactoryConnectionDb.open(FactoryConnectionDb.PGSQL);
        Municipio r = new Municipio();
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT m.municipio,p.provincia from direccion.provincia as p,direccion.municipio as m WHERE p.idprovincia= m.idprovincia_provincia and m.municipio like \n" +
" '").append(municipio).append("%';");
        try {
            ResultSet rs = this.conn.query(sql.toString());
            while (rs.next()) {

                r.setMunicipio(rs.getString("municipio"));
                r.setProvincia(rs.getString("provincia"));
            }
        } catch (Exception e) {
        } finally {
            this.conn.close();
        }
        return r;
    }    

}
