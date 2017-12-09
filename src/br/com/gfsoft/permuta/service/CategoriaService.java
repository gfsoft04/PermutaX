package br.com.gfsoft.permuta.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gfsoft.permuta.dao.AbstractDAO;
import br.com.gfsoft.permuta.dao.CategoriaDAO;
import br.com.gfsoft.permuta.model.Categoria;

@Service
public class CategoriaService extends AbstractService<Categoria>{
	
	@Autowired
	private CategoriaDAO categoriaDAO;
	
	public void salvar(Categoria categoria) {
		
		categoriaDAO.salvar(categoria);
	}

	@Override
	public AbstractDAO<Categoria> getDAO() {
		return categoriaDAO;
	}

}
