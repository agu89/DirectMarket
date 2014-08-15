/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

import Conexionbd.agregar;
import Conexionbd.getLista;
import java.util.*;

/**
 *
 * @author Usuario
 */
public class ControladorProductoyEspecificaciones {
  
    public List ListaProductos;
    public List ListaHoja;
    public List ListaCompuesta;
    
    public void ControladorProductoyEspecificaciones(){
        
    List<producto> ListaProductos = new LinkedList<producto>();
    List<hoja> ListaHoja = new LinkedList<hoja>();
    List<compuesta> ListaCompuesta = new LinkedList<compuesta> ();
    
    }
  
    
    
    
    public void RegistrarProducto(String Nombre, int NumRef, String Descripcion, ListaEspecificaciones ListaEsp, Money precio, String Imagen){
         producto p = new producto();
         p.setDatosProd(Nombre, NumRef, Descripcion, ListaEsp, precio, Imagen);
         ListaProductos.add(p);
          agregar ag = new agregar();
          ag.agregarproducto(p);
          
           /* CargarImagen(jpg)*/
          
    public List<DataProducto> ListarProductos(){
        
    getLista gl = new getLista();
    ListaProductos = gl.getListaProducto();
    List<DataProducto> DataListaProducto = new LinkedList();
        Iterator it = ListaProducto.iterator();
        while(it.hasNext()){
            if ( it instanceof producto){
                producto pr  = new producto();
                pr = (producto) it;
                DataProducto dpr = new DataProducto();
                dpr = pr.getDataProd();
                DataListaProducto.add(dpr);
            
            }
            it.next();
         }
        return DataListaProducto;

    }
          public producto SeleccionarProducto(String Nombre){
    
        getLista gl = new getLista();
        ListaProductos = gl.getListaProducto();
        Iterator it = ListaProducto.iterator();

        while (it.hasNext()){
            if (it instanceof producto){
                producto pr = new producto();
                pr = (producto)it;
                if (pr.getNombre()== Nombre)
                    return pr;

            }
            it.next();

        }
        return null;
    }
          public List<DataHoja> ListarHojas(){
        
    getLista gl = new getLista();
    ListaHoja = gl.getListaHoja();
    List<DataHoja> DataListaHoja = new LinkedList();
        Iterator it = ListaProducto.iterator();
        while(it.hasNext()){
            if ( it instanceof Hoja){
                Hoja ho  = new Hoja();
                ho = (Hoja) it;
                DataHoja dho = new DataHoja();
                dho = ho.getDataHoja();
                DataListaHoja.add(ho);
            
            }
            it.next();
         }
        return DataListaProducto;

    }
          
            //AltaEspecificaciones(ListaString)
        
    }
    
    
    
    
}
