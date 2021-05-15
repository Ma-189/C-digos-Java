
public class Ex2 {

	public static Integer min3(Integer valor1, Integer valor2, Integer valor3) {
	    if (valor1 < valor2) {
	    	if (valor1<valor3)
	    		return valor1;
	    	else
	    		return valor3;
	    }
	    else {
	    	if (valor2 < valor3) 
	    		return valor2;
	    		else 
	    			return valor3;
	    		}
	    }
	public static Double min3(Double valor1, Double valor2, Double valor3) {
	    if (valor1 < valor2) {
	    	if (valor1<valor3)
	    		return valor1;
	    	else
	    		return valor3;
	    }
	    else {
	    	if (valor2 < valor3) 
	    		return valor2;
	    		else 
	    			return valor3;}
	}
}
	
	    
