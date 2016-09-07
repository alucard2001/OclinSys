/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Clase.Persona;
import Factory.ConnectionDb;
import Factory.FactoryConnectionDb;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alucard
 */
public class MPersonaImpl implements MPersona {

    ConnectionDb conn;

    @Override
    public List<Persona> list() {
        this.conn = FactoryConnectionDb.open(FactoryConnectionDb.PGSQL);
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT dni,idtipo_tipodocumento,nombre_tercero,\n"
                + "  idtipo_tercero_tipo_tercero,sexo,apellido,idtipopermiso_tipopermiso\n"
                + "FROM dato.persona ;");
        List<Persona> list = new ArrayList<>();
        try {
            ResultSet rs = this.conn.query(sql.toString());
            while (rs.next()) {
                Persona persona = new Persona();
                persona.setDni(rs.getString("dni"));
                persona.setIdtipodocumento(rs.getInt("idtipo_tipodocumento"));
                persona.setNombretercero(rs.getString("nombre_tercero"));
                persona.setApellido(rs.getString("nombre_tercero"));
                persona.setIdtipopermiso(rs.getInt("idtipo_tercero_tipo_tercero"));
                persona.setApellido(rs.getString("apellido"));
                persona.setSexo(rs.getString("sexo"));
                persona.setIdtipopermiso(rs.getInt("idtipopermiso_tipopermiso"));
                list.add(persona);
            }
            
        } catch (Exception e) {
        } finally {
            this.conn.close();
        }
        return list;
    }

   
    @Override
    public boolean save(Persona persona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int idPersona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Persona search(String persona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 

}
