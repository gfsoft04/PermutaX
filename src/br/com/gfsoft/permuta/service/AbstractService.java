package br.com.gfsoft.permuta.service;

import java.util.List;

import br.com.gfsoft.permuta.dao.AbstractDAO;
import br.com.gfsoft.permuta.model.AbstractEntity;

public abstract class AbstractService<T extends AbstractEntity> {

	public void salvar(T entity) {
		getDAO().salvar(entity);
	}

	public void atualizar(T entity) {
		getDAO().atualizar(entity);
	}

	public void remover(T entity) {
		getDAO().remover(entity);
	}

	public List<T> listar() {
		return getDAO().listar();
	}

	public T buscarPorId(Long id) {
		return getDAO().buscarPorId(id);
	}

	public abstract AbstractDAO<T> getDAO();

}
