package grupooHilos;
/**
 * Esta es la clase GrupoHilos que hereda de Thread
 * @author Roldán Sánchez Alexis  
 * @author Romero Pedraza Francesca Melania
 * @author Sandoval Peña Dafne Esmeralda
 * @author Colón Palacios Emmanuel 
 */
public class GrupoHilos extends Thread {
    /**
     * Constructor que recibe dos parametros
     * @param g de tipo ThreadGroup
     * @param n de tipo String
     */
    public GrupoHilos(ThreadGroup g, String n ){
        super(g,n);
    }
    /**
     * Metodo run de la clase Thread
     */
    @Override
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println(getName() + " iteracion "+ i);
        }
    }
}
