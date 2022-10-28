/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo5;

/**
 *
 * @author javier luna reyes
 */
public class POO5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Persona per1= new Persona();
       per1.setNombre("Sofia");
       per1.setApellido("Hernandez");
       per1.setfNacimineto(new Fecha(21,10,22));
       System.out.println(per1);
        
       Persona per2 =new Persona("Arturo", "Alvarez",new Fecha(11,2,21 ) );
       System.out.println(per2);
        
       Fecha fecha= new Fecha();
       fecha.setDia(3);
       fecha.setMes(4);
       fecha.setAño(99);
        
       Persona per3 = new Persona("Rocio","Suarez", fecha);
       System.out.println(per3);
    }
    
}
