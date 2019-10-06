import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int numero=0, menor=1, major=1;
    Scanner sc=new Scanner(System.in);

    for (int i=0;i<5;i++){
      System.out.print("\nEscriu un numero: ");
      numero=sc.nextInt();
      
      if (numero<menor){
        menor=numero;
      }
      if (numero>major){
        major=numero;
      }
    }
    System.out.println("\n\nEl numero major és: " +major);
    System.out.println("El numero menor és: " +menor);
  }
}