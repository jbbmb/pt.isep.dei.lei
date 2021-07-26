/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.Date;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.ListaOrganizadores;
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
public class CriarExposicaoControllerTest {
    
    public CriarExposicaoControllerTest() {
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
     * Test of novaExposicao method, of class CriarExposicaoController.
     */
    @Test
    public void testNovaExposicao() {
        System.out.println("novaExposicao");
        CentroExposicoes centroExposicoes = new CentroExposicoes();
        CriarExposicaoController instance = new CriarExposicaoController(centroExposicoes);
        instance.novaExposicao();
    }

    /**
     * Test of setDados method, of class CriarExposicaoController.
     */
    @Test
    public void testSetDados() {
        System.out.println("setDados");
        CentroExposicoes centro = new CentroExposicoes();
        String titulo = "";
        String textoDescritivo = "";
        Date dataInicio = new Date();
        Date dataFim = new Date();
        String local = "";
        Date periodoSubCandInicio =  new Date();
        Date periodoSubCanFim =  new Date();
        Date limConflitos =  new Date();
        CriarExposicaoController instance = new CriarExposicaoController(centro);
        instance.novaExposicao();
        instance.setDados(titulo, textoDescritivo, dataInicio, dataFim, local, periodoSubCandInicio, periodoSubCanFim, limConflitos);
    }

    /**
     * Test of getUtilizador method, of class CriarExposicaoController.
     */
    @Test
    public void testGetUtilizador() {
        System.out.println("getUtilizador");
        String username = "";
        CentroExposicoes centro = new CentroExposicoes();
        CriarExposicaoController instance = new CriarExposicaoController(centro);
        Utilizador expResult = instance.getUtilizador(username);
        Utilizador result = instance.getUtilizador(username);
        assertEquals(expResult, result);
    }

    /**
     * Test of getListaUtilizadores method, of class CriarExposicaoController.
     */
    @Test
    public void testGetListaUtilizadores() {
        System.out.println("getListaUtilizadores");
        CentroExposicoes centro = new CentroExposicoes();
        CriarExposicaoController instance = new CriarExposicaoController(centro);
        RegistoUtilizadores expResult = instance.getListaUtilizadores();
        RegistoUtilizadores result = instance.getListaUtilizadores();
        assertEquals(expResult, result);
    }

    /**
     * Test of addOrganizador method, of class CriarExposicaoController.
     */
    @Test
    public void testAddOrganizador() {
        System.out.println("addOrganizador");
        Utilizador utilizador = new Utilizador();
        CentroExposicoes centro = new CentroExposicoes();
        CriarExposicaoController instance = new CriarExposicaoController(centro);
        instance.novaExposicao();
        instance.addOrganizador(utilizador);
    }

    /**
     * Test of registaExposicao method, of class CriarExposicaoController.
     */
    @Test
    public void testRegistaExposicao() {
        System.out.println("registaExposicao");
        CentroExposicoes centro = new CentroExposicoes();
        CriarExposicaoController instance = new CriarExposicaoController(centro);
        instance.novaExposicao();
        instance.registaExposicao();
    }

    /**
     * Test of getListaOrganizadores method, of class CriarExposicaoController.
     */
    @Test
    public void testGetListaOrganizadores() {
        System.out.println("getListaOrganizadores");
        CentroExposicoes centro = new CentroExposicoes();
        CriarExposicaoController instance = new CriarExposicaoController(centro);
        instance.novaExposicao();
        ListaOrganizadores expResult = instance.getListaOrganizadores();
        ListaOrganizadores result = instance.getListaOrganizadores();
        assertEquals(expResult, result);
    }
    
}
