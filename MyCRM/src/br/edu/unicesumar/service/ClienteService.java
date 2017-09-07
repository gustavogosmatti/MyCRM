package br.edu.unicesumar.service;

import br.edu.unicesumar.dao.ClienteDAO;
import br.edu.unicesumar.model.Cliente;

public class ClienteService {
	
private static ClienteDAO dao;

public ClienteService()
{
	dao = new ClienteDAO();
}
	
public Cliente CadastrarCliente(String nome, String sobrenome, String email, String telefone){

return dao.Cadastrar(nome, sobrenome, email, telefone);
}
}
