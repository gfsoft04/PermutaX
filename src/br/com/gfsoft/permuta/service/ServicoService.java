package br.com.gfsoft.permuta.service;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.gfsoft.permuta.dao.AbstractDAO;
import br.com.gfsoft.permuta.dao.ServicoDAO;
import br.com.gfsoft.permuta.model.Servico;

public class ServicoService extends AbstractService<Servico>{

	@Autowired
	private ServicoDAO servicoDAO;
	
	@Override
	public AbstractDAO<Servico> getDAO() {
		return servicoDAO;
	}

}
