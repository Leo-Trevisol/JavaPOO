import java.util.Iterator;

public class ControleRemoto implements Controlador {
	
	private Integer volume;
	private boolean ligado;
	private boolean tocando;
	
	public ControleRemoto() {
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
	}

	public Integer getVolume() {
		return volume;
	}

	public void setVolume(Integer volume) {
		this.volume = volume;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public boolean isTocando() {
		return tocando;
	}

	public void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

	@Override
	public void ligar() {
		this.setLigado(true);
		
	}

	@Override
	public void desligar() {
		this.setLigado(false);
		
	}

	@Override
	public void abrirMenu() {
		System.out.println("-------MENU-------");
		System.out.println("Ligado?:" + isLigado());
		System.out.println("Volume:" + getVolume());
		for(int i = 0; i <= getVolume(); i+=10){
			System.out.print("|");
		}
		System.out.println();
		System.out.println("Tocando:" + isTocando());
		
	}

	@Override
	public void fecharMenu() {
		System.out.println("Fechando menu...");
		
	}

	@Override
	public void maisVolume() {
		if(isLigado()) {
			setVolume(getVolume() + 5);
		}else {
			System.out.println("Acao impossivel... aparelho desligado!");
		}
		
	}

	@Override
	public void menosVolume() {
		if(isLigado()) {
			setVolume(getVolume() - 5);
		}else {
			System.out.println("Acao impossivel... aparelho desligado!");
		}
		
	}

	@Override
	public void ligarMudo() {
		if(isLigado()) {
			if(getVolume() > 0) {
				setVolume(0);
			}
			
		}else {
			System.out.println("Acao impossivel... aparelho desligado!");
		}
		
	}

	@Override
	public void desligarMudo() {
		if(isLigado()) {
			if(getVolume() == 0) {
				setVolume(50);
			}
			
		}else {
			System.out.println("Acao impossivel... aparelho desligado!");
		}
		
		
	}

	@Override
	public void play() {
		if(isLigado()) {
			if(!isTocando()) {
				setTocando(true);
			}
		}else {
			System.out.println("Acao impossivel... aparelho desligado!");
		}
		
	}

	@Override
	public void pause() {
		if(isLigado()) {
			if(isTocando()) {
				setTocando(false);
			}
		}else {
			System.out.println("Acao impossivel... aparelho desligado!");
		}
		
	}
	
	

}
