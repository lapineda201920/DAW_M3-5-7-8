import java.util.Scanner;

class Main {
  public static void procediment(int gener, int febrer, int març, int abril, int maig, int juny, int juliol, int agost, int setembre, int octubre, int novembre, int desembre, int mes){
    switch(mes){
      case 1:
        System.out.println("\nEl mes té "+gener+" dies.");
      break;
      case 2:
        System.out.println("\nEl mes té "+febrer+" dies.");
      break;
      case 3:
        System.out.println("\nEl mes té "+març+" dies.");
      break;
      case 4:
        System.out.println("\nEl mes té "+abril+" dies.");
      break;
      case 5:
        System.out.println("\nEl mes té "+maig+" dies.");
      break;
      case 6:
        System.out.println("\nEl mes té "+juny+" dies.");
      break;
      case 7:
        System.out.println("\nEl mes té "+juliol+" dies.");
      break;
      case 8:
        System.out.println("\nEl mes té "+agost+" dies.");
      break;
      case 9:
        System.out.println("\nEl mes té "+setembre+" dies.");
      break;
      case 10:
        System.out.println("\nEl mes té "+octubre+" dies.");
      break;
      case 11:
        System.out.println("\nEl mes té "+novembre+" dies.");
      break;
      case 12:
        System.out.println("\nEl mes té "+desembre+" dies.");
      break;
    }
  }

  public static int tipo_any(int any, int febrer){
    if ((any % 4 == 0) && ((any % 100 != 0) || (any % 400 == 0))){
      febrer=29;
      System.out.println("\nL'any és de traspàs\n");
    }
    else{
      febrer=28;
      System.out.println("\nL'any no és de traspàs\n");
    }
    return febrer;
  }

  public static void main(String[] args) {
    int gener=31, febrer=0, març=31, abril=30, maig=31, juny=30, juliol=31, agost=31, setembre=30, octubre=31, novembre=30, desembre=31, any=0, mes=0, total=0;

    Scanner sc=new Scanner(System.in);
    System.out.print("Escriu un any: ");
    any=sc.nextInt();
    while (mes<1 || mes>12){
      System.out.print("Escriu el numero d'un mes: ");
      mes=sc.nextInt();
    }

    febrer=tipo_any(any, febrer);
    
    procediment(gener, febrer, març, abril, maig, juny, juliol, agost, setembre, octubre, novembre, desembre, mes);
  }
}
