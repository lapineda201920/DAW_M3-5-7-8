import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int i=0, j=0;
    boolean esPrim;

    for(i=2;i<=100;i++){
        esPrim=true;
        for(j=2;j<i;j++){
          if(i%j==0){
            esPrim = false;
          }
        }
        if(esPrim){
          System.out.print(i+", ");
        }
    }
  }
}