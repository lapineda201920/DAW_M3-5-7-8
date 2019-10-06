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

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Introdueix un numero: ");
    int num1=sc.nextInt();
    System.out.print("Introdueix un altre numero: ");
    int num2=sc.nextInt();
    int num=1;

    while (num!=3){
      num=menu(num);
      switch (num) {
        case 1:
          int suma= num1+num2;
          System.out.println("Suma:"+num1+"+"+num2+"="+suma);
          break;
        case 2:
          int mult= num1*num2;
          System.out.println("Multiplicació:"+num1+"*"+num2+"="+mult);
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
