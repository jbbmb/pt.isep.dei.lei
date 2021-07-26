/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.Atribuicao;
import lapr.project.model.Candidatura;
import lapr.project.model.CandidaturaDemonstracao;
import lapr.project.model.CandidaturaEstadoAvaliada;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Demonstracao;
import lapr.project.model.Exposicao;
import lapr.project.model.ExposicaoEstado;
import lapr.project.model.ExposicaoEstadoCandidaturasAtribuidas;
import lapr.project.model.ExposicaoEstadoInicial;
import lapr.project.model.FAE;
import lapr.project.model.Utilizador;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Grupo 18_LAPR2 15-16
 */
public class AvaliarCandidaturaControllerTest {
    
    public AvaliarCandidaturaControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getListaExposicoesFAE method, of class AvaliarCandidaturaController.
     */
    @Test
    public void testGetListaExposicoesFAE() {
        System.out.println("getListaExposicoesFAE");
        String id = "idtest";
        CentroExposicoes centro = new CentroExposicoes();
        Utilizador u = new Utilizador();
        u.setUSER(id);
        centro.getRegistoUtilizador().addNovoUtilizador(u);
        Exposicao exp = new Exposicao();
        Candidatura cand = new CandidaturaExposicao();
        exp.getListaCandidaturas().getListaCandidaturas().add(cand);
        FAE fae = new FAE(u);
        exp.getListaFAE().addFAE(fae);
        Atribuicao atribuicao = new Atribuicao(fae, cand);
        exp.getListaAtribuicoes().addAtribuicao(atribuicao);
        centro.getRegistoExposicoes().getListaExposicoes().add(exp);
        AvaliarCandidaturaController instance = new AvaliarCandidaturaController(centro);
        List<Exposicao> expResult = centro.getRegistoExposicoes().getListaExposicoesFAE(id);
        List<Exposicao> result = instance.getListaExposicoesFAE(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of getListaCandidaturasExposicao method, of class AvaliarCandidaturaController.
     */
    @Test
    public void testGetListaCandidaturasExposicao() {
        System.out.println("getListaCandidaturasExposicao");
        int indexExposicao = 0;
        String id = "idtest";
        CentroExposicoes centro = new CentroExposicoes();
        Utilizador u = new Utilizador();
        u.setUSER(id);
        centro.getRegistoUtilizador().addNovoUtilizador(u);
        Exposicao exp = new Exposicao();
        Candidatura cand = new CandidaturaExposicao();
        exp.getListaCandidaturas().getListaCandidaturas().add(cand);
        FAE fae = new FAE(u);
        exp.getListaFAE().addFAE(fae);
        Atribuicao atribuicao = new Atribuicao(fae, cand);
        exp.getListaAtribuicoes().addAtribuicao(atribuicao);
        centro.getRegistoExposicoes().getListaExposicoes().add(exp);
        AvaliarCandidaturaController instance = new AvaliarCandidaturaController(centro);
        instance.getListaExposicoesFAE(id);
        instance.selectExposicao(0);
        List<Candidatura> expResult = exp.getListaCandidaturas().getListaCandidaturas();
        List<Candidatura> result = instance.getListaCandidaturasExposicao();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getListaDemonstracoes method, of class AvaliarCandidaturaController.
     */
    @Test
    public void testGetListaDemonstracoes() {
        System.out.println("getListaDemonstracoes");
        int indexExposicao = 0;
        String id = "idtest";
        CentroExposicoes centro = new CentroExposicoes();
        Utilizador u = new Utilizador();
        u.setUSER(id);
        centro.getRegistoUtilizador().addNovoUtilizador(u);
        Exposicao exp = new Exposicao();
        Candidatura cand = new CandidaturaExposicao();
        exp.getListaCandidaturas().getListaCandidaturas().add(cand);
        FAE fae = new FAE(u);
        exp.getListaFAE().addFAE(fae);
        Atribuicao atribuicao = new Atribuicao(fae, cand);
        exp.getListaAtribuicoes().addAtribuicao(atribuicao);
        Demonstracao dem = new Demonstracao();
        exp.getListaDemonstracoes().addDemonstracao(dem);
        centro.getRegistoExposicoes().getListaExposicoes().add(exp);
        AvaliarCandidaturaController instance = new AvaliarCandidaturaController(centro);
        instance.getListaExposicoesFAE(id);
        instance.selectExposicao(0);
        List<Demonstracao> expResult = exp.getListaDemonstracoes().getListaDemonstracoes();
        List<Demonstracao> result = instance.getListaDemonstracoes();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getListaCandidaturasDemonstracao method, of class AvaliarCandidaturaController.
     */
    @Test
    public void testGetListaCandidaturasDemonstracao() {
        System.out.println("getListaCandidaturasDemonstracao");
       String id = "idtest";
        CentroExposicoes centro = new CentroExposicoes();
        Utilizador u = new Utilizador();
        u.setUSER(id);
        centro.getRegistoUtilizador().addNovoUtilizador(u);
        Exposicao exp = new Exposicao();
        Candidatura cand = new CandidaturaExposicao();
        exp.getListaCandidaturas().getListaCandidaturas().add(cand);
        FAE fae = new FAE(u);
        exp.getListaFAE().addFAE(fae);
        Atribuicao atribuicao = new Atribuicao(fae, cand);
        exp.getListaAtribuicoes().addAtribuicao(atribuicao);
        Demonstracao dem = new Demonstracao();
        Candidatura cand2 = new CandidaturaDemonstracao();
        dem.getListaCandidaturas().getListaCandidaturas().add(cand2);
        exp.getListaDemonstracoes().addDemonstracao(dem);
        centro.getRegistoExposicoes().getListaExposicoes().add(exp);
        AvaliarCandidaturaController instance = new AvaliarCandidaturaController(centro);
        instance.getListaExposicoesFAE(id);
        instance.selectExposicao(0);
        instance.getListaDemonstracoes();
        instance.selectDemonstracao(0);
        List<Candidatura> expResult = dem.getListaCandidaturas().getListaCandidaturas();
        List<Candidatura> result = instance.getListaCandidaturasDemonstracao();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setRespostas method, of class AvaliarCandidaturaController.
     */
    @Test
    public void testSetRespostas() {
        System.out.println("setRespostas");
        String r1 = "test1";
        String r2 = "test2";
        String r3 = "test3";
        String r4 = "test4";
        String r5 = "test5";
        String id = "idtest";
        CentroExposicoes centro = new CentroExposicoes();
        Utilizador u = new Utilizador();
        u.setUSER(id);
        centro.getRegistoUtilizador().addNovoUtilizador(u);
        Exposicao exp = new Exposicao();
        Candidatura cand = new CandidaturaExposicao();
        exp.getListaCandidaturas().getListaCandidaturas().add(cand);
        FAE fae = new FAE(u);
        exp.getListaFAE().addFAE(fae);
        Atribuicao atribuicao = new Atribuicao(fae, cand);
        exp.getListaAtribuicoes().addAtribuicao(atribuicao);
        centro.getRegistoExposicoes().getListaExposicoes().add(exp);
        AvaliarCandidaturaController instance = new AvaliarCandidaturaController(centro);
        instance.getListaExposicoesFAE(id);
        instance.selectExposicao(0);
        instance.getListaCandidaturasExposicao();
        instance.selectCandidatura(0);
        instance.novaAvaliacao();
        boolean expResult = true;
        boolean result = instance.setRespostas(r1, r2, r3, r4, r5);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of selectExposicao method, of class AvaliarCandidaturaController.
     */
    @Test
    public void testSelectExposicao() {
        System.out.println("selectExposicao");
        int indexExposicao = 0;
        String id = "idtest";
        CentroExposicoes centro = new CentroExposicoes();
        Utilizador u = new Utilizador();
        u.setUSER(id);
        centro.getRegistoUtilizador().addNovoUtilizador(u);
        Exposicao exp = new Exposicao();
        Candidatura cand = new CandidaturaExposicao();
        exp.getListaCandidaturas().getListaCandidaturas().add(cand);
        FAE fae = new FAE(u);
        exp.getListaFAE().addFAE(fae);
        Atribuicao atribuicao = new Atribuicao(fae, cand);
        exp.getListaAtribuicoes().addAtribuicao(atribuicao);
        centro.getRegistoExposicoes().getListaExposicoes().add(exp);
        AvaliarCandidaturaController instance = new AvaliarCandidaturaController(centro);
        instance.getListaExposicoesFAE(id);
        ExposicaoEstado expResult = exp.getEstadoExp();
        ExposicaoEstado result = instance.selectExposicao(indexExposicao);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of selectDemonstracao method, of class AvaliarCandidaturaController.
     */
    @Test
    public void testSelectDemonstracao() {
        System.out.println("selectDemonstracao");
        int indexDemonstracao = 0;
        String id = "idtest";
        CentroExposicoes centro = new CentroExposicoes();
        Utilizador u = new Utilizador();
        u.setUSER(id);
        centro.getRegistoUtilizador().addNovoUtilizador(u);
        Exposicao exp = new Exposicao();
        Candidatura cand = new CandidaturaExposicao();
        exp.getListaCandidaturas().getListaCandidaturas().add(cand);
        FAE fae = new FAE(u);
        exp.getListaFAE().addFAE(fae);
        Atribuicao atribuicao = new Atribuicao(fae, cand);
        exp.getListaAtribuicoes().addAtribuicao(atribuicao);
        Demonstracao dem = new Demonstracao();
        exp.getListaDemonstracoes().addDemonstracao(dem);
        centro.getRegistoExposicoes().getListaExposicoes().add(exp);
        AvaliarCandidaturaController instance = new AvaliarCandidaturaController(centro);
        instance.getListaExposicoesFAE(id);
        instance.selectExposicao(0);
        instance.getListaDemonstracoes();
        instance.selectDemonstracao(indexDemonstracao);
        
    }

    /**
     * Test of selectCandidatura method, of class AvaliarCandidaturaController.
     */
    @Test
    public void testSelectCandidatura() {
        System.out.println("selectCandidatura");
        int indexCandidatura = 0;
       String id = "idtest";
        CentroExposicoes centro = new CentroExposicoes();
        Utilizador u = new Utilizador();
        u.setUSER(id);
        centro.getRegistoUtilizador().addNovoUtilizador(u);
        Exposicao exp = new Exposicao();
        Candidatura cand = new CandidaturaExposicao();
        exp.getListaCandidaturas().getListaCandidaturas().add(cand);
        FAE fae = new FAE(u);
        exp.getListaFAE().addFAE(fae);
        Atribuicao atribuicao = new Atribuicao(fae, cand);
        exp.getListaAtribuicoes().addAtribuicao(atribuicao);
        centro.getRegistoExposicoes().getListaExposicoes().add(exp);
        AvaliarCandidaturaController instance = new AvaliarCandidaturaController(centro);
        instance.getListaExposicoesFAE(id);
        instance.selectExposicao(0);
        instance.getListaCandidaturasExposicao();
        instance.selectCandidatura(indexCandidatura);
    }
    
    @Test
    public void testSelectCandidatura2() {
        System.out.println("selectCandidatura");
        int indexCandidatura = 0;
       String id = "idtest";
        CentroExposicoes centro = new CentroExposicoes();
        Utilizador u = new Utilizador();
        u.setUSER(id);
        centro.getRegistoUtilizador().addNovoUtilizador(u);
        Exposicao exp = new Exposicao();
        Candidatura cand = new CandidaturaExposicao();
        exp.getListaCandidaturas().getListaCandidaturas().add(cand);
        FAE fae = new FAE(u);
        exp.getListaFAE().addFAE(fae);
        Atribuicao atribuicao = new Atribuicao(fae, cand);
        exp.getListaAtribuicoes().addAtribuicao(atribuicao);
        Demonstracao dem = new Demonstracao();
        Candidatura cand2 = new CandidaturaDemonstracao();
        dem.getListaCandidaturas().getListaCandidaturas().add(cand2);
        exp.getListaDemonstracoes().addDemonstracao(dem);
        centro.getRegistoExposicoes().getListaExposicoes().add(exp);
        AvaliarCandidaturaController instance = new AvaliarCandidaturaController(centro);
        instance.getListaExposicoesFAE(id);
        instance.selectExposicao(0);
        instance.getListaDemonstracoes();
        instance.selectDemonstracao(0);
        instance.getListaCandidaturasDemonstracao();
        instance.selectCandidatura(indexCandidatura);
    }
    
    /**
     * Test of novaAvaliacao method, of class AvaliarCandidaturaController.
     */
    @Test
    public void testNovaAvaliacao() {
        System.out.println("novaAvaliacao");
        String id = "idtest";
        CentroExposicoes centro = new CentroExposicoes();
        Utilizador u = new Utilizador();
        u.setUSER(id);
        centro.getRegistoUtilizador().addNovoUtilizador(u);
        Exposicao exp = new Exposicao();
        Candidatura cand = new CandidaturaExposicao();
        exp.getListaCandidaturas().getListaCandidaturas().add(cand);
        FAE fae = new FAE(u);
        exp.getListaFAE().addFAE(fae);
        Atribuicao atribuicao = new Atribuicao(fae, cand);
        exp.getListaAtribuicoes().addAtribuicao(atribuicao);
        centro.getRegistoExposicoes().getListaExposicoes().add(exp);
        AvaliarCandidaturaController instance = new AvaliarCandidaturaController(centro);
        instance.getListaExposicoesFAE(id);
        instance.selectExposicao(0);
        instance.getListaCandidaturasExposicao();
        instance.selectCandidatura(0);
        instance.novaAvaliacao();
        
    }

    

    /**
     * Test of registaAvaliacao method, of class AvaliarCandidaturaController.
     */
    @Test
    public void testRegistaAvaliacao() {
        System.out.println("registaAvaliacao");
        String r1 = "test1";
        String r2 = "test2";
        String r3 = "test3";
        String r4 = "test4";
        String r5 = "test5";
        String id = "idtest";
        CentroExposicoes centro = new CentroExposicoes();
        Utilizador u = new Utilizador();
        u.setUSER(id);
        centro.getRegistoUtilizador().addNovoUtilizador(u);
        Exposicao exp = new Exposicao();
        exp.setEstadoExp(new ExposicaoEstadoCandidaturasAtribuidas(exp));
        Candidatura cand = new CandidaturaExposicao();
        cand.setEstado(new CandidaturaEstadoAvaliada(cand));
        exp.getListaCandidaturas().getListaCandidaturas().add(cand);
        FAE fae = new FAE(u);
        exp.getListaFAE().addFAE(fae);
        Atribuicao atribuicao = new Atribuicao(fae, cand);
        exp.getListaAtribuicoes().addAtribuicao(atribuicao);
        centro.getRegistoExposicoes().getListaExposicoes().add(exp);
        AvaliarCandidaturaController instance = new AvaliarCandidaturaController(centro);
        instance.getListaExposicoesFAE(id);
        instance.selectExposicao(0);
        instance.getListaCandidaturasExposicao();
        instance.selectCandidatura(0);
        instance.novaAvaliacao();
        instance.setRespostas(r1, r2, r3, r4, r5);
        instance.registaAvaliacao();
        
    }
    
}
