package br.com.vixsystem.model;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.ManyToMany;


public class Usuario {
	
	//private static final long serialVersionUID = 1L;

	
	private Long idUsuario;
	private boolean ativo;
	private String login;
	private String nomeCompleto;
	private String senha;
	@ManyToMany
	private Set<Usuario> colecaoUsuarios = new HashSet<Usuario>();

			
	public Usuario(){
		
	}
	
	public Usuario(Long idUsuario, boolean ativo, String login, String nomeCompleto,
			String senha, Set<Usuario> colecaoUsuarios) {
		this.idUsuario = idUsuario;
		this.ativo = ativo;
		this.login = login;
		this.nomeCompleto = nomeCompleto;
		this.senha = senha;
		this.colecaoUsuarios = colecaoUsuarios;
	}
	
	
	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public Collection<Usuario> getColecaoUsuarios() {
		return colecaoUsuarios;
	}

	public void setColecaoUsuarios(Set<Usuario> colecaoUsuarios) {
		this.colecaoUsuarios = colecaoUsuarios;
	}
	public void adicionaUsuario(Usuario Usuario) {  
        if (this.colecaoUsuarios == null) {
            this.colecaoUsuarios = new HashSet<Usuario>();  
        }
        this.colecaoUsuarios.add(Usuario);
    }
	
}

