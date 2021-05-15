import java.time.LocalDate;

public class Atleta extends Aluno {
	
	private String modalidade;

	public Atleta() {
		super();
		this.modalidade = "";
	}
	
	public Atleta(String nome, LocalDate nascimento, String prontuário, String email, String modalidade) {
		super(nome, nascimento, prontuário, email);
		this.modalidade = modalidade;
	}
	
	public String getModalidade() {
		return modalidade;
		}
		
	public void setModalidade (String modalidade) {
		this.modalidade = modalidade;
		}
	
	public String toString() {
		return super.toString() + "\n[Modalidade: " +this.modalidade+ "]";
	}

}
