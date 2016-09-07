/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Clase.Descuento;
import Factory.ConnectionDb;
import Factory.FactoryConnectionDb;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tatiana Montilla
 */
public class MDescuentoImpl implements MDescuento {

    ConnectionDb conn;

    @Override
    public List<Descuento> list() {
        this.conn = FactoryConnectionDb.open(FactoryConnectionDb.PGSQL);
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM  articulo.descuento");
        List<Descuento> list = new ArrayList<Descuento>();
        try {
            ResultSet rs = this.conn.query(sql.toString());
            while (rs.next()) {
                Descuento descuento = new Descuento();
                descuento.setIddescuento(rs.getInt("iddescuento"));
                descuento.setDescuento(rs.getInt("descuento"));
                // descuento.setIdprovincia(rs.getInt("idprovincia_provincia"));

                list.add(descuento);
            }

        } catch (Exception e) {
        } finally {
            this.conn.close();
        }
        return list;
    }

    @Override
    public boolean save(Descuento descuento) {
         this.conn = FactoryConnectionDb.open(FactoryConnectionDb.PGSQL);
        boolean save = false;
        try {
            if (descuento.getIddescuento()== 0) {//nuevo
                StringBuilder sql = new StringBuilder();
                sql.append("INSERT INTO articulo.descuento(descuento)VALUES ('").append(descuento.getDescuento()).append(")");
                //sql.append("INSERT INTO  articulo.descuento (descuento) VALUES('").append(descuento.getDescuento()).append(")");
                this.conn.execute(sql.toString());

            } else {//actualizar
                StringBuilder sql = new StringBuilder();
                sql.append("UPDATE articulo.descuento set descuento = ").append(descuento.getDescuento());
                //sql.append(", idprovincia_provincia= '").append(descuento.getIddescuento());
                sql.append("',WHERE iddescuento = ").append(descuento.getIddescuento());
                this.conn.execute(sql.toString());
            }
            save = true;
        } catch (Exception e) {
        } finally {
            this.conn.close();
        }
        return save;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int iddescuento) {
        this.conn = FactoryConnectionDb.open(FactoryConnectionDb.PGSQL);
        boolean delete = false;

        try {
            StringBuilder sql = new StringBuilder();
            sql.append("DELETE FROM articulo.descuento WHERE iddescuento = ").append(iddescuento);
            this.conn.execute(sql.toString());

        } catch (Exception e) {
        } finally {
            this.conn.close();

        }
        return delete;
    }
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    @Override
    public Descuento search(String descuento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }


