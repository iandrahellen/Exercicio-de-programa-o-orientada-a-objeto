package heran�a;

public class TesteContas {

	public static void main(String[] args) {
			
		Conta c = new Conta();
		ContaCorrente cc = new ContaCorrente();
		ContaPoupan�a cp = new ContaPoupan�a();
		
		c.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);
		
		AtualizadorContas adc = new AtualizadorContas(0.01);
		
		adc.roda(c);
		adc.roda(cc);
		adc.roda(cp);
		
		System.out.println("Saldo Total: " + adc.getsaldototal());
	
	}
	
	

}
