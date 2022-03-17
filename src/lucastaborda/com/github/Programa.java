package lucastaborda.com.github;

public class Programa {

	public static void main(String[] args) {
		// O da esquerda tem que ser o mais abstrato e o da direito tem que ser o mais específico
			ContaBanco conta1 = new ContaPr("João da Silva", 200.00, "123456", "PR", "Grande Porte");
		conta1.detalhes();

		conta1.depositar(100.00);
		conta1.depositar(100.00);
		conta1.depositar(100.00);
		
		conta1.sacar(10.00);
		conta1.sacar(10.00);
		conta1.sacar(10.00);
		conta1.sacar(10.00);
		conta1.sacar(10.00);
		
	}
}
