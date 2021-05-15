
public class Calculadora {

	public static Integer Multiplicar(Integer num1, Integer num2) {
		return num1 * num2;
	}
	
	public static Double Multiplicar(Double num1, Double num2) {
		return num1 * num2;
	}
	
	public static Integer Cubo (Integer cubo1) {
		return cubo1 * cubo1 * cubo1;
	}
	
	public static String ParImpar (Integer parimpar) { 
		
			if (parimpar==0)
				return "Zero";
			else if(parimpar % 2==0)  
				return "Par";
			else
				return "Ímpar";
     }
}


