package br.com.gfsoft.permuta.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import br.com.gfsoft.permuta.model.AbstractEntity;

@Transactional
public abstract class AbstractDAO<T extends AbstractEntity> {
	
	@PersistenceContext
	EntityManager manager;

	public void salvar(T entity) {
		manager.persist(entity);
	}

	public void atualizar(T entity) {
		manager.merge(entity);
	}

	public void remover(T entity) {
		entity = manager.find(getEntityClass(), entity.getId());
		manager.remove(entity);
	}

	public T buscarPorId(Long id) {
		return manager.find(getEntityClass(), id);

	}

	public abstract Class<T> getEntityClass();

	public List<T> listar() {
		Query query = manager.createQuery("select c from "
				+ getEntityClass().getSimpleName() + " c");
		return query.getResultList();

	}

}
