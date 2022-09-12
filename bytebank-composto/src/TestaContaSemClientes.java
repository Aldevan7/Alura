public class TestaContaSemClientes {
	
	public static void main(String[] args) {
		
		Conta contaCleisianne = new Conta();
		System.out.println(contaCleisianne.getSaldo());
		
		contaCleisianne.titula = new Cliente();
		System.out.println(contaCleisianne);
		
		contaCleisianne.titula.nome = "Cleisianne";
		System.out.println(contaCleisianne.titula.nome);
	}

}