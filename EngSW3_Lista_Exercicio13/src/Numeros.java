
public class Numeros implements Estrategia{

	@Override
	public void bubbleSort() {
		System.out.println("Ordenando lista de números inteiros pelo algoritmo Bubble Sort");
	}

	@Override
	public void mergeSort() {
		System.out.println("Ordenando lista de números inteiros pelo algoritmo Merge Sort");
		
	}

	@Override
	public void quickSort() {
		System.out.println("Ordenando lista de números inteiros pelo algoritmo Quick Sort");
		
	}
	
}
