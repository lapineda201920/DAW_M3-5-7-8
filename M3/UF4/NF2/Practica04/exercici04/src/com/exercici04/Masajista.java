package com.exercici04;

public class Masajista extends SeleccionFutbol {

    /* ATRIBUTS */
    private String titulacion;
    private int aniosExperiencia;


    /* CONSTRUCTOR */
    public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {

        super(id, nombre, apellidos, edad);
        this.titulacion=titulacion;
        this.aniosExperiencia=aniosExperiencia;
    }


    /* MÈTODES */
    @Override
    public void entrenar() {

        System.out.println("Da asistencia en el entrenamiento (Clase Masajista)");
    }

    public void darMasaje() {

        System.out.println("Da un Masaje");
    }

    /* GETTER'S I SETTER'S */
    public  String getNombre() {

        return nombre;
    }

    public  String getApellidos() {

        return apellidos;
    }
}
