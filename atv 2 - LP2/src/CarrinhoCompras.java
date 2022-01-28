import java.util.ArrayList;

public class CarrinhoCompras {

		public ArrayList<Produto> carcomp;

	    public CarrinhoCompras() {
	        this.carcomp = new ArrayList<Produto>();
	    }

	    public CarrinhoCompras(ArrayList<Produto> carcomp) {
	        this.carcomp = carcomp;
	    }

	    public void incluir (Produto p) {
	       this.carcomp.add(p);
	    }

	    public void remover(Produto p) {
	    	this.carcomp.remove(p);

	    }

	    public void listar() {
	    	System.out.println("\nSomando os valores: ");
	    	
	    
	        double total = 0.0; 

	        if (carcomp.isEmpty()) {
	            System.out.println("Não há produtos no carrinho de compras");
	        }else {
	            for (Produto produto : carcomp) {
	                System.out.println(produto.toString());
	                total+= produto.getPreço();
	            }
	            System.out.println("\nTotal a pagar: " + total);
	        }

        }
   }
