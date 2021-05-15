import java.util.Scanner;
public class ex3 {

	public static void main(String[] args) {
		
		Double prod = new Double(0);
		Double vend1 = new Double(0);
		Double vend2 = new Double(0);
		Double lucr1 = new Double(0);
		Double lucr2 = new Double(0);
		
		Scanner p = new Scanner (System.in);
		System.out.println("Valor do produto: ");
		prod=p.nextDouble();
		if (prod<20.00) {
			lucr1 = 0.45*prod;
			vend1 = lucr1+prod;
			System.out.println("O valor da venda será de: "+vend1);}
		else
			if(prod>=20.00) {
				lucr2 = 0.30*prod;
				vend2 = lucr2+prod;
				System.out.println("O valor da venda será de: "+vend2);}
				
		}
		
		
	}


