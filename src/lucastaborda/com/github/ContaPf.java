package lucastaborda.com.github;

public class ContaPf extends ContaBanco {

	public Integer TotalSaques = 1;
	
	public ContaPf(String NomeTitular, Double Saldo, String Numero, String Tipo) {
		super(NomeTitular, Saldo, Numero, Tipo);
	}
	
	// Método Depositar
		public Double Depositar(Double Valor) {
			this.Saldo = Saldo + (Valor - (Valor * 0.01));
			System.out.println("--- Depósito ---");
			System.out.println("Saldo atual após o Depósito de R$" + Valor + " já incluso taxa: R$" + Saldo);
			System.out.println("");
				return this.Saldo;
	}
		
	// Método Sacar
	public Double Sacar(Double Valor) {
		
		//System.out.println(TotalSaques);
		
		if(Valor > Saldo) {
				System.err.print("Saldo indisponível para saque, você não possui R$" + Valor + " para sacar");
				System.out.println("");	
				System.out.println("");
		} else {
			if(TotalSaques > 3  && Valor < Saldo) {
				this.Saldo -= (Valor + (Valor * 0.01));
				System.out.println("--- Saque ---");
				System.out.println("Saldo atual após o Saque de R$" + Valor + " já incluso taxa: R$" + Saldo);
				System.out.println("");
			}
			else {
				this.Saldo -= Valor;
				System.out.println("--- Saque ---");
				System.out.println("Saldo atual após o Saque de R$" + Valor + ": R$" + Saldo);
				System.out.println("");
			
		TotalSaques++;
			}
		}
		return this.Saldo;
	}
}
