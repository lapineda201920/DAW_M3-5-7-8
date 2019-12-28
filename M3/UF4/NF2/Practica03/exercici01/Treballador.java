import java.util.Scanner;
import java.util.Arrays;


public class Treballador extends Persona{

  /* ATRIBUTS */
  private static int salari = 0;

  /* CONSTRUCTOR */
  Treballador (String nom, int edat, double estatura){
    this.nom = nom;
    this.edat = edat;
    this.estatura = estatura;
  }


  /* MÈTODES */
  public void preguntar_salari() {
    Scanner sc=new Scanner(System.in);

    System.out.println ("Introdueix el seu salari: ");
    salari=sc.nextInt();
  }

  public void informacio_persona(){
    System.out.println ("La persona es diu:\n\nNom: "+nom+"\nEdat: "+edat+"\nEstatura: "+estatura+"\nSalari: "+salari);
  }

}

