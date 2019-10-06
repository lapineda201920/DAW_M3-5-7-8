import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int nota1=0, nota2=0, nota3=0, nota4=0, nota5=0;
    Scanner sc=new Scanner(System.in);

    System.out.print("\nEscriu la primera nota: ");
    nota1=sc.nextInt();
    System.out.print("\nEscriu la segona nota: ");
    nota2=sc.nextInt();
    System.out.print("\nEscriu la tercera nota: ");
    nota3=sc.nextInt();
    System.out.print("\nEscriu la quarta nota: ");
    nota4=sc.nextInt();
    System.out.print("\nEscriu la cinquena nota: ");
    nota5=sc.nextInt();

    int [] notes={nota1, nota2, nota3, nota4, nota5};

    for (int i=0;i<5;i++){
      if (notes[i]<5){
        System.out.print("\nNota numero "+i+" suspesa.");
      }
      else{
        System.out.print("\nNota numero "+i+" aprobada.");
      }
    }
  }
}