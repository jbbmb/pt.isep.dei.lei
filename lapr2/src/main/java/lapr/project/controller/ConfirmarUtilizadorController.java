package lapr.project.controller;

import java.io.Serializable;
import java.util.List;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.RegistoUtilizadores;
import lapr.project.model.Utilizador;

/**
 * @author Grupo 18_LAPR2 15-16
 */
public class ConfirmarUtilizadorController implements Serializable{

    private RegistoUtilizadores ru;
    private CentroExposicoes ce;
    private List<Utilizador> utNaoRegistados;
    private String username;
    private Utilizador userPendente;

    /**
     * Metodo que serve para inicializar a variavel ru do tipo
     * RegistoUtilzidores
     */
    public ConfirmarUtilizadorController(CentroExposicoes centroExposicoes) {
        this.ce = centroExposicoes;
    }

    /**
     * Metodo que serve para listar os username dos utilizadores ainda nao
     * registados
     *
     * @return um array de Utilziadores nao registados
     */
    
    public List<Utilizador> getListaUtilizadoresNaoConfirmados(){
        this.ru = ce.getRegistoUtilizador();
        this.utNaoRegistados = ru.getListaUtilizadoresNaoRegistados();
        return utNaoRegistados;
    }
    

    /**
     * Metodo que serve para obter os dados do utilizador selecionado
     *
     * @param username variavel do tipo string que contem o username do
     * utilizador escolhido
     */
    public String[] getUtilizador(int indexUser) {
        this.userPendente = utNaoRegistados.get(indexUser);
        return new String[]{userPendente.getUsername(), userPendente.getNome(), userPendente.getEMAIL()};
       
    }

    /**
     * Metodo que serve para confirmar o registo do Utilizador
     *
     * @param decisao variavel do tipo boolean que contem a decisao do
     * organizador, caso este aceite ou rejeito o utilizador
     *
     * @return um boolean que informa caso o utilizador tenha sido registado,
     * retornando true, e caso o utilizador nao tenha sido aceite retorna false
     */
    public void confirmaUtilizador() {
        ru.confirmaUtilizador(userPendente.getUsername());
    }

}
