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
            ResultSet rs = bd.sentencia.executeQuery("SELECT * FROM CLIENTES");
            while (rs.next()){
                cliente cli = new cliente();
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
    
}