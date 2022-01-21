/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import modelo.Persona;

/**
 *
 * @author acast
 */
public class Consola {
    public void mostrarDatos(){
        Persona peterpan = new Persona();
        /*
        System.out.println("Nombre: "+peterpan.getNombre());
        System.out.println("Apellido: "+peterpan.getApellidoUno());
        System.out.println("Altura: "+peterpan.getAltura());
        System.out.println("Peso: "+peterpan.getPeso());
        System.out.println("Edad: "+peterpan.getEdad());
        */
        peterpan.setNombre("Peter");
        peterpan.setApellidoUno(" Pan");
        peterpan.setAltura(1.10f);
        peterpan.setPeso(45);
        peterpan.setEdad(12);
        
        System.out.println("Nombre: "+peterpan.getNombre());
        System.out.println("Apellido: "+peterpan.getApellidoUno());
        System.out.println("Altura: "+peterpan.getAltura());
        System.out.println("Peso: "+peterpan.getPeso());
        System.out.println("Edad: "+peterpan.getEdad());
        
        System.out.println("//--------------------------------\\");
        
        Persona gonzalo = new Persona("Gonzalo", "De Tomás", 1.91f, 86, 34);
        System.out.println("Nombre: "+gonzalo.getNombre());
        System.out.println("Apellido: "+gonzalo.getApellidoUno());
        System.out.println("Altura: "+gonzalo.getAltura());
        System.out.println("Peso: "+gonzalo.getPeso());
        System.out.println("Edad: "+gonzalo.getEdad());
        
    }
}
