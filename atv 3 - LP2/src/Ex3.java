import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Collections;
import java.util.ArrayList;

public class Ex3 {

	public static void main(String[] args) {
		
		Random num = new Random();
		
		ArrayList<Integer> random = new ArrayList<Integer>();
		
		int n = 0;
		
		for(int i=0; i<10; ++i) {
			   random.add(n = num.nextInt(100)+1);    
		}
	
		FileOutputStream pares = null;
		FileOutputStream impares = null;
		
		try {
			pares = new FileOutputStream("pares.txt");
			impares = new FileOutputStream("impares.txt");
			
			int pi;
			for(int i=0; i< random.size(); ++i) {
				if (random.get(i) % 2 == 0) {
					System.out.println("Par: "+num);
					pares.write(random.get(i));
				}
				else {
					System.out.println("Ímpar: "+num);
					impares.write(random.get(i));
				}
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
		try {
			pares.close();
			impares.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	  }
   }
}