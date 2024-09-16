package br.com.edmar.dao;

import br.com.edmar.domain.Cliente;

public interface IClienteDAO {

	void salvar(Cliente cliente);
	
	Cliente buscarPorCpf(Long cpf);

}
