public class Condicao {
	public String componenteCarro;
	public String tipoComponente;
	public boolean isDanificado;
	
	public void gerarRelatorioDeCondicao() {
		System.out.println("Lista de Danos:");
	}
	
	public void enviarAlertaParaReparo() {
		System.out.println("Enviar carro para reparo!");
	}
	
	public String getComponenteCarro() {
		return componenteCarro;
	}

	public void setComponenteCarro(String componenteCarro) {
		this.componenteCarro = componenteCarro;
	}

	public String getTipoComponente() {
		return tipoComponente;
	}

	public void setTipoComponente(String tipoComponente) {
		this.tipoComponente = tipoComponente;
	}

	public boolean isDanificado() {
		return isDanificado;
	}

	public void setDanificado(boolean isDanificado) {
		this.isDanificado = isDanificado;
	}


}
