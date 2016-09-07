/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Clase.HistorialClinico;
import Factory.ConnectionDb;
import Factory.FactoryConnectionDb;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tatiana Montilla
 */
public class MHistorialclinicoImpl implements MHistorialclinico{
ConnectionDb conn;
    @Override
    public List<HistorialClinico> list() {
        this.conn = FactoryConnectionDb.open(FactoryConnectionDb.PGSQL);
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM  pacientes.historial_clinico");
        List<HistorialClinico> list = new ArrayList<HistorialClinico>();
        try {
            ResultSet rs = this.conn.query(sql.toString());
            while (rs.next()) {
                HistorialClinico historialclinico = new HistorialClinico();
                historialclinico.setIdhistorialclinico(rs.getInt("idhistorial_clinico"));
                historialclinico.setObservacion(rs.getString("observacion"));
                list.add(historialclinico);
            }

        } catch (Exception e) {
        } finally {
            this.conn.close();
        }
        return list;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 

    @Override
    public boolean save(HistorialClinico observacion) {
        this.conn = FactoryConnectionDb.open(FactoryConnectionDb.PGSQL);
        boolean save = false;
        try {
            if (observacion.getIdhistorialclinico()== 0) {//nuevo
                StringBuilder sql = new StringBuilder();
                sql.append("INSERT INTO  pacientes.historial_clinico (observacion) VALUES('").append(observacion.getIdhistorialclinico()).append("')");
                this.conn.execute(sql.toString());

            } else {//actualizar
                StringBuilder sql = new StringBuilder();
                sql.append("UPDATE pacientes.historial_clinico set observacion ='").append(observacion.getIdhistorialclinico()).append("' WHERE idhistorial_clinico = ").append(observacion.getIdhistorialclinico());
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
    public boolean delete(int idhistorialclinico) {
        this.conn = FactoryConnectionDb.open(FactoryConnectionDb.PGSQL);
        boolean delete = false;

        try {
            StringBuilder sql = new StringBuilder();
            sql.append("DELETE FROM pacientes.historial_clinico WHERE idpais = ").append(idhistorialclinico);
            this.conn.execute(sql.toString());

        } catch (Exception e) {
        } finally {
            this.conn.close();

        }
        return delete;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HistorialClinico search(int idhistorialclinico) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
