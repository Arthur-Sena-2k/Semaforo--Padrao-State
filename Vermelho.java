public  class Vermelho implements Sinal {
	
	private Semaforo semaforo;

    public Vermelho(Semaforo semaforo){
        this.semaforo = semaforo;
    }
    public int getTimer(){
        return this.semaforo.getVermelhoTimer();
    }

    public void proximoEstado(){
        this.semaforo.setSinalAtual(new Verde(this.semaforo));
    }
    public String toString(){
        return "Vermelho" + " : " + getTimer() + " segundos\n";
    }
	@Override
	public void proximoSinal() {
	}
    
}