package exemplo5.memoria;

public class HD extends MemoriaS {
    protected String numeroSerie;

    //Construtor. Recebe o numero da série, o tamanho do HD e a unidade
    public HD(String newNumeroSerie, int newTotal, int newUnidade){
        super(newTotal, newUnidade);
        this.numeroSerie=newNumeroSerie;
    }

    //Reescreve método abstrato. Retorna o espaço real disponível em KB
    public double getEspacoDisponivelRealKB() {
        return this.getEspacoDisponivelKB()-super.getUtilizadoKB();
    }

    //Reescreve método abstrato. Retorna a perda na gravação
    public double getPerda() {
        return this.getEspacoDisponivelKB() / 1024 / 100;
    }
    
    //Busca o número de série do HD
    public String getNumeroSerie(){
        return this.numeroSerie;
    }
 
    public String toString(){
        return "HD Numero de Serie: " + this.getNumeroSerie() + "\n"+super.toString();
    }
 
}


