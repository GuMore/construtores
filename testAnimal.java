package br.com.Generationherança;

public class testAnimal {

	public static void main(String[] args) { 
		
		Cachorro Bob = new Cachorro("Bob", 4, "latido", 10.0);
		Bob.imprimirInfo(); 
		
		System.out.println("\n**********************************************");
		
	    Cavalo Laranjão = new Cavalo("Laranjão", 6, "Rinchar", 25.0);
	    Laranjão.imprimirInfo(); 
	    
	    System.out.println("\n**********************************************");
	    
	    Preguica Charles = new Preguica("Charles", 3,"não tem", "Ela ama subir em arvores!!!");
	    Charles.imprimirInfo();
	    
	    System.out.println("\n**********************************************");
	    	    		
	}

}
