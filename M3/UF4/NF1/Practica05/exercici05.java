import java.util.Scanner;
import java.util.Arrays;

class Main {
  public static int search(int borrar,int i,int[] numeros){
    boolean estat=false;
    Scanner sc=new Scanner(System.in);
    
    while (estat==false){
      System.out.print("\nIntrodueix un número a eliminar: ");
      borrar=sc.nextInt();

      for(i=0;i<numeros.length-1;i++){
        if(numeros[i]==borrar){
          estat=true;
          break;
        }
      }
      if (estat==false){
        System.out.print("\nEl numero introduït no està en el array\n");
      }
    }
    return i;
  }

  public static void delete(int borrar,int i,int[] numeros){
    int k=0;
    for(k=i;k<numeros.length-1;k++){
      numeros[k]=numeros[k+1];            
    }
    
    System.out.println(Arrays.toString(numeros));
  }

  public static void main(String[] args) {
    
    int[] numeros=new int[5];
    numeros[0]=5;
    numeros[1]=6;
    numeros[2]=9;
    numeros[3]=11;
    int borrar=0, i=0;

    System.out.println("\n\n"+Arrays.toString(numeros));

    i=search(borrar,i,numeros);
    delete(borrar,i,numeros);
  }
}