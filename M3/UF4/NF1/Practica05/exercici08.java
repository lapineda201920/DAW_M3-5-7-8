import java.util.Scanner;
import java.util.Arrays;

class Main {

  public static void insert(int resposta,String[][] programador){
    String nom, nota;
    Scanner sc=new Scanner(System.in);

    for (int i=0;i<resposta;i++){
      System.out.print("\nIntrodueix un nom: ");
      nom=sc.nextLine();
      programador[i][0]=nom;
      System.out.print("\nIntrodueix una nota: ");
      nota=sc.nextLine();
      programador[i][1]=nota;
      System.out.print ("\n"+Arrays.toString(programador[i])+"\n");
    }
    //Despres de buscar-ho molt, no he sigut capaç de saber-ho fer.
  }

  public static void main(String[] args) {
    
    String [][] programador;
    int resposta=11;
    Scanner sc=new Scanner(System.in);
    
    while (resposta > 10 || resposta < 0){
      System.out.print("\nIntrodueix quantitat de programados a introduir (1-10): ");
      resposta=sc.nextInt();
    }
    programador=new String [resposta][2];

    insert(resposta, programador);
  }
}
