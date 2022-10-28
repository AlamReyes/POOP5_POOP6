/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo5;

/**
 *
 * @author poo01alu24
 */
class Fecha {
    private  int dia;
    private  int mes;
    private  int año;//aveces no lo perite por el idioma

    public Fecha() {
    }

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if(dia>0 && dia<32)
        this.dia = dia;
        else{
            System.out.println("Dia incorrecto");
            this.dia=0;
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if(mes>0 && mes<13){
            this.mes = mes;
        }
        else{
            System.out.println("Mes incorrecto");
            this.mes=0;
        }
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override //si este override imprime su lugar de posicion
    public String toString() {
        return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", a\u00f1o=" + año + '}';
    }
    
    
    
}
