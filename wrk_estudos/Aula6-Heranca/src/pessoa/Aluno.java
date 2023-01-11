package pessoa;

public class Aluno extends Pessoa {
	
	private boolean matriculado;
	private String curso;
	
	
	public Aluno(String nome, int idade, String sexo, String curso) {
		super(nome, idade, sexo);
		this.matriculado = true;
		this.curso = curso;
	}

	public boolean isMatriculado() {
		return matriculado;
	}


	public void setMatriculado(boolean matriculado) {
		this.matriculado = matriculado;
	}


	public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public void cancelarMatricula() {
		this.setMatriculado(false);
	}
	
	@Override
	public String getClassName() {
		
		return Aluno.class.getSimpleName();
	}

	@Override
	public void status() {
		super.show();
		System.out.println("Matriculado " +  getClassName().toLowerCase() + ": " + this.isMatriculado() );
		System.out.println("Curso do " +  getClassName().toLowerCase() + ": " + this.getCurso() );
	}
	
	

}
