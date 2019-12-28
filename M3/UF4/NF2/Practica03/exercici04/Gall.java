import java.util.Scanner;
import java.util.Arrays;


public class Gall extends Animal{

  /* ATRIBUTS */


  /* CONSTRUCTOR */
  public Gall (){
    super();
  }

  Gall (String nom){
    super (nom);
  }


  /* MÈTODES */
  public void fesSo(){
    System.out.println ("\nSoc un gall");
    System.out.println ("\n\nEm dic "+nom+": Kikirikiiii");
  }

}
