/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.CandidaturaDemonstracao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Demonstracao;
import lapr.project.model.Exposicao;
import lapr.project.model.ListaCandidaturas;
import lapr.project.model.ListaDemonstracoes;
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
public class CriarCandidaturaDemonstracaoControllerTest {

    public CriarCandidaturaDemonstracaoControllerTest() {
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
     * Test of getListaExposicoes method, of class
     * CriarCandidaturaDemonstracaoController.
     */
    @Test
    public void testGetListaExposicoes() {
        System.out.println("getListaExposicoes");
        CentroExposicoes centro = new CentroExposicoes();
        CriarCandidaturaDemonstracaoController instance
                = new CriarCandidaturaDemonstracaoController(centro, "teste");
        List<Exposicao> expResult = instance.getListaExposicoes();
        List<Exposicao> result = instance.getListaExposicoes();
        assertEquals(expResult, result);
    }

    /**
     * Test of getListaDemonstracao method, of class
     * CriarCandidaturaDemonstracaoController.
     */
    @Test
    public void testGetListaDemonstracao() {
        System.out.println("getListaDemonstracao");
        CentroExposicoes centro = new CentroExposicoes();
        Demonstracao demonst = new Demonstracao();
        Exposicao expo = new Exposicao();
        CriarCandidaturaDemonstracaoController instance = new CriarCandidaturaDemonstracaoController(centro, "teste");
        instance.novaCandDemonstracao(demonst);
        ListaDemonstracoes expResult = instance.getListaDemonstracao(expo);
        ListaDemonstracoes result = instance.getListaDemonstracao(expo);
        assertEquals(expResult, result);
    }

    /**
     * Test of novaCandDemonstracao method, of class
     * CriarCandidaturaDemonstracaoController.
     */
    @Test
    public void testNovaCandDemonstracao() {
        System.out.println("novaCandDemonstracao");
        CentroExposicoes centro = new CentroExposicoes();
        Exposicao expo = new Exposicao();
        Demonstracao demonst = new Demonstracao();
        CriarCandidaturaDemonstracaoController instance = new CriarCandidaturaDemonstracaoController(centro, "teste");
        CandidaturaDemonstracao expResult = new CandidaturaDemonstracao();
        CandidaturaDemonstracao result = instance.novaCandDemonstracao(demonst);
    }

    /**
     * Test of setDados method, of class CriarCandidaturaDemonstracaoController.
     */
    @Test
    public void testSetDados() {
        System.out.println("setDados");
        String descricao = "";
        CentroExposicoes centro = new CentroExposicoes();
        Exposicao expo = new Exposicao();
        CriarCandidaturaDemonstracaoController instance = new CriarCandidaturaDemonstracaoController(centro, "teste");
        instance.novaCandDemonstracao(new Demonstracao());
        instance.setDados(descricao);
    }

    /**
     * Test of registaCandidatura method, of class
     * CriarCandidaturaDemonstracaoController.
     */
    @Test
    public void testRegistaCandidatura() {
        System.out.println("registaCandidatura");
        CentroExposicoes centro = new CentroExposicoes();
        Exposicao expo = new Exposicao();
        Demonstracao demonst = new Demonstracao();
        CriarCandidaturaDemonstracaoController instance
                = new CriarCandidaturaDemonstracaoController(centro, "teste");
        instance.getListaExposicoes().add(expo);
        instance.novaCandDemonstracao(demonst);
        instance.getListaCandidaturaDemonstracao();
        instance.registaCandidatura();
    }

    /**
     * Test of getListaCandidaturaDemonstracao method, of class
     * CriarCandidaturaDemonstracaoController.
     */
    @Test
    public void testGetListaCandidaturaDemonstracao() {
        System.out.println("getListaCandidaturaDemonstracao");
        CentroExposicoes centro = new CentroExposicoes();
        Demonstracao demonstracao = new Demonstracao();
        CriarCandidaturaDemonstracaoController instance
                = new CriarCandidaturaDemonstracaoController(centro, "teste");
        instance.novaCandDemonstracao(demonstracao);
        ListaCandidaturas expResult = instance.getListaCandidaturaDemonstracao();
        ListaCandidaturas result = instance.getListaCandidaturaDemonstracao();
        assertEquals(expResult, result);
    }

    /**
     * Test of setListaCandidaturaDemonstracao method, of class
     * CriarCandidaturaDemonstracaoController.
     */
    @Test
    public void testSetListaCandidaturaDemonstracao() {
        System.out.println("setListaCandidaturaDemonstracao");
        CentroExposicoes centro = new CentroExposicoes();
        Demonstracao demonstracao = new Demonstracao();
        ListaCandidaturas listaCandidaturaDemonstracao = new ListaCandidaturas();
        CriarCandidaturaDemonstracaoController instance
                = new CriarCandidaturaDemonstracaoController(centro, "teste");
        instance.novaCandDemonstracao(demonstracao);
        instance.setListaCandidaturaDemonstracao(listaCandidaturaDemonstracao);

    }

}
