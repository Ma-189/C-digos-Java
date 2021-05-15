import java.util.Scanner;
public class ex4 {

	public static void main(String[] args) {
		
		Integer maior = new Integer (0);
		Integer num = new Integer (0);
		Integer i = new Integer (1);
		Scanner sc = new Scanner (System.in);
		
		while(i<=10) {
			System.out.println("Digite o " +(i)+ "º nunúmero: ");
			num=sc.nextInt();
		if (num>maior) {
			maior=num;}
			i++;}
		System.out.println("O maior número é: "+maior);	
		
	}
}

	


