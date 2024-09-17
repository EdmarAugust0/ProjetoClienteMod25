package br.com.edmar.dao;

import br.com.edmar.domain.Cliente;

public interface IClienteDAO {

	Boolean salvar(Cliente cliente);
	
	Cliente buscarPorCpf(Long cpf);

	void excluir(Long cpf);

	void alterar(Cliente cliente);

}
