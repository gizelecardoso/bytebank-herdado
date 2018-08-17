//Gerente eh um funcionário, Gerente herda da class Funcioário
public class Designer extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do DESIGNER");
		return 200;
		
	}
	
}
