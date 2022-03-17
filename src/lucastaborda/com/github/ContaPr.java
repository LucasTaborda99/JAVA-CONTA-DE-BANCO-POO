package lucastaborda.com.github;

public class ContaPr extends ContaBanco {
	
	// Atributos
	public Integer totalSaques = 1;
	
	public ContaPr(String nomeTitular, Double saldo, String numero, String tipo, String classificacao) {
		super(nomeTitular, saldo, numero, tipo);
		this.classificacao = classificacao;
	}

	// M�todo Depositar
		public Double depositar(Double valor) {
			if(valor < 1000) {
				Double saldo = getSaldo();
				saldo += (valor - (valor * 0.008));
				setSaldo(saldo);
				System.out.println("--- Dep�sito ---");
				System.out.println("Saldo atual ap�s o Dep�sito de R$" + valor + " j� incluso taxa: R$" + saldo);
				System.out.println("");
			} else {
				Double saldo = getSaldo();
				saldo += valor;
				setSaldo(saldo);
				System.out.println("--- Dep�sito ---");
				System.out.println("Saldo atual ap�s o Dep�sito de R$" + valor + " = RS" + saldo);
				System.out.println("");
			}
				return getSaldo();
		}
			
		// M�todo Sacar
		public void sacar(Double valor) {
			
			//System.out.println(totalSaques);
			
			if(totalSaques > 3) {
				Double saldo = getSaldo();
				saldo -= (valor + (valor * 0.015));
				setSaldo(saldo);
					System.out.println("--- Saque ---");
					System.out.println("Saldo atual ap�s o Saque de R$" + valor + " j� incluso taxa: R$" + saldo);
					System.out.println("");
			}
			else {
				Double saldo = getSaldo();
				saldo -= valor;
				setSaldo(saldo);
					System.out.println("--- Saque ---");
					System.out.println("Saldo atual ap�s o Saque de R$" + valor + ": R$" + saldo);
					System.out.println("");
					
				totalSaques++;

			}
		}
		
//		// M�todos Setters e Getters
//		protected void setClassificacao(String classificacao) {
//			this.classificacao = classificacao;
//		}
//		
//		public String getClassificacao() {
//			return classificacao;
//		}
}
