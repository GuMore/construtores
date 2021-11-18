package br.com.Generationherança;

public class Cavalo extends Animal {
	
	public Cavalo(String nome, int idade, String som, double velocidade) {
		super(nome, idade, som, velocidade);
		
	}
	
	public void imprimirInfo() {
		System.out.println("O nome do cavalo é: " + getNome() + "\nA idade do cavalo é: " + getIdade() 
		                   + "\nO som que o cavalo reprouz é o: " + getSom() + "\nA velocidade do cavalo é de: " 
				           + getVelocidade()); 
   }
}

	