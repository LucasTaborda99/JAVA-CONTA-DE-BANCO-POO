package lucastaborda.com.github;

public class ContaPj extends ContaBanco {

	public ContaPj(String nomeTitular, Double saldo, String numero, String tipo) {
		super(nomeTitular, saldo, numero, tipo);
	}

	// Método Depositar
		public Double depositar(Double valor) {
			Double saldo = getSaldo();
			saldo += (valor - (valor * 0.02));
			setSaldo(saldo);
				System.out.println("--- Depósito ---");
				System.out.println("Saldo atual após o Depósito de R$" + valor + " já incluso taxa: R$" + saldo);
				System.out.println("");
			return saldo;
		}
			
		// Método Sacar
		public Double sacar(Double valor) {
			Double saldo = getSaldo();
			saldo -= valor;
			setSaldo(saldo);
				System.out.println("--- Saque ---");
				System.out.println("Saldo atual após o Saque de R$" + valor + ": R$" + saldo);
				System.out.println("");
			return saldo;
		}
}
