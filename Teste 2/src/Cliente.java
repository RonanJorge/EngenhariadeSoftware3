import java.util.Set;

public class Cliente {
	private String nome;
	private String cnh;
	public Set<Locacao> locacao;
	
	public void verificarCnh() {
		System.out.println("CNH válido!");
	}
	
	public void gerarListaClientes() {
		System.out.println("Lista de Clientes:");
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnh() {
		return cnh;
	}
	public void setCnh(String cnh) {
		this.cnh = cnh;
	}
	
	public Set<Locacao> getLocacao() {
		return locacao;
	}
	public void setLocacao(Set<Locacao> locacao) {
		this.locacao = locacao;
	}
	
	
}
