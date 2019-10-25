import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    int numeros[]=new int[4], i=0, numero=0;
    Scanner sc=new Scanner(System.in);

    for (i=0;i<numeros.length+1;i++){
      System.out.print("Escriu un número: ");
      numero=sc.nextInt();
      numeros[i]=numero;
    }
  }
}
