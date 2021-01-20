package cuentaa;
/**
 * Esta es la clase ClaseMain
 * @author Roldán Sánchez Alexis  
 * @author Romero Pedraza Francesca Melania
 * @author Sandoval Peña Dafne Esmeralda
 * @author Colón Palacios Emmanuel 
 */
public class ClaseMain {
    /**
     * Llamando a la clase cuenta, iniciando hilos
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	new Cuenta("Acceso 1").start();
	new Cuenta("Acceso 2").start();
	new Cuenta("Deposito 1").start();
	new Cuenta("Deposito 2").start();
	System.out.println("Termina el hilo principal");
    }   
}
