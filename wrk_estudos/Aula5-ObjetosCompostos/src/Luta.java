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
				System.out.println("O lutador " + desafiado.getNome() + " venceu a luta!");
				break;
			case 2:
				desafiado.perderLuta();
				desafiante.ganharLuta();
				System.out.println("O lutador " + desafiante.getNome() + " venceu a luta!");

						}

		}else {
			System.out.println("Luta nao pode acontencer...");
		}
		
		System.out.println();
		
	}

	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean isAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	

}
