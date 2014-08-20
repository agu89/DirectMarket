/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Conexionbd;
import Logica.cliente;
import Logica.Proveedor;
import Logica.Compuesta;
import Logica.Hoja;
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
             
             bd.sentencia.executeQuery("INSERT INTO CLIENTES(nick, nombre, apellido)VALUES('"+cli.getNick()+"','"+cli.getNombre()+"','"+cli.getApellido()+"')");
         } catch (SQLException ex) {
             System.out.println("la puta madre");
             Logger.getLogger(agregar.class.getName()).log(Level.SEVERE, null, ex);
         }
         bd.desconectarBaseDeDatos();
     
     
     
     }
     public void agregarproveedor(Proveedor cli){
     Conexionbd.conexion bd;
     bd = new Conexionbd.conexion();
     bd.conectarBase();
         try {
             
             bd.sentencia.executeQuery("INSERT INTO PROVEEDOR(nick, nombre, apellido)VALUES('"+cli.getNick()+"','"+cli.getNombre()+"','"+cli.getApellido()+"')");
         } catch (SQLException ex) {
             System.out.println("la puta madre");
             Logger.getLogger(agregar.class.getName()).log(Level.SEVERE, null, ex);
         }
     
         bd.desconectarBaseDeDatos();
     
     
     }
     
     public void agregarCompuesta(Compuesta comp){
     Conexionbd.conexion bd;
     bd = new Conexionbd.conexion();
     bd.conectarBase();
         try {
             
             bd.sentencia.executeQuery("INSERT INTO CATEGORIA(REF, NOMBRE, PADRE)VALUES('"+1+"','"+comp.getNombre()+"','"+comp.getPadre()+"')");
         } catch (SQLException ex) {
             
             Logger.getLogger(agregar.class.getName()).log(Level.SEVERE, null, ex);
         }
     
         bd.desconectarBaseDeDatos();
     
     
     }
     
     public void agregarHoja(Hoja hoj){
     Conexionbd.conexion bd;
     bd = new Conexionbd.conexion();
     bd.conectarBase();
         try {
             
             bd.sentencia.executeQuery("INSERT INTO HOJA(REF, NOMBRE, PADRE)VALUES('"+1+"','"+hoj.GetNombre()+"','"+0+"')");
         } catch (SQLException ex) {
             
             Logger.getLogger(agregar.class.getName()).log(Level.SEVERE, null, ex);
         }
     
         bd.desconectarBaseDeDatos();
     
     
     }
     
     
}
