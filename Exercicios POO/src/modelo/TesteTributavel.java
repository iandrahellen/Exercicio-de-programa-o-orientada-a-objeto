package modelo;

public class TesteTributavel {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(100);
		
		SeguroDeVida sgv = new SeguroDeVida();
		
		GerenciadorDeImpostoDeRenda giprenda = new GerenciadorDeImpostoDeRenda();
		giprenda.adiciona(cc);
		giprenda.adiciona(sgv);

		
		System.out.println(giprenda.getTotal());

		}

}
