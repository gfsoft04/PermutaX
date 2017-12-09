package br.com.gfsoft.permuta.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Usuario extends AbstractEntity{
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;
	
	private String nome;
	
	private String apelido;
	
	@Column(name = "data_nasc")
	private LocalDate dataNasc;
	
	private String cpf;
	
	@Column(name = "url_foto")
	private String urlFoto;
	
	@OneToOne
	@JoinColumn(name = "id_endereco")
	private Endereco endereco;
	
//	@OneToMany
//	@Enumerated
//	private List<Avaliacao> avaliacoes;
	
	@Embedded
	private Conta conta;

	@OneToOne
	@JoinColumn(name = "id_servico")
	private Servico servico;
	
	@OneToMany
	@JoinColumn(name = "id_usuario")
	private List<Chat> chat;
	
	@OneToMany
	@JoinColumn(name = "id_usuario")
	private List<Denuncia> denuncias;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public LocalDate getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getUrlFoto() {
		return urlFoto;
	}

	public void setUrlFoto(String urlFoto) {
		this.urlFoto = urlFoto;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	}

	public List<Chat> getChat() {
		return chat;
	}

	public void setChat(List<Chat> chat) {
		this.chat = chat;
	}

	public List<Denuncia> getDenuncias() {
		return denuncias;
	}

	public void setDenuncias(List<Denuncia> denuncias) {
		this.denuncias = denuncias;
	}

}
