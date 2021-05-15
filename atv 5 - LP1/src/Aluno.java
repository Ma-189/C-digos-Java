import java.time.LocalDate;

public class Aluno extends Pessoa {

	private String prontuário;
	private String email;

	public Aluno() {
		super();
		this.prontuário = "";
		this.email = "";
	}
	
	public Aluno(String nome, LocalDate nascimento, String prontuário, String email) {
		super(nome, nascimento);
		this.prontuário = prontuário;
		this.email = email;
	}
	
	public String getProntuário() {
		return prontuário;
		}
		
	public void setProntuário (String prontuário) {
		this.prontuário = prontuário;
		}
	
	public String getEmail() {
		return email;
		}
		
	public void setEmail (String email) {
		this.email = email;
		}	
	
	public String toString() {
		return super.toString() + "\n[Prontuário: " +this.prontuário+ ", Email: " +this.email+ "]";
	}

}


