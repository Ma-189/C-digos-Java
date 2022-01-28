import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		FileInputStream buscar = null;
		
		Scanner sc = new Scanner(System.in);
		
		boolean arq = false;

		while(arq == false) {
			try {
				System.out.println("Entre com o nome do arquivo de leitura: ");
				buscar = new FileInputStream(sc.nextLine());
				
				int ar;
				
	            while ((ar = buscar.read()) != -1){
				System.out.println(buscar.read());
	            }
	            buscar.close();
			}

				catch (FileNotFoundException e) {
					System.out.println("Arquivo não encontrado!");
					arq = false;
			
				}
				catch (IOException e) {
					e.printStackTrace();
				}
			  }
		   }
		}
