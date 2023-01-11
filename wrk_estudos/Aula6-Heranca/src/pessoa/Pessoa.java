package pessoa;

public abstract class Pessoa {
	
	private String nome;
	private int idade;
	private String sexo;
	
	public void fazerAniversario() {
		this.idade = idade+1;
	}

	public Pessoa(String nome, int idade, String sexo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}
	
    public abstract String getClassName();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public abstract void status();
	
	public void show() {
 
	System.out.println("-------------------------------------------------");
	System.out.println("Nome do " +  getClassName().toLowerCase() + ": " + this.getNome() );
	System.out.println("Idade do " +  getClassName().toLowerCase() + ": " + this.getIdade() );
	System.out.println("Sexo do " +  getClassName().toLowerCase() + ": " + this.getSexo() );
			
	}
	
	

}
