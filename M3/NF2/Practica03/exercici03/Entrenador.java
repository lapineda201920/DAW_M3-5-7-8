import java.util.Scanner;
import java.util.Arrays;


public class Entrenador extends SeleccionFutbol{

  /* ATRIBUTS */
  private String id_federacio = "";


  /* CONSTRUCTOR */
  public Entrenador (){
    super();
  }

  Entrenador (int id, String nom, String cognom, int edat, String id_federacio){
    super (id, nom, cognom, edat);
    this.id_federacio = id_federacio;
  }


  /* MÈTODES */
  public void dirigirPartido(){
    System.out.println ("\n\nPartido de futbol: Solamente el entrandor y el futbolista tiene metodos para el partido de futbol:");
    System.out.println ("\n"+nom+" -> "+nom+" -> dirije partido. Federacion = "+id_federacio);
  }

  public void dirigirEntrenamiento(){
    System.out.println ("\n\nEntrenamiento: Solamente el entrandor y el futbolista tiene metodos para entrenar:");
    System.out.println ("\n"+nom+" -> "+nom+" -> dirije Entreno. Federacion = "+id_federacio);
  }

}
