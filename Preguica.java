package br.com.Generationheran�a;

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
		System.out.println("O nome da pregui�a �: " + getNome() + "\nA idade da pregui�a �: " + getIdade() 
		                   + "\nO som que a pregui�a reprouz � o: " + getSom() + "\nEla sobe em arvores? " 
				           + getSubir()); 
	}
}
