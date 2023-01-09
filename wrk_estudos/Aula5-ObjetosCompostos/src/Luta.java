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

			   int min = 0; // Minimum value of range
		      int max = 2; // Maximum value of range
		      // Print the min and max  
		      System.out.println("Random value in int from "+ min + " to " + max + ":");
		      // Generate random int value from min to max
		      int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);
		      // Printing the generated random numbers
		      System.out.println(random_int);	
		
			
			
		}else {
			System.out.println("Luta nao pode acontencer...");
		}
		
		return vencedor;
	}
	

}
