package lucastaborda.com.github;

public class ContaBanco implements IDetalhesConta {

	// Atributos
	private String nomeTitular;
	private Double saldo;
	private String numero;
	private String tipo;
	private Double valor;
	private String classificacao;
	
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
	public void sacar(Double valor) {
		this.saldo -= valor;
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
	
	protected void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}
	
	public String getClassificacao() {
		return classificacao;
	}

	@Override
	public void detalhes() {
		System.out.println("================================================================");
		System.out.println("--- Cliente ---");
		System.out.println(getNomeTitular());
		System.out.println("");
		System.out.println("--- Saldo ---");
		System.out.println(getSaldo());
		System.out.println("");
		System.out.println("--- Número da Conta ---");
		System.out.println(getNumero());
		System.out.println("");
		System.out.println("--- Tipo da Conta ---");
		System.out.println(getTipo());
		System.out.println("");	
		if (getClassificacao() != null) {
			System.out.println("--- Classificação do Produtor ---");
			System.out.println(getClassificacao());
		}
		System.out.println("================================================================");
	}
}

