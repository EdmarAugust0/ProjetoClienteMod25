package br.com.edmar.dao;

import br.com.edmar.domain.Cliente;

public class ClienteDaoMock implements IClienteDAO {

	@Override
	public Boolean salvar(Cliente cliente) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Cliente buscarPorCpf(Long cpf) {
		// TODO Auto-generated method stub
		Cliente cliente = new Cliente();
		cliente.setCpf(cpf);
		return cliente;
	}

}
