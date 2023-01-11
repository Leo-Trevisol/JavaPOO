package pessoa;

public class Professor extends Funcionario{
	
	private String especialidade;
	private float salario;
	
	
	public Professor(String nome, int idade, String sexo, String setor, String especialidade, float salario) {
		super(nome, idade, sexo, setor);
		this.especialidade = especialidade;
		this.salario = salario;
	}
	
	


	@Override
	public String getClassName() {
		
		return Professor.class.getSimpleName();
	}




	@Override
	public void status() {
		super.status();
		System.out.println("Especialidade " +  getClassName() + ": " + this.getEspecialidade() );
		System.out.println("Salario " +  getClassName() + ": " + this.getSalario() );
	}




	public String getEspecialidade() {
		return especialidade;
	}


	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}


	public float getSalario() {
		return salario;
	}


	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public void receberAumento(float aumento) {
		this.salario = salario * aumento;
	}

}
