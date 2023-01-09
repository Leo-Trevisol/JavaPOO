import java.util.Random;

public class Luta {
	
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	
	public void marcarLuta(Lutador l1, Lutador l2) {
		if(l1.getCategoria() == l2.getCategoria() &&
			(!l1.equals(l2))) {
				aprovada = true;
				desafiado = l1;
				desafiante = l2;
			}
		else {
			aprovada = false;
			desafiado = null;
			desafiante = null;
		}
	}
	
	public Lutador lutar() {
		Lutador vencedor = null;
		if(aprovada) {
			desafiado.apresentar();
			desafiante.apresentar();
		
			
			
		}else {
			System.out.println("Luta nao pode acontencer...");
		}
		
		return vencedor;
	}
	

}
