package pessoa;

public class Main {
	
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa("LEozin", 19, "MAsculino");
		Funcionario func = new Funcionario("Jean", 24, "MAsculino", "VideoMaker");
		Professor prof = new Professor("Vito", 20, "Masculino", "Musico", "guitarra", 5000.0f);
		Aluno aluno = new Aluno("leozinAluno", 16, "Masculino", "Desenvolvimento de sistemas");
		
		
		pessoa.status();
		System.out.println();
		func.status();
		System.out.println();
		prof.status();
		System.out.println();
		aluno.status();
		System.out.println();
		
		
		
	}

}
