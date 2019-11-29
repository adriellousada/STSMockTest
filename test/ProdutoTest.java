import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class ProdutoTest {
	private Produto produto;

	@Before
	public void init() {
		produto = new Produto("Caneta", 100);
	}
	
	@Test
	public void testGetPrecoProd() {
		double resposta = produto.getPrecoProd(2);
		Assert.assertEquals(resposta, 200, 0.01);
	}

}
