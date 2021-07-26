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
 * @author Grupo 18_LAPR2 15-16
 */
public class RegistarUtilizadorControllerTest {
    
    public RegistarUtilizadorControllerTest() {
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
     * Test of novoUtilizador method, of class RegistarUtilizadorController.
     */
    @Test
    public void testNovoUtilizador() {
        System.out.println("novoUtilizador");
        CentroExposicoes centroExposicoes = new CentroExposicoes();
        RegistarUtilizadorController instance = new RegistarUtilizadorController(centroExposicoes);
        instance.novoUtilizador();

    }

    /**
     * Test of setDadosUtilizador method, of class RegistarUtilizadorController.
     */
    @Test
    public void testSetDadosUtilizador() {
        System.out.println("setDadosUtilizador");
        String nome = "";
        String username = "";
        String password = "";
        String email = "";
        String resposta = "";
        CentroExposicoes centroExposicoes = new CentroExposicoes();
        RegistarUtilizadorController instance = new RegistarUtilizadorController(centroExposicoes);
        instance.novoUtilizador();
        instance.setDadosUtilizador(nome, username, password, email, resposta);
    }

    /**
     * Test of registarUtilizador method, of class RegistarUtilizadorController.
     */
    @Test
    public void testRegistarUtilizador() {
        System.out.println("registarUtilizador");
        String nome = "";
        String username = "";
        String password = "";
        String email = "";
        String resposta = "";
        CentroExposicoes centroExposicoes = new CentroExposicoes();
        RegistarUtilizadorController instance = new RegistarUtilizadorController(centroExposicoes);
        instance.novoUtilizador();
        instance.setDadosUtilizador(nome, username, password, email, resposta);
        instance.registarUtilizador();
    }
    
}
