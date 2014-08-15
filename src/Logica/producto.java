/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

/**
 *
 * @author Usuario
 */
class producto {
    private String Nombre;
    private int NumRef;
    private String Descripcion;
   // private ListaEspecificaciones ListaEsp;
    //private Money Precio;
    private String Imagen;
    
    public producto(){
        Nombre= null;
        Descripcion = null;
        Imagen = null;
       //      ListaEspecificaciones ListaEsp = null;
      //  Money precio = null; 
       
    }
    public void setDatosProd(String Nombre, int NumRef, String Descripcion,/* ListaEspecificaciones ListaEsp , Money precio, */String Imagen){
        this.Nombre = Nombre;
        this.NumRef = NumRef;
        this.Descripcion = Descripcion;
       // this.ListaEsp = ListaEsp;
      //  this.Precio = Precio;
        
    }
    
    public producto(String nom, int numRef, String desc,/* ListaEspecificaciones listEsp, Money prec, */String imag){
        this.Nombre= nom;
        this.NumRef= numRef;
        this.Descripcion= desc;
    //    this.ListaEsp =listEsp;
     //   this.Precio = prec;
        this.Imagen =imag;
      
      
    }
    
    public String getNombre(){
       return Nombre;
          }
    public int getNumRef(){
       return NumRef;
          } 
    public String getDescripcion(){
       return Descripcion;
          }
    /*public ListaEspecificaciones getListEsp(){
        return ListaEsp;
    }
    public Money getPrecio(){
       return Precio;
          }*/
    public String getImagen(){
       return Imagen;
          }
    public void setNombre(String nom){
       this.Nombre = nom;
            }
    public void setNumRef(int numRef){
       this.NumRef = numRef;
            }
    public void setDescripcion(String desc){
       this.Descripcion = desc;
            }
    public void setListaEsp(ListaEspecificaciones lisEsp){
       this.ListaEsp= lisEsp;
            }
    public void setPrecio(Money prec){
       this.Precio = prec;
            }
    public void setImagen(String imag){
       this.Imagen = imag;
            }
}
