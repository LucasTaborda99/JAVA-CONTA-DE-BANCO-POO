package lucastaborda.com.github;

public class ContaPf extends ContaBanco {
	
	// Atributo
	public Integer totalSaques = 1;
	
	public ContaPf(String nomeTitular, Double saldo, String numero, String tipo) {
		super(nomeTitular, saldo, numero, tipo);
	}
	
	// M�todo Depositar
		public Double depositar(Double valor) {
			Double saldo = getSaldo() + (valor - (valor * 0.01));
			setSaldo(saldo);
				System.out.println("--- Dep�sito ---");
				System.out.println("Saldo atual ap�s o Dep�sito de R$" + valor + " j� incluso taxa: R$" + saldo);
				System.out.println("");
			return saldo;
	}
		
	// M�todo Sacar
	public void sacar(Double valor) {
		//System.out.println(TotalSaques);
		if(valor > getSaldo()) {
				System.err.print("Saldo indispon�vel para saque, voc� n�o possui R$" + valor + " para sacar");
				System.out.println("");	
				System.out.println("");
		} else {
			if(totalSaques > 3  && valor < getSaldo()) {
				Double saldo = getSaldo();
				saldo -= (valor + (valor * 0.01));
				setSaldo(saldo);
					System.out.println("--- Saque ---");
					System.out.println("Saldo atual ap�s o Saque de R$" + valor + " j� incluso taxa: R$" + saldo);
					System.out.println("");
						if(getSaldo() < 0) {
							System.err.println("Valor Negativo (Sua conta est� zerada)");
							System.out.println("");
						}
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
		}
}

