import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int nota=0;

    Scanner sc=new Scanner(System.in);
    System.out.print("Escriu una nota (0-10): ");
    nota=sc.nextInt();

    while (nota>10 || nota<0){
      System.out.print("Escriu una nota (0-10): ");
      nota=sc.nextInt();
    }
    
    switch (nota){
      case 0:case 1:case 2:case 3:case 4:
        System.out.print("\nInsuficient");
      break;
      case 5:
        System.out.print("\nSuficient");
      break;
      case 6:
        System.out.print("\nBé");
      break;
      case 7:case 8:
        System.out.print("\nNotable");
      break;
      case 9:case 10:
        System.out.print("\nExcelent");
      break;
      default:
      break;
    }
  }
}
