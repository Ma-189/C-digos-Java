import java.util.Scanner;
public class ex2 {

	public static void main(String[] args) {
		
		Integer menorv = new Integer(0);
		Integer maiorv = new Integer(0);
		Scanner v = new Scanner (System.in);
		
		System.out.println("Digite o valor do menor n�mero: ");
		menorv=v.nextInt();
		System.out.println("Digite o valor do maior n�mero: ");
		maiorv=v.nextInt();
		
		while(menorv<=maiorv) {
			
			System.out.println(+menorv);
			menorv++;}
		
			

		}
		

	}


