import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class ClienteTest {
	@Mock
	private Pedido pedido;
	
	private Cliente cliente;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
		cliente = new Cliente("Patrick", 10);
	}
	
	@Test
	public void testGetValorDesc() {
		Mockito.when(pedido.getValor()).thenReturn((double)80);
		double resposta = cliente.descontoValor(pedido);
		Assert.assertEquals(resposta, 72, 0.01);
	}

}
