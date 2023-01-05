
public class Conta {
	
	private double	saldo;
	private String	titular;
	private int		numero;
	private String	agencia;
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public void saca(double valor) {
		this.saldo = this.saldo - valor;
	}
	
	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return this.saldo;
	}
	
	/**
	 * @param saldo
	 *            the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	/**
	 * @return the titular
	 */
	public String getTitular() {
		return titular;
	}
	
	/**
	 * @param titular
	 *            the titular to set
	 */
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}
	
	/**
	 * @param numero
	 *            the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	/**
	 * @return the agencia
	 */
	public String getAgencia() {
		return agencia;
	}
	
	/**
	 * @param agencia
	 *            the agencia to set
	 */
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
}
