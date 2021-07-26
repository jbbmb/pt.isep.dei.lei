/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.Candidatura;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Demonstracao;
import lapr.project.model.Exposicao;
import lapr.project.model.Organizador;
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
public class ListarCandidaturasRemovidasControllerTest {
    
    public ListarCandidaturasRemovidasControllerTest() {
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
     * Test of getListaExposicoesOrganizador method, of class ListarCandidaturasRemovidasController.
     */
    @Test
    public void testGetListaExposicoesOrganizador() {
        System.out.println("getListaExposicoesOrganizador");
        CentroExposicoes centroExposicoes = new CentroExposicoes();
        String id = "idtest";
        ListarCandidaturasRemovidasController instance = new ListarCandidaturasRemovidasController(centroExposicoes, id);
        Exposicao expo = new Exposicao();
        expo.getListaOrganizadores().getListaOrganizadores().add(new Organizador
        (new Utilizador("Nome",id,"000","email@email.com","Gestor de projetos da Google")));
        centroExposicoes.getRegistoExposicoes().getListaExposicoes().add(expo);
        List<Exposicao> expResult = centroExposicoes.getRegistoExposicoes().getListaExposicoesOrganizador(id);
        List<Exposicao> result = instance.getListaExposicoesOrganizador();
        assertEquals(expResult, result);
    }

    /**
     * Test of getListaDemonstracoesOrganizador method, of class ListarCandidaturasRemovidasController.
     */
    @Test
    public void testGetListaDemonstracoesOrganizador() {
        System.out.println("getListaDemonstracoesOrganizador");
        CentroExposicoes centroExposicoes = new CentroExposicoes();
        String id = "idtest";
        ListarCandidaturasRemovidasController instance = new ListarCandidaturasRemovidasController(centroExposicoes, id);
        Exposicao expo = new Exposicao();
        Demonstracao dem = new Demonstracao();
        expo.getListaDemonstracoes().getListaDemonstracoes().add(dem);
        expo.getListaOrganizadores().getListaOrganizadores().add(new Organizador
        (new Utilizador("Nome",id,"000","email@email.com","Gestor de projetos da Google")));
        centroExposicoes.getRegistoExposicoes().getListaExposicoes().add(expo);
        instance.getListaExposicoesOrganizador();
        instance.selectExposicao(0);
        List<Demonstracao> expResult = expo.getListaDemonstracoes().getListaDemonstracoes();
        List<Demonstracao> result = instance.getListaDemonstracoesOrganizador();
        assertEquals(expResult, result);
    }

    /**
     * Test of selectExposicao method, of class ListarCandidaturasRemovidasController.
     */
    @Test
    public void testSelectExposicao() {
        System.out.println("selectExposicao");
        int indexExposicao = 0;
        CentroExposicoes centroExposicoes = new CentroExposicoes();
        String id = "idtest";
        ListarCandidaturasRemovidasController instance = new ListarCandidaturasRemovidasController(centroExposicoes, id);
        Exposicao expo = new Exposicao();
        expo.getListaOrganizadores().getListaOrganizadores().add(new Organizador
        (new Utilizador("Nome",id,"000","email@email.com","Gestor de projetos da Google")));
        centroExposicoes.getRegistoExposicoes().getListaExposicoes().add(expo);
        instance.getListaExposicoesOrganizador();
        instance.selectExposicao(indexExposicao);
    }

    /**
     * Test of selectDemonstracao method, of class ListarCandidaturasRemovidasController.
     */
    @Test
    public void testSelectDemonstracao() {
        System.out.println("selectDemonstracao");
        int indexDemonstracao = 0;
        CentroExposicoes centroExposicoes = new CentroExposicoes();
        String id = "idtest";
        ListarCandidaturasRemovidasController instance = new ListarCandidaturasRemovidasController(centroExposicoes, id);
        Exposicao expo = new Exposicao();
        Demonstracao dem = new Demonstracao();
        expo.getListaDemonstracoes().getListaDemonstracoes().add(dem);
        expo.getListaOrganizadores().getListaOrganizadores().add(new Organizador
        (new Utilizador("Nome",id,"000","email@email.com","Gestor de projetos da Google")));
        centroExposicoes.getRegistoExposicoes().getListaExposicoes().add(expo);
        instance.getListaExposicoesOrganizador();
        instance.selectExposicao(0);
        instance.getListaDemonstracoesOrganizador();
        instance.selectDemonstracao(indexDemonstracao);
        ;
    }

    /**
     * Test of mostrarListaCandidaturasRemovidas method, of class ListarCandidaturasRemovidasController.
     */
    @Test
    public void testMostrarListaCandidaturasRemovidas() {
        System.out.println("mostrarListaCandidaturasRemovidas");
         CentroExposicoes centroExposicoes = new CentroExposicoes();
        String id = "idtest";
        ListarCandidaturasRemovidasController instance = new ListarCandidaturasRemovidasController(centroExposicoes, id);
        Exposicao expo = new Exposicao();
        Candidatura cand = new CandidaturaExposicao();
        expo.getListaCandidaturasRemovidas().add(cand);
        expo.getListaOrganizadores().getListaOrganizadores().add(new Organizador
        (new Utilizador("Nome",id,"000","email@email.com","Gestor de projetos da Google")));
        centroExposicoes.getRegistoExposicoes().getListaExposicoes().add(expo);
        instance.getListaExposicoesOrganizador();
        instance.selectExposicao(0);
        List<Candidatura> expResult = expo.getListaCandidaturasRemovidas();
        List<Candidatura> result = instance.mostrarListaCandidaturasRemovidas();
        assertEquals(expResult, result);
        
    }
    @Test
    public void testMostrarListaCandidaturasRemovidas2() {
        System.out.println("mostrarListaCandidaturasRemovidas");
         CentroExposicoes centroExposicoes = new CentroExposicoes();
        String id = "idtest";
        ListarCandidaturasRemovidasController instance = new ListarCandidaturasRemovidasController(centroExposicoes, id);
        Exposicao expo = new Exposicao();
        Demonstracao dem = new Demonstracao();
        Candidatura cand = new CandidaturaExposicao();
        dem.getListaCandidaturasRemovidas().add(cand);
        expo.getListaDemonstracoes().getListaDemonstracoes().add(dem);
        expo.getListaOrganizadores().getListaOrganizadores().add(new Organizador
        (new Utilizador("Nome",id,"000","email@email.com","Gestor de projetos da Google")));
        centroExposicoes.getRegistoExposicoes().getListaExposicoes().add(expo);
        instance.getListaDemonstracoesOrganizador();
        instance.selectDemonstracao(0);
        List<Candidatura> expResult = dem.getListaCandidaturasRemovidas();
        List<Candidatura> result = instance.mostrarListaCandidaturasRemovidas();
        assertEquals(expResult, result);
        
    }
    
}
