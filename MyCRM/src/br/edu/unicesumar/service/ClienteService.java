package br.edu.unicesumar.service;

import br.edu.unicesumar.dao.ClienteDAO;

public class ClienteService {
	
private ClienteDAO dao;
	
public void CadastrarCliente(String nome, String sobrenome, String email, String telefone){

dao.Cadastrar(nome, sobrenome, email, telefone);
}
}
