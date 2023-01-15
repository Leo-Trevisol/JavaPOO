package animais.animaisGenericos;

public class AveGeneric extends Animal {
	
	private String corPena;

	@Override
	public void locomover() {
		System.out.println("Voando...");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo minhoca...");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Cantando...");
		
	}

	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}
	
	public void fazerNinho() {
		System.out.println("Fazendo ninho...");
	}
	
	

}
