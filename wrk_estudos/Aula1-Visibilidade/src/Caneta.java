
public class Caneta {
	
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	private boolean tampada;
	
	public void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Ponta:" + this.ponta);
		System.out.println("Carga:" + this.carga);
		System.out.println("Tampada: " + this.tampada);
	}
	
	public void rabiscar() {
		if(this.tampada) {
			System.out.println("Ta tampada! nao consigo");
		}else {
			System.out.println("Rabisqueiiii!!");
		}
	}
	
	public void tampar() {
		
		this.tampada = true;
		
	}
	
	public void destampar() {
		
		this.tampada = false;
		
	}
	

}
