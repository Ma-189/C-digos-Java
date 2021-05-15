import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1 {

	public static void main(String[] args) {
		
		Scanner n = new Scanner(System.in);
		ArrayList<String> nomes = new ArrayList<>();
	
		int i = 0;
		
		do {
		
		System.out.println("Digite 5 nomes: ");
		
        nomes.add(n.nextLine());
        
		i++; }
		while (i<5);
	
		for(i=4; i>=0; i--) {
		System.out.println(nomes.get(i));}
	}
		
}


