import java.util.InputMismatchException;
import java.util.Scanner;

public class Exce��o1 {

	public static void main(String[] args) {
		
        Scanner n = new Scanner(System.in);
        int num = 0;
       
        do {

            try {
                System.out.print("Digite um n�mero inteiro, e para sair, digite 0: ");
                num = n.nextInt();
            } 
            
            catch (InputMismatchException e) {
                System.out.println("\nDigite apenas n�meros!\n");
            }
            n.nextLine();

        } while (num != 0);
        
        if (num == 0) {
        	System.out.println("\nSaindo...");
        }
    }
}
	
	


