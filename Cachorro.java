package br.com.Generationheran�a;

public class Cachorro extends Animal {  
	
	public Cachorro(String nome, int idade, String som, double velocidade) {
		super(nome, idade, som, velocidade);
		}
	
	public void imprimirInfo() {
		System.out.println("O nome do cachorro �: " + getNome() + "\nA idade do cachorro �: " + getIdade() 
		                   + "\nO som que o cachorro reprouz � o: " + getSom() + "\nA velocidade do cachorro � de: " 
				           + getVelocidade()); 
	}
	
}
	