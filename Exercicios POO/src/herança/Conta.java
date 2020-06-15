package herança;

public class Conta {

	protected double saldo;
	
	public double getSaldo() {
		return this.saldo;
		
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public void saca(double valor) {
		this.saldo -= valor;	
	}
	
	public void atualizar(double taxa) {
		this.saldo += saldo*taxa;
	}
}

