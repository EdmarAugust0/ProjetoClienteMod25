package br.com.edmar.services;

import br.com.edmar.domain.Cliente;
import br.com.edmar.exceptions.TipoChaveNaoEncontradaException;

public interface IClienteServices {

	Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException;

	Cliente buscarPorCpf(Long cpf);

	void excluir(Long cpf);

	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
