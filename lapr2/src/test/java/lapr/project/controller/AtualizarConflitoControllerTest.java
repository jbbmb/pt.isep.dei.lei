/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.Candidatura;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Conflito;
import lapr.project.model.Exposicao;
import lapr.project.model.FAE;
import lapr.project.model.Organizador;
import lapr.project.model.TipoConflito;
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
public class AtualizarConflitoControllerTest {
    
    public AtualizarConflitoControllerTest() {
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
     * Test of getListaExposicoes method, of class AtualizarConflitoController.
     */
    @Test
    public void testGetListaExposicoes() {
        System.out.println("getListaExposicoes");
        String id = "";
        CentroExposicoes centroExposicoes = new CentroExposicoes();
        AtualizarConflitoController instance = new AtualizarConflitoController(centroExposicoes);
        List<Exposicao> expResult = instance.getListaExposicoes(id);
        List<Exposicao> result = instance.getListaExposicoes(id);
    }

    /**
     * Test of selectExposicao method, of class AtualizarConflitoController.
     */
    @Test
    public void testSelectExposicao() {
        System.out.println("selectExposicao");
        Exposicao e = new Exposicao();
        CentroExposicoes centroExposicoes = new CentroExposicoes();
        AtualizarConflitoController instance = new AtualizarConflitoController(centroExposicoes);
        centroExposicoes.getRegistoExposicoes().getListaExposicoes().add(e);
        e.getListaFAE().getListaFAE().add(new FAE
        (new Utilizador("Nome","Teste","000","email@email.com","Gestor de projetos da Google")));
        instance.selectExposicao(e);
    }

    /**
     * Test of getListaConflitos method, of class AtualizarConflitoController.
     */
    @Test
    public void testGetListaConflitos() {
        System.out.println("getListaConflitos");
        Exposicao e = new Exposicao();
        CentroExposicoes centroExposicoes = new CentroExposicoes();
        AtualizarConflitoController instance = new AtualizarConflitoController(centroExposicoes);
        centroExposicoes.getRegistoExposicoes().getListaExposicoes().add(e);
        e.getListaFAE().getListaFAE().add(new FAE
        (new Utilizador("Nome","Teste","000","email@email.com","Gestor de projetos da Google")));
        instance.selectExposicao(e);
        instance.getListaConflitos();
    }

    /**
     * Test of getConflitos method, of class AtualizarConflitoController.
     */
    @Test
    public void testGetConflitos() {
        System.out.println("getConflitos");
        Exposicao e = new Exposicao();
        CentroExposicoes centroExposicoes = new CentroExposicoes();
        AtualizarConflitoController instance = new AtualizarConflitoController(centroExposicoes);
        centroExposicoes.getRegistoExposicoes().getListaExposicoes().add(e);
        e.getListaFAE().getListaFAE().add(new FAE
        (new Utilizador("Nome","Teste","000","email@email.com","Gestor de projetos da Google")));
        instance.selectExposicao(e);
        instance.getListaConflitos();
        instance.getConflitos();
        
    }

    /**
     * Test of selectConflito method, of class AtualizarConflitoController.
     */
    @Test
    public void testSelectConflito() {
        System.out.println("selectConflito");
        Conflito conf = new Conflito();
        Exposicao e = new Exposicao();
        CentroExposicoes centroExposicoes = new CentroExposicoes();
        AtualizarConflitoController instance = new AtualizarConflitoController(centroExposicoes);
        centroExposicoes.getRegistoExposicoes().getListaExposicoes().add(e);
        e.getListaFAE().getListaFAE().add(new FAE
        (new Utilizador("Nome","Teste","000","email@email.com","Gestor de projetos da Google")));
        instance.selectExposicao(e);
        instance.getListaConflitos();
        instance.getConflitos();
        instance.getConflitos().add(conf);
        instance.selectConflito(conf);
    }

    /**
     * Test of getDadosConflito method, of class AtualizarConflitoController.
     */
    @Test
    public void testGetDadosConflito() {
        System.out.println("getDadosConflito");
        Conflito conf = new Conflito();
        Exposicao e = new Exposicao();
        CentroExposicoes centroExposicoes = new CentroExposicoes();
        AtualizarConflitoController instance = new AtualizarConflitoController(centroExposicoes);
        centroExposicoes.getRegistoExposicoes().getListaExposicoes().add(e);
        e.getListaFAE().getListaFAE().add(new FAE
        (new Utilizador("Nome","Teste","000","email@email.com","Gestor de projetos da Google")));
        instance.selectExposicao(e);
        instance.getListaConflitos();
        instance.getConflitos();
        instance.getConflitos().add(conf);
        instance.selectConflito(conf);
        instance.getDadosConflito();
    }

    /**
     * Test of setConflito method, of class AtualizarConflitoController.
     */
    @Test
    public void testSetConflito() {
        System.out.println("setConflito");
        FAE fae = null;
        Candidatura candidatura = null;
        TipoConflito tipoConflito = null;
        Conflito conf = new Conflito();
        Exposicao e = new Exposicao();
        CentroExposicoes centroExposicoes = new CentroExposicoes();
        AtualizarConflitoController instance = new AtualizarConflitoController(centroExposicoes);
        centroExposicoes.getRegistoExposicoes().getListaExposicoes().add(e);
        e.getListaFAE().getListaFAE().add(new FAE
        (new Utilizador("Nome","Teste","000","email@email.com","Gestor de projetos da Google")));
        instance.selectExposicao(e);
        instance.getListaConflitos();
        instance.getConflitos();
        instance.getConflitos().add(conf);
        instance.selectConflito(conf);
        instance.getDadosConflito();
        instance.setConflito(fae, candidatura, tipoConflito);
    }

    /**
     * Test of apagarConflito method, of class AtualizarConflitoController.
     */
    @Test
    public void testApagarConflito() {
        System.out.println("apagarConflito");
        FAE fae = null;
        Candidatura candidatura = null;
        TipoConflito tipoConflito = null;
        Conflito conf = new Conflito();
        Exposicao e = new Exposicao();
        CentroExposicoes centroExposicoes = new CentroExposicoes();
        AtualizarConflitoController instance = new AtualizarConflitoController(centroExposicoes);
        centroExposicoes.getRegistoExposicoes().getListaExposicoes().add(e);
        e.getListaFAE().getListaFAE().add(new FAE
        (new Utilizador("Nome","Teste","000","email@email.com","Gestor de projetos da Google")));
        instance.selectExposicao(e);
        instance.getListaConflitos();
        instance.getConflitos();
        instance.getConflitos().add(conf);
        instance.selectConflito(conf);
        instance.getDadosConflito();
        instance.setConflito(fae, candidatura, tipoConflito);
        instance.apagarConflito();
    }

    /**
     * Test of registaAlteracoes method, of class AtualizarConflitoController.
     */
    @Test
    public void testRegistaAlteracoes() {
        System.out.println("registaAlteracoes");
        FAE fae = null;
        Candidatura candidatura = null;
        TipoConflito tipoConflito = null;
        Conflito conf = new Conflito();
        Exposicao e = new Exposicao();
        CentroExposicoes centroExposicoes = new CentroExposicoes();
        AtualizarConflitoController instance = new AtualizarConflitoController(centroExposicoes);
        centroExposicoes.getRegistoExposicoes().getListaExposicoes().add(e);
        e.getListaFAE().getListaFAE().add(new FAE
        (new Utilizador("Nome","Teste","000","email@email.com","Gestor de projetos da Google")));
        instance.selectExposicao(e);
        instance.getListaConflitos();
        instance.getConflitos();
        instance.getConflitos().add(conf);
        instance.selectConflito(conf);
        instance.getDadosConflito();
        instance.setConflito(fae, candidatura, tipoConflito);
        instance.registaAlteracoes();
    }
    
}
