import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int numero=0, contador=0;
    Scanner sc=new Scanner(System.in);

    System.out.print("\nEscriu un numero: ");
    numero=sc.nextInt();
    contador=numero;


    for (int i=0;i<numero;i++){
      for (int y=0;y<contador;y++){
        System.out.print("*");
      }
      System.out.print("\n");
      contador--;
    }
  }
}
