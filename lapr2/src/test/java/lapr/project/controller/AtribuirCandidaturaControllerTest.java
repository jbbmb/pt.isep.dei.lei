/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Demonstracao;
import lapr.project.model.DemonstracaoEstadoConflitosAlterados;
import lapr.project.model.Exposicao;
import lapr.project.model.ExposicaoEstado;
import lapr.project.model.ExposicaoEstadoConflitosAlterados;
import lapr.project.model.Mecanismo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author grupo18
 */
public class AtribuirCandidaturaControllerTest {

    public AtribuirCandidaturaControllerTest() {
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
     * Test of getListaExposicoesOrganizador method, of class
     * AtribuirCandidaturaController.
     */
    @Test
    public void testGetListaExposicoesOrganizador() {
        System.out.println("getListaExposicoesOrganizador");
        String username = "";
        CentroExposicoes centroExposicoes = new CentroExposicoes();
        AtribuirCandidaturaController instance = new AtribuirCandidaturaController(centroExposicoes);
        List<Exposicao> expResult = instance.getListaExposicoesOrganizador(username);
        List<Exposicao> result = instance.getListaExposicoesOrganizador(username);
        assertEquals(expResult, result);
    }

    /**
     * Test of verificarEstado method, of class AtribuirCandidaturaController.
     */
    @Test
    public void testVerificarEstado() {
        System.out.println("verificarEstado");
        CentroExposicoes centro = new CentroExposicoes();
        Exposicao exposicao = new Exposicao();
        exposicao.setEstadoExp(new ExposicaoEstadoConflitosAlterados(exposicao));
        AtribuirCandidaturaController instance = new AtribuirCandidaturaController(centro);
        ExposicaoEstado result = instance.verificarEstado(exposicao);
        assertTrue(result instanceof ExposicaoEstadoConflitosAlterados);
    }

    /**
     * Test of setMecanismo method, of class AtribuirCandidaturaController.
     */
    @Test
    public void testSetMecanismo0() {
        System.out.println("setMecanismo");
        Mecanismo mecanismo = new Mecanismo();
        CentroExposicoes centroExposicoes = new CentroExposicoes();
        AtribuirCandidaturaController instance = new AtribuirCandidaturaController(centroExposicoes);
        Exposicao exposicao = new Exposicao();
        instance.verificarEstado(exposicao);
        exposicao.setEstadoExp(new ExposicaoEstadoConflitosAlterados(exposicao));
        instance.setMecanismo(mecanismo);
    }

    /**
     * Test of setMecanismo method, of class AtribuirCandidaturaController.
     */
    @Test
    public void testSetMecanismo1() {
        System.out.println("setMecanismo");
        Mecanismo mecanismo = new Mecanismo();
        CentroExposicoes centroExposicoes = new CentroExposicoes();
        AtribuirCandidaturaController instance = new AtribuirCandidaturaController(centroExposicoes);
        Exposicao exposicao = new Exposicao();
        instance.verificarEstado(exposicao);
        Demonstracao demonstracao = new Demonstracao();
        instance.setDemonstracao(demonstracao);
        demonstracao.setEstado(new DemonstracaoEstadoConflitosAlterados(demonstracao));
        instance.setMecanismo(mecanismo);
    }

    /**
     * Test of getListaDemonstracoes method, of class
     * AtribuirCandidaturaController.
     */
    @Test
    public void testGetListaDemonstracoes() {
        System.out.println("getListaDemonstracoes");
        Exposicao exposicao = new Exposicao();
        CentroExposicoes centroExposicoes = new CentroExposicoes();
        AtribuirCandidaturaController instance = new AtribuirCandidaturaController(centroExposicoes);;
        List<Demonstracao> expResult = instance.getListaDemonstracoes(exposicao);
        List<Demonstracao> result = instance.getListaDemonstracoes(exposicao);
        assertEquals(expResult, result);
    }

    /**
     * Test of setDemonstracao method, of class AtribuirCandidaturaController.
     */
    @Test
    public void testSetDemonstracao() {
        System.out.println("setDemonstracao");
        Demonstracao demonstracao = new Demonstracao();
        CentroExposicoes centroExposicoes = new CentroExposicoes();
        AtribuirCandidaturaController instance = new AtribuirCandidaturaController(centroExposicoes);;
        instance.setDemonstracao(demonstracao);
    }

    /**
     * Test of registaAtribuicoesCandidatura method, of class
     * AtribuirCandidaturaController.
     */
    @Test
    public void testRegistaAtribuicoesCandidatura0() {
        System.out.println("registaAtribuicoesCandidatura");
        CentroExposicoes centroExposicoes = new CentroExposicoes();
        Mecanismo mecanismo = new Mecanismo();
        AtribuirCandidaturaController instance = new AtribuirCandidaturaController(centroExposicoes);;
        Exposicao exposicao = new Exposicao();
        instance.verificarEstado(exposicao);
        Demonstracao demonstracao = new Demonstracao();
        instance.setDemonstracao(demonstracao);
        demonstracao.setEstado(new DemonstracaoEstadoConflitosAlterados(demonstracao));
        instance.setMecanismo(mecanismo);
        instance.registaAtribuicoesCandidatura();
    }
    
    /**
     * Test of registaAtribuicoesCandidatura method, of class
     * AtribuirCandidaturaController.
     */
    @Test
    public void testRegistaAtribuicoesCandidatura1() {
        System.out.println("registaAtribuicoesCandidatura");
        CentroExposicoes centroExposicoes = new CentroExposicoes();
        Mecanismo mecanismo = new Mecanismo();
        AtribuirCandidaturaController instance = new AtribuirCandidaturaController(centroExposicoes);;
        Exposicao exposicao = new Exposicao();
        instance.verificarEstado(exposicao);
        exposicao.setEstadoExp(new ExposicaoEstadoConflitosAlterados(exposicao));
        instance.setMecanismo(mecanismo);
        instance.registaAtribuicoesCandidatura();
    }

}
