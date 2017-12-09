package br.com.gfsoft.permuta.dao;

import org.springframework.stereotype.Repository;

import br.com.gfsoft.permuta.model.Categoria;

@Repository
public class CategoriaDAO extends AbstractDAO<Categoria> {

	@Override
	public Class<Categoria> getEntityClass() {
		return Categoria.class;
	}

}
