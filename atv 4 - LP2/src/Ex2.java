import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer esp = 0;
		
		System.out.println("Escreva uma mensagem: ");
		String resp = sc.nextLine();
		
		FileWriter vogais = null;
		FileWriter consoantes = null;
		
		try {
			
			vogais = new FileWriter("vogais.txt");
			consoantes = new FileWriter("consoantes.txt");
			
			for(int i=0; i< resp.length(); i++) {
				char caracter = resp.charAt(i);		
			
			if(caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
				vogais.write(caracter);
			}
			
			else if (caracter == 'b' || caracter == 'c' || caracter == 'd' || caracter == 'f' || caracter == 'g' || caracter == 'h' || caracter == 'j' || 
					caracter == 'k' || caracter == 'l' || caracter == 'm' || caracter == 'n' || caracter == 'p' || caracter == 'q' || caracter == 'r' ||
					caracter == 't' || caracter == 'v' || caracter == 'w' || caracter == 'x' || caracter == 'y' || caracter == 'z') {
				
				consoantes.write(caracter);	
			}
			
			else {
				esp++;
			}
		}
	}
			catch(IOException e) {
				e.printStackTrace();
			}
		finally {
			try {
				vogais.close();
				consoantes.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
	}

