/**
 *
 * @author Keven Costa
 * @author Suellen Rosemberg
 * @author Thiago francelino
 */

public class ProdutoPerecivel extends Produto {

    protected String dataValidade;

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public ProdutoPerecivel() {

    }

    public ProdutoPerecivel(String nome, float precoDeCusto,
            String apelido, String dataValidade) {
        super(nome, precoDeCusto, apelido);
        this.dataValidade = dataValidade;
        // TODO Auto-generated constructor stub
    }

}
