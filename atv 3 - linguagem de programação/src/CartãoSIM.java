
public class CartãoSIM {

	private String Operadora;
	private String Tamanho;
	private Integer Número;
	
	public CartãoSIM() {
		this.Operadora = "";
		this.Tamanho = "";
		this.Número = 0;
	}
	
	public CartãoSIM(String Operadora, String Tamanho, Integer Número) {
		this.Operadora = Operadora;
		this.Tamanho = Tamanho;
		this.Número = Número;
		
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
	
	public Integer getNúmero() {
		return Número;
		}
		
	public void setNúmero (Integer Número) {
		this.Número = Número;
		}
	
}
	
	
		
	

	


