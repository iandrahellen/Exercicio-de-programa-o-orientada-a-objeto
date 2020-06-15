package modelo;

public class GerenciadorDeImpostoDeRenda {

	
	private double total;
	 public void adiciona(Tributavel t) {
      System.out.println("Adicionar tributavel:" + t);
      this.total += t.calcularTributos();
	 
	 }
	 
	 public double getTotal() {
		 return this.total;
	 }
}


