import java.util.Scanner;
import java.util.Arrays;


abstract class Hora{

  /* ATRIBUTS */
  protected int hora = 0;
  protected int segons = 0;


  /* CONSTRUCTOR */
  Hora (int hora, int minut){
    this.hora = hora;
    this.segons = segons;
  }


  /* MÈTODES */

  abstract void inc();

  abstract void setSegons();

  abstract void horaExacte();

}