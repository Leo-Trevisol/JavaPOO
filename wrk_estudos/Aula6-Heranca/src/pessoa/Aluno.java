package pessoa;

public class Aluno extends Pessoa {
	
	private boolean matriculado;
	private String curso;
	
	
	public Aluno(String nome, int idade, String sexo, String curso) {
		super(nome, idade, sexo);
		this.matriculado = true;
		this.curso = curso;
	}

	

	@Override
	public String getClassName() {
		
		return Aluno.class.getSimpleName();
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
	public void status() {
		super.status();
		System.out.println("Matriculado " +  getClassName() + ": " + this.isMatriculado() );
		System.out.println("Curso " +  getClassName() + ": " + this.getCurso() );
	}
	
	

}
