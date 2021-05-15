import java.time.LocalDate;

public class Cachorro extends Mamifero implements Animal {
	
	private String cor;
	
	public Cachorro() {
		super();
		this.cor = "";
	}
	
	public Cachorro(String nome, LocalDate nascimento, String cor) {
		super(nome, nascimento);
		this.cor = cor;
	}
	
	public String getCor() {
		return cor;
		}
		
	public void setCor (String cor) {
		this.cor = cor;
		}

	public String especie() {
		return "Maltês";
	}

	public String somAnimal() {
		return "Latido (auauau)";
	}

	public Integer idade() {
		return LocalDate.now().getYear()-LocalDate.from(getNascimento()).getYear();
	}
	
    public String toString() {
    	return super.toString() + "\n[Cor: " +this.cor+ ", Espécie: " +this.especie()+ ", Som do Animal: " +this.somAnimal()+ ", Idade: " +this.idade()+ "]";
    }
}
    
    

