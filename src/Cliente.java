
public class Cliente {
	private int id;
	private String nome;
	private double desconto;
	
	public double descontoValor(Pedido pedido) {
		double pedidoValor = pedido.getValor();
		return pedidoValor - (pedidoValor * this.desconto / 100);
	}

	public Cliente(String nome, double desconto) {
		super();
		this.nome = nome;
		this.desconto = desconto;
	}	
}
