package br.com.vixsystem.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.vixsystem.model.Cliente;

@ManagedBean
@ViewScoped
public class ClienteBean {
	
	private Cliente cliente = new Cliente();
	
	public Cliente getCliente(){
		return cliente;
	}
	
	
}
