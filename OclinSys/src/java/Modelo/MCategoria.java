/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Clase.Categoria;
import java.util.List;

/**
 *
 * @author Tatiana Montilla
 */
public  interface MCategoria {
    
    public List<Categoria> list();

    public Categoria search(String categoria);

    public boolean save(Categoria categoria);

    public boolean delete(int idcategoria);
    
}
