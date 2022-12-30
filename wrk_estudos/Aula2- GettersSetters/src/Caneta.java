

public class Caneta {
	
	private String modelo;
	private float ponta;
	private String cor;
	private boolean tampada;
	
	
	
	public Caneta(String modelo, float ponta, String cor) {
		this.modelo = modelo;
		this.ponta = ponta;
		this.cor = cor;
		this.tampar();
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float getPonta() {
		return ponta;
	}
	public void setPonta(float f) {
		this.ponta = f;
	}
	
	private void tampar() {
		this.tampada = true;
	}
	
	private void destampar() {
		this.tampada = false;
	}
	
	public void status() {
		System.out.println("SObre a caneta:");
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Cor: " + this.cor);
		System.out.println("Tamapada: " + this.tampada );

	}

}


