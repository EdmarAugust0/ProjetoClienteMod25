package br.com.edmar;

import org.junit.Assert;
import org.junit.Test;

import br.com.edmar.dao.IClienteDAO;
import br.com.edmar.domain.Cliente;
import br.com.edmar.dao.ClienteDaoMock;
import br.com.edmar.services.ClientService;
import br.com.edmar.services.IClienteServices;

public class ClienteTest {
	
	private IClienteServices clienteService;
	
	public ClienteTest() {
		IClienteDAO dao = new ClienteDaoMock();
		clienteService = new ClientService(dao);
	}
	
	@Test
	public void pesquisarCliente() {
		Cliente cliente = new Cliente();
		cliente.setNome("Edmar");
		cliente.setCpf(01231231231L);	
		cliente.setCidade("Belo Horizonte");
		cliente.setEnd("End");
		cliente.setNumero(123);
		cliente.setEstado("MG");
		cliente.setTel(31999999999L);
		
		clienteService.salvar(cliente);
		
		Cliente clienteConsultado = clienteService.buscarPorCpf(cliente.getCpf());
			
		Assert.assertNotNull(clienteConsultado);
	}
}
