package lucastaborda.com.github;

public class ContaPj extends ContaBanco {

	public ContaPj(String NomeTitular, Double Saldo, String Numero, String Tipo) {
		super(NomeTitular, Saldo, Numero, Tipo);
	}

	// M�todo Depositar
		public Double Depositar(Double Valor) {
			this.Saldo = Saldo + (Valor - (Valor * 0.02));
			System.out.println("--- Dep�sito ---");
			System.out.println("Saldo atual ap�s o Dep�sito de R$" + Valor + " j� incluso taxa: R$" + Saldo);
			System.out.println("");
				return this.Saldo;
		}
			
		// M�todo Sacar
		public Double Sacar(Double Valor) {
			this.Saldo -= Valor;
			System.out.println("--- Saque ---");
			System.out.println("Saldo atual ap�s o Saque de R$" + Valor + ": R$" + Saldo);
			System.out.println("");
				return this.Saldo;
		}
}
