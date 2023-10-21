public class Amarelo implements Sinal {
	
    private Semaforo semaforo;

    public Amarelo(Semaforo semaforo){
        this.semaforo = semaforo;
    }

    public int getTimer(){
        return this.semaforo.getAmareloTimer();
    }

    public void proximoEstado(){
        this.semaforo.setSinalAtual(new Vermelho(this.semaforo));
    }

    public String toString(){
        return "Amarelo" + " : " + getTimer() + " segundos\n";
    }
    
    @Override 
    public void proximoSinal() {
    }
}