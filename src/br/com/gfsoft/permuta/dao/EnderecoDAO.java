package br.com.gfsoft.permuta.dao;

import org.springframework.stereotype.Repository;

import br.com.gfsoft.permuta.model.Endereco;

@Repository
public class EnderecoDAO extends AbstractDAO<Endereco>{

	@Override
	public Class<Endereco> getEntityClass() {
		return Endereco.class;
	}

}
