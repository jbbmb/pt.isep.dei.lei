/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.ArrayList;
import java.util.List;
import lapr.project.model.Candidatura;
import lapr.project.model.CandidaturaDemonstracao;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Demonstracao;
import lapr.project.model.DemonstracaoEstadoCandidaturasAbertas;
import lapr.project.model.Exposicao;
import lapr.project.model.ExposicaoEstado;
import lapr.project.model.ExposicaoEstadoCandidaturasExposicaoAbertas;
import lapr.project.model.ExposicaoEstadoCandidaturasExposicaoFechadas;
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
 * @author Grupo 18
 */
public class AlterarCandidaturaControllerTest {
    
    public AlterarCandidaturaControllerTest() {
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
     * Test of getListaExposicoes method, of class AlterarCandidaturaController.
     */
    @Test
    public void testGetListaExposicoes() {
        System.out.println("getListaExposicoes");
        CentroExposicoes centro = new CentroExposicoes();
        String id = "TESTID"; 
        AlterarCandidaturaController instance = new AlterarCandidaturaController(centro, id);
        List<Exposicao> expResult = centro.getRegistoExposicoes().getListaExposicoes();
        List<Exposicao> result = instance.getListaExposicoes();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getListaProdutos method, of class AlterarCandidaturaController.
     */
    @Test
    public void testGetListaProdutos() {
        System.out.println("getListaProdutos");
        CentroExposicoes centro = new CentroExposicoes();
        String id = "TESTID"; 
        AlterarCandidaturaController instance = new AlterarCandidaturaController(centro, id);
        Exposicao exp = new Exposicao();
       exp.setEstadoExp(new ExposicaoEstadoCandidaturasExposicaoAbertas(exp));
        Candidatura cand = new CandidaturaExposicao();
        cand.setIdRepresentante(id);
        exp.getListaCandidaturas().getListaCandidaturas().add(cand);
        centro.getRegistoExposicoes().getListaExposicoes().add(exp);
        List<Produto> expResult = new ArrayList<Produto>();
        instance.selectExposicao(0);
        String[] info = instance.getCandidaturaExposicaoRepresentante();
        List<Produto> result = instance.getListaProdutos();
        assertEquals(expResult, result);
    }

    /**
     * Test of getListaDemonstracoes method, of class AlterarCandidaturaController.
     */
    @Test
    public void testGetListaDemonstracoes() {
        System.out.println("getListaDemonstracoes");
        CentroExposicoes centro = new CentroExposicoes();
        String id = "TESTID"; 
        AlterarCandidaturaController instance = new AlterarCandidaturaController(centro, id);
        Exposicao exp = new Exposicao();
        exp.setEstadoExp(new ExposicaoEstadoCandidaturasExposicaoFechadas(exp));
        Demonstracao dem = new Demonstracao();
        dem.setEstado(new DemonstracaoEstadoCandidaturasAbertas(dem));
        exp.getListaDemonstracoes().getListaDemonstracoes().add(dem);
        centro.getRegistoExposicoes().getListaExposicoes().add(exp);
        instance.selectExposicao(0);
        List<Demonstracao> expResult = exp.getListaDemonstracoes().getListaDemonstracoes();
        List<Demonstracao> result = instance.getListaDemonstracoes();
        assertEquals(expResult, result);
    }

    /**
     * Test of getListaDemonstracoesCandidatura method, of class AlterarCandidaturaController.
     */
    @Test
    public void testGetListaDemonstracoesCandidatura() {
        System.out.println("getListaDemonstracoesCandidatura");
        CentroExposicoes centro = new CentroExposicoes();
        String id = "TESTID"; 
        AlterarCandidaturaController instance = new AlterarCandidaturaController(centro, id);
        Exposicao exp = new Exposicao();
        exp.setEstadoExp(new ExposicaoEstadoCandidaturasExposicaoAbertas(exp));
        ListaDemonstracoes listaDemonstracoes = new ListaDemonstracoes();
        listaDemonstracoes.addDemonstracao(new Demonstracao("codigoTest", "descricaoTest"));
        CandidaturaExposicao cand = new CandidaturaExposicao();
        cand.setIdRepresentante(id);
        cand.setListaDemonstracoes(listaDemonstracoes);
        exp.getListaCandidaturas().getListaCandidaturas().add(cand);
        centro.getRegistoExposicoes().getListaExposicoes().add(exp);
        instance.selectExposicao(0);
        instance.getCandidaturaExposicaoRepresentante();
        List<Demonstracao> expResult = listaDemonstracoes.getListaDemonstracoes();
        List<Demonstracao> result = instance.getListaDemonstracoesCandidatura();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getCandidaturaExposicaoRepresentante method, of class AlterarCandidaturaController.
     */
    @Test
    public void testGetCandidaturaExposicaoRepresentante() {
        System.out.println("getCandidaturaExposicaoRepresentante");
        CentroExposicoes centro = new CentroExposicoes();
        String id = "TESTID"; 
        AlterarCandidaturaController instance = new AlterarCandidaturaController(centro, id);
        Exposicao exp = new Exposicao();
        exp.setEstadoExp(new ExposicaoEstadoCandidaturasExposicaoAbertas(exp));
        ListaProdutos listaProdutos = new ListaProdutos();
        listaProdutos.addProduto(new Produto("Sapatos"));
        ListaDemonstracoes listaDemonstracoes = new ListaDemonstracoes();
        listaDemonstracoes.addDemonstracao(new Demonstracao("codigoTest", "descricaoTest"));
        Candidatura cand = new CandidaturaExposicao("nomeEmpesaTest", "moradaTest", "910000000", 200,1000, "caracterizacaoTest", listaProdutos, listaDemonstracoes, id);
        exp.getListaCandidaturas().getListaCandidaturas().add(cand);
        centro.getRegistoExposicoes().getListaExposicoes().add(exp);
        instance.selectExposicao(0);
         String[] expResult = new String[]{"nomeEmpesaTest", "moradaTest", "910000000", String.valueOf(200), String.valueOf(1000), "caracterizacaoTest"};
        String[] result = instance.getCandidaturaExposicaoRepresentante();
        assertArrayEquals(expResult, result);
        
    }

    /**
     * Test of getCandidaturaDemonstracaoRepresentante method, of class AlterarCandidaturaController.
     */
    @Test
    public void testGetCandidaturaDemonstracaoRepresentante() {
        System.out.println("getCandidaturaDemonstracaoRepresentante");
        CentroExposicoes centro = new CentroExposicoes();
        String id = "TESTID"; 
        AlterarCandidaturaController instance = new AlterarCandidaturaController(centro, id);
        Exposicao exp = new Exposicao();
        exp.setEstadoExp(new ExposicaoEstadoCandidaturasExposicaoFechadas(exp));
        Candidatura cand = new CandidaturaDemonstracao("descricaoTest", id);
        Demonstracao dem = new Demonstracao();
        dem.getListaCandidaturas().addCandidaturaDemonstracao((CandidaturaDemonstracao) cand);
        exp.getListaDemonstracoes().addDemonstracao(dem);
        centro.getRegistoExposicoes().getListaExposicoes().add(exp);
        instance.selectExposicao(0);
        instance.selectDemonstracao(0);
        String expResult = "descricaoTest";
        String result = instance.getCandidaturaDemonstracaoRepresentante();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of selectExposicao method, of class AlterarCandidaturaController.
     */
    @Test
    public void testSelectExposicao() {
        System.out.println("selectExposicao");
        int indexExposicao = 0;
        CentroExposicoes centro = new CentroExposicoes();
        String id = "TESTID";
        AlterarCandidaturaController instance = new AlterarCandidaturaController(centro, id);
        Exposicao exp = new Exposicao();
        exp.setEstadoExp(new ExposicaoEstadoCandidaturasExposicaoAbertas(exp));
        centro.getRegistoExposicoes().getListaExposicoes().add(exp);
        ExposicaoEstado expResult = exp.getEstadoExp();
        ExposicaoEstado result = instance.selectExposicao(indexExposicao);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of selectDemonstracao method, of class AlterarCandidaturaController.
     */
    @Test
    public void testSelectDemonstracao() {
        System.out.println("selectDemonstracao");
        int indexDemonstracao = 0;
        CentroExposicoes centro = new CentroExposicoes();
        String id = "TESTID"; 
        AlterarCandidaturaController instance = new AlterarCandidaturaController(centro, id);
        Exposicao exp = new Exposicao();
        exp.setEstadoExp(new ExposicaoEstadoCandidaturasExposicaoAbertas(exp));
        Demonstracao dem = new Demonstracao();
        exp.getListaDemonstracoes().getListaDemonstracoes().add(dem);
        centro.getRegistoExposicoes().getListaExposicoes().add(exp);
        instance.selectExposicao(indexDemonstracao);
        instance.selectDemonstracao(indexDemonstracao);
        
    }

    /**
     * Test of adicionarProduto method, of class AlterarCandidaturaController.
     */
    @Test
    public void testAdicionarProduto() {
        System.out.println("adicionarProduto");
        String descricao = "";
        CentroExposicoes centro = new CentroExposicoes();
        String id = "TESTID"; 
        AlterarCandidaturaController instance = new AlterarCandidaturaController(centro, id);
        Exposicao exp = new Exposicao();
       exp.setEstadoExp(new ExposicaoEstadoCandidaturasExposicaoAbertas(exp));
        Candidatura cand = new CandidaturaExposicao();
        cand.setIdRepresentante(id);
        exp.getListaCandidaturas().getListaCandidaturas().add(cand);
        centro.getRegistoExposicoes().getListaExposicoes().add(exp);
        instance.selectExposicao(0);
        instance.getCandidaturaExposicaoRepresentante();
        List<Produto>listaProdutos = new ArrayList<>();
        listaProdutos.add(new Produto("sapatos"));
        instance.adicionarProduto(descricao);
        
    }

    /**
     * Test of removerProduto method, of class AlterarCandidaturaController.
     */
    @Test
    public void testRemoverProduto() {
        System.out.println("removerProduto");
        int indexProduto = 0;
        System.out.println("adicionarProduto");
        String descricao = "";
        CentroExposicoes centro = new CentroExposicoes();
        String id = "TESTID"; 
        AlterarCandidaturaController instance = new AlterarCandidaturaController(centro, id);
        Exposicao exp = new Exposicao();
        exp.setEstadoExp(new ExposicaoEstadoCandidaturasExposicaoAbertas(exp));
        Candidatura cand = new CandidaturaExposicao();
        cand.setIdRepresentante(id);
        exp.getListaCandidaturas().getListaCandidaturas().add(cand);
        centro.getRegistoExposicoes().getListaExposicoes().add(exp);
        instance.selectExposicao(0);
        instance.getCandidaturaExposicaoRepresentante();
        instance.adicionarProduto("Sapatos");
        instance.removerProduto(indexProduto);
        
    }

    /**
     * Test of adicionarDemonstracaoCandidatura method, of class AlterarCandidaturaController.
     */
    @Test
    public void testAdicionarDemonstracaoCandidatura() {
        System.out.println("adicionarDemonstracaoCandidatura");
        int indexDemonstracao = 0;
        CentroExposicoes centro = new CentroExposicoes();
        String id = "TESTID"; 
        AlterarCandidaturaController instance = new AlterarCandidaturaController(centro, id);
        Exposicao exp = new Exposicao();
        exp.setEstadoExp(new ExposicaoEstadoCandidaturasExposicaoAbertas(exp));
        Candidatura cand = new CandidaturaExposicao();
        cand.setIdRepresentante(id);
        Demonstracao dem = new Demonstracao();
        exp.getListaDemonstracoes().addDemonstracao(dem);
        exp.getListaCandidaturas().getListaCandidaturas().add(cand);
        centro.getRegistoExposicoes().getListaExposicoes().add(exp);
        instance.selectExposicao(0);
        instance.getCandidaturaExposicaoRepresentante();
        instance.getListaDemonstracoesCandidatura();
        instance.adicionarDemonstracaoCandidatura(indexDemonstracao);
    }

    /**
     * Test of removerDemonstracaoCandidatura method, of class AlterarCandidaturaController.
     */
    @Test
    public void testRemoverDemonstracaoCandidatura() {
        System.out.println("removerDemonstracaoCandidatura");
        int indexDemonstracao = 0;
        CentroExposicoes centro = new CentroExposicoes();
        String id = "TESTID"; 
        AlterarCandidaturaController instance = new AlterarCandidaturaController(centro, id);
        Exposicao exp = new Exposicao();
        exp.setEstadoExp(new ExposicaoEstadoCandidaturasExposicaoAbertas(exp));
        Candidatura cand = new CandidaturaExposicao();
        cand.setIdRepresentante(id);
        Demonstracao dem = new Demonstracao();
        exp.getListaDemonstracoes().addDemonstracao(dem);
        exp.getListaCandidaturas().getListaCandidaturas().add(cand);
        centro.getRegistoExposicoes().getListaExposicoes().add(exp);
        instance.selectExposicao(0);
        instance.getCandidaturaExposicaoRepresentante();
        instance.getListaDemonstracoesCandidatura();
        instance.adicionarDemonstracaoCandidatura(indexDemonstracao);
        instance.removerDemonstracaoCandidatura(indexDemonstracao);
        
    }

    /**
     * Test of alterarCandidaturaExposicao method, of class AlterarCandidaturaController.
     */
    @Test
    public void testAlterarCandidaturaExposicao() {
        System.out.println("alterarCandidaturaExposicao");
        CentroExposicoes centro = new CentroExposicoes();
        String id = "TESTID"; 
        AlterarCandidaturaController instance = new AlterarCandidaturaController(centro, id);
        Exposicao exp = new Exposicao();
        exp.setEstadoExp(new ExposicaoEstadoCandidaturasExposicaoAbertas(exp));
        ListaProdutos listaProdutos = new ListaProdutos();
        listaProdutos.addProduto(new Produto("Sapatos"));
        ListaDemonstracoes listaDemonstracoes = new ListaDemonstracoes();
        listaDemonstracoes.addDemonstracao(new Demonstracao("codigoTest", "descricaoTest"));
        Candidatura cand = new CandidaturaExposicao("nomeEmpesaTest", "moradaTest", "910000000", 200,1000, "caracterizacaoTest", listaProdutos, listaDemonstracoes, id);
        exp.getListaCandidaturas().getListaCandidaturas().add(cand);
        centro.getRegistoExposicoes().getListaExposicoes().add(exp);
        instance.selectExposicao(0);
        instance.getCandidaturaExposicaoRepresentante();
        String[] info = new String[]{"nomeEmpesaTest", "moradaTest", "910000000", String.valueOf(200), String.valueOf(10000), "caracterizacaoTest"};
        boolean expResult = true;
        boolean result = instance.alterarCandidaturaExposicao(info);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of alterarCandidaturaDemonstracao method, of class AlterarCandidaturaController.
     */
    @Test
    public void testAlterarCandidaturaDemonstracao() {
        System.out.println("alterarCandidaturaDemonstracao");
        String info = "";
        CentroExposicoes centro = new CentroExposicoes();
        String id = "TESTID"; 
        AlterarCandidaturaController instance = new AlterarCandidaturaController(centro, id);
        Exposicao exp = new Exposicao();
        exp.setEstadoExp(new ExposicaoEstadoCandidaturasExposicaoFechadas(exp));
        Candidatura cand = new CandidaturaDemonstracao("descricaoTest", id);
        Demonstracao dem = new Demonstracao();
        dem.getListaCandidaturas().addCandidaturaDemonstracao((CandidaturaDemonstracao) cand);
        exp.getListaDemonstracoes().addDemonstracao(dem);
        centro.getRegistoExposicoes().getListaExposicoes().add(exp);
        instance.selectExposicao(0);
        instance.selectDemonstracao(0);
        instance.getCandidaturaDemonstracaoRepresentante();
        boolean expResult = true;
        boolean result = instance.alterarCandidaturaDemonstracao("novaInfoTest");
        assertEquals(expResult, result);
        
    }

    /**
     * Test of registaAlteracaoCandidaturaExposicao method, of class AlterarCandidaturaController.
     */
    @Test
    public void testRegistaAlteracaoCandidaturaExposicao() {
        System.out.println("registaAlteracaoCandidaturaExposicao");
        CentroExposicoes centro = new CentroExposicoes();
        String id = "TESTID"; 
        AlterarCandidaturaController instance = new AlterarCandidaturaController(centro, id);
        Exposicao exp = new Exposicao();
        exp.setEstadoExp(new ExposicaoEstadoCandidaturasExposicaoAbertas(exp));
        ListaProdutos listaProdutos = new ListaProdutos();
        listaProdutos.addProduto(new Produto("Sapatos"));
        ListaDemonstracoes listaDemonstracoes = new ListaDemonstracoes();
        listaDemonstracoes.addDemonstracao(new Demonstracao("codigoTest", "descricaoTest"));
        Candidatura cand = new CandidaturaExposicao("nomeEmpesaTest", "moradaTest", "910000000", 200,1000, "caracterizacaoTest", listaProdutos, listaDemonstracoes, id);
        exp.getListaCandidaturas().getListaCandidaturas().add(cand);
        centro.getRegistoExposicoes().getListaExposicoes().add(exp);
        instance.selectExposicao(0);
        instance.getCandidaturaExposicaoRepresentante();
        String[] info = new String[]{"nomeEmpesaTest", "moradaTest", "910000000", String.valueOf(200), String.valueOf(10000), "caracterizacaoTest"};
        instance.alterarCandidaturaExposicao(info);
        instance.registaAlteracaoCandidaturaExposicao();
        
    }

    /**
     * Test of registaAlteracaoCandidaturaDemonstracao method, of class AlterarCandidaturaController.
     */
    @Test
    public void testRegistaAlteracaoCandidaturaDemonstracao() {
        System.out.println("registaAlteracaoCandidaturaDemonstracao");
        CentroExposicoes centro = new CentroExposicoes();
        String id = "TESTID"; 
        AlterarCandidaturaController instance = new AlterarCandidaturaController(centro, id);
        Exposicao exp = new Exposicao();
        exp.setEstadoExp(new ExposicaoEstadoCandidaturasExposicaoFechadas(exp));
        Candidatura cand = new CandidaturaDemonstracao("descricaoTest", id);
        Demonstracao dem = new Demonstracao();
        dem.getListaCandidaturas().addCandidaturaDemonstracao((CandidaturaDemonstracao) cand);
        exp.getListaDemonstracoes().addDemonstracao(dem);
        centro.getRegistoExposicoes().getListaExposicoes().add(exp);
        instance.selectExposicao(0);
        instance.selectDemonstracao(0);
        instance.getCandidaturaDemonstracaoRepresentante();
        instance.alterarCandidaturaDemonstracao("novaInfoTest");
        instance.validarAlteracoesCandidaturaDemonstracao();
        instance.registaAlteracaoCandidaturaDemonstracao();
        
    }

    /**
     * Test of validarAlteracoesCandidaturaExposicao method, of class AlterarCandidaturaController.
     */
    @Test
    public void testValidarAlteracoesCandidaturaExposicao() {
        System.out.println("validarAlteracoesCandidaturaExposicao");
       CentroExposicoes centro = new CentroExposicoes();
        String id = "TESTID"; 
        AlterarCandidaturaController instance = new AlterarCandidaturaController(centro, id);
        Exposicao exp = new Exposicao();
        exp.setEstadoExp(new ExposicaoEstadoCandidaturasExposicaoAbertas(exp));
        ListaProdutos listaProdutos = new ListaProdutos();
        listaProdutos.addProduto(new Produto("Sapatos"));
        ListaDemonstracoes listaDemonstracoes = new ListaDemonstracoes();
        listaDemonstracoes.addDemonstracao(new Demonstracao("codigoTest", "descricaoTest"));
        Candidatura cand = new CandidaturaExposicao("nomeEmpesaTest", "moradaTest", "910000000", 200,1000, "caracterizacaoTest", listaProdutos, listaDemonstracoes, id);
        exp.getListaCandidaturas().getListaCandidaturas().add(cand);
        centro.getRegistoExposicoes().getListaExposicoes().add(exp);
        instance.selectExposicao(0);
        instance.getCandidaturaExposicaoRepresentante();
        String[] info = new String[]{"nomeEmpesaTest", "moradaTest", "910000000", String.valueOf(200), String.valueOf(10000), "caracterizacaoTest"};
        instance.alterarCandidaturaExposicao(info);
        boolean expResult = true;
        boolean result = instance.validarAlteracoesCandidaturaExposicao();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of validarAlteracoesCandidaturaDemonstracao method, of class AlterarCandidaturaController.
     */
    @Test
    public void testValidarAlteracoesCandidaturaDemonstracao() {
        System.out.println("validarAlteracoesCandidaturaDemonstracao");
       CentroExposicoes centro = new CentroExposicoes();
        String id = "TESTID"; 
        AlterarCandidaturaController instance = new AlterarCandidaturaController(centro, id);
        Exposicao exp = new Exposicao();
        exp.setEstadoExp(new ExposicaoEstadoCandidaturasExposicaoFechadas(exp));
        Candidatura cand = new CandidaturaDemonstracao("descricaoTest", id);
        Demonstracao dem = new Demonstracao();
        dem.getListaCandidaturas().addCandidaturaDemonstracao((CandidaturaDemonstracao) cand);
        exp.getListaDemonstracoes().addDemonstracao(dem);
        centro.getRegistoExposicoes().getListaExposicoes().add(exp);
        instance.selectExposicao(0);
        instance.selectDemonstracao(0);
        instance.getCandidaturaDemonstracaoRepresentante();
        instance.alterarCandidaturaDemonstracao("novaInfoTest");
        boolean expResult = true;
        boolean result = instance.validarAlteracoesCandidaturaDemonstracao();
        assertEquals(expResult, result);
        
    }
    
}
