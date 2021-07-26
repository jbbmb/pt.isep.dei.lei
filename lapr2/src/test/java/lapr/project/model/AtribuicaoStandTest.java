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
public class AtribuicaoStandTest {

    public AtribuicaoStandTest() {
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
     * Test of getCandidatura method, of class AtribuicaoStand.
     */
    @Test
    public void testGetCandidatura() {
        System.out.println("getCandidatura");
        AtribuicaoStand instance = new AtribuicaoStand();
        Candidatura expResult = null;
        Candidatura result = instance.getCandidatura();
        assertEquals(expResult, result);
    }

    /**
     * Test of getStand method, of class AtribuicaoStand.
     */
    @Test
    public void testGetStand() {
        System.out.println("getStand");
        AtribuicaoStand instance = new AtribuicaoStand();
        Stand expResult = null;
        Stand result = instance.getStand();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCandidatura method, of class AtribuicaoStand.
     */
    @Test
    public void testSetCandidatura() {
        System.out.println("setCandidatura");
        Candidatura candidatura = null;
        AtribuicaoStand instance = new AtribuicaoStand();
        instance.setCandidatura(candidatura);
    }

    /**
     * Test of setStand method, of class AtribuicaoStand.
     */
    @Test
    public void testSetStand() {
        System.out.println("setStand");
        Stand stand = null;
        AtribuicaoStand instance = new AtribuicaoStand();
        instance.setStand(stand);
    }

    /**
     * Test of validaAtribuicaoStand method, of class AtribuicaoStand.
     */
    @Test
    public void testValidaAtribuicaoStand() {
        System.out.println("validaAtribuicaoStand");
        AtribuicaoStand instance = new AtribuicaoStand();
        boolean expResult = false;
        boolean result = instance.validaAtribuicaoStand();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class AtribuicaoStand.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        CandidaturaExposicao candidaturaExposicao = new CandidaturaExposicao();
        Stand stand = new Stand();
        AtribuicaoStand instance = new AtribuicaoStand(candidaturaExposicao, stand);
        String expResult = "Atribuicao de Stand a Candidatura:\n" + "Candidatura ="
                + new CandidaturaExposicao() + ", Stand =" + new Stand();
        String result = instance.toString();
        assertEquals(expResult, result);
    }

}
