package br.com.edmar;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.edmar.dao.IClienteDAO;
import br.com.edmar.domain.Cliente;
import br.com.edmar.dao.ClienteDaoMock;
import br.com.edmar.services.ClientService;
import br.com.edmar.services.IClienteServices;

public class ClienteServiceTest {
	
	private IClienteServices clienteService;
	
	private Cliente cliente;
	
	public ClienteServiceTest() {
		IClienteDAO dao = new ClienteDaoMock();
		clienteService = new ClientService(dao);
	}
	
	@Before
	public void init() {
		cliente = new Cliente();
		cliente.setNome("Edmar");
		cliente.setCpf(01231231231L);	
		cliente.setCidade("Belo Horizonte");
		cliente.setEnd("End");
		cliente.setNumero(123);
		cliente.setEstado("MG");
		cliente.setTel(31999999999L);
	}
	
	@Test
	public void pesquisarCliente() {
		Cliente clienteConsultado = clienteService.buscarPorCpf(cliente.getCpf());
			
		Assert.assertNotNull(clienteConsultado);
	}
	
	@Test
	public void salvarCliente() {
		Boolean retorno = clienteService.salvar(cliente);
		
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluirCliente() {
		clienteService.excluir(cliente.getCpf());
	}
}
