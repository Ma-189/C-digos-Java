import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		
		String nome;
		Integer dia;
		Integer mes;
		Integer ano;
		LocalDate data;
		
		
		HashMap<String, LocalDate> mapa = new HashMap<String, LocalDate>();
		
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite um nome: ");
			nome=sc.nextLine();
			
			if(!(nome.isEmpty())) {
			System.out.println("Digite o dia do nascimento: ");
			dia=sc.nextInt();
			System.out.println("Digite o mês do nascimento: ");
			mes=sc.nextInt();
			System.out.println("Digite o ano do nascimento: ");
			ano=sc.nextInt();
			data = LocalDate.of(ano, mes, dia);
			mapa.put(nome, data);}
		}
		while(!(nome.isEmpty()));
		
		System.out.println(mapa);
   }
}