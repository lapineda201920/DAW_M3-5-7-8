package com.exercici01;

import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;

public class Futbolista {

    // ATRIBUTS
    private String nombre;
    private String apellidos;
    private Integer edad;
    private ArrayList<String> demarcacion;
    private Boolean internacional;


    // CONSTRUCTOR
    public Futbolista() {
    }

    public Futbolista(String nombre, String apellidos, Integer edad, ArrayList<String> demarcacion, Boolean internacional) {

        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.demarcacion = demarcacion;
        this.internacional = internacional;
    }


    // MÈTODES
    public Futbolista(BasicDBObject dBObjectFutbolista) {

        this.nombre = dBObjectFutbolista.getString("nombre");
        this.apellidos = dBObjectFutbolista.getString("apellidos");
        this.edad = dBObjectFutbolista.getInt("edad");

        // Cuidado cuando trabajamos con Arrays o Listas
        BasicDBList listDemarcaciones = (BasicDBList) dBObjectFutbolista.get("demarcacion");
        this.demarcacion = new ArrayList<String>();
        for (Object demarc : listDemarcaciones) {
            this.demarcacion.add(demarc.toString());
        }

        this.internacional = dBObjectFutbolista.getBoolean("internacional");
    }

    public BasicDBObject toDBObjectFutbolista() {

        // Creamos una instancia BasicDBObject
        BasicDBObject dBObjectFutbolista = new BasicDBObject();

        dBObjectFutbolista.append("nombre", this.getNombre());
        dBObjectFutbolista.append("apellidos", this.getApellidos());
        dBObjectFutbolista.append("edad", this.getEdad());
        dBObjectFutbolista.append("demarcacion", this.getDemarcacion());
        dBObjectFutbolista.append("internacional", this.getInternacional());

        return dBObjectFutbolista;
    }

    // GET's I SET's
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public String getApellidos() {

        return apellidos;
    }

    public void setApellidos(String apellidos) {

        this.apellidos = apellidos;
    }

    public Integer getEdad() {

        return edad;
    }

    public void setEdad(Integer edad) {

        this.edad = edad;
    }

    public ArrayList<String> getDemarcacion() {

        return demarcacion;
    }

    public void setDemarcacion(ArrayList<String> demarcacion) {

        this.demarcacion = demarcacion;
    }

    public Boolean getInternacional() {

        return internacional;
    }

    public void setInternacional(Boolean internacional) {

        this.internacional = internacional;
    }

    // IMPRIMIR INFORMACIÓ
    @Override
    public String toString() {

        return "Nom: " + this.getNombre() + " " + this.getApellidos() + " / Edat: " + this.edad + " / Demarcació: " + this.demarcacion.toString() + " / Internacional: " + this.internacional;
    }

}
