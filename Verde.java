public class Verde implements Sinal{
   
	private Semaforo semaforo;

    public Verde(Semaforo semaforo){
        this.semaforo = semaforo;
    }

    public int getTimer(){
        return this.semaforo.getVerdeTimer();
    }

    public void proximoEstado(){
        this.semaforo.setSinalAtual(new Amarelo(this.semaforo));
    }

    public String toString(){
        return "Verde" + " : " + getTimer() + " segundos\n";
    }
    
    @Override
    public void proximoSinal(){
    }
}