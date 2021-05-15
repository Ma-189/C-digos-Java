import java.util.Scanner;
public class ex2 {

	public static void main(String[] args) {
		
		Integer maçãs = new Integer(0);
		Double maç1 = new Double(0);
		Double maç2 = new Double(0);
		Scanner m = new Scanner (System.in);
		System.out.println("Número de maçãs compradas: ");
		maçãs=m.nextInt();
		if (maçãs<12) {
			maç1=0.30*maçãs;
			System.out.println("Cada maçã sairá por R$0,30. O valor total será: "+maç1);}
			else 
				if(maçãs>=12) {
				maç2=0.25*maçãs;
				System.out.println("Cada maçã sairá por R$0,25. O valor total será: "+maç2);}
			}
			
		}

	


