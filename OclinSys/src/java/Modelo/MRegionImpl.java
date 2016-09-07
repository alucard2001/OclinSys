/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Clase.Pais;
import Clase.Region;
import Factory.ConnectionDb;
import Factory.FactoryConnectionDb;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alucard
 */
public class MRegionImpl implements MRegion {
    
    ConnectionDb conn;
    
    @Override
    public List<Region> list() {
        this.conn = FactoryConnectionDb.open(FactoryConnectionDb.PGSQL);
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM  direccion.region");
        List<Region> list = new ArrayList<Region>();
        try {
            ResultSet rs = this.conn.query(sql.toString());
            while (rs.next()) {
                Region region = new Region();
                region.setIdregion(rs.getInt("idregion"));
                region.setRegion(rs.getString("region"));
                region.setIdpais(rs.getInt("idpais_pais"));
                
                list.add(region);
            }
            
        } catch (Exception e) {
        } finally {
            this.conn.close();
        }
        return list;
    }
    
    @Override
    public boolean save(Region region) {
        this.conn = FactoryConnectionDb.open(FactoryConnectionDb.PGSQL);
        boolean save = false;
        try {
            if (region.getIdregion() == 0) {//nuevo
                StringBuilder sql = new StringBuilder();
                sql.append("INSERT INTO  direccion.region (region,idpais_pais) VALUES('").append(region.getRegion());
                sql.append("', ").append(region.getIdpais()).append(")");
                this.conn.execute(sql.toString());
                
            } else {//actualizar
                StringBuilder sql = new StringBuilder();
                sql.append("UPDATE direccion.region set region = ").append(region.getRegion());
                sql.append(",idpais_pais= '").append(region.getIdpais());
                sql.append("',WHERE idregion = ").append(region.getIdregion());
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
    public boolean delete(int idregion) {
        this.conn = FactoryConnectionDb.open(FactoryConnectionDb.PGSQL);
        boolean delete = false;
        
        try {
            StringBuilder sql = new StringBuilder();
            sql.append("DELETE FROM direccion.region WHERE idregion = ").append(idregion);
            this.conn.execute(sql.toString());
            
        } catch (Exception e) {
        } finally {
            this.conn.close();
            
        }
        return delete;
    }
    
    @Override
    public Region search(String region) {
        this.conn = FactoryConnectionDb.open(FactoryConnectionDb.PGSQL);
        Region r = new Region();
        
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT r.region,p.pais from direccion.pais as p,direccion.region as r WHERE r.idpais_pais= p.idpais and r.region like '").append(region).append("%';");
        try {
            ResultSet rs = this.conn.query(sql.toString());
            while (rs.next()) {
                
                r.setRegion(rs.getString("region"));
                r.setPais(rs.getString("pais"));
            }
        } catch (Exception e) {
        } finally {
            this.conn.close();
        }
        return r;
    }
    
}
