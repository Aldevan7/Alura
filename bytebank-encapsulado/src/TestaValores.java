
public class TestaValores {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);	
		Conta conta2 = new Conta(2337, 34227);
		
		conta.setAgencia(12312);
			
		System.out.println(conta.getAgencia());
		System.out.println(conta2.getAgencia());
		
		
		System.out.println("Total de contas: " + Conta.getTotal());

	}

}