package br.com.Generationherança;

public class Preguica extends Animal { 
		
	private String subir; 

	public Preguica (String nome, int idade, String som, String subir) { 
		super (nome, idade, som, subir); 
		
		this.subir = subir;
	}
	public String getSubir() {
		return subir;
	}
	public void setSubir(String subir) {
		this.subir = subir;
	}	
	
	public void imprimirInfo() {
		System.out.println("O nome da preguiça é: " + getNome() + "\nA idade da preguiça é: " + getIdade() 
		                   + "\nO som que a preguiça reprouz é o: " + getSom() + "\nEla sobe em arvores? " 
				           + getSubir()); 
	}
}
