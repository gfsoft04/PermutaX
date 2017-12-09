package br.com.gfsoft.permuta.dao;

import org.springframework.stereotype.Repository;

import br.com.gfsoft.permuta.model.Servico;

@Repository
public class ServicoDAO extends AbstractDAO<Servico>{

	@Override
	public Class<Servico> getEntityClass() {
		return Servico.class;
	}

}
