package com.mycompany.tarea_de_grupo_modulo_6;

public class Main {

    public static void main(String[] args) {
        Persona deportista = new Deportista("Wendy", "Bonilla", 21, false, "0000-0000-0000");
        System.out.println(" " + deportista.getnombre() + " " + deportista.getapellidos() + " " + deportista.getnumeroDocumentoidentidad() + " " + (deportista.getcasado()?"Casado(a)":"Soltero(a)") + " " + deportista.getedad());
        System.out.println("");
        Persona doctor = new Doctor("Juan", "Madrid", 30, true, "1111-1111-1111");
        System.out.println(" " + doctor.getnombre() + " " + doctor.getapellidos() + " " + doctor.getnumeroDocumentoidentidad() + " " + (doctor.getcasado()?"Casado(a)":"Soltero(a)") + " " + doctor.getedad());
    }
}
