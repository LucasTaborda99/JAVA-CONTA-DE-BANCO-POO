package lucastaborda.com.github;

public class ContaPr extends ContaBanco {
	
	// Atributos
	public Integer totalSaques = 1;
	
	public ContaPr(String nomeTitular, Double saldo, String numero, String tipo, String classificacao) {
		super(nomeTitular, saldo, numero, tipo);
		this.classificacao = classificacao;
	}

	// Método Depositar
		public Double depositar(Double valor) {
			if(valor < 1000) {
				Double saldo = getSaldo();
				saldo += (valor - (valor * 0.008));
				setSaldo(saldo);
				System.out.println("--- Depósito ---");
				System.out.println("Saldo atual após o Depósito de R$" + valor + " já incluso taxa: R$" + saldo);
				System.out.println("");
			} else {
				Double saldo = getSaldo();
				saldo += valor;
				setSaldo(saldo);
				System.out.println("--- Depósito ---");
				System.out.println("Saldo atual após o Depósito de R$" + valor + " = RS" + saldo);
				System.out.println("");
			}
				return getSaldo();
		}
			
		// Método Sacar
		public void sacar(Double valor) {
			
			//System.out.println(totalSaques);
			
			if(totalSaques > 3) {
				Double saldo = getSaldo();
				saldo -= (valor + (valor * 0.015));
				setSaldo(saldo);
					System.out.println("--- Saque ---");
					System.out.println("Saldo atual após o Saque de R$" + valor + " já incluso taxa: R$" + saldo);
					System.out.println("");
			}
			else {
				Double saldo = getSaldo();
				saldo -= valor;
				setSaldo(saldo);
					System.out.println("--- Saque ---");
					System.out.println("Saldo atual após o Saque de R$" + valor + ": R$" + saldo);
					System.out.println("");
					
				totalSaques++;

			}
		}
		
//		// Métodos Setters e Getters
//		protected void setClassificacao(String classificacao) {
//			this.classificacao = classificacao;
//		}
//		
//		public String getClassificacao() {
//			return classificacao;
//		}
}
