import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2 {

	public static void main(String[] args) {
		
		Scanner n = new Scanner(System.in);
		ArrayList<String> nomes = new ArrayList<>();
		
		nomes.add("Marcela");
		nomes.add("Carla");
		nomes.add("Fabio");
		nomes.add("Juliana");
		nomes.add("Pedro");
		
		for (int i=0; i<nomes.size(); i++) {
			System.out.println(i+1 + " " + nomes.get(i));
		}
		
		int opc = 0;
		do {
			System.out.println("\nDeseja excluir um nome?" + "\n1 - Sim\t\t 2 - Não");
			opc = n.nextInt();
			if (opc == 1) {
				System.out.println("Digite um número para excluir: ");
				int nu = n.nextInt();
				nomes.remove(nu-1);	
				for (int i = 0; i<nomes.size(); i++) {
					System.out.println(i+1 + " " + nomes.get(i));
				}
			}
			if (opc != 1 && opc != 2)
				System.out.println("Opção Inválida!");
		} while(opc != 2 || opc > nomes.size());		
		System.out.println("Encerrando...");
	}
}