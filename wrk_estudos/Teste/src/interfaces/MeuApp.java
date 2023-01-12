package interfaces;

public class MeuApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	
		BasicoDAO funcionarioDAO = new FuncionarioDAO();

		if (funcionarioDAO instanceof BasicoDAO) {
		//	funcionarioDAO.salvar();
		}else {
				System.err.println("A Classe FuncionarioDAO não implementa BasicoDAO, nenhum procedimento foi realizado");

		}
	}
	
	public void calculaSalarioDeFuncionario(Funcionario funcionario){

		if (funcionario instanceof Gerente){
			//calculo para gerente
		}else if (funcionario instanceof Coordenador){
			//calculo para coordenador
		}else if (funcionario instanceof Operador){
			//calculo para operador
		}

	}

}
