/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.TipoConflito;
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
public class DefinirTipoConflitoControllerTest {

    public DefinirTipoConflitoControllerTest() {
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
     * Test of getListaTiposConflito method, of class
     * DefinirTipoConflitoController.
     */
    @Test
    public void testGetListaTiposConflito() {
        System.out.println("getListaTiposConflito");
        CentroExposicoes centro = new CentroExposicoes();
        DefinirTipoConflitoController instance
                = new DefinirTipoConflitoController(centro);
        List<TipoConflito> expResult = instance.getListaTiposConflito();
        List<TipoConflito> result = instance.getListaTiposConflito();
        assertEquals(expResult, result);
    }

    /**
     * Test of novoTipoConflito method, of class DefinirTipoConflitoController.
     */
    @Test
    public void testNovoTipoConflito() {
        System.out.println("novoTipoConflito");
        String descricao = "";
        CentroExposicoes centro = new CentroExposicoes();
        DefinirTipoConflitoController instance
                = new DefinirTipoConflitoController(centro);
        boolean expResult = false;
        instance.getListaTiposConflito();
        boolean result = instance.novoTipoConflito(descricao);
    }

    /**
     * Test of registaTipoConflito method, of class
     * DefinirTipoConflitoController.
     */
    @Test
    public void testRegistaTipoConflito() {
        System.out.println("registaTipoConflito");
        TipoConflito conflito = new TipoConflito("teste");
        CentroExposicoes centro = new CentroExposicoes();
        DefinirTipoConflitoController instance
                = new DefinirTipoConflitoController(centro);
        instance.getListaTiposConflito();
        instance.novoTipoConflito("teste");
        instance.registaTipoConflito(conflito);
    }

}
