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
	public void salvar(Cliente cliente) {
		clienteDAO.salvar(cliente);
	}

	@Override
	public Cliente buscarPorCpf(Long cpf) {
		return clienteDAO.buscarPorCpf(cpf);
	}

}
