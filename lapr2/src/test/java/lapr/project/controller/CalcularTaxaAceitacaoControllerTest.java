/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.Date;
import java.util.List;
import lapr.project.model.Candidatura;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Demonstracao;
import lapr.project.model.Exposicao;
import lapr.project.model.ExposicaoEstadoCandidaturasExposicaoAbertas;
import lapr.project.model.ListaDemonstracoes;
import lapr.project.model.ListaProdutos;
import lapr.project.model.Produto;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Utilizador
 */
public class CalcularTaxaAceitacaoControllerTest {

    public CalcularTaxaAceitacaoControllerTest() {
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
     * CalcularTaxaAceitacaoController.
     */
    @Test
    public void testGetListaExposicoes() {
        CentroExposicoes ce = new CentroExposicoes();
        CalcularTaxaAceitacaoController instance = new CalcularTaxaAceitacaoController(ce);
        System.out.println("getListaExposicoes");
        List<Exposicao> expResult = ce.getRegistoExposicoes().getListaExposicoes();
        List<Exposicao> result = instance.getListaExposicoes();
        assertEquals(expResult, result);
    }

    /**
     * Test of getListaCandidaturas method, of class
     * CalcularTaxaAceitacaoController.
     */
    @Test
    public void testGetListaCandidaturas() {
        CentroExposicoes ce = new CentroExposicoes();
        CalcularTaxaAceitacaoController instance = new CalcularTaxaAceitacaoController(ce);
        Exposicao e = new Exposicao(ce, "Titulo", "Bem escrito", new Date(),
                new Date(), "Porto", new Date(), new Date(),
                new Date());
        System.out.println("getListaCandidaturas");
        List<Candidatura> expResult = e.getListaCandidaturas().getListaCandidaturas();
        List<Candidatura> result = instance.getListaCandidaturas(e);
        assertEquals(expResult, result);
    }

    /**
     * Test of obterDados method, of class CalcularTaxaAceitacaoController.
     */
    @Test
    public void testObterDados() {
       CentroExposicoes ce = new CentroExposicoes();
        CalcularTaxaAceitacaoController instance = new CalcularTaxaAceitacaoController(ce);
        Exposicao e = new Exposicao(ce, "Titulo", "Bem escrito", new Date(),
                new Date(), "Porto", new Date(), new Date(),
                new Date());
        ce.getRegistoExposicoes().getListaExposicoes().add(e);
        CandidaturaExposicao cand = new CandidaturaExposicao();
        instance.getListaCandidaturas(e);
        e.getListaCandidaturas().getListaCandidaturas().add(cand);
        System.out.println("obterDados");
        instance.obterDados();

    }

    /**
     * Test of calcularPercentagemDeAceitacao method, of class
     * CalcularTaxaAceitacaoController.
     */
    @Test
    public void testCalcularPercentagemDeAceitacao() {
        System.out.println("CalcularPercentagemDeAceitacao");
        CentroExposicoes ce = new CentroExposicoes();
        CalcularTaxaAceitacaoController instance = new CalcularTaxaAceitacaoController(ce);
        Exposicao e = new Exposicao(ce, "Titulo", "Bem escrito", new Date(),
                new Date(), "Porto", new Date(), new Date(),
                new Date());
        ce.getRegistoExposicoes().getListaExposicoes().add(e);
        CandidaturaExposicao cand = new CandidaturaExposicao();
        instance.getListaCandidaturas(e);
        e.getListaCandidaturas().getListaCandidaturas().add(cand);
        float expResult = 0.0F;
        float result = instance.calcularPercentagemDeAceitacao();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of candidaturasNaoAvaliadas method, of class
     * CalcularTaxaAceitacaoController.
     */
    @Test
    public void testCandidaturasNaoAvaliadas() {
        System.out.println("candidaturasNaoAvaliadas");
        CentroExposicoes ce = new CentroExposicoes();
        CalcularTaxaAceitacaoController instance = new CalcularTaxaAceitacaoController(ce);
        Exposicao e = new Exposicao(ce, "Titulo", "Bem escrito", new Date(),
                new Date(), "Porto", new Date(), new Date(),
                new Date());
        ce.getRegistoExposicoes().getListaExposicoes().add(e);
        Candidatura cand = new CandidaturaExposicao();
        instance.getListaCandidaturas(e);
        e.getListaCandidaturas().getCandidaturasNaoAvaliadas().add(cand);
        int expResult = e.getListaCandidaturas().getCandidaturasNaoAvaliadas().size();
        int result = instance.candidaturasNaoAvaliadas();
        assertEquals(expResult, result);
    }

    /**
     * Test of candidaturasRemovidas method, of class
     * CalcularTaxaAceitacaoController.
     */
    @Test
    public void testCandidaturasRemovidas() {
        System.out.println("candidaturasRemovidas");
        CentroExposicoes ce = new CentroExposicoes();
        CalcularTaxaAceitacaoController instance = new CalcularTaxaAceitacaoController(ce);
        Exposicao e = new Exposicao(ce, "Titulo", "Bem escrito", new Date(),
                new Date(), "Porto", new Date(), new Date(),
                new Date());
        ce.getRegistoExposicoes().getListaExposicoes().add(e);
        Candidatura cand = new CandidaturaExposicao();
        instance.getListaCandidaturas(e);
        e.getListaCandidaturas().getListaCandidaturasRemovidas().add(cand);
        int expResult = e.getListaCandidaturas().getListaCandidaturasRemovidas().size() ;
        int result = instance.candidaturasRemovidas();
        assertEquals(expResult, result);
    }

}
