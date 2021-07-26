/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.ListaDemonstracoes;
import lapr.project.model.ListaProdutos;
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
public class CriarCandidaturaExposicaoControllerTest {
    
    public CriarCandidaturaExposicaoControllerTest() {
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
     * CriarCandidaturaExposicaoController.
     */
    @Test
    public void testGetListaExposicoes() {
        CentroExposicoes centro = new CentroExposicoes();
        System.out.println("getListaExposicoes");
        CriarCandidaturaExposicaoController instance
                = new CriarCandidaturaExposicaoController(centro, "Teste");
        List<Exposicao> expResult = instance.getListaExposicoes();
        List<Exposicao> result = instance.getListaExposicoes();
    }

    /**
     * Test of novaCandidatura method, of class
     * CriarCandidaturaExposicaoController.
     */
    @Test
    public void testNovaCandidatura() {
        System.out.println("novaCandidatura");
        CentroExposicoes centro = new CentroExposicoes();
        String user = "Teste";
        Exposicao e = new Exposicao();
        CriarCandidaturaExposicaoController instance
                = new CriarCandidaturaExposicaoController(centro, user);
        instance.getListaExposicoes();
        CandidaturaExposicao expResult = new CandidaturaExposicao();
        CandidaturaExposicao result = instance.novaCandidatura(e);
    }

    /**
     * Test of addProduto method, of class CriarCandidaturaExposicaoController.
     */
    @Test
    public void testAddProduto() {
        System.out.println("addProduto");
        CentroExposicoes centro = new CentroExposicoes();
        Exposicao e = new Exposicao();
        String user = "Teste";
        String caracterizacao = "";
        CriarCandidaturaExposicaoController instance
                = new CriarCandidaturaExposicaoController(centro, user);
        CandidaturaExposicao cand = new CandidaturaExposicao();
        instance.getListaExposicoes();
        instance.novaCandidatura(e);
        instance.addProduto(caracterizacao);
    }

    /**
     * Test of getListaDemonstracao method, of class
     * CriarCandidaturaExposicaoController.
     */
    @Test
    public void testGetListaDemonstracao() {
        System.out.println("getListaDemonstracao");
        CentroExposicoes centro = new CentroExposicoes();
        Exposicao exposicao = new Exposicao();
        String username = "Teste";
        CriarCandidaturaExposicaoController instance
                = new CriarCandidaturaExposicaoController(centro, username);
        instance.getListaExposicoes();
        instance.novaCandidatura(exposicao);
        ListaDemonstracoes expResult = instance.getListaDemonstracao();
        ListaDemonstracoes result = instance.getListaDemonstracao();
        assertEquals(expResult, result);
    }

    /**
     * Test of registaCandidatura method, of class
     * CriarCandidaturaExposicaoController.
     */
    @Test
    public void testRegistaCandidatura() {
        System.out.println("registaCandidatura");
        CentroExposicoes centro = new CentroExposicoes();
        Exposicao exposicao = new Exposicao();
        String username = "Teste";
        CriarCandidaturaExposicaoController instance
                = new CriarCandidaturaExposicaoController(centro, username);
        instance.novaCandidatura(exposicao);
        instance.registaCandidatura();
    }

    /**
     * Test of setDados method, of class CriarCandidaturaExposicaoController.
     */
    @Test
    public void testSetDados() {
        CentroExposicoes centro = new CentroExposicoes();
        Exposicao Exposicao = new Exposicao();
        String username = "Teste";
        System.out.println("setDados");
        String nomeEmpresa = "ISEP";
        String morada = "Rua";
        String contacto = "918897654";
        int area = 30;
        int numConvites = 50;
        String caracterizacao = "ola";
        CriarCandidaturaExposicaoController instance
                = new CriarCandidaturaExposicaoController(centro, username);
        instance.getListaExposicoes();
        instance.novaCandidatura(Exposicao);
        instance.setDados(nomeEmpresa, morada, contacto, area, numConvites,
                caracterizacao);
    }

    /**
     * Test of getListaProdutos method, of class
     * CriarCandidaturaExposicaoController.
     */
    @Test
    public void testGetListaProdutos() {
        System.out.println("getListaProdutos");
        CentroExposicoes centro = new CentroExposicoes();
        Exposicao exposicao = new Exposicao();
        String username = "Teste";
        CriarCandidaturaExposicaoController instance
                = new CriarCandidaturaExposicaoController(centro, username);
        instance.getListaExposicoes();
        instance.novaCandidatura(exposicao);
        ListaProdutos expResult = instance.getListaProdutos();
        ListaProdutos result = instance.getListaProdutos();
        assertEquals(expResult, result);
    }
    
    

    
}
