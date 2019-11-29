
public class LinhaPedidos {
	private Produto produto;
	private Pedido pedido;
	private int quantidade;
	
	public double calcValor() {
		return (produto.getPrecoProd(quantidade));
	}

	public LinhaPedidos(Produto produto, Pedido pedido, int quantidade) {
		super();
		this.produto = produto;
		this.pedido = pedido;
		this.quantidade = quantidade;
	}
}
