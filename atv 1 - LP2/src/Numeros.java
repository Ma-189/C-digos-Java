import java.util.Scanner;
import java.util.ArrayList;

public class Numeros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		int num = 0;
		int maior=0;
		int menor=0;
		
		 System.out.println("Digite n�meros inteiros maiores que 0 e para encerrar, digite 0: ");
			
		  do {
			  
			  num=sc.nextInt();
	
			  if(num > 0) {
				  array.add(num);
				  menor = num;
				  
			  }
			  
		  }while(num>0);
		  
		  for(int i = 0; i < array.size(); i++){
			  if (array.get(i)> maior) {
					maior=array.get(i);}
			  }
			  
		  
			  for(int j = 0; j < array.size(); j++){
			  if (array.get(j)< menor) {
					menor=array.get(j);}
			  }
		  
			  System.out.println(array);
		      System.out.println("A quantidade de n�meros armazenados �: "+array.size());
		      System.out.println("O maior n�mero �: "+maior);
		      System.out.println("O menor n�mero �: "+menor);
		
	}
  }