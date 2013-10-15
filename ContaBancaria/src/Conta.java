public class Conta {
	
	private double saldo;

	public Conta(double saldoInicial){
		this.saldo = saldoInicial + 10;
	}
	
	public void deposito(double valor){
		this.saldo += valor;
	}
	
	public double getSaldo(){
		return this.saldo;
	}
	
}
