import java.util.Scanner;

class cuenta_bancaria {
  String nombre, constructor;
  int balance=0;

  cuenta_bancaria (String nombre, String constructor, int balance){
    this.nombre=nombre;      
    this.constructor=constructor;      
    this.balance=balance;
  }

  public void depositarDinero(){
    Scanner sc=new Scanner(System.in);
    int depositar=0;

    System.out.print("Introdueix la quantitat a depositar: ");
    depositar=sc.nextInt();

    balance=depositar+balance;

    System.out.print("Total del balanç: "+balance);
  }

  public void retirarDinero(){
    Scanner sc=new Scanner(System.in);
    int retirar=0;

    System.out.print("Introdueix la quantitat a retirar: ");
    retirar=sc.nextInt();

    balance=balance-retirar;

    System.out.print("Total del balanç: "+balance);
  }

  public void obtenerBalance(){
    System.out.print("El total del balanç és: "+balance);
  }
}

class Main {

  public static int menu(int num){
    Scanner sc=new Scanner(System.in);

    System.out.print("\n\n-----MENU-----\n");
    System.out.print("\nQuè vols fer:");
    System.out.print("\n1) Depositar Diners");
    System.out.print("\n2) Retirar Diners");
    System.out.print("\n3) Obtenir Balanç");
    System.out.print("\n4) Tancar Programma\n\n");
    System.out.print("Resposta: ");
    num=sc.nextInt();
    return num;
  }

  public static void main(String[] args) {
    String nombre, constructor;
    int balance=0, num=0;

    Scanner sc=new Scanner(System.in);

    System.out.print("Introdueix el nom de la persona: ");
    nombre=sc.nextLine();
    System.out.print("Introdueix el tipus de compte: ");
    constructor=sc.nextLine();
    System.out.print("Introdueix el balanç: ");
    balance=sc.nextInt();
    
    cuenta_bancaria usuari=new cuenta_bancaria(nombre,constructor,balance);

    while (num!=4){
      num=menu(num);
      switch (num) {
        case 1:
          usuari.depositarDinero();
        break;
        case 2:
          usuari.retirarDinero();
        break;
        case 3:
          usuari.obtenerBalance();
        break;
        case 4:
          System.out.println("Tancant el programa");
        break;
        default:
          System.out.println("\nNumero incorrecte!\n");
        break;

      }
    }
  }
}
