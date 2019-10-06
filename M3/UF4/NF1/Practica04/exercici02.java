import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int numero=0, i=0;
    long total=0;

    Scanner sc=new Scanner(System.in);
    System.out.print("Escriu un número: ");
    numero=sc.nextInt();

    System.out.print("\n"+numero+"= "+numero+" ");
    total=numero;
    i=(numero-1);

    while (i>0){
      total=total*i;
      System.out.print("("+i+") ");
      i--;
    }
    
    System.out.print("= "+total);
  }
}