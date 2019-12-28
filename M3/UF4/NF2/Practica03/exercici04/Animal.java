import java.util.Scanner;
import java.util.Arrays;


abstract class Animal{

  /* ATRIBUTS */
  protected String nom = "";


  /* CONSTRUCTOR */
  public Animal (String nom){
    this.nom = nom;
  }


  /* MÈTODES */
  abstract void fesSo();

}