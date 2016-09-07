/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Clase.Calle;
import Factory.ConnectionDb;
import Factory.FactoryConnectionDb;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tatiana Montilla
 */
public class MCalleImpl implements MCalle{

    ConnectionDb conn;
    
    @Override
    public List<Calle> list() {
 this.conn = FactoryConnectionDb.open(FactoryConnectionDb.PGSQL);
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM  direccion.calle");
        List<Calle> list = new ArrayList<Calle>();
        try {
            ResultSet rs = this.conn.query(sql.toString());
            while (rs.next()) {
                Calle calle = new Calle();
                calle.setIdcalle(rs.getInt("idsector"));
                calle.setCalle(rs.getString("sector"));
                calle.setIdsector(rs.getInt("idsector_sector"));

                list.add(calle);
            }

        } catch (Exception e) {
        } finally {
            this.conn.close();
        }
        return list;
    }

    @Override
    public boolean save(Calle calle) {
       this.conn = FactoryConnectionDb.open(FactoryConnectionDb.PGSQL);
        boolean save = false;
        try {
            if (calle.getIdcalle()== 0) {//nuevo
                StringBuilder sql = new StringBuilder();
                sql.append("INSERT INTO  direccion.calle (calle,idcalle_calle) VALUES('").append(calle.getCalle());
                sql.append("', ").append(calle.getIdsector()).append(")");
                this.conn.execute(sql.toString());

            } else {//actualizar
                StringBuilder sql = new StringBuilder();
                sql.append("UPDATE direccion.calle set calle = ").append(calle.getCalle());
                sql.append(", idsector_sector= '").append(calle.getIdsector());
                sql.append("',WHERE idcalle = ").append(calle.getIdcalle());
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
    public boolean delete(int idcalle) {
        this.conn = FactoryConnectionDb.open(FactoryConnectionDb.PGSQL);
        boolean delete = false;

        try {
            StringBuilder sql = new StringBuilder();
            sql.append("DELETE FROM direccion.calle WHERE idcalle = ").append(idcalle);
            this.conn.execute(sql.toString());

        } catch (Exception e) {
        } finally {
            this.conn.close();

        }
        return delete;
    }

    @Override
    public Calle search(String calle) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
