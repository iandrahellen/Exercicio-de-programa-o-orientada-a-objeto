package heran�a;

public class ContaPoupan�a extends Conta{
	
	@Override
	public void atualizar(double taxa) {
		this.saldo += saldo*taxa*3;
  }
 
	@Override
	public void deposita(double valor) {
		this.saldo += valor-0.1;
}
	
	
 }