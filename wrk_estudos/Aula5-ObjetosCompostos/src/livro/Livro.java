package livro;

public class Livro implements Publicacao{
	
	private String titulo;
	private String autor;
	private int totalPag;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	public Livro(String titulo, String autor, int totalPag, Pessoa leitor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.totalPag = totalPag;
		this.pagAtual = 0;
		this.aberto = false;
		this.leitor = leitor;
	}

	public String detalhes() {
		return "Livro [titulo=" + titulo + "\n, autor=" + autor + "\n, totalPag=" + totalPag + "\n, pagAtual=" + pagAtual
				+ "\n, aberto=" + aberto + "\n, leitor=" + leitor.toString() + "]";
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getTotalPag() {
		return totalPag;
	}

	public void setTotalPag(int totalPag) {
		this.totalPag = totalPag;
	}

	public int getPagAtual() {
		return pagAtual;
	}

	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}

	public boolean isAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}

	@Override
	public void abrir() {
		this.aberto = true;
		
	}

	@Override
	public void fechar() {
		this.aberto = false;
		
	}

	@Override
	public void folhear(int pagina) {
		if(pagina > this.totalPag){
			this.pagAtual = 0;
		}else{
			this.pagAtual = pagina;
		}
		
		
	}

	@Override
	public void avancarPag() {
		this.pagAtual++;
		
	}

	@Override
	public void voltarPag() {
		this.pagAtual--;
		
	}

	
	
	
	
}
