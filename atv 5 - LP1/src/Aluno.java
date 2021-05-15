import java.time.LocalDate;

public class Aluno extends Pessoa {

	private String prontu�rio;
	private String email;

	public Aluno() {
		super();
		this.prontu�rio = "";
		this.email = "";
	}
	
	public Aluno(String nome, LocalDate nascimento, String prontu�rio, String email) {
		super(nome, nascimento);
		this.prontu�rio = prontu�rio;
		this.email = email;
	}
	
	public String getProntu�rio() {
		return prontu�rio;
		}
		
	public void setProntu�rio (String prontu�rio) {
		this.prontu�rio = prontu�rio;
		}
	
	public String getEmail() {
		return email;
		}
		
	public void setEmail (String email) {
		this.email = email;
		}	
	
	public String toString() {
		return super.toString() + "\n[Prontu�rio: " +this.prontu�rio+ ", Email: " +this.email+ "]";
	}

}


