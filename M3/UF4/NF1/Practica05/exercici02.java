import java.util.Scanner;

class Main {

  public static void introduir(int resposta,int numero,int[] numeros){
    Scanner sc=new Scanner(System.in);

    for (int i=0;i<resposta;i++){
      System.out.print("\nIntrodueix un número: ");
      numero=sc.nextInt();
      numeros[i]=numero;
    }
  }

  public static void buscador(int buscar,boolean resp,int[] numeros){
    for (int i=0;i<numeros.length;i++){
      if(numeros[i]==buscar){
        System.out.print("\nnumeros["+i+"]");
        resp=true;
      }
      else{
      }
    }
    if (resp==true){
      System.out.print("\n\nResposta: "+buscar);
    }
    else{
      System.out.print("Resposta: -1");
    }
  }

  public static void main(String[] args) {
    
    int [] numeros;
    int numero=1, resposta=0, buscar=0;
    boolean resp=false;
    Scanner sc=new Scanner(System.in);
    
    System.out.print("\nIntrodueix quantitat de numeros a introduir: ");
    resposta=sc.nextInt();
    numeros=new int[resposta];

    introduir(resposta, numero, numeros);

    System.out.print("\nIntrodueix el numero a buscar: ");
    buscar=sc.nextInt();

    buscador(buscar, resp, numeros);
  }
}
