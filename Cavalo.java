package br.com.Generationheran�a;

public class Cavalo extends Animal {
	
	public Cavalo(String nome, int idade, String som, double velocidade) {
		super(nome, idade, som, velocidade);
		
	}
	
	public void imprimirInfo() {
		System.out.println("O nome do cavalo �: " + getNome() + "\nA idade do cavalo �: " + getIdade() 
		                   + "\nO som que o cavalo reprouz � o: " + getSom() + "\nA velocidade do cavalo � de: " 
				           + getVelocidade()); 
   }
}

	