/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Clase.Municipio;
import java.util.List;

/**
 *
 * @author Alucard
 */
public interface MMunicipio {

    public List<Municipio> list();

    public Municipio search(String municipio);

    public boolean save(Municipio municipio);

    public boolean delete(int idmunicipio);
}
