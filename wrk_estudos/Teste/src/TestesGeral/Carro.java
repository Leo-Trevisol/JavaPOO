package TestesGeral;

public class Carro {
	
	String	cor;
	String	modelo;
	double	velocidade;
	double	velocidadeMax;
	Motor	motor;

	public Carro(String cor, String modelo, double velocidade, double velocidadeMax, Motor motor) {
		super();
		this.cor = cor;
		this.modelo = modelo;
		this.velocidade = velocidade;
		this.velocidadeMax = velocidadeMax;
		this.motor = motor;
	}

	public void liga() {
		System.out.println("O carro ligou");
	}
	
	public void acelerar(double quantidade) {
		double novaVelocidade = this.velocidade + quantidade;
		this.velocidade = novaVelocidade;
	}
	
	public int marcha() {
		
		if (this.velocidade < 0) {
			return -1;
		}
		if (this.velocidade >= 0 && this.velocidade < 40) {
			return 1;
		}
		if (this.velocidade >= 40 && this.velocidade < 80) {
			return 2;
		}

		return 3;

	}
	
	@Override
	public String toString() {
		return "Carro [cor=" + cor + ", modelo=" + modelo + ", velocidade=" + velocidade + ", velocidadeMax="
				+ velocidadeMax + ", motor=" + motor + "]";
	}
	
	/**
	 * @return the cor
	 */
	public String getCor() {
		return cor;
	}

	/**
	 * @param cor
	 *            the cor to set
	 */
	public void setCor(String cor) {
		this.cor = cor;
	}

	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * @param modelo
	 *            the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * @return the velocidade
	 */
	public double getVelocidade() {
		return velocidade;
	}

	/**
	 * @param velocidade
	 *            the velocidade to set
	 */
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	/**
	 * @return the velocidadeMax
	 */
	public double getVelocidadeMax() {
		return velocidadeMax;
	}

	/**
	 * @param velocidadeMax
	 *            the velocidadeMax to set
	 */
	public void setVelocidadeMax(double velocidadeMax) {
		this.velocidadeMax = velocidadeMax;
	}

	/**
	 * @return the motor
	 */
	public Motor getMotor() {
		return motor;
	}

	/**
	 * @param motor
	 *            the motor to set
	 */
	public void setMotor(Motor motor) {
		this.motor = motor;
	}

}
