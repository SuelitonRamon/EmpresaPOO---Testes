package empresa.com.br;

	class Empregado extends Pessoa {
		private double salario;
		private String cargo;
		private String departamento;
		
		public Empregado(String nome, String cpf, String endereço, String telefone, double salario, String cargo, String departamento){
			super (nome, cpf, endereço, telefone);
			this.salario = salario;
			this.cargo = cargo;
			this.departamento = departamento;
		}
		
		public void calcularSalario(double indiceCorrecao) {
			this.salario = this.salario * (1 + indiceCorrecao); 
		}
		
		public void imprimirCadastro() {
			super.imprimirCadastro();
			System.out.println("Salário: " + salario);
			System.out.println("Cargo: " + cargo);
			System.out.println("Departamento: " + departamento);
		}
	}
