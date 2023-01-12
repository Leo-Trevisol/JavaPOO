package escola;

public class Tecnico extends Aluno {
	
	public String resgistroProfissional;
	public boolean praticar;
	
	public Tecnico(String nome, int idade, String sexo, boolean matricula, String curso, String resgistroProfissional,
			boolean praticar) {
		super(nome, idade, sexo, matricula, curso);
		this.resgistroProfissional = resgistroProfissional;
		this.praticar = praticar;
	}

	@Override
	public void pagarMensalidade(float valor) {
		// TODO Auto-generated method stub
		
	}

	public String getResgistroProfissional() {
		return resgistroProfissional;
	}

	public void setResgistroProfissional(String resgistroProfissional) {
		this.resgistroProfissional = resgistroProfissional;
	}

	public boolean isPraticar() {
		return praticar;
	}

	public void setPraticar(boolean praticar) {
		this.praticar = praticar;
	}
	
	

}
