import java.util.Scanner;
public class ex1 {

	public static void main(String[] args) {
	
		Integer senha = new Integer(0);
		Scanner s = new Scanner (System.in);
		System.out.println("Digite a senha de 4 números: ");
		senha=s.nextInt();
		if (senha==1234) {
			System.out.println("ACESSO LIBERADO");}
			else {
				System.out.println("ACESSO NEGADO");}
				
		}

}


