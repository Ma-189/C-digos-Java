
public class Carro {
	
	private String Marca;
	private String Modelo;
	private Motor motor;
	
	public Carro() {
		this.Marca = "";
		this.Modelo = "";
		this.motor = motor;
	}
	
	public Carro(String Marca, String Modelo, Motor motor) {
		this.Marca = Marca;
		this.Modelo = Modelo;
		this.motor = motor;
	}
	
	public String getMarca() {
		return Marca;
		}
		
	public void setMarca (String Marca) {
		this.Marca = Marca;
		}
	
	public String getModelo() {
		return Modelo;
		}
		
	public void setModelo (String Modelo) {
		this.Modelo = Modelo;
		}
	
	public Motor getmotor() {
		return motor;
		}
		
	public void setmotor (Motor motor) {
		this.motor = motor;
		}
	
}


