package empresa.com.br;

public class Empresa {
    public static void main(String[] args) {
        Empregado empregado = new Empregado("João Silva", "123.456.789-00", "Rua A, 123", "11987654321", 2500.00, "Desenvolvedor", "TI");
        System.out.println("---- Empregado ----");
        empregado.calcularSalario(0.10);
        empregado.imprimirCadastro();

        Cliente cliente = new Cliente("Maria Souza", "987.654.321-00", "Av. B, 456", "11987654322", "12.345.678/0001-99", "especial");
        System.out.println("\n---- Cliente ----");
        double valorFinalCompra = cliente.valorDaCompra(5000.00, 100.00);
        cliente.imprimirCadastro();
        System.out.println("Valor final da compra: " + valorFinalCompra);
    }
}