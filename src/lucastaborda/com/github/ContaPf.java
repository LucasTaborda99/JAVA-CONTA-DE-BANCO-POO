package lucastaborda.com.github;

public class ContaPf extends ContaBanco {

	public ContaPf(String NomeTitular, Double Saldo, String Numero, String Tipo) {
		super(NomeTitular, Saldo, Numero, Tipo);
	}
	
	// Método Depositar
	public void Depositar(Double Valor) {
		this.Saldo = Saldo + (Valor - (Valor * 0.01));
	}
		
	// Método Sacar
	public void Sacar(Double Valor) {
				
	}
	
}
