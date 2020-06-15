package herança;

public class ContaCorrente extends Conta{

	
	@Override
	public void atualizar(double taxa) {
		this.saldo += saldo*taxa*2;
	}
}
