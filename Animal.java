package br.com.Generationherança;

public class Animal {  
	
      private String nome;
      private int idade; 
      private String som;
      protected double velocidade; 
      
      public Animal (String nome, int idade, String som, double velocidade) {   
    	  
    	  this.nome = nome; 
    	  this.idade = idade;
    	  this.som = som;
    	  this.velocidade = velocidade;
      }
                  
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSom() {
		return som;
	}
	public void setSom(String som) {
		this.som = som;
	}
      

}
