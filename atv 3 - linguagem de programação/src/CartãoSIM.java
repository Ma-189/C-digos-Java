
public class Cart�oSIM {

	private String Operadora;
	private String Tamanho;
	private Integer N�mero;
	
	public Cart�oSIM() {
		this.Operadora = "";
		this.Tamanho = "";
		this.N�mero = 0;
	}
	
	public Cart�oSIM(String Operadora, String Tamanho, Integer N�mero) {
		this.Operadora = Operadora;
		this.Tamanho = Tamanho;
		this.N�mero = N�mero;
		
	}
	
	public String getOperadora() {
		return Operadora;
		}
		
	public void setOperadora (String Operadora) {
		this.Operadora = Operadora;
		}
	
	public String getTamanho() {
		return Tamanho;
		}
		
	public void setTamanho (String Tamanho) {
		this.Tamanho = Tamanho;
		}
	
	public Integer getN�mero() {
		return N�mero;
		}
		
	public void setN�mero (Integer N�mero) {
		this.N�mero = N�mero;
		}
	
}
	
	
		
	

	


