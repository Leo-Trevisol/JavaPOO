

public class Main {
	
	public static void main(String[] args) {
		Caneta c1 = new Caneta("", 0.0f, "");
		c1.setModelo("BIC");
		c1.setPonta(0.5f);
		c1.status();
		
		System.out.println("Caneta " + c1.getModelo() + "de ponta " + c1.getPonta());
	}

}
