/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author acast
 */
public class Persona {
    //Atributos
    private String nombre;
    private String apellidoUno;
    private float altura;
    private int peso;
    private int edad;
    private Profesion profesion;
    enum Profesion{
    	'Torero', 'Taxista';
    }
    
    
    public Persona(){
        nombre = null;
        apellidoUno = null;
        altura=0;
        peso=0;
        edad=0;
        
        
        
    }

    public Persona(String nombre, String apellidoUno, float altura, int peso, int edad) {
        this.nombre = nombre;
        this.apellidoUno = apellidoUno;
        this.altura = altura;
        this.peso = peso;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoUno() {
        return apellidoUno;
    }

    public void setApellidoUno(String apellidoUno) {
        this.apellidoUno = apellidoUno;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
}
