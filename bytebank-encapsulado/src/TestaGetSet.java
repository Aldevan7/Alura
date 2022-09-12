
public class TestaGetSet {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		
		System.out.println(conta.getNumero());
		
		Cliente aldevan = new Cliente();
		aldevan.setNome("Aldevan Santos");
		
		conta.setTitular(aldevan);
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
	}

}