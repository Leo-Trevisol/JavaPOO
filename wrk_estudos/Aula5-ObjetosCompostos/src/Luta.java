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
	
	public void lutar() {
		Lutador vencedor = null;
		if(aprovada) {
			desafiado.apresentar();
			desafiante.apresentar();
			Random r = new Random();
			int resultado = r.nextInt(3);

			switch(resultado){
				case 0:
				desafiado.empatarLuta();
				desafiante.empatarLuta();
				System.out.println("O resultado deu empate!");
				break;
			case 1:
				desafiado.ganharLuta();
				desafiante.perderLuta();
				System.out.println("O lutador " + desafiado + " venceu a luta!");
				break;
			case 2:
				desafiado.perderLuta();
				desafiante.ganharLuta();
				System.out.println("O lutador " + desafiante + " venceu a luta!");

						}

		}else {
			System.out.println("Luta nao pode acontencer...");
		}
		
	}
	

}
