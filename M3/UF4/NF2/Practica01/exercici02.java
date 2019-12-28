import java.util.Scanner;

class Main {

  public static int menu(int num){
    Scanner sc=new Scanner(System.in);

    System.out.print("\n-----MENU-----\n");
    System.out.print("\nQuè vols fer:");
    System.out.print("\n1) Sumar");
    System.out.print("\n2) Multiplicar");
    System.out.print("\n3) Sortir\n\n");
    System.out.print("Resposta: ");
    num=sc.nextInt();
    return num;
  }

  public static int multiplicar(int num1, int num2, int mult){
    mult = num1 * num2;
    return mult;
  }

  public static int sumar(int num1, int num2, int suma){
    suma = num1 + num2;
    return suma;
  }

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Introdueix un numero: ");
    int num1=sc.nextInt();
    System.out.print("Introdueix un altre numero: ");
    int num2=sc.nextInt();
    int num=0, suma=0, mult=0;

    while (num!=3){
      num=menu(num);
      switch (num) {
        case 1:
          suma= sumar(num1,num2,suma);
          System.out.println("Suma:"+suma);
          break;
        case 2:
          mult= multiplicar(num1,num2,suma);
          System.out.println("Multiplicació:"+mult);
          break;
        case 3:
          System.out.println("Tancant el programa");
        break;
        default:
          System.out.println("\nNumero incorrecte!\n");
        break;

      }
    }
  }
}
