import java.time.LocalDate;

public class Gato extends Mamifero implements Animal {
	
private String pelagem;
	
	public Gato() {
		super();
		this.pelagem = "";
	}
	
	public Gato(String nome, LocalDate nascimento, String pelagem) {
		super(nome, nascimento);
		this.pelagem = pelagem;
	}
	
	public String getPelagem() {
		return pelagem;
		}
		
	public void setPelagem (String pelagem) {
		this.pelagem = pelagem;
		}

	public String especie() {
		return "Gato Persa";
	}

	public String somAnimal() {
		return "Miado (miau)";
	}

	public Integer idade() {
		return LocalDate.now().getYear()-LocalDate.from(getNascimento()).getYear();
	}
	
    public String toString() {
    	return super.toString() + "\n[Pelagem: " +this.pelagem+ ", Espécie: " +this.especie()+ ", Som do Animal: " +this.somAnimal()+ ", Idade: " +this.idade()+ "]";
    }
}
    
    


