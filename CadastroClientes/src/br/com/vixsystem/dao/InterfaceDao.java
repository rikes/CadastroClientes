package br.com.vixsystem.dao;

import java.util.List;

import br.com.vixsystem.model.InterfacePessoa;
import br.com.vixsystem.model.Usuario;

public interface InterfaceDao {

	public void save(InterfacePessoa intPessoa);
    public Usuario getPerfilUsuario(long id);
    public List<Usuario> listTodos();
    public List<Usuario> listAtivos();
    public void remove(Usuario user);
    public void update(Usuario user);
    
    
}
