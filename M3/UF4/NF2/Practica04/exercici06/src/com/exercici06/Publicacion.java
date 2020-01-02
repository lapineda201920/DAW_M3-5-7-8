package com.exercici06;

public class Publicacion {

    /* ATRIBUTS */
    private String codigo;
    private String titulo;
    private int anio;


    /* CONSTRUCTOR */
    public Publicacion(String codigo, String titulo, int anio) {

        this.codigo = codigo;
        this.titulo = titulo;
        this.anio = anio;
    }

    /* MÈTODES */
    public String getCodigo() {

        return codigo;
    }

    public void setCodigo(String codigo) {

        this.codigo = codigo;
    }

    public String getTitulo() {

        return titulo;
    }

    public void setTitulo(String titulo) {

        this.titulo = titulo;
    }

    public int getAnio() {

        return anio;
    }

    public void setAnio(int anio) {

        this.anio = anio;
    }

    @Override
    public String toString() {

        return "Publicacion [codigo=" + codigo + ", titulo=" + titulo + ", anio=" + anio + "]";
    }
}
