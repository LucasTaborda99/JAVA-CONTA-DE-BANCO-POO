package lucastaborda.com.github;

public class Programa {

	public static void main(String[] args) {
		// O da esquerda tem que ser o mais abstrato e o da direito tem que ser o mais específico
			ContaBanco conta1 = new ContaPf("João da Silva", 200.00, "123456", "PF");
			System.out.println("================================================================");
			System.out.println("--- Cliente ---");
			System.out.println(conta1.NomeTitular);
			System.out.println("");
			System.out.println("--- Saldo ---");
			System.out.println(conta1.Saldo);
			System.out.println("");
			System.out.println("--- Número da Conta ---");
			System.out.println(conta1.Numero);
			System.out.println("");
			System.out.println("--- Tipo da Conta ---");
			System.out.println(conta1.Tipo);
			//System.out.println("--- Classificação do Produtor ---");
			//System.out.println(conta1.Classificacao);
			System.out.println("================================================================");
		
		conta1.Depositar(200.00);
		conta1.Depositar(100.00);
		//conta1.Depositar(100.00);
		
		conta1.Sacar(10.00);
		conta1.Sacar(10.00);
		conta1.Sacar(10.00);
		conta1.Sacar(10.00);
		conta1.Sacar(10.00);
		conta1.Sacar(445.00);
		
	}
}
