public class Semaforo {
	private String numTombamento = null;
	private int vermelhoTimer = 3;
	private int verdeTimer = 5;
	private int amareloTimer = 1;
	private Sinal sinal = new Vermelho(this);
	
	public Semaforo(String numTombamento) {
        this.numTombamento = numTombamento;
	}
	public String getNumTombamento() {
		return numTombamento;
	}
	public void setNumTombamento(String numTombamento) {
		this.numTombamento = numTombamento;
	}

	public void setSinalAtual(Sinal sinal){
		this.sinal = sinal;
	}

	public Sinal getSinalAtual() {
		return this.sinal;
	}
	
	
	public void exibir() {
		System.out.println(" vermelho  ( " + (this.sinal instanceof Vermelho?"X":" ") + " )");
		System.out.println(" amarelo   ( " + (this.sinal instanceof Amarelo?"X":" ") + " )");
		System.out.println(" verde     ( " + (this.sinal instanceof Verde?"X":" ") + " )");
	}
	
	public void efetuarTransicao() {
	    this.sinal.proximoSinal();
	}
	
	public void showVisorRegressivo() {
		for (int i = this.sinal.getTimer(); i >0 ; i--) {
			System.out.println(i + " segundo(s)");
			try {
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void start() {
		this.start(10);
	}

	public void start(int time_in_seconds) {
		while(time_in_seconds > 0) {
			System.out.println("Tempo restante da simulacao: " + time_in_seconds + " segundos");
			System.out.println( getSinalAtual() + " : " + this.sinal.getTimer() + " segundos.");
			exibir();
			time_in_seconds -= this.sinal.getTimer();
			showVisorRegressivo();
			efetuarTransicao();
			System.out.println();
		}
		
	}
	
	public String toString() {
		String s = "";
		s += "Numero Tombamento: " + numTombamento + "\n";
		s += "Tempo de permanencia em cada estagio:\n";
		s += "Vermelho: "+ this.verdeTimer + " segundos\n";
		s += "Verde: " + this.verdeTimer + " segundos\n";
		s += "Amarelo: " + this.amareloTimer + " segundos\n";
		return s;
	}
	
	public void setVermelhoTimer(int newTimer){
		this.vermelhoTimer = newTimer; 
	}
	public int getVermelhoTimer(){
		return this.vermelhoTimer;
	}
	public void setVerdeTimer(int newTimer){
		this.verdeTimer = newTimer; 
	}
	public int getVerdeTimer(){
		return this.verdeTimer;
	}
	public void setAmareloTimer(int newTimer){
		this.amareloTimer = newTimer; 
	}
	public int getAmareloTimer(){
		return this.amareloTimer;
	}
}



