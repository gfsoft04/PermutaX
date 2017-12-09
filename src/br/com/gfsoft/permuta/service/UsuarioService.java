package br.com.gfsoft.permuta.service;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.gfsoft.permuta.dao.AbstractDAO;
import br.com.gfsoft.permuta.dao.UsuarioDAO;
import br.com.gfsoft.permuta.model.Usuario;

public class UsuarioService extends AbstractService<Usuario>{
	
	@Autowired
	private UsuarioDAO usuarioDAO;
	
	@Override
	public AbstractDAO<Usuario> getDAO() {
		return usuarioDAO;
	}
	
	public Usuario login(String email, String senha){

		return usuarioDAO.login(email, senha);
	}
	
	public Usuario buscar(String cpf) {
		
		return usuarioDAO.buscar(cpf);
	}
	
	public Usuario buscarEmail(String email) {
		
		return usuarioDAO.buscarEmail(email);
	}
	
}
