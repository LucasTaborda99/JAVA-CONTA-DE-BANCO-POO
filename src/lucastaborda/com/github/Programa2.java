package lucastaborda.com.github;

public class Programa2 {

	public static void main(String[] args) {
		
		// O da esquerda tem que ser o mais abstrato e o da direito tem que ser o mais espec�fico
		ContaBanco conta1 = new ContaPj("Jo�o da Silva", 100.00, "123456", "PF");
		System.out.println("--- Cliente ---");
		System.out.println("Titular da Conta: " + conta1.NomeTitular);
		System.out.println("");
		System.out.println("--- Saldo ---");
		System.out.println("Saldo original: R$" + conta1.Saldo);
		System.out.println("");
	
	conta1.Depositar(200.00);
		System.out.println("--- Dep�sito ---");
		System.out.println("Saldo atual ap�s o Dep�sito de R$" + conta1.Valor + " j� incluso taxa: R$" + conta1.Saldo);
		System.out.println("");
		
	conta1.Depositar(200.00);
		System.out.println("--- Dep�sito ---");
		System.out.println("Saldo atual ap�s o Dep�sito de R$" + conta1.Valor + " j� incluso taxa: R$" + conta1.Saldo);
		System.out.println("");
		
	conta1.Depositar(200.00);
		System.out.println("--- Dep�sito ---");
		System.out.println("Saldo atual ap�s o Dep�sito de R$" + conta1.Valor + " j� incluso taxa: R$" + conta1.Saldo);
		System.out.println("");
		
	//conta1.Depositar(100.00);
		//System.out.println("--- Dep�sito ---");
		//System.out.println("Saldo atual ap�s o Dep�sito de R$" + conta1.Valor + " j� incluso taxa: R$" + conta1.Saldo);
		//System.out.println("");
		
	conta1.Sacar(50.00);
	conta1.Sacar(100.00);
	conta1.Sacar(100.00);
	conta1.Sacar(100.00);
	//conta1.Sacar(10.00);
	//conta1.Sacar(10.00);
	//conta1.Sacar(10.00);

	}

}
