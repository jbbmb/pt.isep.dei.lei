/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 *
 * @author Grupo 18_LAPR2 15-16
 */
public interface ExposicaoEstado {
    
    public boolean valida();
    public boolean setCriada();
    public boolean setComFAESemDemonstracao();
    public boolean setComDemonstracoesSemFAE();
    public boolean setCompleta();
    public boolean setCandidaturasExposicaoAbertas();
    public boolean setCandidaturasExposicaoFechadas();
    public boolean setConflitosDetetados();
    public boolean setConflitosAlterados();
    public boolean setCandidaturasAtribuidas();
    public boolean setCandidaturasAvaliadas();
    public boolean setCandidaturasDecididas();
    
}
