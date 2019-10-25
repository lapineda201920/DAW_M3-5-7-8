import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    int numeros [];
    numeros = new int[5];

    int numero=0, num_elem=0;
    Scanner sc=new Scanner(System.in);
    

    for (num_elem=0;num_elem<numeros.length;num_elem++){
      System.out.print("\nIntrodueix un número: ");
      numero=sc.nextInt();
      numeros[num_elem]=numero;
    }
    System.out.print("\nJa has arribat al final del array!");
  }
}
