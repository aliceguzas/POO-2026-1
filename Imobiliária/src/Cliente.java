import java.util.ArrayList;

public class Cliente {

    private String nomeCliente;
    private ArrayList<Casa> casas;

    public Cliente(String nome){
        this.nomeCliente = nome;
    }

    public String getNome(){
        return nomeCliente;
    }

    public void compraCasa(Casa c){
        casas = new ArrayList<Casa>();
        casas.add(c);
    }

    public ArrayList<Casa> consultarCasasCliente(){

        ArrayList<Casa> aux = new ArrayList<>();
        for (Casa casa: casas){
            aux.add(casa);
        }
        return aux;
    }

}
