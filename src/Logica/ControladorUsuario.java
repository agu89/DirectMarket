/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;
import java.util.*; 
import Conexionbd.*;
/**
 *
 * @author Guilleeu
 */
public class ControladorUsuario {
    
    
    private List ListaClientes;
    private List ListaProveedores;
    
    
    public void ControladorUsuario(){
        
    List<cliente> ListaClientes = new LinkedList();
    List<Proveedor> ListaProveedores = new LinkedList();
    
    
    // sintaxis List<Persona> listalinked = new LinkedList<Persona>();
    }
  
   
    public void RegistrarCliente(String nick, String nombre, String apellido, String email, Date fnac, String Imagen){
    
        cliente c = new cliente();
        c.setDatos(nick, nombre, apellido, email, fnac, Imagen);
        ListaClientes.add(c);
        agregar ag = new agregar();
        ag.agregarcliente(c);
       
    }
    
    public void SetTipoUsuario(String t){
    }
    
    public void RegistrarProveedor(String nick, String nombre, String apellido, String email, Date fnac, String Imagen, String nombreComp, String linkPag){
    
    Proveedor p = new Proveedor();
    p.setdatos(nick, nombre, apellido, email,fnac, Imagen, nombreComp,linkPag);
    ListaProveedores.add(p);
    agregar ag = new agregar();
    ag.agregarproveedor(p);
    
    }
    
    public void CargarFoto(){
   
    }
    
    public List<DataCliente> ListarClientes(){
        
    //getLista gl = new getLista();
    getLista gl = new getLista();
    LinkedList<cliente> clientes = gl.getListaCliente();
    List<DataCliente> DataListaClientes = new LinkedList();
    DataCliente dc = new DataCliente();
        //Iterator it = ListaClientes.iterator();
        for(/*it.hasNext()*/int i=0; i<clientes.size(); i++){
           // if ( /*it instanceof cliente*/ListaClientes.){
                cliente cc  = new cliente();
                cc = clientes.get(i);
                dc = cc.getData();
                DataListaClientes.add(dc);
            
            //}
            //it.next();
         }
        return DataListaClientes;
            // no se si esta devolviendo bien la lista  
    }
    
    public cliente SeleccionarCliente(String nick){
    
        getLista gl = new getLista();
        ListaClientes = gl.getListaCliente();
        Iterator it = ListaClientes.iterator();

        while (it.hasNext()){
            if (it instanceof cliente){
                cliente c = new cliente();
                c = (cliente)it;
                if (c.getNick()== nick)
                    return c;

            }
            it.next();

        }
        return null;
    }
    
    public List<DataProveedor> ListarProveedores(){
        
        List<DataProveedor> dataListaProveedores = new LinkedList();
        getLista gl = new getLista();
        ListaProveedores = gl.getListaProveedor();
        
        Iterator it = ListaProveedores.iterator();
        DataProveedor dp = new DataProveedor();
        while(it.hasNext()){
            if ( it instanceof Proveedor){
                Proveedor p = new Proveedor();
                p = (Proveedor) it;
                dp = p.getData();
                dataListaProveedores.add(dp);
            
            }
            it.next();
        
        }
      
    return dataListaProveedores;
    }
     public DataCliente getDataCliente(String nick){
        
        getLista gl = new getLista();
        ListaClientes = gl.getListaCliente();
        DataCliente dp = new DataCliente();
       Iterator it = ListaClientes.iterator();
       
       for(int i=0; i<=ListaClientes.size();i++){
           cliente c = new cliente();
            if(it instanceof cliente){
                
               c = (cliente)it;
                if (c.getNick().equals(nick)){
                    
                    dp = c.getData();
                    
                }
            } 
       }
        
       return dp;
     }
    
    public DataProveedor SeleccionarProveedor(String nick){
        
        getLista gl = new getLista();
        ListaProveedores = gl.getListaProveedor();
        
       Iterator it = ListaProveedores.iterator();
       
       for(int i=0; i<=ListaProveedores.size();i++){
           Proveedor p = new Proveedor();
            if(it instanceof Proveedor){
                
               p = (Proveedor)it;
                if (p.getNick() == nick){
                    DataProveedor dp = new DataProveedor();
                    dp = p.getData();
                    return dp;
                }
            } 
       }
    return null;
    }
    public List<cliente> ListarClientesObject(){
        
    getLista gl = new getLista();
    ListaClientes = gl.getListaCliente();
    List<cliente> ListaCli = new LinkedList();
    
        Iterator it = ListaClientes.iterator();
        while(it.hasNext()){
            if ( it instanceof cliente){
                cliente cc;
                cc = (cliente) it;
                ListaCli.add(cc);
          /*      for(cliente c : ListaCli){
                c.*/
            }
            
            
            it.next();
           }
        return ListaCli;
            // no se si esta devolviendo bien la lista  
    }
   /* public List<OrdenCompra> ObtenerOrdenesdeCompra(){
        
    
    
    }*/
   /* public dataOrden SeleccionarOrdenCompra(OrdenCompra oc){
     
    
    
    
    
   /     858.04
    
    }*/
    
}
