import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int numero1, numero2, numero3, primer=0, segon=0, tercer=0;

    Scanner sc=new Scanner(System.in);
    System.out.print("Escriu un primer numero: ");
    numero1=sc.nextInt();
    System.out.print("Escriu un segon numero: ");
    numero2=sc.nextInt();
    System.out.print("Escriu un tercer numero: ");
    numero3=sc.nextInt();

    if (numero1>numero2 && numero1>numero3){
      primer=numero1;
      if (numero2>numero3){
        segon=numero2;
        tercer=numero3;
      }
      else{
        segon=numero3;
        tercer=numero2;
      }
    }
    else{
      if (numero2>numero1 && numero2>numero3){
        primer=numero2;
        if (numero1>numero3){
          segon=numero1;
          tercer=numero3;
        }
        else{
          segon=numero3;
          tercer=numero1;
        }
      }
      else{
        primer=numero3;
        if (numero2>numero1){
          segon=numero2;
          tercer=numero1;
        }
        else{
          segon=numero1;
          tercer=numero2;
        }
      }
    }
    System.out.print("\n1r Numero: "+ primer);
    System.out.print("\n2r Numero: "+ segon);
    System.out.print("\n3r Numero: "+ tercer);
  }
}
