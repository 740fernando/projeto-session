package entities;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.catalina.ha.backend.CollectedInfo;

public class Produto {

	private static Map<Integer, Produto> produtos;

	// dados estáticos
	static {
		produtos = new LinkedHashMap<Integer, Produto>();
		produtos.put(1, new Produto(1, "caneca", 15.00));
		produtos.put(2, new Produto(2, "camiseta", 30.50));
		produtos.put(3, new Produto(3, "adesivo", 50.40));
		produtos.put(4, new Produto(4, "topo de bolo", 10.00));
		produtos.put(5, new Produto(5, "cartaz", 5.00));
	}
	private int id;
	private String nome;
	private double valor;

	private Produto(int id, String nome, Double valor) {
		this.id = id;
		this.nome = nome;
		this.valor = valor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	// lista de produtos disponiveis
	public static Collection<Produto> getProdutos() {
		return produtos.values();
	}
	// recebe um id como parametro e retorna produto correspondente
	public static Produto getProdutoById(int id) {
		return produtos.get(id);
	}
}