/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

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
    List<Hoja> ListaHoja = new LinkedList<hoja>();
    List<compuesta> ListaCompuesta = new LinkedList<compuesta> ();
    
    }
  
    
    
    
    public void RegistrarProducto(String Nombre, int NumRef, String Descripcion, ListaEspecificaciones ListaEsp, Money precio, String Imagen){
         producto p = new producto();
         p.setDatosProd(Nombre, NumRef, Descripcion, ListaEsp, precio, Imagen);
         ListaProductos.add(p);
           /* CargarImagen(jpg)
            AltaEspecificaciones(ListaString)
            IngresarPadre(string)
            ListarEspecificaciones()*/
            
}
