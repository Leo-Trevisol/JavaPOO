package animaisGenericos;

public class ReptilGeneric extends Animal {
	
	private String corEscama;

	@Override
	public void locomover() {
		System.out.println("Rastejando...");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo insetos...");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Linguinha pra fora...");
		
	}
	
	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	

}
