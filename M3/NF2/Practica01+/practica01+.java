import java.util.Scanner;
import java.util.Arrays;

class Main {

  public static void AfegirElement(int [] array, int num_caselles){
    /*int num_introduir;
    boolean alert=false;
    Scanner sc=new Scanner(System.in);
    
    System.out.print("\nIntrodueix un número a introduïr: ");
    num_introduir=sc.nextInt();
    
    for (int i = 0; i < array.length; i++){
      if (array[i] != 0){
        alert = true;
        break;
      }
    }
    if (alert == false){
      
    }
    else{

    }

    // No sé com fer la part d'afegir els números. Ho he intentat de fer-ho, però sense resultat
    sc.close();*/
  }

  public static void ExtreureElement(int [] array){
    int num_extreure;
    Scanner sc=new Scanner(System.in);
    
    System.out.print("\nIntrodueix un número a extreure: ");
    num_extreure=sc.nextInt();

    for (int i = 0; i < array.length; i++){
      if (array[i] == num_extreure){
        array[i] = 0;
        break;
      }
    }
    sc.close();
  }

  public static void ConsultarSiCuaBuida(int [] array){
    boolean alert=false;

    for (int i = 0; i < array.length; i++){
      if (array[i] != 0){
        System.out.println("\n\nL'array no està buït!");
        alert = true;
        break;
      }
    }
    if (alert == false){
      System.out.println("\n\nL'array està buït!");
    }

    System.out.println(Arrays.toString(array));
  }

  public static void ConsultarSiCuaPlena(int [] array, int num_caselles){
    boolean alert=false;

    for (int i = 0; i < array.length; i++){
      if (array[i] != 0){
        System.out.println("L'array no està ple!");
        alert = true;
        break;
      }
    }
    if (alert == false){
      System.out.println("L'array està ple!");
    }

    System.out.println(Arrays.toString(array));
  }

  public static void switch_resposta(int resposta, int [] array, int num_caselles){
    switch(resposta){
      case 1:
        AfegirElement(array, num_caselles);
      break;
      case 2:
        ExtreureElement(array);
      break;
      case 3:
        ConsultarSiCuaBuida(array);
      break;
      case 4:
        ConsultarSiCuaPlena(array, num_caselles);
      break;
      case 5:
        System.out.println("\n\nSortint del programa");
      break;
      default:
      break;
    }
  }

  public static int menu(){
    int resposta=6;
    Scanner sc=new Scanner(System.in);

    while(resposta > 5 | resposta < 1){
      System.out.print("\n\n-----MENU-----\n\n");
      System.out.print("\n1- Afegir Element\n");
      System.out.print("\n2- Extreure Element\n");
      System.out.print("\n3- Consultar si la cua està buida\n");
      System.out.print("\n4- Consultar si la cua està plena\n");
      System.out.print("\n5- Sortir del programa\n");
      System.out.print("\nResposta: ");
      resposta=sc.nextInt();
    }
    sc.close();
    return resposta;
  }

  public static void main(String[] args) {
    
    int num_caselles, resposta=0;
    Scanner sc=new Scanner(System.in);
    
    System.out.print("\nIntrodueix un número de caselles: ");
    num_caselles=sc.nextInt();

    int [] array = new int [num_caselles];

    while (resposta != 5){
      resposta = menu();
      switch_resposta(resposta, array, num_caselles);
    }
    sc.close();
  }
}
