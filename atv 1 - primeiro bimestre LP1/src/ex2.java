import java.util.Scanner;
public class ex2 {

	public static void main(String[] args) {
		
		Integer ma��s = new Integer(0);
		Double ma�1 = new Double(0);
		Double ma�2 = new Double(0);
		Scanner m = new Scanner (System.in);
		System.out.println("N�mero de ma��s compradas: ");
		ma��s=m.nextInt();
		if (ma��s<12) {
			ma�1=0.30*ma��s;
			System.out.println("Cada ma�� sair� por R$0,30. O valor total ser�: "+ma�1);}
			else 
				if(ma��s>=12) {
				ma�2=0.25*ma��s;
				System.out.println("Cada ma�� sair� por R$0,25. O valor total ser�: "+ma�2);}
			}
			
		}

	


