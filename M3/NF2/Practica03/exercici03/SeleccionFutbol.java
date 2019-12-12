import java.util.Scanner;
import java.util.Arrays;


public class SeleccionFutbol{

  /* ATRIBUTS */
  protected int id = 0;
  protected String nom = "";
  protected String cognom = "";
  protected int edat = 0;


  /* CONSTRUCTOR */
  SeleccionFutbol (int id, String nom, String cognom, int edat){
    this.id = id;
    this.nom = nom;
    this.cognom = cognom;
    this.edat = edat;
  }


  /* MÈTODES */
  public void Concentrarse(){
    System.out.println ("\n"+nom+" -> concentrado");
  }

  public void Viajar(){
    System.out.println ("\n"+nom+" -> Viajando");
  }

}