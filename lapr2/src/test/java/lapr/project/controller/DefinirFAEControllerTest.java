/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.ExposicaoEstadoCriada;
import lapr.project.model.FAE;
import lapr.project.model.ListaFAE;
import lapr.project.model.Organizador;
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
 * @author grupo18
 */
public class DefinirFAEControllerTest {

    public DefinirFAEControllerTest() {
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
     * Test of getListaExposicoesOrganizador method, of class
     * DefinirFAEController.
     */
    @Test
    public void testGetListaExposicoesOrganizador() {
        System.out.println("getListaExposicoesOrganizador");
        String email = "";
        CentroExposicoes centro = new CentroExposicoes();
        DefinirFAEController instance = new DefinirFAEController(centro);
        List<Exposicao> expResult = instance.getListaExposicoesOrganizador(email);
        List<Exposicao> result = instance.getListaExposicoesOrganizador(email);
        assertEquals(expResult, result);
    }

    /**
     * Test of getListaUtilizadores method, of class DefinirFAEController.
     */
    @Test
    public void testGetListaUtilizadores() {
        System.out.println("getListaUtilizadores");
        CentroExposicoes centro = new CentroExposicoes();
        DefinirFAEController instance = new DefinirFAEController(centro);
        RegistoUtilizadores expResult = instance.getListaUtilizadores();
        RegistoUtilizadores result = instance.getListaUtilizadores();
        assertEquals(expResult, result);
    }

    /**
     * Test of addFAE method, of class DefinirFAEController.
     */
    @Test
    public void testAddFAE() {
        System.out.println("addFAE");
        Utilizador u = new Utilizador();
        Exposicao e = new Exposicao();
        CentroExposicoes centro = new CentroExposicoes();
        DefinirFAEController instance = new DefinirFAEController(centro);
        FAE expResult = null;
        FAE result = instance.addFAE(u, e);
    }

    /**
     * Test of registaFAE method, of class DefinirFAEController.
     */
    @Test
    public void testRegistaFAE() {
        System.out.println("registaFAE");
        FAE fae = new FAE();
         Utilizador u = new Utilizador();
        Organizador organizador = new Organizador();
        String email = "";
        Exposicao expo = new Exposicao();
        expo.setEstadoExp(new ExposicaoEstadoCriada(expo));
        CentroExposicoes centro = new CentroExposicoes();
        DefinirFAEController instance = new DefinirFAEController(centro);
        instance.addFAE(u, expo);
        instance.registaFAE(fae);
    }

    /**
     * Test of getListaFAE method, of class DefinirFAEController.
     */
    @Test
    public void testGetListaFAE() {
        System.out.println("getListaFAE");
        Exposicao exposicao = new Exposicao();
        CentroExposicoes centro = new CentroExposicoes();
        DefinirFAEController instance = new DefinirFAEController(centro);
        ListaFAE expResult = instance.getListaFAE(exposicao);
        ListaFAE result = instance.getListaFAE(exposicao);
        assertEquals(expResult, result);
    }

}
