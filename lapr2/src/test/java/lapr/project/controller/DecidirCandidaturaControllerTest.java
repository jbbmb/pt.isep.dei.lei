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
import lapr.project.model.Exposicao;
import lapr.project.model.ExposicaoEstado;
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
public class DecidirCandidaturaControllerTest {
    
    public DecidirCandidaturaControllerTest() {
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
     * Test of getListaExposicao method, of class DecidirCandidaturaController.
     */
    @Test
    public void testGetListaExposicao() {
        System.out.println("getListaExposicao");
        String username = "Teste";
        CentroExposicoes centroExposicoes = new CentroExposicoes();
        DecidirCandidaturaController instance = new DecidirCandidaturaController(centroExposicoes);
        List<Exposicao> expResult = instance.getListaExposicao(username);
        List<Exposicao> result = instance.getListaExposicao(username);
    }

    /**
     * Test of selectExposicao method, of class DecidirCandidaturaController.
     */
    @Test
    public void testSelectExposicao() {
        System.out.println("selectExposicao");
        CentroExposicoes centroExposicoes = new CentroExposicoes();
        DecidirCandidaturaController instance = new DecidirCandidaturaController(centroExposicoes);
        Exposicao expo = new Exposicao();
        String username = "Teste";
        expo.getListaOrganizadores().getListaOrganizadores().add(new Organizador
        (new Utilizador("Nome","Teste","000","email@email.com","Gestor de projetos da Google")));
        centroExposicoes.getRegistoExposicoes().getListaExposicoes().add(expo);
        instance.getListaExposicao(username);
        instance.selectExposicao(0);


    }

    /**
     * Test of getListaCandidaturas method, of class DecidirCandidaturaController.
     */
    @Test
    public void testGetListaCandidaturas() {
        System.out.println("getListaCandidaturas");
        CentroExposicoes centroExposicoes = new CentroExposicoes();
        DecidirCandidaturaController instance = new DecidirCandidaturaController(centroExposicoes);
        Exposicao expo = new Exposicao();
        String username = "Teste";
        expo.getListaOrganizadores().getListaOrganizadores().add(new Organizador
        (new Utilizador("Nome","Teste","000","email@email.com","Gestor de projetos da Google")));
        centroExposicoes.getRegistoExposicoes().getListaExposicoes().add(expo);
        instance.getListaExposicao(username);
        instance.selectExposicao(0);
        List<Candidatura> expResult = instance.getListaCandidaturas(expo);
        List<Candidatura> result = instance.getListaCandidaturas(expo);
    }

    /**
     * Test of selectCandidatura method, of class DecidirCandidaturaController.
     */
    @Test
    public void testSelectCandidatura() {
        System.out.println("selectCandidatura");
        CentroExposicoes centroExposicoes = new CentroExposicoes();
        DecidirCandidaturaController instance = new DecidirCandidaturaController(centroExposicoes);
        Exposicao expo = new Exposicao();
        String username = "Teste";
        expo.getListaOrganizadores().getListaOrganizadores().add(new Organizador
        (new Utilizador("Nome","Teste","000","email@email.com","Gestor de projetos da Google")));
        centroExposicoes.getRegistoExposicoes().getListaExposicoes().add(expo);
        instance.getListaExposicao(username);
        instance.selectExposicao(0);
        Candidatura candidatura = new CandidaturaExposicao();
        instance.getListaCandidaturas(expo).add(candidatura);
        instance.selectCandidatura(0);
    }

    /**
     * Test of getDadosCandidatura method, of class DecidirCandidaturaController.
     */
    @Test
    public void testGetDadosCandidatura() {
        System.out.println("getDadosCandidatura");
        CentroExposicoes centroExposicoes = new CentroExposicoes();
        DecidirCandidaturaController instance = new DecidirCandidaturaController(centroExposicoes);
        Exposicao expo = new Exposicao();
        String username = "Teste";
        expo.getListaOrganizadores().getListaOrganizadores().add(new Organizador
        (new Utilizador("Nome","Teste","000","email@email.com","Gestor de projetos da Google")));
        centroExposicoes.getRegistoExposicoes().getListaExposicoes().add(expo);
        instance.getListaExposicao(username);
        instance.selectExposicao(0);
        Candidatura candidatura = new CandidaturaExposicao();
        instance.getListaCandidaturas(expo).add(candidatura);
        instance.selectCandidatura(0);
        String expResult = "";
        String result = instance.getDadosCandidatura();
    }

    /**
     * Test of setDecisao method, of class DecidirCandidaturaController.
     */
    @Test
    public void testSetDecisao() {
        System.out.println("setDecisao");
        String decisao = "aceite";
        CentroExposicoes centroExposicoes = new CentroExposicoes();
        DecidirCandidaturaController instance = new DecidirCandidaturaController(centroExposicoes);
        Exposicao expo = new Exposicao();
        String username = "Teste";
        expo.getListaOrganizadores().getListaOrganizadores().add(new Organizador
        (new Utilizador("Nome","Teste","000","email@email.com","Gestor de projetos da Google")));
        centroExposicoes.getRegistoExposicoes().getListaExposicoes().add(expo);
        instance.getListaExposicao(username);
        instance.selectExposicao(0);
        Candidatura candidatura = new CandidaturaExposicao();
        instance.getListaCandidaturas(expo).add(candidatura);
        instance.selectCandidatura(0);
        instance.getDadosCandidatura();
        instance.setDecisao(decisao);
    }

    /**
     * Test of registaDecisao method, of class DecidirCandidaturaController.
     */
    @Test
    public void testRegistaDecisao() {
        System.out.println("registaDecisao");
        String decisao = "aceite";
        CentroExposicoes centroExposicoes = new CentroExposicoes();
        DecidirCandidaturaController instance = new DecidirCandidaturaController(centroExposicoes);
        Exposicao expo = new Exposicao();
        String username = "Teste";
        expo.getListaOrganizadores().getListaOrganizadores().add(new Organizador
        (new Utilizador("Nome","Teste","000","email@email.com","Gestor de projetos da Google")));
        centroExposicoes.getRegistoExposicoes().getListaExposicoes().add(expo);
        instance.getListaExposicao(username);
        instance.selectExposicao(0);
        Candidatura candidatura = new CandidaturaExposicao();
        instance.getListaCandidaturas(expo).add(candidatura);
        instance.selectCandidatura(0);
        instance.getDadosCandidatura();
        instance.setDecisao(decisao);
        instance.registaDecisao();

    }
    
}
