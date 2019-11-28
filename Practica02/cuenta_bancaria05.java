import java.util.Scanner;

class cuenta_bancaria05 {
  public String nombre, banc;
  private int balance=0, limit=0;

    /* CONSTRUCTORS */

    cuenta_bancaria (int balance){
        limit=0;      
        this.balance=balance;
    }

    cuenta_bancaria (String nombre, int limit, int balance, String banc){
        this.nombre=nombre;
        this.limit=limit;      
        this.balance=balance;
        this.banc=banc;
    }

    /* MÈTODES */

    public crear_compte() {        
        comptador++;        
        System.out.println ("S'acaba de crear el usuari número " + comptador);
        balance = 0;
        limit = -50;
    }

    {        
        Scanner sc=new Scanner(System.in);
        String nou_banc;

        System.out.print("Introdueix el nou banc a canviar: ");
        nou_banc=sc.nextInt();

        banc=nou_banc;

        System.out.print("\nNom del nou banc: "+nou_banc);
    }

    public void ingresar_dinero(){
        Scanner sc=new Scanner(System.in);
        int depositar=0;

        System.out.print("Introdueix la quantitat a depositar: ");
        depositar=sc.nextInt();

        balance=depositar+balance;

        System.out.print("Total del balanç: "+balance);
    }

    public void sacar_dinero(){
        Scanner sc=new Scanner(System.in);
        int retirar=0;

        System.out.print("Introdueix la quantitat a retirar: ");
        retirar=sc.nextInt();

        if (retirar >= limit){
            System.out.print("\nOperació no executada!\n");
        }
        else{
            balance=balance-retirar;
            System.out.print("\nOperació executada amb èxit!\n");
            System.out.print("Total del balanç: "+balance);
        }
    }

    public void mostrar_informacio(){
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
        String nombre;
        int balance=0, limit=0, num=0;

        Scanner sc=new Scanner(System.in);

        System.out.print("Introdueix el nom de la persona: ");
        nombre=sc.nextLine();
        System.out.print("Introdueix el límit de descobert: ");
        limit=sc.nextLine();
        System.out.print("Introdueix el balanç: ");
        balance=sc.nextInt();

        Cuenta_bancaria05 usuari = new crear_compte(nombre,limit,balance,"LaCaixa");

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