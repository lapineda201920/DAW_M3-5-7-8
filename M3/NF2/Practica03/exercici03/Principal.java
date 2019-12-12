import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;


public class Principal{

  // ARRAYLIST DE OBJETOS SELECCIONFUTBOL
  public static ArrayList <SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();
  
  public static void main(String[] args) {

    // SELECCIONFUTBOL [] INTEGRANTES = NEW SELECCIONFUTBOL [20]
    Entrenador delBosque = new Entrenador(1, "Vicente", "Del Bosque", 60, "284EZ89");
    Futbolista iniesta = new Futbolista(2, "Andres", "Inicesta", 29, 6, "Interior Derecho");
    Masajista raulMartinez = new Masajista(3, "Raúl", "Martínez", 41, "Licienciado en Fisioterapia", 18);

    integrantes.add(delBosque);
    integrantes.add(iniesta);
    integrantes.add(raulMartinez);

    // CONCENTRACION
    System.out.println("Todos los integrantes comienzan una concentración (Todos ejecutan el mismo método)");
    for (SeleccionFutbol integrante : integrantes){
      integrante.Concentrarse();
    }

    // VIAJE
    System.out.println("Todos los integrantes viajan para jugar un partido (Todos ejecutan el mismo método)");
    for (SeleccionFutbol integrante : integrantes){
      integrante.Viajar();
    }

    // MÈTODES INDIVIDUALS
    delBosque.dirigirEntrenamiento();
    iniesta.entrenar();
    raulMartinez.darMasaje();
    delBosque.dirigirPartido();
    iniesta.jugarPartido();
  }

}


