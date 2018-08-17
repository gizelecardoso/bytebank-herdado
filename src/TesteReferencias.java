
public class TesteReferencias {
	
	public static void main(String[] args) {

		//Gerente g1 = new Gerente(); funciona porque todo gerente � tipo Gerente
		//Funcionario g1 = new Gerente(); funciona porque todo gerente � Funcionario
		//Gerente g1 = new Funcion�rio(); n�o funciona, porque nem todo funcion�rio � Gerente.
		
		Funcionario g1 = new Gerente();
		g1.setNome("Marcos");
		g1.setSalario(5000.00);
		
		//Funcion�rio virou uma classe abstrata.
		//Funcionario f = new Funcionario();
		//f.setNome("Leandro");
		//f.setSalario(2000.00);
		
		Funcionario ev = new EditorVideo();
		ev.setNome("Roberto");
		ev.setSalario(2500.00);
		
		Funcionario d = new Designer();
		d.setNome("Clara");
		d.setSalario(2500.00);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(ev);
		controle.registra(d);
		System.out.println(controle.getSoma());
	}

}
