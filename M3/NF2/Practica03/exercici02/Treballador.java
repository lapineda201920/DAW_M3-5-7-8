import java.util.Scanner;
import java.util.Arrays;


public class Treballador extends Persona{

  /* ATRIBUTS */
  private static int salari = 0;


  /* CONSTRUCTOR */
  Treballador (String nom, int edat, double estatura, int salari){
    super(nom,edat,estatura);
    this.salari = salari;
  }


  /* MÈTODES */

  public void mostrarDades(){
    super.mostrarDades();
    System.out.println ("Salari: "+salari);
  }

}

