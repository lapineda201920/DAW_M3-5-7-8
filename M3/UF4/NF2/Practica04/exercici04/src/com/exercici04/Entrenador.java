package com.exercici04;

public class Entrenador extends SeleccionFutbol {

    /* ATRIBUTS */
    private int idFederacion;


    /* CONSTRUCTOR */
    public Entrenador(int id, String nombre, String apellidos, int edad, int idFederacion) {

        super(id, nombre, apellidos, edad);
        this.idFederacion=idFederacion;
    }


    /* MÈTODES */
    @Override
    public void entrenar() {

        System.out.println("Dirige un entrenamiento (Clase Entrenador)");
    }

    @Override
    public void jugarPartido() {

        System.out.println("Dirige un Partido (Clase Entrenador)");
    }

    public void planificarEntrenamiento() {

        System.out.println("Planificar un Entrenamiento");
    }

    /* GETTER'S I SETTER'S */
    public  String getNombre() {

        return nombre;
    }

    public  String getApellidos() {

        return apellidos;
    }
}
