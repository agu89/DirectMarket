/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

/**
 *
 * @author Guilleeu
 */
public class Proveedor extends Usuario{
    
    private String nombreCompañia;
    private String linkPagina;
    
    public String getNombreCompañia(){
    
    return nombreCompañia;
    }
    
    public String getLinkPagina(){
    
    return linkPagina;
    }
    
    public void setNombreCompañia(String nc){
    
    this.nombreCompañia = nc;
    }
    
    public void setLinkPagina(String lp){
    
    this.linkPagina = lp;
    }
    
    public Proveedor(){
       nick = null;
       nombre = null;
       apellido = null;
      
   }
   
   public Proveedor(String ni,String nom, String ap){
        
       this.nick = ni;
       this.nombre = nom;
       this.apellido = ap;
     
   }
   public String getNick(){
       return nick;
          }
   public String getNombre(){
       return nombre;
     }
   public String getApellido(){
       return apellido;
   }
   public void setNick(String ni){
       this.nick = ni;
            }
   public void setNombre(String nom){
       this.nombre = nom;
   }
   public void setApellido(String ap){
        this.apellido = ap;
   }
    
}