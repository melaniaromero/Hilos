package cuentaa;
import static java.lang.Thread.sleep;
/**
 * Esta es la clase Cuenta que hereda de Thread
 * @author Roldán Sánchez Alexis  
 * @author Romero Pedraza Francesca Melania
 * @author Sandoval Peña Dafne Esmeralda
 * @author Colón Palacios Emmanuel 
 */
public class Cuenta extends Thread{
	private static long saldo = 0;
        /**
         * Constructor que recibe un parametro
         * @param nombre de tipo String
         */
	public Cuenta (String nombre){
		super(nombre);
	}
        /**
         * Metodo run de la clase Thread
         */
        @Override
	public void run(){
		if(getName().equals("Deposito 1") || getName().equals("Deposito 2")){
			this.depositarDinero(100);
		}else {
			this.extraerDinero(50);
		}

		System.out.println("Termina el " + getName());
	}
        /**
         * Metodo sincronizado depositarDinero recibe un parametro 
         * @param cantidad de tipo int
         */
	public synchronized void depositarDinero(int cantidad){
		saldo += cantidad;
		System.out.println("Se depositaron " + cantidad + " pesos.");
		notifyAll();
	}
        /**
         * Metodo sincronizado extraerDinero recibe un parametro
         * @param cantidad de tipo int
         */
	public synchronized void extraerDinero(int cantidad){
		try{
			if(saldo <= 0){
				System.out.println(getName() + " espera deposito \n\tSaldo: " + saldo);
				sleep(5000);
			}
		} catch(InterruptedException ie){
			System.out.println(ie);
		}
		saldo -= cantidad;
		System.out.println(getName() + " extrajo " + cantidad + " pesos. \n\t Saldo restante: " + saldo);
		notifyAll();
	}
}
