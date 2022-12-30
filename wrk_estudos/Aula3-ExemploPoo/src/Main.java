

public class Main {
	
	public static void main(String[] args) {
		ContaBanco c1 = new ContaBanco();
		c1.setNumConta(11);
		c1.setDono("leozin");
		c1.abrirConta("CC");
		
		
		ContaBanco c2 = new ContaBanco();
		c2.setNumConta(22);
		c2.setDono("marquin");
		c2.abrirConta("CP");
		
		
		c1.depositar(200f);
		c1.sacar(250f);
		
		c1.fecharConta();
		
		
		c1.estadoAtual();
		c2.estadoAtual();
	}

}
