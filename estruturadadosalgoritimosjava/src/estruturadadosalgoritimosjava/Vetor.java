package estruturadadosalgoritimosjava;


public class Vetor {

	private String[] elementos; 
	private int tamanho;

	public Vetor(int capacidade){
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}

}