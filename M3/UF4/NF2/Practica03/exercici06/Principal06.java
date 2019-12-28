import java.util.Scanner;
import java.util.Arrays;

public class Principal06{

  public static void main(String[] args) {

    Hora rellotge=new Hora(12, 30); // Les 12:30
    
    System.out.println(rellotge);

    // Li sumem 1 minut 61 cops
    for (int i = 1; i <= 61; i++){
      rellotge.inc();
    }
    System.out.println(rellotge);

    // Li fem un set d'hora -- L'aplicarà ja que entra dins els paràmetres
    rellotge.setHora(23);
    System.out.println(rellotge);

    // Li fem un set de minut -- No l'aplicarà ja que passa de 59
    rellotge.setMinuts(60);
    System.out.println(rellotge);

    // Aquest mètode ens retorna una variable tipo String ... 
    // ... com si fos un System.out.println
    rellotge.toString();
  }

}