import java.util.Comparator;

public class Ex4 implements Comparator<Produto>{

	@Override
	public int compare(Produto p2, Produto p5) {
		
		return p2.getNome().compareTo(p5.getNome());
	}

}
