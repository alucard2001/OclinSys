/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Clase.Pais;
import Factory.ConnectionDb;
import Factory.FactoryConnectionDb;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alucard
 */
public class MPaisImpl implements MPais {

    ConnectionDb conn;

    @Override
    public List<Pais> list() {
        this.conn = FactoryConnectionDb.open(FactoryConnectionDb.PGSQL);
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM  direccion.pais");
        List<Pais> list = new ArrayList<Pais>();
        try {
            ResultSet rs = this.conn.query(sql.toString());
            while (rs.next()) {
                Pais pais = new Pais();
                pais.setIdpais(rs.getInt("idpais"));
                pais.setPais(rs.getString("dpais"));
                list.add(pais);
            }

        } catch (Exception e) {
        } finally {
            this.conn.close();
        }
        return list;
    }

    @Override
    public Pais edit(int idpais) {
        this.conn = FactoryConnectionDb.open(FactoryConnectionDb.PGSQL);
        Pais pais = new Pais();
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM  direccion.pais where idpai = ").append(1);
        try {
            ResultSet rs = this.conn.query(sql.toString());
            while (rs.next()) {

                pais.setIdpais(rs.getInt("idpais"));
                pais.setPais(rs.getString("pais"));
            }
        } catch (Exception e) {
        } finally {
            this.conn.close();
        }
        return pais;
    }

    @Override
    public boolean save(Pais pais) {
        this.conn = FactoryConnectionDb.open(FactoryConnectionDb.PGSQL);
        boolean save = false;
        try {
            if (pais.getIdpais() == 0) {//nuevo
                StringBuilder sql = new StringBuilder();
                sql.append("INSERT INTO  direccion.pais (pais) VALUES('").append(pais.getPais()).append("')");
                this.conn.execute(sql.toString());

            } else {//actualizar
                StringBuilder sql = new StringBuilder();
                sql.append("UPDATE direccion.pais pais ='").append(pais.getPais()).append("' WHERE idpais = ").append(pais.getIdpais());
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
    public boolean delete(int idpais) {
        this.conn = FactoryConnectionDb.open(FactoryConnectionDb.PGSQL);
        boolean delete = false;

        try {
            StringBuilder sql = new StringBuilder();
            sql.append("DELETE FROM direccion.pais WHERE idpais = ").append(idpais);
            this.conn.execute(sql.toString());

        } catch (Exception e) {
        } finally {
            this.conn.close();

        }
        return delete;
    }

}
