import java.util.Scanner;
import java.util.ArrayList;

public class Jogador2 {

	public static void main(String[] args) {
		
		ArrayList<Jogador> array = new ArrayList<Jogador>();
		
		Jogador jg = new Jogador();
		Scanner sc = new Scanner(System.in);
		String nome="";
		Integer idade;
		Integer numero;

		do {
			System.out.println("Entre com o nome do jogador: ");
			nome = sc.next();
			if(!nome.equals("0"))
				jg.setNome(nome);
			else
				break;
		
			System.out.println("Entre com a idade do jogador: ");
			idade = sc.nextInt();
			if(idade > 0)
				jg.setIdade(idade);
			
			System.out.println("Entre com o numero do jogador: ");
			numero = sc.nextInt();
			if(numero > 0)
				jg.setNumero(numero);
			
			array.add(jg);
		} while (! nome.equals("0"));
		
		for(int cont = 0; cont < array.size(); cont++) {
            System.out.println("Jogador " + (cont+1) + ": ");
            System.out.println(array.get(cont) + "\n");
        }
	}

}