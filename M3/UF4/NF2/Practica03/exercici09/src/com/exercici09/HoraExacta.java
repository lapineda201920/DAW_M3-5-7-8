package com.exercici09;

public class HoraExacta extends Hora {

    /* ATRIBUTS */
    protected int segundos;


    /* CONSTRUCTOR */
    public HoraExacta (int hora, int minutos, int segundos){

        super(hora, minutos);
        setSegundos(segundos);
    }


    /* MÈTODES */
    @Override
    public void setSegundos (int segundos){

        if (0 <= segundos && segundos < 60){

            this.segundos=segundos;
        }
    }

    @Override
    public void inc(){

        segundos++;
        if (segundos > 60){

            segundos = 0;
            //super.inc();
        }
    }

    @Override
    public void setHora(int hora) {

        if (hora >= 1 && hora <=12){

            this.hora = hora;
        }
    }

    @Override
    public String toString() {

        String result = super.toString();
        result += ":" + segundos;
        return result;
    }

    @Override
    public boolean equals(Object o) {

        HoraExacta otroReloj = (HoraExacta) o;

        boolean iguales;
        if (this.hora == otroReloj.hora && this.minutos == otroReloj.minutos && this.segundos == otroReloj.segundos){

            iguales = true;
        }
        else {

            iguales = false;
        }

        return iguales;
    }

}
