/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6;
import java.util.HashMap;
import java.util.ArrayList;
/**
 *
 * @author Nicolas
 */
public class Directorio {
    private final HashMap<Integer, Cliente> lista = new HashMap<>();
    
    public void agregarCliente(int numero, Cliente cliente){
        lista.put(numero, cliente);
    }
    
    public Cliente buscarCliente(int numero){
        return lista.get(numero);
    }
    
    public int buscarTelefono(String cliente){
        for (int i: lista.keySet()){
            if(lista.get(i).getApellido().equals(cliente)){
                return i;
            }
        }
        return 0;
    }
    
    public ArrayList buscarClientes(String ciudad){
        ArrayList<Cliente> lis = new ArrayList<>();
        for(int i : lista.keySet()){
            if(lista.get(i).getCiudad().equals(ciudad)){
                lis.add(lista.get(i));
            }
        }
        return lis;
    }
    
    public void borrarCliente(int dn){
        for(int i: lista.keySet()){
            if(lista.get(i).getDni() == dn){
                lista.remove(i);
            }
        }
    }
    
}
