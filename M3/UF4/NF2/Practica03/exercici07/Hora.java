import java.util.Scanner;
import java.util.Arrays;


abstract class Hora{

  /* ATRIBUTS */
  protected int hora = 0;
  protected int minut = 0;


  /* CONSTRUCTOR */
  Hora (int hora, int minut){
    this.hora = hora;
    this.minut = minut;
  }


  /* MÈTODES */

  abstract void inc();

  abstract void setMinuts();

  abstract void setHora();

  abstract String toString(); // No entenc el perquè em surt error

}