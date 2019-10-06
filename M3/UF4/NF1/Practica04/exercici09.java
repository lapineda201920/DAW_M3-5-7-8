import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    fuera:
      for (int i=0; i<5; i++){
        for (int j=0; j<5; j++){
          System.out.println("Dentro");
          continue fuera;
        } // fin del bucle anidado}
      }
  }
}

//Entra a l'etiqueta fuera, comença el primer i segon bucle, i en el segon bucle imprimeix la paraula "Dentro",
i a continuació fa un continue fuera, lo que el fa sortir del segon bucle per continuar amb el primer bucle. És
per aixó, que ha imprés solament 5 cops la paraula "Dentro", i no pas 25 cops.
