package lucastaborda.com.github;

public class ContaPj extends ContaBanco {

	public ContaPj(String NomeTitular, Double Saldo, String Numero, String Tipo) {
		super(NomeTitular, Saldo, Numero, Tipo);
	}

	// M�todo Depositar
	public void Depositar(Double Valor) {
		this.Saldo += (Valor - (Valor * 0.02));
	}
	
	// M�todo Sacar
	public void Sacar(Double Valor) {
			
	}
}
