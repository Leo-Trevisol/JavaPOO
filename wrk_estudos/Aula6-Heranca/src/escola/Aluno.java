package escola;

public abstract class Aluno extends Pessoa{

	private boolean matricula;
	private String curso;
	
	public Aluno(String nome, int idade, String sexo, boolean matricula, String curso) {
		super(nome, idade, sexo);
		this.matricula = matricula;
		this.curso = curso;
	}
	
	public abstract void pagarMensalidade(float valor);

	public boolean isMatricula() {
		return matricula;
	}

	public void setMatricula(boolean matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
}
