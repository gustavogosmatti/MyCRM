package br.edu.unicesumar.dao;

import br.edu.unicesumar.model.Cliente;

public class ClienteDAO {

	
	
public void Cadastrar(String nome, String sobrenome, String email, String telefone){
	
	Cliente c = new Cliente(nome,sobrenome,email,telefone);
		
}
}
