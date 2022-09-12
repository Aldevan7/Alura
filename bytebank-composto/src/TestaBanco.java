public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente aldevan = new Cliente();
		aldevan.nome ="Aldevan Santos";
		aldevan.cpf = "222.222.222-22";
		aldevan.profissao = "Eng. Software";
		
		Conta conta = new Conta();
		conta.deposita(100);
		
		System.out.println("Aldevan, tem: " + conta.getSaldo());
		
		//Associa o cliente Aldevan a conta (conta)
		conta.titula = aldevan;
		System.out.println(conta.titula.nome);
		System.out.println(conta.titula);
		System.out.println(aldevan);
	}

}