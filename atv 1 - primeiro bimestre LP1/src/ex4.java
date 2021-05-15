import java.util.Scanner;
public class ex4 {

	public static void main(String[] args) {
		
		Integer num = new Integer(0);
		
		Scanner n = new Scanner (System.in);
		System.out.println("Digite um número inteiro: ");
		num=n.nextInt();
		if(num%2==0) {
			System.out.println("NÚMERO PAR");}
			else {
		        System.out.println("NÚMERO ÍMPAR");}
		}
		

	}


