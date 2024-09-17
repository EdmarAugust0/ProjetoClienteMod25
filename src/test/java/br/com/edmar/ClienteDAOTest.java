package br.com.edmar;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.edmar.dao.ClienteDaoMock;
import br.com.edmar.dao.IClienteDAO;
import br.com.edmar.domain.Cliente;

public class ClienteDAOTest {
	
	private IClienteDAO clienteDAO;
	
	private Cliente cliente;
	
	public ClienteDAOTest() {
		clienteDAO = new ClienteDaoMock();
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
		
		clienteDAO.salvar(cliente);
	}
	
	@Test
	public void pesquisarCliente() {
		Cliente clienteConsultado = clienteDAO.buscarPorCpf(cliente.getCpf());
		
		Assert.assertNotNull(clienteConsultado);
	}
	
	@Test
	public void salvarCliente() {
		Boolean retorno = clienteDAO.salvar(cliente);
		
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluirCliente() {
		clienteDAO.excluir(cliente.getCpf());
	}
	
	@Test
	public void alterarCliente() {
		cliente.setNome("Augusto");
		clienteDAO.alterar(cliente);
		
		Assert.assertEquals("Augusto", cliente.getNome());
	}
}
