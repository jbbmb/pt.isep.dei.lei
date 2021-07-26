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
public class AtribuicaoTest {

    public AtribuicaoTest() {
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
     * Test of getFAE method, of class Atribuicao.
     */
    @Test
    public void testGetFAE() {
        System.out.println("getFAE");
        Atribuicao instance = new Atribuicao(new FAE(), new CandidaturaExposicao());
        FAE expResult = instance.getFAE();
        FAE result = instance.getFAE();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFAE method, of class Atribuicao.
     */
    @Test
    public void testSetFAE() {
        System.out.println("setFAE");
        FAE fae = new FAE();
        Atribuicao instance = new Atribuicao(fae, new CandidaturaExposicao());
        instance.setFAE(fae);
    }

    /**
     * Test of getCandidatura method, of class Atribuicao.
     */
    @Test
    public void testGetCandidatura() {
        System.out.println("getCandidatura");
        Atribuicao instance = new Atribuicao(new FAE(), new CandidaturaExposicao());
        Candidatura expResult = instance.getCandidatura();
        Candidatura result = instance.getCandidatura();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCANDIDATURA method, of class Atribuicao.
     */
    @Test
    public void testSetCANDIDATURA() {
        System.out.println("setCANDIDATURA");
        Candidatura candidatura = new CandidaturaExposicao();
        Atribuicao instance = new Atribuicao(new FAE(), candidatura);
        instance.setCANDIDATURA(candidatura);
    }

    /**
     * Test of toString method, of class Atribuicao.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        FAE fae = new FAE();
        Candidatura cand = new CandidaturaExposicao();
        Atribuicao instance = new Atribuicao(fae, cand);
        String expResult = cand+ "----" + fae;
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Atribuicao.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Atribuicao instance = new Atribuicao(new FAE(), new CandidaturaExposicao());
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }

}
