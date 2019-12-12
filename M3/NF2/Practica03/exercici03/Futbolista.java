import java.util.Scanner;
import java.util.Arrays;


public class Futbolista extends SeleccionFutbol{

  /* ATRIBUTS */
  private int dorsal = 0;
  private String demarcacio = "";


  /* CONSTRUCTOR */
  public Futbolista (){
    super();
  }

  Futbolista (int id, String nom, String cognom, int edat, int dorsal, String demarcacio){
    super (id, nom, cognom, edat);
    this.dorsal = dorsal;
    this.demarcacio = demarcacio;
  }


  /* MÈTODES */
  public void entrenar(){
    System.out.println ("\n"+nom+" -> "+nom+" -> concentrados");
  }

  public void jugarPartido(){
    System.out.println ("\n"+nom+" -> "+nom+" -> jugando partido con dorsal "+dorsal+ " demarcacion = "+demarcacio);
  }

}
