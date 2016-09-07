/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Clase.Tipodescuento;
import Factory.ConnectionDb;
import Factory.FactoryConnectionDb;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tatiana Montilla
 */
public class MTipodescuentoImpl implements MTipodescuento {

    ConnectionDb conn;

    @Override
    public List<Tipodescuento> list() {
        this.conn = FactoryConnectionDb.open(FactoryConnectionDb.PGSQL);
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM  nomina.tipo_descuento");
        List<Tipodescuento> list = new ArrayList<Tipodescuento>();
        try {
            ResultSet rs = this.conn.query(sql.toString());
            while (rs.next()) {
                Tipodescuento tipodescuento = new Tipodescuento();
                tipodescuento.setIdtipodescuento(rs.getInt("idtipo_descuento"));
                tipodescuento.setTipodescuento(rs.getString("tipo_descuento"));
                tipodescuento.setDescuento(rs.getInt("descuento"));
                list.add(tipodescuento);
            }

        } catch (Exception e) {
        } finally {
            this.conn.close();
        }
        return list;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    @Override
    public boolean save(Tipodescuento tipodescuento) {
        this.conn = FactoryConnectionDb.open(FactoryConnectionDb.PGSQL);
        boolean save = false;
        try {
            if (tipodescuento.getIdtipodescuento()== 0) {//nuevo
                StringBuilder sql = new StringBuilder();
                sql.append("INSERT INTO  nomina.tipo_descuento (tipo_descuento,descuento) VALUES('").append(tipodescuento.getTipodescuento());
                sql.append("', ").append(tipodescuento.getDescuento()).append(")");
                this.conn.execute(sql.toString());

            } else {//actualizar
                StringBuilder sql = new StringBuilder();
                sql.append("UPDATE nomina.tipo_descuento set tipo_descuento = ").append(tipodescuento.getTipodescuento());
                sql.append(", descuento= '").append(tipodescuento.getDescuento());
                sql.append("',WHERE tipo_descuento = ").append(tipodescuento.getIdtipodescuento());
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
    public boolean delete(int idtipodescuento) {
        this.conn = FactoryConnectionDb.open(FactoryConnectionDb.PGSQL);
        boolean delete = false;

        try {
            StringBuilder sql = new StringBuilder();
            sql.append("DELETE FROM nomina.tipo_descuento WHERE idtipo_descuento = ").append(idtipodescuento);
            this.conn.execute(sql.toString());

        } catch (Exception e) {
        } finally {
            this.conn.close();

        }
        return delete;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Tipodescuento search(String tipodescuento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
