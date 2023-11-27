public class OrdenarObjeto {
	Estrategia ordenar;
	public void definirEstrategia(Object objeto) {
		if(objeto.getClass().getName().equals("String")){
			ordenar = new Strings();
		} else if (objeto.getClass().getName().equals("Integer")){
			ordenar = new Numeros();
		} else {
			ordenar = new ObjetoCustomizado();
		}
	}
	
	public void ordenaçãoBubbleSort() {
		ordenar.bubbleSort();
	}
	
	public void ordenacaoMergeSort() {
		ordenar.mergeSort();
	}
	
	public void ordenacaoQuickSort() {
		ordenar.quickSort();
	}
}
