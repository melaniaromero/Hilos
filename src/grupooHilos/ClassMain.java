package grupooHilos;
/**
 * Esta es la clase ClassMain
 * @author Roldán Sánchez Alexis  
 * @author Romero Pedraza Francesca Melania
 * @author Sandoval Peña Dafne Esmeralda
 * @author Colón Palacios Emmanuel 
 */
public class ClassMain {
    public static void main(String[] args) {
        /**
         * Constructor de un grupo de hilos
         */
        ThreadGroup grupoHilos = new ThreadGroup("Grupo con prioridad normal");
        /**
         * Creando hilos en el GrupoHilos
         */
        Thread hilo1 = new GrupoHilos(grupoHilos, "Hilo 1 con prioridad maxima");
        Thread hilo2 = new GrupoHilos(grupoHilos, "Hilo 2 con prioridad normal");
        Thread hilo3 = new GrupoHilos(grupoHilos, "Hilo 3 con prioridad normal");
        Thread hilo4 = new GrupoHilos(grupoHilos, "Hilo 4 con prioridad normal");
        Thread hilo5 = new GrupoHilos(grupoHilos, "Hilo 5 con prioridad normal");
        /**
         * Se le asigna al hilo 1 la maxima prioridad 
         */
        hilo1.setPriority(Thread.MAX_PRIORITY);
        grupoHilos.setMaxPriority(Thread.NORM_PRIORITY);
        System.out.println("Prioridad promedio del grupo  " + grupoHilos.getMaxPriority());
        /**
         * Imprimiendo hilos con su respectiva prioridad
         */
        System.out.println("Prioridad Hilo 1 = "+hilo1.getPriority());
        System.out.println("Prioridad Hilo 2 = "+hilo2.getPriority());
        System.out.println("Prioridad Hilo 3 = "+hilo3.getPriority());
        System.out.println("Prioridad Hilo 4 = "+hilo4.getPriority());
        System.out.println("Prioridad Hilo 5 = "+hilo5.getPriority());
        System.out.println("\n\n");
        /**
         * Empiezan a ejecutarse los hilos
         */
        hilo1.start();//empiezan
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();
        
        listaHilos(grupoHilos);
    }
    public  static void listaHilos(ThreadGroup grupoActual){
        int numHilos;
        Thread[] listaDeHilos;//listar hilos
        /**
         * Metodo activeCount para encontrar el número de threads activos actualmente dentro del grupo.
         */
        numHilos = grupoActual.activeCount();
        /**
         * Creando lista de hilos
         */
        listaDeHilos = new Thread[numHilos];//creando
        /**
         * Creando objetos apuntando a la lista de hilos
         */
        grupoActual.enumerate(listaDeHilos);
        System.out.println("Num de hilos activos "+ numHilos);
         for(int i=0; i<numHilos; i++){
             System.out.println("Hilo activo "+ i +" = "+ listaDeHilos[i].getName());
         }
    }            
}
