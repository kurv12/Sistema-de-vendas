import java.util.ArrayList;

/**
 *
 * @author Keven Costa
 * @author Suellen Rosemberg
 * @author Thiago francelino
 */
public abstract class Venda {

        public int id;
	protected String dataVenda;
	protected Vendedor Vendedor;
	protected String formaPagamento;
	protected Cliente cliente;
        protected double valorVenda;
        protected ArrayList<Produto> produtos;
	
	protected abstract float calcularValorTotal();
	
	public String getDataVenda() {
		return dataVenda;
	}
	public void setDataVenda(String dataVenda) {
		this.dataVenda = dataVenda;
	}
	public Vendedor getVendedor() {
		return Vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		Vendedor = vendedor;
	}
	public String getFormaPagamento() {
		return formaPagamento;
	}
	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

        public ArrayList<Produto> getProdutos() {
            return produtos;
        }

        public void setProdutos(ArrayList<Produto> produtos) {
            this.produtos = produtos;
        }

	public Venda(String dataVenda, Vendedor vendedor, String formaPagamento, Cliente cliente) {
		super();
		this.dataVenda = dataVenda;
		Vendedor = vendedor;
		this.formaPagamento = formaPagamento;
		this.cliente = cliente;
	}

    public double getValorVenda() {
        return this.valorVenda;
    }
	
	
	
}
