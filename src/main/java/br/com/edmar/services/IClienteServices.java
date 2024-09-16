package br.com.edmar.services;

import br.com.edmar.domain.Cliente;

public interface IClienteServices {

	void salvar(Cliente cliente);

	Cliente buscarPorCpf(Long cpf);

}
