/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import lapr.project.model.CentroExposicoes;
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
public class LoginControllerTest {
    
    public LoginControllerTest() {
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
     * Test of validaLogin method, of class LoginController.
     */
    @Test
    public void testValidaLogin() {
        System.out.println("validaLogin");
        String username = "";
        String password = "";
        CentroExposicoes centro = new CentroExposicoes();
        LoginController instance = new LoginController(centro);
        boolean expResult = false;
        boolean result = instance.validaLogin(username, password);
        assertEquals(expResult, result);
    }
    
}
