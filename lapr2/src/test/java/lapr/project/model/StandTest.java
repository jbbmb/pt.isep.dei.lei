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
 * @author Grupo 18
 */
public class StandTest {
    
    public StandTest() {
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
     * Test of getDescricao method, of class Stand.
     */
    @Test
    public void testGetDescricao() {
        System.out.println("getDescricao");
        Stand instance = new Stand();
        String expResult = instance.getDescricao();
        String result = instance.getDescricao();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDescricao method, of class Stand.
     */
    @Test
    public void testSetDescricao() {
        System.out.println("setDescricao");
        String descricao = "teste";
        Stand instance = new Stand("teste");
        instance.setDescricao(descricao);
    }

    /**
     * Test of validaStand method, of class Stand.
     */
    @Test
    public void testValidaStand() {
        System.out.println("validaStand");
        Stand instance = new Stand();
        boolean expResult = false;
        boolean result = instance.validaStand();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Stand.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Stand instance = new Stand();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Stand.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Stand instance = new Stand("ola");
        String expResult = "Stand:\n" + "descrição =" + "ola";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
