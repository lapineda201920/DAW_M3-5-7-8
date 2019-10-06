import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    bucle1:
    for (int i = 0; i < 10; i++){

      System.out.println("Bucle i. i = "+i);
      for (int j = 0; j < 10; j++){

        System.out.println("Bucle j. j = "+j);
        for (int k = 0; k < 10; k++){

          System.out.println("Bucle k. k = "+k);
          break bucle1;
        }

      }

    }
    
  }
}

//Entra a l'etiqueta bucle1, comença un primer for (amb valor 0), imprimeix el valor, continua un segon i tercer 
for (amb valors 0), els imprimeix, i en el últim for està un break bucle1, el que farà que el procés s'acabi.