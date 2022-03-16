package lucastaborda.com.github;

public class Programa {

	public static void main(String[] args) {
		// O da esquerda tem que ser o mais abstrato e o da direito tem que ser o mais específico
			ContaBanco conta1 = new ContaPr("João da Silva", 200.00, "123456", "PR", "Grande Porte");
			System.out.println("================================================================");
			System.out.println("--- Cliente ---");
			System.out.println(conta1.getNomeTitular());
			System.out.println("");
			System.out.println("--- Saldo ---");
			System.out.println(conta1.getSaldo());
			System.out.println("");
			System.out.println("--- Número da Conta ---");
			System.out.println(conta1.getNumero());
			System.out.println("");
			System.out.println("--- Tipo da Conta ---");
			System.out.println(conta1.getTipo());
			//System.out.println("--- Classificação do Produtor ---");
			//System.out.println(conta1.classificacao);
			System.out.println("================================================================");
		
		conta1.depositar(100.00);
		conta1.depositar(100.00);
		conta1.depositar(100.00);
		
		conta1.sacar(10.00);
		conta1.sacar(10.00);
		conta1.sacar(10.00);
		conta1.sacar(10.00);
		
	}
}
