package br.com.Generationheran�a;

public class testAnimal {

	public static void main(String[] args) { 
		
		Cachorro Bob = new Cachorro("Bob", 4, "latido", 10.0);
		Bob.imprimirInfo(); 
		
		System.out.println("\n**********************************************");
		
	    Cavalo Laranj�o = new Cavalo("Laranj�o", 6, "Rinchar", 25.0);
	    Laranj�o.imprimirInfo(); 
	    
	    System.out.println("\n**********************************************");
	    
	    Preguica Charles = new Preguica("Charles", 3,"n�o tem", "Ela ama subir em arvores!!!");
	    Charles.imprimirInfo();
	    
	    System.out.println("\n**********************************************");
	    	    		
	}

}
