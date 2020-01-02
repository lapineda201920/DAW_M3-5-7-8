package com.exercici04;

public class Futbolista extends SeleccionFutbol {

    /* ATRIBUTS */
    private int dorsal;
    private String demarcacion;


    /* CONSTRUCTOR */
    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {

        super(id, nombre, apellidos, edad);
        this.dorsal=dorsal;
        this.demarcacion=demarcacion;
    }


    /* MÈTODES */
    @Override
    public void entrenar() {

        System.out.println("Realiza un entrenamiento (Clase Futbolista)");
    }

    @Override
    public void jugarPartido() {

        System.out.println("Juega un Partido (Clase Futbolista)");
    }

    public void entrevista() {

        System.out.println("Da una Entrevista");
    }

    /* GETTER'S I SETTER'S */
    public  String getNombre() {

        return nombre;
    }

    public  String getApellidos() {

        return apellidos;
    }
}
