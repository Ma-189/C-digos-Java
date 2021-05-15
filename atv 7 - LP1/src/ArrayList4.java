import java.util.ArrayList;

public class ArrayList4 {

	public static void main(String[] args) {
		
	    ArrayList<Integer> num = new ArrayList<>();
	    
	    int soma = 0;
	    
	    for (int i=0; i<=100; i++){
	   
		   if (i%2==1)
			   num.add(i);
	    }
	    
	    System.out.println(num);
	
	    for (int i=0; i<num.size(); i++) {
	    	soma = soma + num.get(i);
	    }
	    
	    System.out.println("\nA soma dos valores é "+soma);	
      }
    }

