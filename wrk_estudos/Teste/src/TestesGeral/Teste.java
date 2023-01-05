

public class Teste {
	
	
	public static void main(String[] args) {
		
		new Teste().Iniciar();
		
	}
	
	public void Iniciar() {
		Integer um = 1;
		Integer dois = um;
		
		System.out.println("1.1: " + um);
		System.out.println("1.2: " + dois);
		
		um = 2;
		
		System.out.println("1.1: " + um);
		System.out.println("1.2: " + dois);
		
	
	}
	

}
