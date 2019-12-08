/**
 *
 * @author Keven Costa
 * @author Suellen Rosemberg
 * @author Thiago francelino
 */
public class VendaAVista extends Venda{

	public VendaAVista(String dataVenda, Vendedor vendedor, String formaPagamento, Cliente cliente) {
		super(dataVenda, vendedor, formaPagamento, cliente);
		// TODO Auto-generated constructor stub
	}
	
	protected float calcularValorTotal() {
		return 0;
	}
	
	
}
