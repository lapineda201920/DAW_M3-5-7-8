import java.util.Scanner;
import java.util.Arrays;

class Main {

  public static void crear_triangle(int [][] array, int num_files){
    for (int y=0;y < num_files;y++){
      array [y][0] =  1 ;

      for (int z=1;z < num_files;z++){
        if (y != 0){
          array [y][z] =  array [y-1][z-1] + array [y-1][z] ;
        }
      }
    }

    System.out.println();
    for(int i=0; i<num_files; i++){
      for(int j=0; j<num_files; j++){
        System.out.print(array[i][j]+ "\t");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    
    int num_files;
    Scanner sc=new Scanner(System.in);
    
    System.out.print("\nIntrodueix un número de files: ");
    num_files=sc.nextInt();

    int [][] array = new int [num_files][num_files];

    crear_triangle(array, num_files);
  }
}
