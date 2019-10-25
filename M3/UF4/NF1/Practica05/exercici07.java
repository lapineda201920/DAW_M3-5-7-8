import java.util.Scanner;
import java.util.Arrays;

class Main {

  public static void insert(int resposta,int[] numeros){
    int numero=0;
    Scanner sc=new Scanner(System.in);

    for (int i=0;i<resposta;i++){
      System.out.print("\nIntrodueix un número: ");
      numero=sc.nextInt();
      numeros[i]=numero;
    }

    for (int contador=numeros.length-1; contador>=0; contador--){
      System.out.println(numeros[contador]);
    }
  }

  public static void main(String[] args) {
    
    int [] numeros;
    int resposta=0;
    Scanner sc=new Scanner(System.in);
    
    System.out.print("\nIntrodueix quantitat de numeros a introduir: ");
    resposta=sc.nextInt();
    numeros=new int[resposta];

    insert(resposta, numeros);
  }
}