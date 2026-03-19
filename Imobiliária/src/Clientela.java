import java.util.ArrayList;

public class Clientela {

    private ArrayList<Cliente> clientes;


    public Clientela(){
        clientes = new ArrayList<Cliente>();

    }

    public boolean cadastrarCliente(Cliente c){
        return clientes.add(c);
    }

    public Cliente consultarClientePorNome(String nome){
        for (Cliente c: clientes){
            if(c.getNome().equals(nome))
                return c;
        }
        return null;
    }
    

}