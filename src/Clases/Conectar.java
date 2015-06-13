/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class Conectar {
    Connection con = null;
    
    
     public Connection conexion(){
    try{
        //Cargamos nuestro driver
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/sistema_veterinario","root","");
       // System.out.println("conexion establecida");
        //JOptionPane.showMessageDialog(null, "conexion establecida");
        
    }catch(ClassNotFoundException | SQLException e){
        System.out.println("Error de conexion");
        JOptionPane.showMessageDialog(null, "Error en la Conexion");
    }
    return con;
    }
}
    

