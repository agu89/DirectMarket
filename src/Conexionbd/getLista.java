/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Conexionbd;

import Logica.Proveedor;
import Logica.cliente;
import java.sql.ResultSet;
import java.util.LinkedList;
import Logica.Hoja;
import Logica.Compuesta;
/**
 *
 * @author Agustin
 */
public class getLista {
    
    public LinkedList<cliente> getListaCliente(){
        LinkedList<cliente> ListaCliente = new LinkedList();
        Conexionbd.conexion bd = new Conexionbd.conexion();
        try{
            bd.conectarBase();
            ResultSet rs = bd.sentencia.executeQuery("SELECT * FROM USUARIOS");
            while (rs.next()){
                cliente cli = new cliente();
                cli.setNick(rs.getString("NICK"));
                cli.setEmail(rs.getString("EMAIL"));
                ListaCliente.add(cli);
                
            }
        }catch (Exception e){
            
        }
        bd.desconectarBaseDeDatos();
        
        return ListaCliente;
    
    }
    
    public LinkedList<Proveedor> getListaProveedor(){
        LinkedList<Proveedor> ListaProveedor = new LinkedList();
        Conexionbd.conexion bd = new Conexionbd.conexion();
        try{
            bd.conectarBase();
            ResultSet rs = bd.sentencia.executeQuery("SELECT * FROM PROVEEDOR");
            while (rs.next()){
                Proveedor prov = new Proveedor();
                ListaProveedor.add(prov);
                
                
            }
        }catch (Exception e){
            
        }
        bd.desconectarBaseDeDatos();
        
        return ListaProveedor;
    
    }
    
    
    public LinkedList<Hoja> getListaHoja(){
        LinkedList<Hoja> ListaHoja = new LinkedList();
        Conexionbd.conexion bd = new Conexionbd.conexion();
        try{
            bd.conectarBase();
            ResultSet rs = bd.sentencia.executeQuery("SELECT * FROM CLIENTES");
            while (rs.next()){
                Hoja hoj = new Hoja();
                ListaHoja.add(hoj);
                
            }
        }catch (Exception e){
            
        }
        bd.desconectarBaseDeDatos();
        
        return ListaHoja;
    
    }
    
    
    public LinkedList<Compuesta> getListaCompuesta(){
        LinkedList<Compuesta> ListaCompuesta = new LinkedList();
        Conexionbd.conexion bd = new Conexionbd.conexion();
        try{
            bd.conectarBase();
            ResultSet rs = bd.sentencia.executeQuery("SELECT * FROM CLIENTES");
            while (rs.next()){
                Compuesta com = new Compuesta();
                ListaCompuesta.add(com);
                
            }
        }catch (Exception e){
            
        }
        bd.desconectarBaseDeDatos();
        
        return ListaCompuesta;
    
    }
    
}
