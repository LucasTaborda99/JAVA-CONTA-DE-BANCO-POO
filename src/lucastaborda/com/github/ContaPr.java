package lucastaborda.com.github;

public class ContaPr extends ContaBanco {
	
	// Atributo
	public String Classificacao;
	
	Integer TotalSaques = 1;
	
	public ContaPr(String NomeTitular, Double Saldo, String Numero, String Tipo, String Classificacao) {
		super(NomeTitular, Saldo, Numero, Tipo);
	}

	// M�todo Depositar
		public Double Depositar(Double Valor) {
			if(Valor < 1000) {
				this.Saldo += (Valor - (Valor * 0.008));
				System.out.println("--- Dep�sito ---");
				System.out.println("Saldo atual ap�s o Dep�sito de R$" + Valor + " j� incluso taxa: R$" + this.Saldo);
				System.out.println("");
			} else {
				this.Saldo += Valor;
				System.out.println("--- Dep�sito ---");
				System.out.println("Saldo atual ap�s o Dep�sito de R$" + Valor + " = RS" + this.Saldo);
				System.out.println("");
			}
				return this.Saldo;
		}
			
		// M�todo Sacar
		public Double Sacar(Double Valor) {
			
			//System.out.println(TotalSaques);
			
			if(TotalSaques > 3) {
				this.Saldo -= (Valor + (Valor * 0.015));
				System.out.println("--- Saque ---");
				System.out.println("Saldo atual ap�s o Saque de R$" + Valor + " j� incluso taxa: R$" + Saldo);
				System.out.println("");
			} else {
				this.Saldo -= Valor;
					System.out.println("--- Saque ---");
					System.out.println("Saldo atual ap�s o Saque de R$" + Valor + ": R$" + Saldo);
					System.out.println("");
					
				TotalSaques++;
			}
			return this.Saldo;
		}
}
