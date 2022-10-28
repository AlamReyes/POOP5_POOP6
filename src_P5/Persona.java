/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo5;

/**
 *
 * @author poo01alu24
 */
public class Persona {
    private String nombre;//Atributo
    private String apellido;//Atributo
    private Fecha fNacimineto;//Atributo

    public Persona() { //constructor basio de clase
    }

    public Persona(String nombre, String apellido, Fecha fNacimineto) { 
        this.nombre = nombre;
        this.apellido = apellido;
        this.fNacimineto = fNacimineto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Fecha getfNacimineto() {
        return fNacimineto;
    }

    public void setfNacimineto(Fecha fNacimineto) {
        this.fNacimineto = fNacimineto;
    }
    
   
    //SE PUEDE HACER CON INSERT CODE>GETTER_AND_CENTER>SELECCIONAR TODO Y YA.
    @Override //con to string
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", fNacimineto=" + fNacimineto + '}';
    }

}
