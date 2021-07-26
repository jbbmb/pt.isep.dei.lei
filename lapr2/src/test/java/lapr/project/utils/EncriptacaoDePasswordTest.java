/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.utils;

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
public class EncriptacaoDePasswordTest {

    public EncriptacaoDePasswordTest() {
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
     * Test of cifra method, of class EncriptacaoDePassword.
     */
    @Test
    public void testCifra() {
        System.out.println("cifra");
        String password = "abc";
        int chave = 3;
        EncriptacaoDePassword instance = new EncriptacaoDePassword();
        String expResult = "def";
        String result = instance.cifra(password, chave);
        assertEquals(expResult, result);
    }

    /**
     * Test of decifra method, of class EncriptacaoDePassword.
     */
    @Test
    public void testDecifra() {
        System.out.println("decifra");
        String password = "abc";
        int chave = 3;
        EncriptacaoDePassword instance = new EncriptacaoDePassword();
        String expResult = "^_`";
        String result = instance.decifra(password, chave);
        assertEquals(expResult, result);
    }

}
