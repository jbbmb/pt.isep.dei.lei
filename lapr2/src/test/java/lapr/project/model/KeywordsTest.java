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
public class KeywordsTest {
    
    public KeywordsTest() {
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
     * Test of getPalavraChave method, of class Keywords.
     */
    @Test
    public void testGetPalavraChave() {
        System.out.println("getPalavraChave");
        Keywords instance = new Keywords("teste", 0);
        String expResult = "teste";
        String result = instance.getPalavraChave();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPalavraChave method, of class Keywords.
     */
    @Test
    public void testSetPalavraChave() {
        System.out.println("setPalavraChave");
        String palavraChave = "teste";
        Keywords instance = new Keywords(palavraChave, 0);
        instance.setPalavraChave(palavraChave);
    }
    
    
    /**
     * Test of addOcorrencia method, of class Keywords.
     */
    @Test
    public void testAddOcorrencia() {
        System.out.println("addOcorrencia");
        Keywords instance = new Keywords("teste", 0);
        instance.addOcorrencia();
    }

    /**
     * Test of equals method, of class Keywords.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = new Object();
        Keywords instance = new Keywords("teste", 0);
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }

    /**
     * Test of getOcorrencias method, of class Keywords.
     */
    @Test
    public void testGetOcorrencias() {
        System.out.println("getOcorrencias");
        Keywords instance = new Keywords("teste", 0);
        int expResult = 0;
        int result = instance.getOcorrencias();
        assertEquals(expResult, result);
    }

    /**
     * Test of setOcorrencias method, of class Keywords.
     */
    @Test
    public void testSetOcorrencias() {
        System.out.println("setOcorrencias");
        int ocorrencias = 0;
        Keywords instance = new Keywords("teste", 0);
        instance.setOcorrencias(ocorrencias);
    }
    
}
