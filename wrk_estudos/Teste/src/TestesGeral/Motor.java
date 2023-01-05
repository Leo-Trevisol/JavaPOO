
public class Motor {
	
	int		potencia;
	String	tipo;

	public Motor(int potencia, String tipo) {
		super();
		this.potencia = potencia;
		this.tipo = tipo;
	}

	/**
	 * @return the potencia
	 */
	public int getPotencia() {
		return potencia;
	}

	/**
	 * @param potencia
	 *            the potencia to set
	 */
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo
	 *            the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return "Motor [potencia=" + potencia + ", tipo=" + tipo + "]";
	}
	
}
