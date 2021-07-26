/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.RegistoUtilizadores;
import lapr.project.model.Utilizador;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Utilizador
 */
public class ConfirmarUtilizadorControllerTest {

    public ConfirmarUtilizadorControllerTest() {
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
     * Test of getListaUtilizadoresNaoConfirmados method, of class
     * ConfirmarUtilizadorController.
     */
    @Test
    public void testGetListaUtilizadoresNaoConfirmados() {
        System.out.println("getListaUtilizadoresNaoConfirmados");
        CentroExposicoes ce = new CentroExposicoes();
        ConfirmarUtilizadorController instance = new ConfirmarUtilizadorController(ce);
        RegistarUtilizadorController ructrl = new RegistarUtilizadorController(ce);
        RegistoUtilizadores ru = ructrl.getRegistoUtilizadores();
        ructrl.novoUtilizador();
        ructrl.setDadosUtilizador("Paulo Silva", "paulosilva2131", "minhaPassWoRd", "paulo@gmail.com", "Biologo");
        ructrl.registarUtilizador();
        List<Utilizador> expResult = ce.getRegistoUtilizador().getListaUtilizadoresNaoRegistados();
        List<Utilizador> result = instance.getListaUtilizadoresNaoConfirmados();
        assertEquals(expResult, result);

    }



}
