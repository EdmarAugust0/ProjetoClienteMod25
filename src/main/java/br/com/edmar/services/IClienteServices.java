package br.com.edmar.services;

import br.com.edmar.domain.Cliente;

public interface IClienteServices {

	Boolean salvar(Cliente cliente);

	Cliente buscarPorCpf(Long cpf);

	void excluir(Long cpf);

}
