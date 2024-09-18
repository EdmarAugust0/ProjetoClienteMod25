/**
 * 
 */
package br.com.edmar.services;

import br.com.edmar.dao.IClienteDAO;
import br.com.edmar.domain.Cliente;
import br.com.edmar.exceptions.TipoChaveNaoEncontradaException;

/**
 * 
 */
public class ClientService implements IClienteServices {
	
	private IClienteDAO clienteDAO;
	
	public ClientService(IClienteDAO clienteDAO) {
		this.clienteDAO = clienteDAO;
	}

	@Override
	public Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException {
		return clienteDAO.cadastrar(cliente);
	}

	@Override
	public Cliente buscarPorCpf(Long cpf) {
		return clienteDAO.consultar(cpf);
	}

	@Override
	public void excluir(Long cpf) {
		clienteDAO.excluir(cpf);
	}

	@Override
	public void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException {
		clienteDAO.alterar(cliente);
	}

}
