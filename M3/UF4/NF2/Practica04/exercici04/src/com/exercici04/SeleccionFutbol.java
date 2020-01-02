package com.exercici04;

public abstract class SeleccionFutbol implements IntegranteSeleccionFutbol {

    /* ATRIBUTS */
    protected int id;
    protected String nombre;
    protected String apellidos;
    protected int edad;


    /* CONSTRUCTOR */
    public SeleccionFutbol(int id, String nombre, String apellidos, int edad) {

        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }


    /* MÈTODES */
    public SeleccionFutbol() {

    }

    public void concentrarse() {

        System.out.println("Concentrarse (Clase Padre)");
    }

    public void viajar() {

        System.out.println("Viajar (Clase Padre)");
    }

    public void entrenar() {

        System.out.println("Entrenar (Clase Padre)");
    }

    public void jugarPartido() {

        System.out.println("Asiste al Partido de Fútbol (Clase Padre)");
    }


    /* GETTER'S I SETTER'S */
    public abstract String getNombre();

    public abstract String getApellidos();

}
