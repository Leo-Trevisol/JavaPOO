package projetoFinal;

public class Main {
	
	public static void main(String[] args) {
		
		Video videos[] = new Video[3];
		
		videos[0] = new Video("Receita de bolo de cenoura");
		videos[1] =  new Video("Receita de strogolove");
		videos[2] = new Video ("Receita de lentilha");
		
		
		
		Viewer[] viw = new Viewer[2];
		
		viw[0] = new Viewer("Leozin", 19, "MAsc", "Leo-trevis");
		viw[1] = new Viewer("Jhonas", 21, "MAsc", "jhonitas_dev");
		
		System.out.println("---------------------------");
		
		
		Vizualizacao vizu[] = new Vizualizacao[3];
		
		vizu[0] = new Vizualizacao(viw[0], videos[0]);
		
		videos[0].play();
		videos[0].like();
		
		System.out.println(vizu[0].toString());
		
		
	}

}
