import java.util.Scanner;
import java.util.Arrays;


public class Futbolista extends SeleccionFutbol{

  /* ATRIBUTS */
  private int dorsal = 0;
  private String demarcacio = "";


  /* CONSTRUCTOR */
  @Override
  public void entrenamiento() {
    System.out.println("Realiza un entrenamiento (Clase Futbolista)");
  }

  @Override
  public void partidoFutbol() {
    System.out.println("Juega un Partido (Clase Futbolista)");
  }

  public void entrevista() {
    System.out.println("Da una Entrevista");
  }


  /* MÈTODES */


}
