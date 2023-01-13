package animais2;

public class Cachorro extends Lobo{

	@Override
	public void emitirSom() {
		System.out.println("AuAuAu...");
	}
	
	public void reagir(String frase) {
		if(frase.equals("Toma comida") || frase.equals("Ola")) {
			System.out.println("Abanar e latir...");
			
		}else {
			System.out.println("Rosnar...");
		}
	}
	
	public void reagir(int hora, int min){
		if(12 < hora) {
			System.out.println("Abanar...");
		} else if(hora >= 18) {
			System.out.println("Ignorar...");
		}else {
			System.out.println("Abanar e latir...");
		}
	}
	
	public void reagir (boolean dono) {
		if(dono) {
			System.out.println("Abanar e latir...");
		}else {
			System.out.println("Rosnar...");
		}
	}

	
}
