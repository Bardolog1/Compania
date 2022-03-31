package com.bardolog.compañia;

public class Persona {
    private String nombre;
    private String apellido;
    private String numFiscal;
    private String direcc;

    public Persona() {
    }
    public Persona(String nombre) {
        this();
        this.nombre = nombre;
    }
    public Persona(String nombre, String apellido) {
       this(nombre);
        this.apellido = apellido;
    }
    public Persona(String nombre, String apellido, String numFiscal) {
        this(nombre, apellido);
        this.numFiscal = numFiscal;
    }
    public Persona(String nombre, String apellido, String nuFiscal, String direccion){
       this(nombre, apellido, nuFiscal);
       this.direcc=direccion;
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
    public String getNumFiscal() {
        return numFiscal;
    }
    public void setNumFiscal(String numFiscal) {
        this.numFiscal = numFiscal;
    }
    public String getDirecc() {
        return direcc;
    }
    public void setDirecc(String direcc) {
        this.direcc = direcc;
    }

    @Override
    public String toString() {
        return "Nombre: "+ nombre +" "+ apellido+
                "\n#Fiscal: "+numFiscal+"\nDireccion: "+direcc;
    }
}
