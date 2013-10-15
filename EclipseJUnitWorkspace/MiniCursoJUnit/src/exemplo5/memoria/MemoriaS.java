package exemplo5.memoria;

public abstract class MemoriaS {
    public static final int BYTE=1; //define unidade como BYTE
    public static final int KB=2;   //define unidade como KB
    public static final int MB=3;   //define unidade como MB
    public static final int GB=4;   //define unidade como GB
    protected double total;
    protected double utilizadoKB;
    protected int unidade;

    //Construtor. Recebe como parâmetro o total a ser gravado e a unidade de dados
    public MemoriaS(int newTotal, int newUnidade){
        this.total=newTotal;
        this.unidade=newUnidade;
        this.utilizadoKB=0;
    }

    //Construtor. Recebe como parâmetro o total a ser gravado e define a unidade como KB 
    public MemoriaS(int newTotal){
        this(newTotal, KB);
    }

    //Busca valor gravado
    public double getUtilizadoKB(){
        return this.utilizadoKB;
    }

    //Retorna perda na gravação
    public abstract double getPerda();

    //Retorna espaço disponínel real em KB
    public abstract double getEspacoDisponivelRealKB();

    //Retorna espaço disponível em KB
    public double getEspacoDisponivelKB(){
        return this.getConverteKB(this.total);
    }

    //Utilizado na gravação
    public boolean GravaKB(int newTamanho){
    	if (this.getConverteKB(this.total) - this.utilizadoKB >= newTamanho) {
    		this.utilizadoKB = this.utilizadoKB + newTamanho;
    		return true;
    	}
        return false;
    }
 
    //Converte unidade para KB
    public double getConverteKB(double valor){
        if (this.unidade == BYTE) {
            return valor / 1024;
        } else if (this.unidade == MB) {
            return valor * 1024;
        } else if (this.unidade == GB) {
            return valor * 1024 * 1024;
        }
        else return valor;
    }

    //Busca unidade
    public String getUnidade(){
        if (this.unidade == BYTE) {
            return "BYTE";
        } else if (this.unidade == KB){
            return "KB";
        } else if (this.unidade == MB) {
            return "MB";
        } else return "GB";
    }
 
    //Busca percentual disponível       
    public double getPercentualDisponivel(){
        return (this.getConverteKB(this.total) - this.utilizadoKB)
        		/ this.getConverteKB(this.total) * 100;    
    }
 
    public String toString(){
        return "Percentual Disponivel: " + getPercentualDisponivel() +
        		"%\nEspaço Total: " + getEspacoDisponivelKB()+"KB\nEspaço Disponivel Real: " +
        		getEspacoDisponivelRealKB() + "KB\nPerda: " + getPerda() + "KB";
    }
 
    public static void main(String args[]){
        MemoriaS hd = new HD("46327", 10, MemoriaS.MB);
        MemoriaS cd = new CD(650, MemoriaS.MB);
        hd.GravaKB(10242);
        cd.GravaKB(665602);
        System.out.println(hd);
        System.out.println(cd);
    }
}