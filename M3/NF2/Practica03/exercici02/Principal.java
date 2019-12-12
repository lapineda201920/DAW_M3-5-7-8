import java.util.Scanner;
import java.util.Arrays;


public class Principal{

  public static void main(String[] args) {

    Persona P=new Persona("Manolo", 24, 155);
    Treballador E=new Treballador("Jaume", 32, 178, 1200);
    
    P.mostrarDades();
    E.mostrarDades();

  }

}


