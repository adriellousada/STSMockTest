import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class PedidoTest {
	private Pedido pedido;
	
	@Mock
	private Cliente cliente;
	
	@Mock
	private LinhaPedidos item;

	@Before
	public void initPedido() {
		MockitoAnnotations.initMocks(this);
		pedido = new Pedido(cliente, item);
	}
	
	@Test
	public void calcValorPedido() {
		Mockito.when(cliente.descontoValor(pedido)).thenReturn((double)8);
		Mockito.when(item.calcValor()).thenReturn((double)10);
		double resposta = pedido.calcPreco();
		Assert.assertEquals(resposta, 8, 0.01);
	}

	@Test
	public void testarGetValor() {
		Mockito.when(cliente.descontoValor(pedido)).thenReturn((double)10);
		Mockito.when(item.calcValor()).thenReturn((double)10);
		pedido.calcPreco();
		double resposta = pedido.getValor();
		Assert.assertEquals(resposta, 10, 0.01);
	}
}
