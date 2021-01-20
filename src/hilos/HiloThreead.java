package hilos;
/**
 * Esta es la clase HiloThreead que hereda de Thread
 * @author Roldán Sánchez Alexis  
 * @author Romero Pedraza Francesca Melania
 * @author Sandoval Peña Dafne Esmeralda
 * @author Colón Palacios Emmanuel 
 */
public class HiloThreead extends Thread {
    /**
     * Constructor que recibe un parametro
     * @param nombre de tipo String
     */
    public HiloThreead(String nombre) {
        super(nombre);
    }
    /**
     * Metodo run de la clase Thread
     */
    @Override
    public void run(){//metodo de Thread
        for(int i=0; i <10; i++){
            System.out.println("Iteracion "+(i)+" de "+getName());
        }
        System.out.println("Termina el Hilo "+ getName());//termina el hilo
    }
    
    
    
}
