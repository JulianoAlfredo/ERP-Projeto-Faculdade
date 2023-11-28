import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        NotaFiscalService nfeService = new NotaFiscalService();
        ClienteService clienteService = new ClienteService();
        ProdutoService produtoService = new ProdutoService();

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Emitir NFE");
            System.out.println("2. Criar Cliente");
            System.out.println("3. Criar Produto");
            System.out.println("4. Consultar NFEs");
            System.out.println("5. Consultar Clientes");
            System.out.println("6. Consultar Produtos");
            System.out.println("0. Sair");
            System.out.print("Escolha a opção: ");

            // Read user input
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character left by nextInt()

            switch (choice) {
                case 1:
                    // Emitir NFE
                    System.out.println("Informe os dados da NFE:");
                    System.out.print("Emissor: ");
                    String emissor = scanner.nextLine();
                    System.out.print("Comprador: ");
                    String comprador = scanner.nextLine();
                    System.out.print("Produto: ");
                    String produto = scanner.nextLine();
                    System.out.print("Valor Nota: ");
                    float valorNota = scanner.nextFloat();
                    System.out.print("Quantidade de Produtos: ");
                    int quantidadeProdutos = scanner.nextInt();
                    
                    nfeService.emitirNFE(emissor, comprador, produto, valorNota, quantidadeProdutos);
                    break;

                case 2:
                    // Criar Cliente
                    System.out.println("Informe os dados do Cliente:");
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("CPF: ");
                    String cpf = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Cidade: ");
                    String cidade = scanner.nextLine();
                    System.out.print("Contato: ");
                    String contato = scanner.nextLine();

                    clienteService.criarClienteObject(nome, cpf, email, cidade, contato);
                    break;

                case 3:
                    // Criar Produto
                    System.out.println("Informe os dados do Produto:");
                    System.out.print("Nome: ");
                    String nomeProduto = scanner.nextLine();
                    System.out.print("SKU: ");
                    String sku = scanner.nextLine();
                    System.out.print("Preço: ");
                    float preco = scanner.nextFloat();
                    System.out.print("Estoque: ");
                    int estoque = scanner.nextInt();

                    produtoService.criarProduto(nomeProduto, sku, preco, estoque);
                    break;

                case 4:
                    // Consultar NFEs
                    nfeService.consultarNFEs();
                    break;

                case 5:
                    // Consultar Clientes
                    clienteService.consultarClientes();
                    break;

                case 6:
                    // Consultar Produtos
                    produtoService.consultarProdutos();
                    break;

                case 0:
                    // Sair do loop
                    System.out.println("Saindo do programa.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (choice != 0);

        // Close the scanner
        scanner.close();
    }
}
