import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;


public class Principal{

  // ARRAYLIST DE OBJETOS SELECCIONFUTBOL
  public static ArrayList <SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();
  
  public static void main(String[] args) {

    // SELECCIONFUTBOL [] INTEGRANTES = NEW SELECCIONFUTBOL [20]
    SeleccionFutbol delBosque = new Entrenador(1, "Vicente", "Del Bosque", 60, "284EZ89");
    SeleccionFutbol iniesta = new Futbolista(2, "Andres", "Inicesta", 29, 6, "Interior Derecho");
    SeleccionFutbol raulMartinez = new Masajista(3, "Raúl", "Martínez", 41, "Licienciado en Fisioterapia", 18);

    integrantes.add(delBosque);
    integrantes.add(iniesta);
    integrantes.add(raulMartinez);

    // CONCENTRACION
    System.out.println("Todos los integrantes comienzan una concentración (Todos ejecutan el mismo método)");
    for (SeleccionFutbol integrante : integrantes){
      integrante.concentrarse();
    }

    // VIAJE
    System.out.println("Todos los integrantes viajan para jugar un partido (Todos ejecutan el mismo método)");
    for (SeleccionFutbol integrante : integrantes){
      integrante.viajar();
    }

    // ENTRENAMIENTO
    System.out.println("nEntrenamiento: Todos los integrantes tienen su función en un entrenamiento (Especialización)");
    for (SeleccionFutbol integrante : integrantes) {
      System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
      integrante.entrenamiento();
    }

    // PARTIDO DE FUTBOL
    System.out.println("nPartido de Fútbol: Todos los integrantes tienen su función en un partido (Especialización)");
    for (SeleccionFutbol integrante : integrantes) {
      System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
      integrante.partidoFutbol();
    }

    // PLANIFICAR ENTRENAMIENTO
    System.out.println("nPlanificar Entrenamiento: Solo el entrenador tiene el método para planificar un entrenamiento:");
    System.out.print(delBosque.getNombre() + " " + delBosque.getApellidos() + " -> ");
    ((Entrenador) delBosque).planificarEntrenamiento();

    // ENTREVISTA
    System.out.println("nEntrevista: Solo el futbolista tiene el método para dar una entrevista:");
    System.out.print(iniesta.getNombre() + " " + iniesta.getApellidos() + " -> ");
    ((Futbolista) iniesta).entrevista();

    // MASAJE
    System.out.println("nMasaje: Solo el masajista tiene el método para dar un masaje:");
    System.out.print(raulMartinez.getNombre() + " " + raulMartinez.getApellidos() + " -> ");
    ((Masajista) raulMartinez).darMasaje();
    
  }

}


