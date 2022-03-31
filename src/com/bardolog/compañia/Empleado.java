package com.bardolog.compañia;

public class Empleado extends Persona{
    private double remunera;
    private int empleId;
    private static int ultimoIdEm=0;

    public Empleado(String nombre, String apellido, String nuFiscal, String direccion, double remunera) {
        super(nombre, apellido, nuFiscal, direccion);
        this.remunera = remunera;
        this.empleId=++ultimoIdEm;
    }

    public double getRemunera() {
        return remunera;
    }

    public int getEmpleId() {
        return empleId;
    }


    public double aumRemuneracion(int porcentaje){
        this.remunera= (this.remunera*porcentaje/100)+this.remunera;
        return this.remunera;
    }

    @Override
    public String toString() {
        return super.toString()+"\nIdentificación de empleado:" +empleId +
                "\nSueldo Empleado:" +Double.toString(remunera)+" COP";

    }
}
