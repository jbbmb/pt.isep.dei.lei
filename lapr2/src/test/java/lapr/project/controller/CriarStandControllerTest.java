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
 * @author Grupo 18
 */
public class CriarStandControllerTest {
    
    public CriarStandControllerTest() {
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
     * Test of getCentroExposicoes method, of class CriarStandController.
     */
    @Test
    public void testGetCentroExposicoes() {
        System.out.println("getCentroExposicoes");
        CentroExposicoes ce = new CentroExposicoes();
    
        CriarStandController instance = new CriarStandController(ce);
        CentroExposicoes expResult = ce;
        CentroExposicoes result = instance.getCentroExposicoes();
        assertEquals(expResult, result);
     
        
    }

    /**
     * Test of setCentroExposicoes method, of class CriarStandController.
     */
    @Test
    public void testSetCentroExposicoes() {
        System.out.println("setCentroExposicoes");
        CentroExposicoes centroExposicoes = new CentroExposicoes();
        CriarStandController instance = new CriarStandController(centroExposicoes);
        instance.setCentroExposicoes(centroExposicoes);
        
    }

    /**
     * Test of setDados method, of class CriarStandController.
     */
    @Test
    public void testSetDados() {
        System.out.println("setDados");
        String descricao = "hello";
        CentroExposicoes centro = new CentroExposicoes();
        CriarStandController instance = new CriarStandController(centro);
        boolean expResult = true;
        boolean result = instance.setDados(descricao);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of registarStand method, of class CriarStandController.
     */
    @Test
    public void testRegistarStand() {
        System.out.println("registarStand");
        CentroExposicoes centro = new CentroExposicoes();
        CriarStandController instance = new CriarStandController(centro);
        instance.setDados("hello");
        instance.registarStand();
        
    }
    
}
