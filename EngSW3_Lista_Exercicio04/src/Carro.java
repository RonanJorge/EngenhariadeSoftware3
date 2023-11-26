public class Carro {
	private int anoFabricacao;
	private String marca;
	private String modelo;
	private Locacao locacao;
	
	public void verificarAno() {
		System.out.println("Ano de fabricação está OK!");
	}
	
	public void enviarParaRevisão() {
		System.out.println("Enviar carro para revisão periódica");
	}
	
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public Locacao getLocacao() {
		return locacao;
	}
	public void setLocacao(Locacao locacao) {
		this.locacao = locacao;
	}
	
	
}
