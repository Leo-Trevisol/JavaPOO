package pessoa;

public class Funcionario extends Pessoa {
	

	private String setor;
	private boolean trabalhando;
	
	public Funcionario(String nome, int idade, String sexo, String setor) {
		super(nome, idade, sexo);
		this.setor = setor;
		this.trabalhando = false;
	}

	
	public void mudarTrabalho(String trabs) {
		this.setor = trabs;
	}


	public String getSetor() {
		return setor;
	}


	public boolean isTrabalhando() {
		return trabalhando;
	}


	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}
	
	


	@Override
	public String getClassName() {
		
		return Funcionario.class.getSimpleName();
	}


	@Override
	public void status() {
		super.status();
		System.out.println("Setor " +  getClassName() + ": " + this.getSetor() );
		System.out.println("Trabalhando " +  getClassName() + ": " + this.isTrabalhando() );
	}
	
	
	

}
