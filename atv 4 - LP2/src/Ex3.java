import java.io.FileReader;
import java.io.IOException;

public class Ex3 {

	public static void main(String[] args) {
		
		Integer esp = 0;
		Integer vogais = 0;
		Integer consoantes = 0;
		Integer caracteres = 0;
		
		try(FileReader texto = new FileReader("texto.txt")) {
			
			int c;
			
			while((c = texto.read()) != -1) {
				
				String caracter = String.valueOf((char)c);
				
				for(int i=0; i< caracter.length(); i++) {
					char carac = caracter.charAt(i);		

				
			
				if(carac == 'a' || carac == 'e' || carac== 'i' || carac == 'o' || carac == 'u' || carac == 'A' || carac == 'E' || carac== 'I' || carac == 'O' || carac == 'U') {
				vogais++;
			}
			
				else if (carac == 'b' || carac== 'c' || carac == 'd' || carac == 'f' || carac == 'g' || carac == 'h' || carac == 'j' || 
						carac == 'k' || carac == 'l' || carac == 'm' || carac == 'n' || carac == 'p' || carac == 'q' || carac == 'r' ||
								carac == 't' || carac== 'v' || carac == 'w' || carac == 'x' || carac == 'y' || carac == 'z' || carac == 'B' 
								|| carac== 'C' || carac == 'D' || carac == 'F' || carac == 'G' || carac == 'H' || carac == 'J' || 
						carac == 'K' || carac == 'L' || carac == 'M' || carac == 'N' || carac == 'P' || carac == 'Q' ||
								carac == 'R' || carac== 'S' || carac == 'T' || carac == 'V' || carac == 'W' || carac == 'X'|| carac == 'Y' || carac== 'Z') {
				consoantes++;	
			}
			else {
				esp++;
			}
			caracteres= vogais + consoantes + esp;
			}
			}
			
			System.out.println("A quantidade total de vogais é: "+vogais);
			System.out.println("A quantidade total de consoantes é: "+consoantes);
			System.out.println("A quantidade total de espaços é: "+esp);
			System.out.println("A quantidade total de caracteres é: "+caracteres);
		}
		
		
				catch(IOException e) {
					e.printStackTrace();
		
		}
	}
}

