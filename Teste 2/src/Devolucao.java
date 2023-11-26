import java.time.LocalDate;
import java.util.Set;

public class Devolucao implements InterfaceDevolucao{
	private LocalDate datadevolução;
	private double quilometragem;
	
	@Override
	public void calcularConsumo() {
		System.out.println("Consumo calculado!");
		
	}
	@Override
	public void calcularMulta(Set<Condicao> condicoes) {
		System.out.println("Multa calculada!");
		
	}
	
	public LocalDate getDatadevolução() {
		return datadevolução;
	}
	public void setDatadevolução(LocalDate datadevolução) {
		this.datadevolução = datadevolução;
	}
	public double getQuilometragem() {
		return quilometragem;
	}
	public void setQuilometragem(double quilometragem) {
		this.quilometragem = quilometragem;
	}
	
		
}
