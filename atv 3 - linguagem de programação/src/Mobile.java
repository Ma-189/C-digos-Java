
public class Mobile {
	
	private String Modelo;
	private String Marca;
	private Cart�oSIM Cart�o;
	
	public Mobile() {
		this.Modelo = "";
		this.Marca = "";
		this.Cart�o = Cart�o;
	}
	
	public Mobile(String Modelo, String Marca, Cart�oSIM Cart�o) {
		this.Modelo = Modelo;
		this.Marca = Marca;
		this.Cart�o = Cart�o;
		
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
	
	public Cart�oSIM getCart�o() {
		return Cart�o;
		}
		
	public void setCart�o (Cart�oSIM Cart�o) {
		this.Cart�o = Cart�o;
	}
 
	
}

