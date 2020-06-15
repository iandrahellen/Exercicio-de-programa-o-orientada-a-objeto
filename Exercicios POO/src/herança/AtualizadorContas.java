package herança;

public class AtualizadorContas {
	
	private double saldototal = 0;
	private double selic;
	
	public AtualizadorContas(double selic) {
		this.selic = selic;
	}
	public void roda(Conta C) {
       //imprimir saldo anterior
		System.out.println("Saldo anterior: "+ C.getSaldo());
		//atualizar o saldo com a taxa selic
		C.atualizar(selic);
		//imprimir saldo final
		System.out.println("Saldo final: " + C.getSaldo());
		//incrementar saldototal
		saldototal += C.getSaldo();
	
}
	public double getsaldototal() {
		return saldototal;

		
	}
}
