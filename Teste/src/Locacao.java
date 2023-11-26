import java.time.LocalDate;

public class Locacao {
	private LocalDate dataLocacao;
	private Double tempoLocacao;
	private String finalidade;
	private String localDeUso;
	private Double valorCaucao;
	private Double valorAPagar;
	
	public Carro carro;
	public Cliente cliente;
	
	public void calcularCaucao() {
		System.out.println("O valor do caução será:");
	}
	
	public void calcularValorAPagar(InterfaceDevolucao devolucao) {
		System.out.println("O valor a pagar será: ");
	}
	
	
	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public LocalDate getDataLocacao() {
		return dataLocacao;
	}
	public void setDataLocacao(LocalDate dataLocacao) {
		this.dataLocacao = dataLocacao;
	}
	public Double getTempoLocacao() {
		return tempoLocacao;
	}
	public void setTempoLocacao(Double tempoLocacao) {
		this.tempoLocacao = tempoLocacao;
	}
	public String getFinalidade() {
		return finalidade;
	}
	public void setFinalidade(String finalidade) {
		this.finalidade = finalidade;
	}
	public String getLocalDeUso() {
		return localDeUso;
	}
	public void setLocalDeUso(String localDeUso) {
		this.localDeUso = localDeUso;
	}
	public Double getValorCaucao() {
		return valorCaucao;
	}
	public void setValorCaucao(Double valorCaucao) {
		this.valorCaucao = valorCaucao;
	}
	public Double getValorAPagar() {
		return valorAPagar;
	}
	public void setValorAPagar(Double valorAPagar) {
		this.valorAPagar = valorAPagar;
	}	
}
