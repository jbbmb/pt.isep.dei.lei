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
public class CentroExposicoesTest {

    public CentroExposicoesTest() {
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
     * Test of getRegistoExposicoes method, of class CentroExposicoes.
     */
    @Test
    public void testGetRegistoExposicoes() {
        System.out.println("getRegistoExposicoes");
        CentroExposicoes centro = new CentroExposicoes();
        RegistoExposicoes expResult = centro.getRegistoExposicoes();
        RegistoExposicoes result;
        result = centro.getRegistoExposicoes();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRegistoUtilizador method, of class CentroExposicoes.
     */
    @Test
    public void testGetRegistoUtilizador() {
        System.out.println("getRegistoUtilizador");
        CentroExposicoes instance = new CentroExposicoes();
        RegistoUtilizadores expResult = instance.getRegistoUtilizador();
        RegistoUtilizadores result = instance.getRegistoUtilizador();
        assertEquals(expResult, result);
    }

    /**
     * Test of getListaTiposConflito method, of class CentroExposicoes.
     */
    @Test
    public void testGetListaTiposConflito() {
        System.out.println("getListaTiposConflito");
        CentroExposicoes instance = new CentroExposicoes();
        ListaTiposConflito expResult = instance.getListaTiposConflito();
        ListaTiposConflito result = instance.getListaTiposConflito();
        assertEquals(expResult, result);
    }

    /**
     * Test of getListaRecursos method, of class CentroExposicoes.
     */
    @Test
    public void testGetListaRecursos() {
        System.out.println("getListaRecursos");
        CentroExposicoes instance = new CentroExposicoes();
        ListaRecursos expResult = instance.getListaRecursos();
        ListaRecursos result = instance.getListaRecursos();
        assertEquals(expResult, result);
    }

    /**
     * Test of setListaRecursos method, of class CentroExposicoes.
     */
    @Test
    public void testSetListaRecursos() {
        System.out.println("setListaRecursos");
        ListaRecursos listaRecursos = null;
        CentroExposicoes instance = new CentroExposicoes();
        instance.setListaRecursos(listaRecursos);
    }

    /**
     * Test of getRegistoGestores method, of class CentroExposicoes.
     */
    @Test
    public void testGetRegistoGestores() {
        System.out.println("getRegistoGestores");
        CentroExposicoes instance = new CentroExposicoes();
        RegistoGestorExposicoes expResult = instance.getRegistoGestores();
        RegistoGestorExposicoes result = instance.getRegistoGestores();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRegistoGestores method, of class CentroExposicoes.
     */
    @Test
    public void testSetRegistoGestores() {
        System.out.println("setRegistoGestores");
        RegistoGestorExposicoes rGestores = null;
        CentroExposicoes instance = new CentroExposicoes();
        instance.setRegistoGestores(rGestores);
    }

}
