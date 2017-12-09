package br.com.gfsoft.permuta.service;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.gfsoft.permuta.dao.AbstractDAO;
import br.com.gfsoft.permuta.dao.EnderecoDAO;
import br.com.gfsoft.permuta.model.Endereco;

public class EnderecoService extends AbstractService<Endereco>{

	@Autowired
	private EnderecoDAO enderecoDAO;
	
	@Override
	public AbstractDAO<Endereco> getDAO() {
		return enderecoDAO;
	}

}
