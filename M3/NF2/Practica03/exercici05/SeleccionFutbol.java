import java.util.Scanner;
import java.util.Arrays;


public abstract class SeleccionFutbol{

  /* ATRIBUTS */
  protected int id = 0;
  protected String nom = "";
  protected String cognom = "";
  protected int edat = 0;


  /* CONSTRUCTOR */
  public void viajar() {
    System.out.println("Viajar (Clase Padre)");
  }

  public void concentrarse() {
    System.out.println("Concentrarse (Clase Padre)");
  }


  /* MÈTODES */
  public abstract void entrenamiento();

	public void partidoFutbol() {
	  System.out.println("Asiste al Partido de Fútbol (Clase Padre)");
	}

}