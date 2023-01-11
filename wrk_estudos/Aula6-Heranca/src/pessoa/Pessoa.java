package pessoa;

public class Pessoa {
	
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
	
    public  String getClassName(){
        return Pessoa.class.getSimpleName();
    }

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
	
	public void status() {
		System.out.println("-------------------------------------------------");
		System.out.println("Nome " +  getClassName() + ": " + this.getNome() );
		System.out.println("Idade " +  getClassName() + ": " + this.getIdade() );
		System.out.println("Sexo " +  getClassName() + ": " + this.getSexo() );
		


	}

}
