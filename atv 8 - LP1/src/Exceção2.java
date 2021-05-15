
public class Exceção2 {

	public static void main(String[] args) {
	
		String nome = null;
		String nome2 = null;
		
		try {
			nome2 = nome.toUpperCase();			
		}
		
		catch (NullPointerException e) {
			
			System.out.println("O nome possui valor null");
			
			nome = "Marcela Stade Carvalho";
			nome2 = nome.toUpperCase();
					
		}
		
		System.out.println("\nNome antigo: "+nome);
		System.out.println("\nNovo nome: "+nome2);

	}

}
