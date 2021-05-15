
public class Motor {
	
	private String Tipo;
	private Double Tamanho;
	
	public Motor() {
		this.Tipo = "";
		this.Tamanho = 0.0;
	}
	
	public Motor(String Tipo, Double Tamanho) {
		this.Tipo = Tipo;
		this.Tamanho = Tamanho;	
	}
	
	public String Tipo() {
		return Tipo;
		}
		
	public void setTipo (String Tipo) {
		this.Tipo = Tipo;
		}
	
	public Double getTamanho() {
		return Tamanho;
		}
		
	public void setTamanho (Double Tamanho) {
		this.Tamanho = Tamanho;
		}
}
	
	