/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Demonstracao;
import lapr.project.model.Exposicao;
import lapr.project.model.Organizador;
import lapr.project.model.Recurso;
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
public class CriarDemonstracaoControllerTest {
    
    public CriarDemonstracaoControllerTest() {
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
     * Test of getListaExposicoes method, of class CriarDemonstracaoController.
     */
    @Test
    public void testGetListaExposicoes() {
        System.out.println("getListaExposicoes");
        CentroExposicoes centroExposicoes = new CentroExposicoes();
        String username = "Teste";
        CriarDemonstracaoController instance = new CriarDemonstracaoController(centroExposicoes);
        List<Exposicao> expResult = instance.getListaExposicoes(username);
        List<Exposicao> result = instance.getListaExposicoes(username);
    }

    /**
     * Test of selectExposicao method, of class CriarDemonstracaoController.
     */
    @Test
    public void testSelectExposicao() {
        System.out.println("selectExposicao");
        CentroExposicoes centroExposicoes = new CentroExposicoes();
        Exposicao expo = new Exposicao();
        String username = "Teste";
        expo.getListaOrganizadores().getListaOrganizadores().add(new Organizador
        (new Utilizador("Nome","Teste","000","email@email.com","Gestor de projetos da Google")));
        centroExposicoes.getRegistoExposicoes().getListaExposicoes().add(expo);
        int indexExposisao = 0;
        CriarDemonstracaoController instance = new CriarDemonstracaoController(centroExposicoes);
        instance.getListaExposicoes(username);
        instance.selectExposicao(indexExposisao);
    }

    /**
     * Test of novaDemonstracao method, of class CriarDemonstracaoController.
     */
    @Test
    public void testNovaDemonstracao() {
        System.out.println("novaDemonstracao");
        CentroExposicoes centroExposicoes = new CentroExposicoes();
        Exposicao exposicao = new Exposicao();
        centroExposicoes.getRegistoExposicoes().getListaExposicoes().add(exposicao);
        CriarDemonstracaoController instance = 
                new CriarDemonstracaoController(centroExposicoes);
        String username = "Teste";
        exposicao.getListaOrganizadores().getListaOrganizadores().add(new Organizador
        (new Utilizador("Nome","Teste","000","email@email.com","Gestor de projetos da Google")));
        instance.getListaExposicoes(username);
        instance.selectExposicao(0);
        Demonstracao expResult = new Demonstracao();
        Demonstracao result = instance.novaDemonstracao();
    }

    /**
     * Test of setDados method, of class CriarDemonstracaoController.
     */
    @Test
    public void testSetDados() {
        System.out.println("setDados");
        CentroExposicoes centroExposicoes = new CentroExposicoes();
        Exposicao exposicao = new Exposicao();
        CriarDemonstracaoController instance = new CriarDemonstracaoController(centroExposicoes);
        centroExposicoes.getRegistoExposicoes().getListaExposicoes().add(exposicao);
        String username = "Teste";
        exposicao.getListaOrganizadores().getListaOrganizadores().add(new Organizador
        (new Utilizador("Nome","Teste","000","email@email.com","Gestor de projetos da Google")));
        instance.getListaExposicoes(username);
        instance.selectExposicao(0);
        instance.novaDemonstracao();
        String codigoUnico = "CódigoTeste";
        String descricao = "Teste";
        instance.setDados(codigoUnico, descricao);
    }

    /**
     * Test of getListaRecursos method, of class CriarDemonstracaoController.
     */
    @Test
    public void testGetListaRecursos() {
        System.out.println("getListaRecursos");
        CentroExposicoes centroExposicoes = new CentroExposicoes ();
        CriarDemonstracaoController instance = new CriarDemonstracaoController(centroExposicoes);
        Exposicao exposicao = new Exposicao();
        centroExposicoes.getRegistoExposicoes().getListaExposicoes().add(exposicao);
        String username = "Teste";
        exposicao.getListaOrganizadores().getListaOrganizadores().add(new Organizador
        (new Utilizador("Nome","Teste","000","email@email.com","Gestor de projetos da Google")));
        instance.getListaExposicoes(username);
        instance.selectExposicao(0);
        instance.novaDemonstracao();
        String codigoUnico = "CódigoTeste";
        String descricao = "Teste";
        instance.setDados(codigoUnico, descricao);
        List<Recurso> expResult = instance.getListaRecursos();
        List<Recurso> result = instance.getListaRecursos();
    }

    /**
     * Test of selectRecurso method, of class CriarDemonstracaoController.
     */
    @Test
    public void testSelectRecurso() {
        System.out.println("selectRecurso");
        CentroExposicoes centroExposicoes = new CentroExposicoes ();
        CriarDemonstracaoController instance = new CriarDemonstracaoController(centroExposicoes);
        Exposicao exposicao = new Exposicao();
        centroExposicoes.getRegistoExposicoes().getListaExposicoes().add(exposicao);
        String username = "Teste";
        exposicao.getListaOrganizadores().getListaOrganizadores().add(new Organizador
        (new Utilizador("Nome","Teste","000","email@email.com","Gestor de projetos da Google")));
        instance.getListaExposicoes(username);
        instance.selectExposicao(0);
        instance.novaDemonstracao();
        String codigoUnico = "CódigoTeste";
        String descricao = "Teste";
        instance.setDados(codigoUnico, descricao);
        centroExposicoes.getListaRecursos().getListaRecursos().add(new Recurso());
        instance.getListaRecursos();
        int indexRecurso = 0;
        instance.selectRecurso(indexRecurso);
        
    }

    /**
     * Test of getListaRecursosDem method, of class CriarDemonstracaoController.
     */
    @Test
    public void testGetListaRecursosDem() {
        System.out.println("getListaRecursosDem");
        CentroExposicoes centroExposicoes = new CentroExposicoes();
        CriarDemonstracaoController instance = new CriarDemonstracaoController(centroExposicoes);
        Exposicao exposicao = new Exposicao();
        centroExposicoes.getRegistoExposicoes().getListaExposicoes().add(exposicao);
        String username = "Teste";
        exposicao.getListaOrganizadores().getListaOrganizadores().add(new Organizador
        (new Utilizador("Nome","Teste","000","email@email.com","Gestor de projetos da Google")));
        instance.getListaExposicoes(username);
        instance.selectExposicao(0);
        instance.novaDemonstracao();
        String codigoUnico = "CódigoTeste";
        String descricao = "Teste";
        instance.setDados(codigoUnico, descricao);
        centroExposicoes.getListaRecursos().getListaRecursos().add(new Recurso());
        instance.getListaRecursos();
        instance.selectRecurso(0);
        List<Recurso> expResult = instance.getListaRecursosDem();
        List<Recurso> result = instance.getListaRecursosDem();        
    }

    /**
     * Test of addRecurso method, of class CriarDemonstracaoController.
     */
    @Test
    public void testAddRecurso() {
        System.out.println("addRecurso");
        String recurso = "";
        CentroExposicoes centroExposicoes = new CentroExposicoes();
        CriarDemonstracaoController instance = new CriarDemonstracaoController(centroExposicoes);
        Exposicao exposicao = new Exposicao();
        centroExposicoes.getRegistoExposicoes().getListaExposicoes().add(exposicao);
        String username = "Teste";
        exposicao.getListaOrganizadores().getListaOrganizadores().add(new Organizador
        (new Utilizador("Nome","Teste","000","email@email.com","Gestor de projetos da Google")));
        instance.getListaExposicoes(username);
        instance.selectExposicao(0);
        instance.novaDemonstracao();
        String codigoUnico = "CódigoTeste";
        String descricao = "Teste";
        instance.setDados(codigoUnico, descricao);
        centroExposicoes.getListaRecursos().getListaRecursos().add(new Recurso());
        instance.getListaRecursos();
        instance.selectRecurso(0);
        instance.getListaRecursosDem();
        instance.addRecurso(recurso);
    }

    /**
     * Test of removerRecurso method, of class CriarDemonstracaoController.
     */
    @Test
    public void testRemoverRecurso() {
        System.out.println("removerRecurso");
        String recurso = "";
        CentroExposicoes centroExposicoes = new CentroExposicoes();
        CriarDemonstracaoController instance = new CriarDemonstracaoController(centroExposicoes);
        Exposicao exposicao = new Exposicao();
        centroExposicoes.getRegistoExposicoes().getListaExposicoes().add(exposicao);
        String username = "Teste";
        exposicao.getListaOrganizadores().getListaOrganizadores().add(new Organizador
        (new Utilizador("Nome","Teste","000","email@email.com","Gestor de projetos da Google")));
        instance.getListaExposicoes(username);
        instance.selectExposicao(0);
        instance.novaDemonstracao();
        String codigoUnico = "CódigoTeste";
        String descricao = "Teste";
        instance.setDados(codigoUnico, descricao);
        centroExposicoes.getListaRecursos().getListaRecursos().add(new Recurso());
        instance.getListaRecursos();
        instance.selectRecurso(0);
        instance.getListaRecursosDem();
        instance.addRecurso(recurso);
        instance.removerRecurso(recurso);
    }

    /**
     * Test of registaDemonstracao method, of class CriarDemonstracaoController.
     */
    @Test
    public void testRegistaDemonstracao() {
        System.out.println("registaDemonstracao");
        String recurso = "";
        CentroExposicoes centroExposicoes = new CentroExposicoes();
        CriarDemonstracaoController instance = new CriarDemonstracaoController(centroExposicoes);
        Exposicao exposicao = new Exposicao();
        centroExposicoes.getRegistoExposicoes().getListaExposicoes().add(exposicao);
        String username = "Teste";
        exposicao.getListaOrganizadores().getListaOrganizadores().add(new Organizador
        (new Utilizador("Nome","Teste","000","email@email.com","Gestor de projetos da Google")));
        instance.getListaExposicoes(username);
        instance.selectExposicao(0);
        instance.novaDemonstracao();
        String codigoUnico = "CódigoTeste";
        String descricao = "Teste";
        instance.setDados(codigoUnico, descricao);
        centroExposicoes.getListaRecursos().getListaRecursos().add(new Recurso());
        instance.getListaRecursos();
        instance.selectRecurso(0);
        instance.getListaRecursosDem();
        instance.addRecurso(recurso);
        instance.removerRecurso(recurso);
        boolean expResult = instance.registaDemonstracao();
        boolean result = instance.registaDemonstracao();
        assertEquals(expResult, result);
        
    }
    
}
