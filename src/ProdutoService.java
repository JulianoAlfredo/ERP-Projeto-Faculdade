import java.util.ArrayList;
import java.util.List;

class Produto {
    String nome;
    String sku;
    float preco;
    int estoque;
}

public class ProdutoService {
    private List<Produto> produtoArr; 
    public ProdutoService(){
        this.produtoArr = new ArrayList<>();
    }
    public Produto criarProduto(String nome, String sku, float preco, int estoque){
        Produto novoProduto = new Produto();

        novoProduto.nome = nome;
        novoProduto.sku = sku;
        novoProduto.preco = preco;
        novoProduto.estoque = estoque;

        produtoArr.add(novoProduto);
        return novoProduto;
    }

    public void consultarProdutos() {
        // Somente demonstrativo, futuramente aplicar consulta pelo sku ou nome. Utilizando if-else
        for (Produto produto : produtoArr) {
            System.out.println("Nome: " + produto.nome);
            System.out.println("SKU: " + produto.sku);
            System.out.println("Preço: " + produto.preco);
            System.out.println("Estoque: " + produto.estoque);
            System.out.println("-----------------------");
        }
    }

}
