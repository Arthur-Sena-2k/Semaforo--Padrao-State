public class Main {

	public static void main(String[] args) {
		Semaforo epitacio = new Semaforo("12356");
		System.out.println("Sinal Atual: " + epitacio.getSinalAtual());
		
		epitacio.start();
	
		System.out.println("Final");
		
		System.out.println(epitacio);
	}

}