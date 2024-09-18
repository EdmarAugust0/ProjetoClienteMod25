package br.com.edmar.dao;

import br.com.edmar.dao.generics.GenericDAO;
import br.com.edmar.domain.Cliente;

public class ClienteDAO extends GenericDAO<Cliente>implements IClienteDAO {

	@Override
	public Class<Cliente> getTipoClasse() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void atualiarDados(Cliente entity, Cliente entityCadastrado) {
		// TODO Auto-generated method stub
		
	}

}
