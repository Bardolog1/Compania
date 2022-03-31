package com.bardolog.compañia.ejemplo;
import com.bardolog.compañia.*;

public class ejemploCompañia {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Camilo","rodriguez",
                "103375628", " Calle 40 sur # 78j-33",
                3500000,250000000);

        gerente.setPresupuesto(150000000);
        gerente.aumRemuneracion(20);
        System.out.println(gerente);

        Empleado empleado = new Empleado("Jorge","Marquez",
                "1023949635", "Carrera 41 # 78 - 37 sur",
                1500000);

        empleado.aumRemuneracion(8);
        System.out.println(empleado);
    }
}
