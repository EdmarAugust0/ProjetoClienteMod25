/**
 * 
 */
package br.com.edmar.services;

import br.com.edmar.dao.IClienteDAO;
import br.com.edmar.domain.Cliente;

/**
 * 
 */
public class ClientService implements IClienteServices {
	
	private IClienteDAO clienteDAO;
	
	public ClientService(IClienteDAO clienteDAO) {
		this.clienteDAO = clienteDAO;
	}

	@Override
	public Boolean salvar(Cliente cliente) {
		return clienteDAO.salvar(cliente);
	}

	@Override
	public Cliente buscarPorCpf(Long cpf) {
		return clienteDAO.buscarPorCpf(cpf);
	}

	@Override
	public void excluir(Long cpf) {
		clienteDAO.excluir(cpf);
	}

	@Override
	public void alterar(Cliente cliente) {
		clienteDAO.alterar(cliente);
	}

}
