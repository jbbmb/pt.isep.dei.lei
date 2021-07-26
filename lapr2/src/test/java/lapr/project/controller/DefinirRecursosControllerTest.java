/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Recurso;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Grupo 18_LAPR2 15-16
 */
public class DefinirRecursosControllerTest {
    
    public DefinirRecursosControllerTest() {
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
     * Test of getListaRecursos method, of class DefinirRecursosController.
     */
    @Test
    public void testGetListaRecursos() {
        System.out.println("getListaRecursos");
        CentroExposicoes centroExposicoes = new CentroExposicoes();
        DefinirRecursosController instance = new DefinirRecursosController(centroExposicoes);
        List<Recurso> expResult = instance.getListaRecursos();
        List<Recurso> result = instance.getListaRecursos();
        assertEquals(expResult, result);
    }

    /**
     * Test of novoRecurso method, of class DefinirRecursosController.
     */
    @Test
    public void testNovoRecurso() {
        System.out.println("novoRecurso");
        CentroExposicoes centroExposicoes = new CentroExposicoes();
        DefinirRecursosController instance = new DefinirRecursosController(centroExposicoes);
        instance.getListaRecursos();
        instance.novoRecurso();

    }

    /**
     * Test of setRecurso method, of class DefinirRecursosController.
     */
    @Test
    public void testSetRecurso() {
        System.out.println("setRecurso");
        String recurso = "";
        CentroExposicoes centroExposicoes = new CentroExposicoes();
        DefinirRecursosController instance = new DefinirRecursosController(centroExposicoes);
        instance.getListaRecursos();
        instance.novoRecurso();
        boolean expResult = false;
        boolean result = instance.setRecurso(recurso);
        assertEquals(expResult, result);
    }

    /**
     * Test of registarRecurso method, of class DefinirRecursosController.
     */
    @Test
    public void testRegistarRecurso() {
        System.out.println("registarRecurso");
        String recurso = "";
        CentroExposicoes centroExposicoes = new CentroExposicoes();
        DefinirRecursosController instance = new DefinirRecursosController(centroExposicoes);
        instance.getListaRecursos();
        instance.novoRecurso();
        instance.setRecurso(recurso);
        instance.registarRecurso();
    }
    
}
