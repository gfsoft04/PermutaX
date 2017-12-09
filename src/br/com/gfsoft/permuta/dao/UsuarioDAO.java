package br.com.gfsoft.permuta.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.gfsoft.permuta.model.Usuario;

@Repository
public class UsuarioDAO extends AbstractDAO<Usuario>{

	@Override
	public Class<Usuario> getEntityClass() {
		return Usuario.class;
	}
	
	public Usuario login(String email, String senha){
		
		Query  query = manager.createQuery("select u from Usuario u where u.conta.email = :email and u.conta.senha = :senha");
		query.setParameter("email", email);
		query.setParameter("senha", senha);
		List<Usuario> usuarios = query.getResultList();
		if(usuarios != null && !usuarios.isEmpty()){
			return usuarios.get(0);
		}
		return null;
	}
	
	public Usuario buscar(String cpf) {
		
		Usuario usuario = manager.find(Usuario.class, cpf);
		
		//verificar se vier nulo?
		
		return usuario;
	}
	
	public Usuario buscarEmail(String email) {
		
		Query query = manager.createQuery("select u from Usuario u where u.conta.email = :email");
		query.setParameter("email", email);
		
		Usuario usuario = (Usuario) query.getSingleResult();
		
		if (usuario != null) return usuario;
		
		return null;
		
//		Usuario usuario = manager.find(Usuario.class, email);
//		return usuario;
	}
}
