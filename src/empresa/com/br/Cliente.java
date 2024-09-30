package empresa.com.br;

class Cliente extends Pessoa{
	public String cnpj;
	public String tipoCliente;
	
	public Cliente(String nome, String cpf, String endereço, String telefone, String cnpj, String tipoCliente){
		super (nome, cpf, endereço, telefone);
		this.cnpj = cnpj;
		this.tipoCliente = tipoCliente;
	}
	
	public double valorDaCompra(double valorCompra, double frete) {
		double desconto = 0;
		
		if (tipoCliente.equalsIgnoreCase("especial")) {
			desconto = 0.10;
		} else if (tipoCliente.equalsIgnoreCase("normal")) {
			desconto = 0.03;
		} else {
			System.out.println("Entrada inválida! Selecione um tipo de cliente válido.");
			System.exit(0);
		}
		
		double valorFinalCompra = (valorCompra * (1 - desconto)) + frete;
		return valorFinalCompra;
	}
	
    public void imprimirCadastro() {
        super.imprimirCadastro();
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Tipo de Cliente: " + tipoCliente);
    }    
}
