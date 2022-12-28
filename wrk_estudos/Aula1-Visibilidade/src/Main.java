

public class Main {
	
	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.modelo = "BIC";
		c1.cor = "Vermelha";
		//c1.ponta = "0.5f"
		c1.carga = 100;
		c1.tampar();
		c1.status();
	}


}
