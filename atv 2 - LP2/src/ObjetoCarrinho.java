public class ObjetoCarrinho {

	public static void main(String[] args) {
	
		CarrinhoCompras produtos = new CarrinhoCompras();
		
		Produto p1 = new Produto("1", "leite", 3.40 );
		Produto p2 = new Produto("2", "chocolate", 5.60 );
		Produto p3 = new Produto("3", "bolacha", 4.0 );
		Produto p4 = new Produto("4", "alface", 2.20 );
		Produto p5 = new Produto("5", "refrigerante", 4.54 );
		
		produtos.incluir(p1);
		produtos.incluir(p2);
		produtos.incluir(p3);
		produtos.incluir(p4);
		produtos.incluir(p5);
		produtos.listar();
		
		produtos.remover(p2);
		produtos.remover(p4);
		produtos.listar();
	}

}
