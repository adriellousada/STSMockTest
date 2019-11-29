import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class LinhaPedidosTest {
	@Mock
	private Produto produto;
	
	@Mock
	private Pedido pedido;
	
	private LinhaPedidos item;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
		item = new LinhaPedidos(produto, pedido, 1);
	}
	
	@Test
	public void testarPreco() {
		Mockito.when(produto.getPrecoProd(1)).thenReturn((double)100);
		double resposta = item.calcValor();
		Assert.assertEquals(resposta, 100, 0.01);
	}

}
