package br.com.vixsystem.model;

import java.util.Calendar;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Cliente {

	private Long idUsuario;
	private boolean ativo;
	private String nome;
	private String endereco;
	private String tipo;
	
	@Temporal(TemporalType.DATE)
	private Calendar dataCadastro = Calendar.getInstance();
	
	
	public Cliente(){
		
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Calendar getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Calendar dataCadastro) {
		this.dataCadastro = dataCadastro;
	}


}
