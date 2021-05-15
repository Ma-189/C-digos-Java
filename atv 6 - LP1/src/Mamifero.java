import java.time.LocalDate;

public class Mamifero {
	
		private String nome;
		private LocalDate nascimento;

		public Mamifero() {
			this.nome = "";
			this.nascimento = LocalDate.now();
		}
		
		public Mamifero(String nome, LocalDate nascimento) {
			this.nome = nome;
			this.nascimento = nascimento;
		}
		
		public String getNome() {
			return nome;
			}
			
		public void setNome (String nome) {
			this.nome = nome;
			}
		
		public LocalDate getNascimento() {
			return nascimento;
			}
			
		public void setNascimento (LocalDate nascimento) {
			this.nascimento = nascimento;
			}	
		
		public String toString() {
			return super.toString() + "\n[Nome: " +this.nome+ ", Nascimento: " +this.nascimento+ "]";
		}
	}

	


