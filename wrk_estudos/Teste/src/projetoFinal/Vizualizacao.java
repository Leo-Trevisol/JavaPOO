package projetoFinal;

public class Vizualizacao {
	
	private Viewer espectador;
	private Video video;
	
	public Vizualizacao(Viewer espectador, Video video) {
		super();
		this.espectador = espectador;
		this.video = video;
		this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
		this.video.setViews(this.video.getViews() + 1);
	}
	
	public void avaliar() {
		this.video.setAvaliacao(5);
	}
	
	public void avaliar(int nota) {
		this.video.setAvaliacao(nota);
	}
	
	public void avaliar(float perc) {
		int tot = 0;
		
		if(perc <=20) {
			tot = 3;
		} else if(perc <= 50 ) {
			tot = 5;
		}else if (tot <= 90) {
			tot = 8;
		}else {
			tot = 10;
		}
		
		this.video.setAvaliacao(tot);
		
	}

	public Viewer getEspectador() {
		return espectador;
	}

	public void setEspectador(Viewer espectador) {
		this.espectador = espectador;
	}

	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}

	@Override
	public String toString() {
		return "Vizualizacao [espectador=" + espectador + ", video=" + video + "]";
	}
	
	

}
