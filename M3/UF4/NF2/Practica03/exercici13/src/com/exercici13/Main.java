package com.exercici13;

public class Main {

    public static void main(String[] args) {

        Campana c = new Campana();

        c.add(Instrumento.Nota.DO);
        c.add(Instrumento.Nota.SI);
        c.add(Instrumento.Nota.SOL);
        c.add(Instrumento.Nota.RE);
        c.interpretar();

        Piano p = new Piano();

        p.add(Instrumento.Nota.FA);
        p.add(Instrumento.Nota.DO);
        p.add(Instrumento.Nota.RE);
        p.add(Instrumento.Nota.MI);
        p.interpretar();

    }
}
