package com.bardolog.compañia;

public class Cliente extends Persona{
    private int clienteid;
    private static int ultimoid=0;


    public Cliente(String nombre, String apellido, String nuFiscal, String direccion ) {
        super(nombre, apellido, nuFiscal, direccion);
        this.clienteid = ++ultimoid;
    }

    public int getClienteid() {
        return clienteid;
    }

    @Override
    public String toString() {
        return  super.toString()+ "\nId Cliente: "+clienteid ;
    }
}
