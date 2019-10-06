import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int numero_secret=0, numero=0;
    Scanner sc=new Scanner(System.in);

    numero_secret = (int)(Math.random()*(100-1+1)+1);
    System.out.print(numero_secret);

    while (numero!=(-1) && numero!=numero_secret){
      System.out.print("\nEscriu un número: ");
      numero=sc.nextInt();
      if (numero==-1 || numero==numero_secret){
        System.out.print("\nFi del joc!\n");
      }
      else{
        if (numero_secret>numero){
          System.out.print("\nMajor\n");
        }
        else{
          System.out.print("\nMenor\n");
        }
      }
    }
  }
}
