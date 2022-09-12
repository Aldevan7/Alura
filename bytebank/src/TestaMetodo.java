
public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.saldo = 100;
		conta.deposita(50);
		System.out.println(conta.saldo);
		
		boolean conseguiuRetirar = conta.saca(20);
		System.out.println(conta.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaCleisianne = new Conta();
		contaCleisianne.deposita(1000);
		boolean sucessoTranferencia =
				contaCleisianne.transfere(300, conta);
		
		if(sucessoTranferencia) {
			System.out.println("Transferencia com sucesso!");
		}else {
			System.out.println("Faltou saldo!");
		}
		
		System.out.println(contaCleisianne.saldo);
		System.out.println(conta.saldo);
		
		conta.titula = "Aldevan";
		System.out.println(conta.titula);
	}

}
