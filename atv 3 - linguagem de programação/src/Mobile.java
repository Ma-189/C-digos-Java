
public class Mobile {
	
	private String Modelo;
	private String Marca;
	private CartãoSIM Cartão;
	
	public Mobile() {
		this.Modelo = "";
		this.Marca = "";
		this.Cartão = Cartão;
	}
	
	public Mobile(String Modelo, String Marca, CartãoSIM Cartão) {
		this.Modelo = Modelo;
		this.Marca = Marca;
		this.Cartão = Cartão;
		
	}
	
	public String getModelo() {
		return Modelo;
		}
		
	public void setModelo (String Modelo) {
		this.Modelo = Modelo;
		}
	
	public String getMarca() {
		return Marca;
		}
		
	public void setMarca (String Marca) {
		this.Marca = Marca;
		}
	
	public CartãoSIM getCartão() {
		return Cartão;
		}
		
	public void setCartão (CartãoSIM Cartão) {
		this.Cartão = Cartão;
	}
 
	
}

