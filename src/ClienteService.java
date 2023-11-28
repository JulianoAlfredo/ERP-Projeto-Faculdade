import java.util.ArrayList;
import java.util.List;

class Cliente{
        String name;
        String cpf;
        String email;
        String contato;
        String cidade;
}

public class ClienteService {
    private List<Cliente> clienteArr; 

    public ClienteService() {
        this.clienteArr = new ArrayList<>();
    }
    public Cliente criarClienteObject(String nome, String cpf, String email, String cidade, String contato){
        Cliente novoCliente = new Cliente();
        novoCliente.name =nome;
        novoCliente.cpf = cpf;
        novoCliente.email = email;
        novoCliente.cidade = cidade;
        novoCliente.contato = contato;
        clienteArr.add(novoCliente);
        return novoCliente;
    }

    public void consultarClientes(){

        //somente demonstrativo, futuramente aplicar consulta pelo nome ou cpf. utilizando if else
        for (Cliente cliente : clienteArr) {
            System.out.println("Nome: " + cliente.name);
            System.out.println("CPF: " + cliente.cpf);
            System.out.println("Email: " + cliente.email);
            System.out.println("Cidade: " + cliente.cidade);
            System.out.println("Contato: " + cliente.contato);
        }
    }

}
