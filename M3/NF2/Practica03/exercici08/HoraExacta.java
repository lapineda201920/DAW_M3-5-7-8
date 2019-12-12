import java.util.Scanner;
import java.util.Arrays;


public class HoraExacta extends Hora{

  /* ATRIBUTS */


  /* CONSTRUCTOR */
  public HoraExacta (int hora, int segons){
    super(hora, segons);
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
  public void setSegons(int segons) {
	  if (segons >= 1 && segons <=59){
      this.segons = segons;
    }
  }
  
  @Override  
  public void setHora(int hora) {
	  if (hora >= 1 && hora <=12){
      this.hora = hora;
    }
  }
}
