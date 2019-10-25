import java.util.Scanner;
import java.util.Arrays;

class Main {

  public static void insert(int insereix,int[] numeros){
    int i=0, k=0;

    for(i=0;i<numeros.length-1;i++){
      if(numeros[i]>insereix){
        break;
      }
    }

    for(k=numeros.length-2; k>=i; k--){
      numeros[k+1]=numeros[k];            
    }
    
    numeros[i]=insereix;
    System.out.println(Arrays.toString(numeros));
  }

  public static void main(String[] args) {
    
    int[] numeros=new int[5];
    numeros[0]=5;
    numeros[1]=6;
    numeros[2]=9;
    numeros[3]=11;
    int insereix=0;
    Scanner sc=new Scanner(System.in);

    System.out.println("\n\n"+Arrays.toString(numeros));

    System.out.print("\nIntrodueix un número: ");
    insereix=sc.nextInt();

    insert(insereix,numeros);
  }
}