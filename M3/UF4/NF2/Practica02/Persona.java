
package persona;

public class Persona {
    static int numPersonas=0; // atributo de clase
    static int numEdats = 0; //atribut de clase
    private String nombre = ""; // atributo de objeto
    private int edat = 0;

    public Persona (String n, int e) {
        nombre = n;
        edat = e;
        numPersonas++;
        /* OPCIÓ 1*/    
        numEdats = numEdats + edat;
    }

    /* OPCIÓ 2   
    public static void sumaEdades(int edat){
        numEdats = numEdats + edat;
    }*/  

    public void muestra() {
        System.out.print("Soy "+nombre);
        System.out.println(" pero hay "+ (numPersonas-1) + " personas más.");
        numPersonas = numPersonas-1;
    }

    public void mostraedat() {
        System.out.println("\nEdat Total: "+ numEdats);
    }
}
class PersonaApp {
    public static void main(String arg[]) {
        Persona p1,p2,p3; // se crean tres instancias del atributo nombre

        p1 = new Persona("Pedro",21);
        p2 = new Persona("Juan",22);
        p3 = new Persona("Susana",24);

        /* OPCIÓ 2
        Persona.sumaEdades(getEdat(p1));
        Persona.sumaEdades(p2);
        Persona.sumaEdades(p3);*/

        p2.muestra();
        p1.muestra();
        p3.muestra();

        p3.mostraedat();
    }
}