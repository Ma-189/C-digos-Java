import java.util.ArrayList;
import java.util.Random;


public class ArrayList3 {

	public static void main(String[] args) {
	
		Random nu = new Random();
		ArrayList<Integer> num = new ArrayList<>();

        int i = 0;
        int n = 0;
        int maior = 0;
		
        while (i<10) {
		
		
        num.add(n = nu.nextInt(100)); 
        
        System.out.println(num);
        
		if (num.get(i)> maior) {
			maior=num.get(i);}
		
		i++;}
        
		 System.out.println("\nO maior número é: "+maior);
		 
	}

  }

