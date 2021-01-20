package hilos;
/**
 * Esta es la clase HiloRunablea que implementa de Runnable
 * @author Roldán Sánchez Alexis  
 * @author Romero Pedraza Francesca Melania
 * @author Sandoval Peña Dafne Esmeralda
 * @author Colón Palacios Emmanuel 
 */
public class HiloRunablea implements Runnable {
    /**
     * Metodo run de la clase Runnable
     */
    @Override
    public void run() {
        for (int i=0; i<10; i++){
            System.out.println("Interacion "+i+" de "+ Thread.currentThread().getName());//buscando un nombre
        }
        System.out.println("Termina  el hilo "+Thread.currentThread().getName());
    }   
}
