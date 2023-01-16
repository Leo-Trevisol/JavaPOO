package projetoFinal;

public class Main {
	
	public static void main(String[] args) {
		
		Video videos[] = new Video[3];
		
		videos[0] = new Video("Receita de bolo de cenoura");
		videos[1] =  new Video("Receita de strogolove");
		videos[2] = new Video ("Receita de lentilha");
		
		System.out.println(videos[0].toString());
		
		Viewer[] viw = new Viewer[2];
		
		viw[0] = new Viewer("Leozin", 19, "MAsc", "Leo-trevis");
		viw[1] = new Viewer("Jhonas", 21, "MAsc", "jhonitas_dev");
		
		System.out.println("---------------------------");
		
		System.out.println(viw[0].toString());
		
		
		
	}

}
