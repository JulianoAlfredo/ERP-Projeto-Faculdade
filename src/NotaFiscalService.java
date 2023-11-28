import java.util.List;
import java.util.ArrayList;

import java.util.Random;


class NFE{
    String emissor;
    String comprador;
    String produto;
    float valorNota;
    String chaveDeAcesso;
    int quantidadeProdutos;

    //TENHO QUE ADICIONAR NUMERO E SERIE DA NOTA FISCAL
}

public class NotaFiscalService {
    private List<NFE> nfeArr;

    public NotaFiscalService(){
        this.nfeArr = new ArrayList<>();
    }

    private String generateRandomChaveDeAcesso() {
        // Generate a random 44-digit number (Chave de Acesso format)
        return String.format("%044d", new Random().nextLong() %1000000000000000000L);
    }
    public NFE emitirNFE(String emissor, String comprador, String produto, float valorNota, int quantidadeProdutos){
        NFE notaFiscal = new NFE();
        notaFiscal.emissor = emissor;
        notaFiscal.comprador = comprador;
        notaFiscal.produto = produto;
        notaFiscal.valorNota = valorNota;
        notaFiscal.chaveDeAcesso = generateRandomChaveDeAcesso();
        notaFiscal.quantidadeProdutos = quantidadeProdutos;

        nfeArr.add(notaFiscal);
        return notaFiscal;
    }

    public void consultarNFEs() {
        // Somente demonstrativo, futuramente aplicar consulta por chave de acesso ou comprador. Utilizando if-else
        for (NFE nfe : nfeArr) {
            System.out.println("Emissor: " + nfe.emissor);
            System.out.println("Comprador: " + nfe.comprador);
            System.out.println("Produto: " + nfe.produto);
            System.out.println("Valor Nota: " + nfe.valorNota);
            System.out.println("Chave de Acesso: " + nfe.chaveDeAcesso);
            System.out.println("Quantidade de Produtos: " + nfe.quantidadeProdutos);
            System.out.println("-----------------------");
        }
    }

}
