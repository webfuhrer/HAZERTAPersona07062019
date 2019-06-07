/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopersona;

/**
 *
 * @author Admin
 */
public class ProyectoPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p=new Persona();
        p.setNombre("Pepe");
        p.setAltura(1.75F);
        p.setPeso(95.5f);
        
        System.out.println(p);
        
    }
    
}
