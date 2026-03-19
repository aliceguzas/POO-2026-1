import java.util.ArrayList;

public class Condominio {
    private ArrayList<Casa> casas;


    public Condominio() {
        casas = new ArrayList<Casa>();
    }

    // Operacao "C" - criar/cadastrar
    public boolean cadastrarCasa(Casa c) {
        return casas.add(c);
    }

    // Operacao "R" - consultar
    public Casa consultarCasaEndereco(String endereco) {
        for(Casa aux : casas) {
            if(aux.getEndereco().equals(endereco))
                return aux;
        }
        return null;
    }

    public boolean removeCasa(Casa aux){
        return casas.remove(aux);
    }

    /**
     * R - Retrieve
     * Consulta todas as casas cadastradas
     * @return lista auxiliar com casas cadastradas
     */
    public ArrayList<Casa> consultarTodasCasas() {
        // ArrayList auxiliar para o retorno
        ArrayList<Casa> aux = new ArrayList<>();
        for(Casa casa : casas) {
            aux.add(casa);
        }
        return aux;
    }
}
