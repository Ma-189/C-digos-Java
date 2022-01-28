import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Ex2 {

	public static void main(String[] args) {
		
		FileInputStream entrada = null;
		FileOutputStream maior = null;
		FileOutputStream menor = null;
		
		try {
			entrada = new FileInputStream("entrada.txt");
			maior = new FileOutputStream("maior.txt");
			menor = new FileOutputStream("menor.txt");
			
			int num;
			while ((num = entrada.read()) != -1){
				if (num > 128) {
					System.out.println("Maior: "+num);
					maior.write(num);
				}
				else {
					if (num <= 128) {
					System.out.println("Menor: "+num);
					menor.write(num);
				}
					}
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
		try {
			entrada.close();
			maior.close();
			menor.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	  }
   }
}
