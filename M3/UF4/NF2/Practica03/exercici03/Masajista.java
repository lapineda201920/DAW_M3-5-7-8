import java.util.Scanner;
import java.util.Arrays;


public class Masajista extends SeleccionFutbol{

  /* ATRIBUTS */
  private int anysExperiencia = 0;
  private String titulacio = "";


  /* CONSTRUCTOR */
  public Masajista (){
    super();
  }

  Masajista (int id, String nom, String cognom, int edat, int anysExperiencia, String titulacio){
    super (id, nom, cognom, edat);
    this.anysExperiencia = anysExperiencia;
    this.titulacio = titulacio;
  }


  /* MÈTODES */
  public void darMasaje(){
    System.out.println ("\n\nMasaje: Solo el masajista tiene el método para dar un masaje:");
    System.out.println ("\n"+nom+" -> "+nom+" -> dando masaje con Titulacion = "+titulacio);
  }

}