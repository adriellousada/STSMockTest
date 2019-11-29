
public class Produto {
	private int id;
	private String nome;
	private double preco;

	public double getPrecoProd(int quantidade) {
		return this.preco * quantidade;
	}

	public Produto(String nome, double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}
	
}
