package escola;

public class Bolsista extends Aluno {
	
	private boolean bolsa;

	public Bolsista(String nome, int idade, String sexo, boolean matricula, String curso, boolean bolsa) {
		super(nome, idade, sexo, matricula, curso);
		this.bolsa = bolsa;
	}
	
	public void renovarBolsa() {
		this.bolsa = true;
	}

	@Override
	public void pagarMensalidade(float valor) {
		// TODO Auto-generated method stub
		
	}

	public boolean isBolsa() {
		return bolsa;
	}

	public void setBolsa(boolean bolsa) {
		this.bolsa = bolsa;
	}
	
	

}
