import java.util.Scanner;
import java.util.Arrays;

class Main {

  public static void n_comp(int [] numero){
    int resultat=0, major=0; 

    System.out.print("\n\nNúmeros: "+numero[0]);

    for (int i=numero[0];i<numero[1];i++){
      System.out.print(", "+(i+1));
    }
  }

  public static void main(String[] args) {
    
    int [] numero=new int [2];
    Scanner sc=new Scanner(System.in);
    
    for (int i=0;i<2;i++){
      System.out.print("\nIntrodueix un número enter: ");
      numero[i]=sc.nextInt();
    }

    n_comp(numero);
  }
}