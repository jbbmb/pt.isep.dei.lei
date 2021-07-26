/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

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
public class AvaliacaoTest {
    
    public AvaliacaoTest() {
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
     * Test of getIdFAE method, of class Avaliacao.
     */
    @Test
    public void testGetIdFAE() {
        System.out.println("getIdFAE");
        Avaliacao instance = new Avaliacao("teste");
        String expResult = "teste";
        String result = instance.getIdFAE();
        assertEquals(expResult, result);
    }

    /**
     * Test of setIdFAE method, of class Avaliacao.
     */
    @Test
    public void testSetIdFAE() {
        System.out.println("setIdFAE");
        String idFAE = "";
        Avaliacao instance = new Avaliacao("");
        instance.setIdFAE(idFAE);
    }

    /**
     * Test of getConhecimentoFAE method, of class Avaliacao.
     */
    @Test
    public void testGetConhecimentoFAE() {
        System.out.println("getConhecimentoFAE");
        Avaliacao instance = new Avaliacao("", "1", "", "", "", "");
        String expResult = "1";
        String result = instance.getConhecimentoFAE();
        assertEquals(expResult, result);
    }

    /**
     * Test of setConhecimentoFAE method, of class Avaliacao.
     */
    @Test
    public void testSetConhecimentoFAE() {
        System.out.println("setConhecimentoFAE");
        String conhecimentoFAE = "";
        Avaliacao instance = new Avaliacao("", "1", "", "", "", "");
        instance.setConhecimentoFAE(conhecimentoFAE);
    }

    /**
     * Test of getAdequacaoExposicao method, of class Avaliacao.
     */
    @Test
    public void testGetAdequacaoExposicao() {
        System.out.println("getAdequacaoExposicao");
        Avaliacao instance = new Avaliacao("", "1", "2", "", "", "");
        String expResult = "2";
        String result = instance.getAdequacaoExposicao();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAdequacaoExposicao method, of class Avaliacao.
     */
    @Test
    public void testSetAdequacaoExposicao() {
        System.out.println("setAdequacaoExposicao");
        String adequacaoExposicao = "";
        Avaliacao instance = new Avaliacao("", "1", "2", "", "", "");
        instance.setAdequacaoExposicao(adequacaoExposicao);
    }

    /**
     * Test of getAdequacaoDemonstracoes method, of class Avaliacao.
     */
    @Test
    public void testGetAdequacaoDemonstracoes() {
        System.out.println("getAdequacaoDemonstracoes");
        Avaliacao instance = new Avaliacao("", "1", "2", "3", "", "");
        String expResult = "3";
        String result = instance.getAdequacaoDemonstracoes();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAdequacaoDemonstracoes method, of class Avaliacao.
     */
    @Test
    public void testSetAdequacaoDemonstracoes() {
        System.out.println("setAdequacaoDemonstracoes");
        String adequacaoDemonstracoes = "";
        Avaliacao instance = new Avaliacao("", "1", "2", "", "", "");
        instance.setAdequacaoDemonstracoes(adequacaoDemonstracoes);
    }

    /**
     * Test of getAdequacaoConvites method, of class Avaliacao.
     */
    @Test
    public void testGetAdequacaoConvites() {
        System.out.println("getAdequacaoConvites");
        Avaliacao instance = new Avaliacao("", "1", "2", "", "4", "");
        String expResult = "4";
        String result = instance.getAdequacaoConvites();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAdequacaoConvites method, of class Avaliacao.
     */
    @Test
    public void testSetAdequacaoConvites() {
        System.out.println("setAdequacaoConvites");
        String adequacaoConvites = "";
        Avaliacao instance = new Avaliacao("", "1", "2", "", "", "");
        instance.setAdequacaoConvites(adequacaoConvites);
    }

    /**
     * Test of getRecomendacao method, of class Avaliacao.
     */
    @Test
    public void testGetRecomendacao() {
        System.out.println("getRecomendacao");
        Avaliacao instance = new Avaliacao("", "1", "2", "", "", "5");
        String expResult = "5";
        String result = instance.getRecomendacao();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRecomendacao method, of class Avaliacao.
     */
    @Test
    public void testSetRecomendacao() {
        System.out.println("setRecomendacao");
        String recomendacao = "";
        Avaliacao instance = new Avaliacao("", "1", "2", "", "", "");
        instance.setRecomendacao(recomendacao);
    }

    /**
     * Test of validarRespostas method, of class Avaliacao.
     */
    @Test
    public void testValidarRespostas() {
        System.out.println("validarRespostas");
        Avaliacao instance = new Avaliacao("teste");
        boolean expResult = false;
        boolean result = instance.validarRespostas();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Avaliacao.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Avaliacao instance = new Avaliacao("teste", "1", "2", "3", "4", "5");
        String expResult = "Avaliacao feita pelo utilizador FAE " + "teste" + ":\n"
                + "\nConhecimento do FAE sobre o tema da exposição: " + "1"
                + "\nAdequação da candidatura à exposição: " + "2" 
                + "\nAdequação da candidatura às demonstrações: " + "3" 
                + "\nAdequação do número de convites por candidatura: " + "4" 
                + "\nRecomendação global: " + "5";;
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
