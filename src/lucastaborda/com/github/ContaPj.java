package lucastaborda.com.github;

public class ContaPj extends ContaBanco {

	public ContaPj(String nomeTitular, Double saldo, String numero, String tipo) {
		super(nomeTitular, saldo, numero, tipo);
	}

	// M�todo Depositar
		public Double depositar(Double valor) {
			Double saldo = getSaldo();
			saldo += (valor - (valor * 0.02));
			setSaldo(saldo);
				System.out.println("--- Dep�sito ---");
				System.out.println("Saldo atual ap�s o Dep�sito de R$" + valor + " j� incluso taxa: R$" + saldo);
				System.out.println("");
			return saldo;
		}
			
		// M�todo Sacar
		public Double sacar(Double valor) {
			Double saldo = getSaldo();
			saldo -= valor;
			setSaldo(saldo);
				System.out.println("--- Saque ---");
				System.out.println("Saldo atual ap�s o Saque de R$" + valor + ": R$" + saldo);
				System.out.println("");
			return saldo;
		}
}
