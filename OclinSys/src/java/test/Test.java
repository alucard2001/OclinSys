package test;

import Clase.*;
import Modelo.*;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Alucard
 */
public class Test {

    public static void main(String[] args) {
        Test test = new Test();
//        test.ListPgSql();
        test.BuscarPgSql();
       

    }

    public void ListPgSql() {
        MPais pais = new MPaisImpl();
        List<Pais> list = pais.list();
        
       for (Pais p : list) {
            System.out.println("----");
            System.out.println( " Pais: " + " "+p.getPais());
        }
       
    }
    public void BuscarPgSql() {
          
         MRegion Pais = new MRegionImpl();
         Region pais =Pais.search("S");
        
        System.out.println("1 :" + pais.getRegion()+" 2 :"+ pais.getPais());

  

       
    }

}
