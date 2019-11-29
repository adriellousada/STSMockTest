import java.util.HashSet;
import java.util.Set;

public class Pedido {
	private int id;
	private Set<LinhaPedidos> items = new HashSet<>();
	private Cliente cliente;
	private double valor;

	public Pedido(Cliente cliente, Set<LinhaPedidos> items) {
		super();
		this.cliente = cliente;
		for(LinhaPedidos item : items) {
			this.items.add(item);
		}
	}

	public Pedido(Cliente cliente, LinhaPedidos item) {
		super();
		this.cliente = cliente;
		this.items.add(item);
	}
	
	public double calcPreco() {
		double preco = 0;
		for(LinhaPedidos item : items) {
			preco += item.calcValor();
		}
		this.valor = preco;
		this.valor = cliente.descontoValor(this);
		return this.valor;
	}
	
	public double getValor() {
		return valor;
	}

	public static void main(String args[]) {
		
	}
}
