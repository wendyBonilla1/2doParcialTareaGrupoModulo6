package com.mycompany.tarea_de_grupo_modulo_6;

public class Doctor extends Persona {

    public Doctor(
            String nombre, String apellidos,
            int edad,
            boolean casado,
            String numeroDocumentoidentidad) {
        super(nombre, apellidos, edad, casado, numeroDocumentoidentidad);
    }

    @Override
    public String getnombre() {
        return nombre;
    }

    @Override
    public String getapellidos() {
        return apellidos; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getedad() {
        return edad; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean getcasado() {
        return casado; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getnumeroDocumentoidentidad() {
        return numeroDocumentoidentidad; //To change body of generated methods, choose Tools | Templates.
    }

}
