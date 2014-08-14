/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Conexionbd;
import Logica.cliente;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Agustin
 */
public class agregar {
     public void agregarcliente(cliente cli){
     Conexionbd.conexion bd;
     bd = new Conexionbd.conexion();
     bd.conectarBase();
         try {
             bd.sentencia.executeQuery("INSERT INTO `PUBLIC.CLIENTES`(`nick`, `nombre`, `apellido`)VALUES('"+cli.getNick()+"','"+cli.getNombre()+"','"+cli.getNick()+"')");
         } catch (SQLException ex) {
             Logger.getLogger(agregar.class.getName()).log(Level.SEVERE, null, ex);
         }
     
     
     
     
     }
     
}
