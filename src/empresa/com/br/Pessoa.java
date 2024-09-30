package empresa.com.br;

	class Pessoa{
		private String nome;
		private	String cpf;
		private String endereço;
		private String telefone;
		
		public Pessoa(String nome, String cpf, String endereço, String telefone){
			this.nome = nome;
			this.cpf = cpf;
			this.endereço = endereço;
			this.telefone = telefone;
		}
		
		public void imprimirCadastro() {
			System.out.println("Nome " + nome);
			System.out.println("CPF: " + cpf);
			System.out.println("Endereço: " + endereço);
			System.out.println("Telefone: " + telefone);
		}
	}
