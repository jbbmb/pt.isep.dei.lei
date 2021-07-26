/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.Date;
import java.util.List;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Demonstracao;
import lapr.project.model.Exposicao;
import lapr.project.model.ListaDemonstracoes;
import lapr.project.model.Organizador;
import lapr.project.model.Utilizador;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Grupo 18_LAPR2 15-16
 */
public class DecidirDemonstracaoControllerTest {
    
    public DecidirDemonstracaoControllerTest() {
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
     * Test of getListaExposicoes method, of class DecidirDemonstracaoController.
     */
    @Test
    public void testGetListaExposicoes() {
        System.out.println("getListaExposicoes");
        String username = "Teste";
        CentroExposicoes centroExposicoes = new CentroExposicoes();
        DecidirDemonstracaoController instance = new DecidirDemonstracaoController(centroExposicoes);
        List<Exposicao> expResult = instance.getListaExposicoes(username);
        List<Exposicao> result = instance.getListaExposicoes(username);
    }

    /**
     * Test of selectExposicao method, of class DecidirDemonstracaoController.
     */
    @Test
    public void testSelectExposicao() {
        System.out.println("selectExposicao");
        CentroExposicoes centroExposicoes = new CentroExposicoes();
        DecidirDemonstracaoController instance = new DecidirDemonstracaoController(centroExposicoes);
        Exposicao expo = new Exposicao();
        String username = "Teste";
        expo.getListaOrganizadores().getListaOrganizadores().add(new Organizador
        (new Utilizador("Nome","Teste","000","email@email.com","Gestor de projetos da Google")));
        centroExposicoes.getRegistoExposicoes().getListaExposicoes().add(expo);
        instance.getListaExposicoes(username);
        int indexExposisao = 0;
        instance.selectExposicao(indexExposisao);
    }

    /**
     * Test of getDemonstracoes method, of class DecidirDemonstracaoController.
     */
    @Test
    public void testGetDemonstracoes() {
        System.out.println("getDemonstracoes");
        CentroExposicoes centroExposicoes = new CentroExposicoes();
        DecidirDemonstracaoController instance = new DecidirDemonstracaoController(centroExposicoes);
        Exposicao expo = new Exposicao();
        String username = "Teste";
        expo.getListaOrganizadores().getListaOrganizadores().add(new Organizador
        (new Utilizador("Nome","Teste","000","email@email.com","Gestor de projetos da Google")));
        centroExposicoes.getRegistoExposicoes().getListaExposicoes().add(expo);
        instance.getListaExposicoes(username);
        instance.selectExposicao(0);
        ListaDemonstracoes expResult = instance.getDemonstracoes();
        ListaDemonstracoes result = instance.getDemonstracoes();
    }

    /**
     * Test of selectDemonstracao method, of class DecidirDemonstracaoController.
     */
    @Test
    public void testSelectDemonstracao() {
        System.out.println("selectDemonstracao");
        int indexDemonstracao = 0;
        CentroExposicoes centroExposicoes = new CentroExposicoes();
        DecidirDemonstracaoController instance = new DecidirDemonstracaoController(centroExposicoes);
        Exposicao expo = new Exposicao();
        String username = "Teste";
        expo.getListaOrganizadores().getListaOrganizadores().add(new Organizador
        (new Utilizador("Nome","Teste","000","email@email.com","Gestor de projetos da Google")));
        centroExposicoes.getRegistoExposicoes().getListaExposicoes().add(expo);
        instance.getListaExposicoes(username);
        instance.selectExposicao(0);
        Demonstracao demonstracao = new Demonstracao();
        instance.getDemonstracoes().getListaDemonstracoes().add(demonstracao);
        instance.selectDemonstracao(indexDemonstracao);
    }

    /**
     * Test of getDadosDemonstracao method, of class DecidirDemonstracaoController.
     */
    @Test
    public void testGetDadosDemonstracao() {
        System.out.println("getDadosDemonstracao");
        CentroExposicoes centroExposicoes = new CentroExposicoes();
        DecidirDemonstracaoController instance = new DecidirDemonstracaoController(centroExposicoes);
        Exposicao expo = new Exposicao();
        String username = "Teste";
        expo.getListaOrganizadores().getListaOrganizadores().add(new Organizador
        (new Utilizador("Nome","Teste","000","email@email.com","Gestor de projetos da Google")));
        centroExposicoes.getRegistoExposicoes().getListaExposicoes().add(expo);
        instance.getListaExposicoes(username);
        instance.selectExposicao(0);
        Demonstracao demonstracao = new Demonstracao();
        instance.getDemonstracoes().getListaDemonstracoes().add(demonstracao);
        instance.selectDemonstracao(0);
        String expResult = "";
        String result = instance.getDadosDemonstracao();

    }

    /**
     * Test of setDecisao method, of class DecidirDemonstracaoController.
     */
    @Test
    public void testSetDecisao() {
        System.out.println("setDecisao");
        String decisao = "aceite";
        CentroExposicoes centroExposicoes = new CentroExposicoes();
        DecidirDemonstracaoController instance = new DecidirDemonstracaoController(centroExposicoes);
        Exposicao expo = new Exposicao();
        String username = "Teste";
        centroExposicoes.getRegistoExposicoes().getListaExposicoes().add(expo);
        expo.getListaOrganizadores().getListaOrganizadores().add(new Organizador
        (new Utilizador("Nome","Teste","000","email@email.com","Gestor de projetos da Google")));
        instance.getListaExposicoes(username);
        instance.selectExposicao(0);
        Demonstracao demonstracao = new Demonstracao();
        instance.getDemonstracoes().getListaDemonstracoes().add(demonstracao);
        instance.selectDemonstracao(0);
        instance.getDadosDemonstracao();
        instance.setDecisao(decisao);
    }

    /**
     * Test of setPeriodoCandidaturas method, of class DecidirDemonstracaoController.
     */
    @Test
    public void testSetPeriodoCandidaturas() {
        System.out.println("setPeriodoCandidaturas");
        Date dataInicio = new Date();
        Date dataFim = new Date();
        String decisao = "aceite";
        CentroExposicoes centroExposicoes = new CentroExposicoes();
        DecidirDemonstracaoController instance = new DecidirDemonstracaoController(centroExposicoes);
        Exposicao expo = new Exposicao();
        String username = "Teste";
        expo.getListaOrganizadores().getListaOrganizadores().add(new Organizador
        (new Utilizador("Nome","Teste","000","email@email.com","Gestor de projetos da Google")));
        centroExposicoes.getRegistoExposicoes().getListaExposicoes().add(expo);
        instance.getListaExposicoes(username);
        instance.selectExposicao(0);
        Demonstracao demonstracao = new Demonstracao();
        instance.getDemonstracoes().getListaDemonstracoes().add(demonstracao);
        instance.selectDemonstracao(0);
        instance.getDadosDemonstracao();
        instance.setDecisao(decisao);
        instance.setPeriodoCandidaturas(dataInicio, dataFim);

    }

    /**
     * Test of registaDemonstracaoAceite method, of class DecidirDemonstracaoController.
     */
    @Test
    public void testRegistaDemonstracaoAceite() {
        System.out.println("registaDemonstracaoAceite");
        String decisao = "aceite";
        CentroExposicoes centroExposicoes = new CentroExposicoes();
        Date dataInicio = new Date();
        Date dataFim = new Date();
        DecidirDemonstracaoController instance = new DecidirDemonstracaoController(centroExposicoes);
        Exposicao expo = new Exposicao();
        String username = "Teste";
        expo.getListaOrganizadores().getListaOrganizadores().add(new Organizador
        (new Utilizador("Nome","Teste","000","email@email.com","Gestor de projetos da Google")));
        centroExposicoes.getRegistoExposicoes().getListaExposicoes().add(expo);
        instance.getListaExposicoes(username);
        instance.selectExposicao(0);
        Demonstracao demonstracao = new Demonstracao();
        instance.getDemonstracoes().getListaDemonstracoes().add(demonstracao);
        instance.selectDemonstracao(0);
        instance.getDadosDemonstracao();
        instance.setDecisao(decisao);
        instance.setPeriodoCandidaturas(dataInicio, dataFim);
        ListaDemonstracoes listaDemonstracoes = instance.getDemonstracoes();
        instance.registaDemonstracaoAceite();
    }
    
}
