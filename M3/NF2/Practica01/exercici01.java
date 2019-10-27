import java.util.Scanner;

class Persona { 
      // Atributos
      String nombre;
      int edat;
      double statura;
      // Constructores
      Persona (String nombre, int edat,double statura){
            this.nombre=nombre;      
            this.edat=edat;      
            this.statura=statura;
      }
      void saludar() {
            System.out.println("hola. Mi nombre es "+ nombre);
      }

      public void cumpliranyos() {
            edat++;
            System.out.println("hola. tengo "+ edat+"anyos");
      }
      public void crecer(double incremento) {
            statura+=incremento;
            System.out.println("hola. Mido "+ statura+"cm");
      }
}

class Main {
      public static void main(String[] args) {
            Persona juan=new Persona("Jordi",15,60);
            Persona isabel=new Persona("Isabel",15,60);
            isabel.saludar();
            juan.cumpliranyos();
            isabel.crecer(4.5);
            isabel.cumpliranyos(); // si no se inicializa se toma por defecto isabel.edat=0.
      }  
} 
