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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void desligar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void abrirMenu() {
		System.out.println(isLigado());
		System.out.println(getVolume());
		for(int i = 0; i < getVolume(); i++){
			System.out.println("|");
		}
		System.out.println(isTocando());
		
	}

	@Override
	public void fecharMenu() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void maisVolume() {
		if(isLigado()) {
			setVolume(getVolume() + 1);
		}
		
	}

	@Override
	public void menosVolume() {
		if(isLigado()) {
			setVolume(getVolume() - 1);
		}
		
	}

	@Override
	public void ligarMudo() {
		if(isLigado()) {
			if(getVolume() > 0) {
				setVolume(0);
			}
			
		}
		
	}

	@Override
	public void desligarMudo() {
		if(isLigado()) {
			if(getVolume() == 0) {
				setVolume(50);
			}
			
		}
		
		
	}

	@Override
	public void play() {
		if(isLigado()) {
			if(!isTocando()) {
				setTocando(true);
			}
		}
		
	}

	@Override
	public void pause() {
		if(isLigado()) {
			if(isTocando()) {
				setTocando(false);
			}
		}
		
	}
	
	

}
