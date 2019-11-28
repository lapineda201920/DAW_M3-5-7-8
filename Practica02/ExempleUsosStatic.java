
//package exempleusosstatic;

public class ExempleUsosStatic{     
    private static int comptador = 0;     
    private int numeroSerie; 
    //iniciador static    
    static {                   
        System.out.println ("Iniciador  \"static\" que  s'executa en  carregar la classe");    
    }
    //iniciador no static  
    {         
        System.out.println ("Iniciador que s'executa en la creació de cada objecte de la clase");       
    }  
    public ExempleUsosStatic() {        
        comptador++;        
        System.out.println ("Se acaba de crear el objecte número " + numeroSerie);    
    }    
    public int nombreObjectesCreats() {        
        return comptador;    
    }   
    public int getnumeroSerie(){      
        return numeroSerie;   
    }
}
public class ExempleUsoStaticApp{    
    public static void main(String args[]) {      
        ExempleUsosStatic d1 = new ExempleUsosStatic();      
        ExempleUsosStatic d2;      
        d2 = new ExempleUsosStatic();      
        System.out.println("Numero de serie de d1 = " + d1.getnumeroSerie());     
        System.out.println("Numero de serie de d2 = " + d2.getnumeroSerie());      
        System.out.println("Objectes creats: "+ d2.nombreObjectesCreats());   
    } 
}