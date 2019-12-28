import java.util.Scanner;
import java.util.Arrays;


public class Gos extends Animal{

  /* ATRIBUTS */


  /* CONSTRUCTOR */
  public Gos (){
    super();
  }

  Gos (String nom){
    super (nom);
  }


  /* MÈTODES */
  public void fesSo(){
    System.out.println ("\nSoc un gos");
    System.out.println ("\n\nEm dic "+nom+": BUP BUP BUP");
  }

}
