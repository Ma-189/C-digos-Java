import java.util.Scanner;
public class ex1 {

	public static void main(String[] args) {
		
		Integer i = new Integer(0);
		Integer n = new Integer(1);
		Double m = new Double(0);
		Scanner nm = new Scanner (System.in);
		
		while(n>0) {
			System.out.println("Digite um n�mero inteiro maior que 0: ");
			n=nm.nextInt();
			i++;
			m+=n;}
		if(n==0) {
		System.out.println("Foram digitados "+(--i)+ " n�meros e a m�dia desses n�meros �: "+m/(++i-1));}

	}

}
