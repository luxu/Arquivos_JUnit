package exemplo5.memoria;

public class CD extends MemoriaS {
    public static final int ABERTO =1; //define o estado como aberto
    public static final int FECHADO=2; //define o estado como fechado
    protected int estado;

    //Construtor. Recebe o total a ser gravado e a unidade 
    public CD(int newTotal, int newUnidade){
        super(newTotal, newUnidade);
        this.estado = ABERTO;
    }

    //Reescreve método abstrato. Retorna espaço real disponível em KB
    public double getEspacoDisponivelRealKB() {
        return this.getEspacoDisponivelKB()-super.getUtilizadoKB();
    }

    //Reescreve método abstrato. Retorna perda na gravação
    public double getPerda() {
        return this.getEspacoDisponivelKB()*0.02;
    }

    //Reescreve método abstrato. Utilizado para gravar, recebendo o tamanho
    public boolean GravaKB(int newTamanho) {
        if (this.estado == ABERTO) {
            if (super.GravaKB(newTamanho)) {
                this.estado = 2;
                return true;
            } else return false;
        }
        else return false;
    }

    //Busca estado (aberto ou fechado)
    public String getEstado(){
        if (this.estado == ABERTO)
            return "ABERTO";
        else
        	return "FECHADO";
    }
 
    public String toString(){
        return "CD Estado: " + this.getEstado() + "\n" + super.toString();
    }
}