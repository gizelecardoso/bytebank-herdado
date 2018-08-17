//ESSE CALCULO PERMANECE FUNCIONANDO PRA TODOS - PORQUE TEM A REFERÊNCIA GENÉRICA FUNCIONÁRIO.
public class ControleBonificacao {
	
	private double soma; 
	
	public void registra(Funcionario f) {
		
		double boni = f.getBonificacao();
		this.soma = this.soma + boni;
		
	}

	
	public double getSoma() {
		return soma;
	}

}
