import java.util.Scanner;
public class ex5 {

	public static void main(String[] args) {
		
		Integer tab = new Integer(0);
		Integer i = new Integer(0);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número de 1 até 10: ");
		tab=sc.nextInt();
		
		for (i=1; i<=10; i++) {
			
			System.out.println(+tab+"X"+i+"="+tab*i);}
		
	}

}
