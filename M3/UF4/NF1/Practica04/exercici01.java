import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int numero=0, total=0, i=0;

    Scanner sc=new Scanner(System.in);
    System.out.print("Escriu un número: ");
    numero=sc.nextInt();

    System.out.print("\n"+numero+"= "+numero+" ");
    total=numero;

    for (i=(numero-1); i>0; i--){
      total=total*i;
      System.out.print("("+i+") ");
    }
    System.out.print("= "+total);
  }
}