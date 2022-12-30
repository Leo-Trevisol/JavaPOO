
public class ContaBanco {

	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;

	public ContaBanco(int numConta, String tipo, String dono, float saldo, boolean status) {
		super();
		this.numConta = numConta;
		this.tipo = tipo;
		this.dono = dono;
		this.saldo = saldo;
		this.status = status;
	}
	
	public ContaBanco() {
		
	}
	
	public void estadoAtual() {
		System.out.println("`````````````````````````````````");
		System.out.println("Numero conta:" + this.getNumConta());
		System.out.println("Tipo conta:" + this.getTipo());
		System.out.println("dono conta:" + this.getDono());
		System.out.println("saldo conta:" + this.getSaldo());
		System.out.println("status conta:" + this.isStatus());
	}
	
	

	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if (t == "CC") {
			setSaldo(50);
		} else if (t == "CP"){
			setSaldo(150);
		}
		
		System.out.println("Conta aberta com sucesso!!");

	}

	public void fecharConta() {
			if (this.getSaldo() > 0) {
			System.out.println("A Conta ainda tem credito!");
			}else if(this.getSaldo() < 0) {
				System.out.println("A conta ainda tem debito!");
			}else {
				this.setStatus(false);
				System.out.println("Conta fechada!");
			}
	}

	public void depositar(float v) {
		if(this.isStatus()) {
			this.setSaldo(getSaldo() + v);
			System.out.println("Deposito de " + v + " realizado com sucesso!");
		}else {
			System.out.println("Conta ja fechada!");
		}

	}

	public void sacar(float v) {
		if(this.isStatus()) {
		if(this.getSaldo() >= v) {
			this.setSaldo(getSaldo() - v);
			System.out.println("Saque de " + v + " Realizado!");
		}else {
			System.out.println("Saldo insuficiente para sacar!");
		}
		}else {
			System.out.println("Conta ja fechada!");
	}
	}
public void pagarMensalidade() {
		int v = 0;
		if (getTipo() == "CC") {
			v = 12;
			
		} else if (getTipo() == "CP") {
			v = 20;
		}
		
		if(this.isStatus()) {
			this.setSaldo(getSaldo() - v);
			System.out.println("Mensalidade de " + v + " Paga!");
		}else {
			System.out.println("Conta ja fechada!");
		}
	}

public int getNumConta() {
	return numConta;
}

public void setNumConta(int numConta) {
	this.numConta = numConta;
}

public String getTipo() {
	return tipo;
}

public void setTipo(String tipo) {
	this.tipo = tipo;
}

public String getDono() {
	return dono;
}

public void setDono(String dono) {
	this.dono = dono;
}

public float getSaldo() {
	return saldo;
}

public void setSaldo(float saldo) {
	this.saldo = saldo;
}

public boolean isStatus() {
	return status;
}

public void setStatus(boolean status) {
	this.status = status;
}



}
