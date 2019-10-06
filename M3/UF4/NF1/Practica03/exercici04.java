import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int hora=0, minut=0, segon=0;

    Scanner sc=new Scanner(System.in);
    System.out.print("Escriu una hora (0-23): ");
    hora=sc.nextInt();
    System.out.print("Escriu un minut (0-59): ");
    minut=sc.nextInt();
    System.out.print("Escriu un segon (0-59): ");
    segon=sc.nextInt();

    while (hora>23 || hora<0){
      System.out.print("Escriu una hora (0-23): ");
      hora=sc.nextInt();
    }
    while (minut>59 || minut<0){
      System.out.print("Escriu un minut (0-59): ");
      minut=sc.nextInt();
    }
    while (segon>59 || segon<0){
      System.out.print("Escriu un segon (0-59): ");
      segon=sc.nextInt();
    }
    
    if (segon==59){
      segon=0;
      minut += 1;
    }
    else{
      segon +=1;
    }
    if (minut==59 && segon>59){
      minut=0;
      hora += 1;
    }
    else{
    }
    if (hora==23 && minut>=59 && segon>59){
      segon=0;
      minut=0;
      hora=0;
    }
    else{
    }
    System.out.print("\n"+hora+":"+minut+":"+segon);
  }
}