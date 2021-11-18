package br.com.Generationherança;

public class Cachorro extends Animal {  
	
	public Cachorro(String nome, int idade, String som, double velocidade) {
		super(nome, idade, som, velocidade);
		}
	
	public void imprimirInfo() {
		System.out.println("O nome do cachorro é: " + getNome() + "\nA idade do cachorro é: " + getIdade() 
		                   + "\nO som que o cachorro reprouz é o: " + getSom() + "\nA velocidade do cachorro é de: " 
				           + getVelocidade()); 
	}
	
}
	