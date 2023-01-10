package livro;

public class Main {public Main() {
	//TODO Auto-generated constructor stub
}
public static void main(String[] args) {
	

	Pessoa[] pessoas = new Pessoa[2];
	
	Livro[] livros = new Livro[3];
	

	pessoas[0] = new Pessoa("Leozin", 19, "Masculino");
	pessoas[1] = new Pessoa("Maria", 20, "Feminino");
	
	livros[0] = new Livro("Cidade das cinzas", "Cassandra Clare", 400, pessoas[0]);
	livros[1] = new Livro("O filho de netuno", "Rick Riordan", 300, pessoas[0]);
	livros[2] = new Livro("Um conto de duas cidades", "Charles Dickens", 500, pessoas[1]);

	


	
	
}
}
