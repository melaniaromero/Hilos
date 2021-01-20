package hilos;
/**
 * Esta es la clase Hilos
 * @author Roldán Sánchez Alexis  
 * @author Romero Pedraza Francesca Melania
 * @author Sandoval Peña Dafne Esmeralda
 * @author Colón Palacios Emmanuel 
 */
public class Hilos {
    public static void main(String[] args) {
        //hay tres hilos 
        /**
         * Llamando a la clase HiloThreead
        */
        HiloThreead hilo = new HiloThreead("Primer hilo Thread");//llamando nuestra clase
        /**
         * Se inicia otro hilo inmediatamente con el metodo start
        */ 
        hilo.start();//ejecuta todo lo necesario 
        /**
         * Se crea otro hilo inmediatamente
        */
        new HiloThreead("Segundo hilo").start();//se crea otro hilo
        System.out.println("Termina el hilo principal ");
        
        //Segundaactividad
        /**
         * Creacion del primer hilo Runnable mediante el objeto Thread
         */
        new Thread(new HiloRunablea(), "Primer hilo Runnable").start();
        /**
         * Creacion del segundo hilo Runnable mediante el objeto Thread
         */
        new Thread(new HiloRunablea(), "Segundo hilo Runnable").start();
        System.out.println("Se termina hilo principal");
    }
}
