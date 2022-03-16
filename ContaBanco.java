package lucastaborda.com.github;

public class ContaBanco {

	// Atributos
	private String nomeTitular;
	private Double saldo;
	private String numero;
	private String tipo;
	private Double valor;
	
	// Método Construtor
	public ContaBanco (String nomeTitular, Double saldo, String numero, String tipo) {
		this.nomeTitular = nomeTitular;
		this.saldo = saldo;
		this.numero = numero;
		this.tipo = tipo;
	}
	
	// Método Depositar
	public Double depositar (Double valor) {
		return this.saldo;
	}
	
	// Método Sacar
	public Double sacar(Double valor) {
		return this.saldo; 
	}
	
	// Métodos Setters e Getters
	protected void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	
	public String getNomeTitular() {
		return nomeTitular;
	}
	
	protected void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	
	protected void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getNumero() {
		return numero;
	}

	protected void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	protected void setValor(Double valor) {
		this.valor = valor;
	}
	
	public Double getValor() {
		return valor;
	}
	
}

