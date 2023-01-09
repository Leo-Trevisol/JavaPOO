

public class Main {

	public static void main(String[] args) {

		Lutador lutadores[] = new Lutador[6];

		lutadores[0] = new Lutador("Leozin", "Brazil", 17, 1.74, 71.0, 10, 5, 1);

		lutadores[1] = new Lutador("SwitcGuy", "Switerzerland", 18, 1.75, 74.0, 1, 5, 5);

		lutadores[2] = new Lutador("WhatzMan", "Netherlands", 19, 1.90, 78.0, 5, 5, 6);

		lutadores[3] = new Lutador("Gonzalo", "Argentina", 20, 1.85, 82.0, 52, 0, 1);
		
		lutadores[4] = new Lutador("PicaTchu", "Japan", 21, 1.60, 102.0, 4, 0, 4);
		
		lutadores[5] = new Lutador("KinJon", "Korea", 22, 1.52, 86.0, 12, 3, 2);

		Luta novaLuta = new Luta();
		novaLuta.marcarLuta(lutadores[2], lutadores[3]);
		novaLuta.lutar();
		lutadores[2].status();

		lutadores[3].status();	 

	}

}
