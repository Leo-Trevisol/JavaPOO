package interfaces;

import java.util.List;

public interface BasicoDAO {

	public void salvar(Object bean);
	public void atualizar(Object bean);
	public void deletar(int id);
	public Object getById(int id);
	public List<Object> getAll();


}
