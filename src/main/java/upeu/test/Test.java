/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package upeu.test;

import com.google.gson.Gson;
import upeu.config.Conexion;



/**
 *
 * @author admin
 */
public class Test {

static Gson g = new Gson();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        if(Conexion.getConexion()!=null){
            System.out.println("si");
        }else{
            System.out.println("no");
        }

    }
    
}
