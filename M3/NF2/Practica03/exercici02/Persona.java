import java.util.Scanner;
import java.util.Arrays;


public class Persona{  

  /* ATRIBUTS */
  protected String nom = "";
  protected int edat = 0;
  protected double estatura = 0;


  /* CONSTRUCTOR */
  Persona (String nom, int edat, double estatura){
    this.nom = nom;
    this.edat = edat;
    this.estatura = estatura;
  }


  /* MÈTODES */
  public void mostrarDades(){
    System.out.println ("\n\nLa persona es diu:\n\nNom: "+nom+"\nEdat: "+edat+"\nEstatura: "+estatura);
  }

}
