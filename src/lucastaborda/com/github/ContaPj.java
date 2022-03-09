package lucastaborda.com.github;

public class ContaPj extends ContaBanco {

	public ContaPj(String NomeTitular, Double Saldo, String Numero, String Tipo) {
		super(NomeTitular, Saldo, Numero, Tipo);
	}

	// Método Depositar
		public Double Depositar(Double Valor) {
			this.Saldo = Saldo + (Valor - (Valor * 0.02));
			System.out.println("--- Depósito ---");
			System.out.println("Saldo atual após o Depósito de R$" + Valor + " já incluso taxa: R$" + Saldo);
			System.out.println("");
				return this.Saldo;
		}
			
		// Método Sacar
		public Double Sacar(Double Valor) {
			this.Saldo -= Valor;
			System.out.println("--- Saque ---");
			System.out.println("Saldo atual após o Saque de R$" + Valor + ": R$" + Saldo);
			System.out.println("");
				return this.Saldo;
		}
}
