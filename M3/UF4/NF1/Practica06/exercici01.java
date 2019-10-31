import java.util.Scanner;
import java.util.Arrays;

class Main {

  public static int comparar(int [] numero){
    int resultat=0, major=0;

    for (int i=0;i<2;i++){
      resultat=Integer.compare(numero[i], numero[i+1]);

      if (resultat==1 && major<numero[i]){
        major=numero[i];
      }
      if (resultat==-1 && major<numero[i+1]){
        major=numero[i+1];
      }
    }

    return major;
  }

  public static void main(String[] args) {
    
    int [] numero=new int [3];
    Scanner sc=new Scanner(System.in);
    
    for (int i=0;i<3;i++){
      System.out.print("\nIntrodueix un número enter: ");
      numero[i]=sc.nextInt();
    }

    int resultat=comparar(numero);
    System.out.print("\n\nEl número més gran dels 3 és: "+resultat);
  }
}
