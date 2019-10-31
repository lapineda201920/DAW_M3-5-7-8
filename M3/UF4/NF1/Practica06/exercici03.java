import java.util.Scanner;
import java.util.Arrays;

class Main {

  public static void divisors(int [] numero){
    int i=0, y=0;
    int [] suma=new int [2];
    
    for (y=0;y<2;y++){
      System.out.println("\nDivisors del número "+numero[y]+": ");
      for(i=1;i<numero[y];i++){
        if (numero[y] % i == 0){
        System.out.println(i);
        suma[y]= suma[y] + i;
        }
      }
      System.out.println("\n\nSuma Total: "+suma[y]);
    }
    System.out.print("\n----------------------------------");
    if (suma[0] == numero[1] || suma[1] == numero[0]){
      System.out.println("\n\nSuma Nº1: "+suma[0]+"\nSuma Nº2: "+suma[1]);
      System.out.print("\nNúmeros amics! ");
    }
    else{
      System.out.println("\n\nSuma Nº1: "+suma[0]+"\nSuma Nº2: "+suma[1]);
      System.out.print("\nNúmeros no amics! ");
    }
  }

  public static void main(String[] args) {
    
    int [] numero=new int [2];
    Scanner sc=new Scanner(System.in);
    
    for (int i=0;i<2;i++){
      System.out.print("\nIntrodueix un número enter: ");
      numero[i]=sc.nextInt();
    }

    divisors(numero);
  }
}
