package lapr.project.model;


/** @author Grupo 18_LAPR2 15-16 */

public interface Candidatura {
    
    public void setEstado(CandidaturaEstado estado);
    public CandidaturaEstado getEstado();
    public String toString();
    public String[] getDadosCandidatura();
    public boolean valida();
    public boolean validaDecisao(String dec);
    public String getIdRepresentante();
    public ListaAvaliacoes getListaAvaliacoes();
    public void registaDecisao(String decisao);
    public void registaAvaliacao(Avaliacao avaliacao);
    public ListaProdutos getListaProdutos();
    public ListaDemonstracoes getListaDemonstracoes();
    public void setDescricao(String info);
    public void setDecisao(String decisao);
    public void setStand(Stand stand);
    public String getNomeEmpresa();
    public String getDescricao();
    public void setIdRepresentante(String id);

   
}