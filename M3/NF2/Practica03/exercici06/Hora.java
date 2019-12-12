import java.util.Scanner;
import java.util.Arrays;


public class Hora{

  /* ATRIBUTS */
  private int hora = 0;
  private int minut = 0;


  /* CONSTRUCTOR */
  Hora (int hora, int minut){
    this.hora = hora;
    this.minut = minut;
  }


  /* MÈTODES */

  public void inc() {
    if (minut != 59){
      minut = minut + 1; 
    }
	  else{
      minut = 0;
      if (hora != 23){
        hora ++;
      }
      else{
        hora = 0;
      }
    }
  }

  public void setMinuts(int minut) {
	  if (minut >= 1 && minut <=59){
      this.minut = minut;
    }
  }
  
  public void setHora(int hora) {
	  if (hora >= 1 && hora <=23){
      this.hora = hora;
    }
  }
  
  public String toString() {
    String rellotge = "La hora actual és les "+hora+" i "+minut+" minuts.";

	  return rellotge;
	}

}