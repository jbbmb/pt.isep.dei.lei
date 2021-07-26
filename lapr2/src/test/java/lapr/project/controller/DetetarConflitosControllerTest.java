/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import lapr.project.model.Candidatura;
import lapr.project.model.CandidaturaExposicao;
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
public class DetetarConflitosControllerTest {
    
    public DetetarConflitosControllerTest() {
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
     * Test of getListaTiposConflito method, of class DetetarConflitosController.
     */
    @Test
    public void testGetListaTiposConflito() {
        System.out.println("getListaTiposConflito");
        CentroExposicoes centroExposicoes = new CentroExposicoes();
        Exposicao expo = new Exposicao();
        centroExposicoes.getRegistoExposicoes().getListaExposicoes().add(expo);
        DetetarConflitosController instance = new DetetarConflitosController(centroExposicoes, expo);
        instance.getListaTiposConflito();
    }

    /**
     * Test of getMecanismosDetecaoConflito method, of class DetetarConflitosController.
     */
    @Test
    public void testGetMecanismosDetecaoConflito() {
        System.out.println("getMecanismosDetecaoConflito");
        CentroExposicoes centroExposicoes = new CentroExposicoes();
        Exposicao expo = new Exposicao();
        centroExposicoes.getRegistoExposicoes().getListaExposicoes().add(expo);
        DetetarConflitosController instance = new DetetarConflitosController(centroExposicoes, expo);
        instance.getListaTiposConflito();
        instance.getListaTiposConflito().getListaTipoConf();
        instance.getMecanismosDetecaoConflito();
        
    }

    /**
     * Test of detetarConflitos method, of class DetetarConflitosController.
     */
    @Test
    public void testDetetarConflitos() {
        System.out.println("detetarConflitos");
        CentroExposicoes centroExposicoes = new CentroExposicoes();
        Exposicao expo = new Exposicao();
        centroExposicoes.getRegistoExposicoes().getListaExposicoes().add(expo);
        DetetarConflitosController instance = new DetetarConflitosController(centroExposicoes, expo);
        instance.getListaTiposConflito();
        instance.getListaTiposConflito().getListaTipoConf();
        Utilizador u = new Utilizador("Nome","Teste","000","email@email.com","Gestor de projetos da Google");
        Candidatura cand = new CandidaturaExposicao();
        FAE f = new FAE (u);
        expo.getListaFAE().getListaFAE().add(f);
        cand.setIdRepresentante(u.getUsername());
        expo.getListaCandidaturas().getListaCandidaturas().add(cand);
        instance.getMecanismosDetecaoConflito();
        instance.detetarConflitos();
        
    }

    /**
     * Test of run method, of class DetetarConflitosController.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        CentroExposicoes centroExposicoes = new CentroExposicoes();
        Exposicao expo = new Exposicao();
        centroExposicoes.getRegistoExposicoes().getListaExposicoes().add(expo);
        DetetarConflitosController instance = new DetetarConflitosController(centroExposicoes, expo);
        instance.getListaTiposConflito();
        instance.getListaTiposConflito().getListaTipoConf();
        Utilizador u = new Utilizador("Nome","Teste","000","email@email.com","Gestor de projetos da Google");
        Candidatura cand = new CandidaturaExposicao();
        FAE f = new FAE (u);
        expo.getListaFAE().getListaFAE().add(f);
        cand.setIdRepresentante(u.getUsername());
        expo.getListaCandidaturas().getListaCandidaturas().add(cand);
        instance.getMecanismosDetecaoConflito();
        instance.detetarConflitos();
        instance.run();
    }
    
}
