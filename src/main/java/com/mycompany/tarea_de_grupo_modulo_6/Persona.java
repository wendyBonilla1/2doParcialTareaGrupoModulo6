package com.mycompany.tarea_de_grupo_modulo_6;

public abstract class Persona {

    protected String nombre;
    protected String apellidos;
    protected int edad;
    protected boolean casado;
    protected String numeroDocumentoidentidad;

    public Persona(String nombre, String apellidos,
            int edad,
            boolean casado,
            String numeroDocumentoidentidad
    ) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.casado = casado;
        this.numeroDocumentoidentidad = numeroDocumentoidentidad;
    }

    abstract public String getnombre();

    abstract public String getapellidos();

    abstract public int getedad();

    abstract public boolean getcasado();

    abstract public String getnumeroDocumentoidentidad();
}
