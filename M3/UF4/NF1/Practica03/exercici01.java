import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    double numero;

    Scanner sc=new Scanner(System.in);
    System.out.print("Escriu un numero decimal: ");
    numero=sc.nextDouble();

    if (numero>(-1) && numero<(1) && numero!=0){
      System.out.print("Numero correcte");
    }
    else{
      System.out.print("Numero incorrecte");
    }
  }
}
