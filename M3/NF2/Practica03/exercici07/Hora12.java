import java.util.Scanner;
import java.util.Arrays;


public class Hora12 extends Hora{

  /* ATRIBUTS */
  protected String mer = "am"; // Indica si la horaa és am o pm


  /* CONSTRUCTOR */
  public Hora12 (int hora, int minut, String mer){
    super(hora, minut);
    this.mer = mer;
  }


  /* MÈTODES */
  @Override
  public void inc() {
    super.inc(); // Incrementa minuts amb el mètode de la superclasse
    if (hora != 12){
      hora ++;
    }
	  else{
      hora = 0;
      if (mer == "am"){
        mer = "pm";
      }
      else{
        mer = "am";
      }
    }
  }

  @Override  
  public void setHora(int hora) {
	  if (hora >= 1 && hora <=12){
      this.hora = hora;
    }
  }
  
  @Override
  public String toString() {
    String rellotge = "La hora actual és les "+hora+" "+mer;

	  return rellotge;
	}
}
