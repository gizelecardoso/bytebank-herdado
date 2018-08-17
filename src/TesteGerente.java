
public class TesteGerente {
	
	public static void main(String[] argss) {
		
		Gerente gerente = new Gerente();
		Funcionario ger = new Gerente();
		Autenticavel g = new Gerente();
		
		Autenticavel ad = new Administrador();
		
		Autenticavel cl = new Cliente();
		
		
		Gerente g1 = new Gerente();
		g1.setNome("Marco");
		g1.setCpf("222.222.222-22");
		g1.setSalario(5000.00);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		
		g1.setSenha(2222);
	
		boolean autenticou = g1.autentica(2222);
		
		System.out.println(autenticou);
		System.out.println(g1.getBonificacao());
	
	}

}
