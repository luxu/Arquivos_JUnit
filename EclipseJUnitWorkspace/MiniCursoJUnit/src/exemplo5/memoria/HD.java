package exemplo5.memoria;

public class HD extends MemoriaS {
    protected String numeroSerie;

    //Construtor. Recebe o numero da s�rie, o tamanho do HD e a unidade
    public HD(String newNumeroSerie, int newTotal, int newUnidade){
        super(newTotal, newUnidade);
        this.numeroSerie=newNumeroSerie;
    }

    //Reescreve m�todo abstrato. Retorna o espa�o real dispon�vel em KB
    public double getEspacoDisponivelRealKB() {
        return this.getEspacoDisponivelKB()-super.getUtilizadoKB();
    }

    //Reescreve m�todo abstrato. Retorna a perda na grava��o
    public double getPerda() {
        return this.getEspacoDisponivelKB() / 1024 / 100;
    }
    
    //Busca o n�mero de s�rie do HD
    public String getNumeroSerie(){
        return this.numeroSerie;
    }
 
    public String toString(){
        return "HD Numero de Serie: " + this.getNumeroSerie() + "\n"+super.toString();
    }
 
}


