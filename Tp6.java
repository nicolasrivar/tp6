/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6;

/**
 *
 * @author Nicolas
 */
public class Tp6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente pepe = new Cliente(423233, "pepe", "argento", "bs as", "sarmiento 2132");
        
        Directorio aa = new Directorio();
        
        aa.agregarCliente(265744444, pepe);
        
        System.out.println(aa.buscarCliente(265744444).getApellido());
        System.out.println(aa.buscarTelefono("argento"));
        System.out.println(aa.buscarClientes("bs as"));
    }
    
}
