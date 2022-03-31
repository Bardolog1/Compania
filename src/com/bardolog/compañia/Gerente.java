package com.bardolog.compañia;

public class Gerente extends Empleado{
    private double presupuesto;

    public Gerente(String nombre, String apellido, String nuFiscal, String direccion, double remunera, double presupuesto) {
        super(nombre, apellido, nuFiscal, direccion, remunera);
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }


    @Override
    public String toString() {
        return super.toString() + "\nPresupuesto: " + presupuesto+" COP";
    }
}
