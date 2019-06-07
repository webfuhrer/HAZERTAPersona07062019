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
public class Persona {
    static boolean inmortal;
    private float altura;
    private float peso;
    private String nombre;

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "La persona se llama "+nombre+" y pesa "+peso+"kg"+
                " y mide "+altura+"m"; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
