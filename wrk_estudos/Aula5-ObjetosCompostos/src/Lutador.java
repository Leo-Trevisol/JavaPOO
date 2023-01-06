
public class Lutador {

	private String nome;
	private String nacionalidade;
	private int idade;
	private double altura;
	private double peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;

	public Lutador(String nome, String nacionalidade, int idade, double d, double e, 
			int vitorias, int derrotas, int empates) {
		super();
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = d;
		this.peso = e;
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getCategoria() {
		if(getPeso() < 50.0) {
			this.categoria = "Invalido";
		}else if (getPeso() < 70.0) {
			this.categoria = "Leve";
		}else if (getPeso() < 90.0) {
			this.categoria = "medio";
		}else if (getPeso() < 120.0) {
			this.categoria = "Pesado";
		}else {
			this.categoria = "Invalido";
		}
		return this.categoria;
	}

	

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}

	public void ganharLuta() {
		setVitorias(getVitorias() + 1);

	}

	public void perderLuta() {
		setDerrotas(getDerrotas() + 1);
	}

	public void empatarLuta() {
		setEmpates(getEmpates() + 1);
	}
	
	public void apresentar() {
		System.out.println("----------APRESENTANDO LUTADOR----------");
		System.out.println("Lutador: " + getNome());
		System.out.println("Pesando: " + getPeso() + " kilos");
		System.out.println("Categoria: " + getCategoria());
		System.out.println(getAltura() + " de altura");
		System.out.println("Com " + getVitorias() + " Vitorias");
		System.out.println("Com " + getDerrotas() + " Derrotas");
		System.out.println("Com " + getEmpates() + " Empates");



	}

	@Override
	public String toString() {
		return "Lutador [nome=" + nome + ", nacionalidade=" + nacionalidade + ", idade=" + idade + ", altura=" + altura
				+ ", peso=" + peso + ", categoria=" + getCategoria() + ", vitorias=" + vitorias + ", derrotas=" + derrotas
				+ ", empates=" + empates + "]";
	}
	
	

}
