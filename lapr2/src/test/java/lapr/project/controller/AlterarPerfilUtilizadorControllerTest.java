/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import lapr.project.model.CentroExposicoes;
import lapr.project.model.RegistoUtilizadores;
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
public class AlterarPerfilUtilizadorControllerTest {

    public AlterarPerfilUtilizadorControllerTest() {
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
     * Test of getDadosUtilizador method, of class
     * AlterarPerfilUtilizadorController.
     */
    @Test
    public void testGetDadosUtilizador() {
        CentroExposicoes ce = new CentroExposicoes();
        RegistarUtilizadorController ructrl = new RegistarUtilizadorController(ce);
        RegistoUtilizadores ru = ructrl.getRegistoUtilizadores();
        ructrl.novoUtilizador();
        ructrl.setDadosUtilizador("Paulo Silva", "paulosilva2131", "minhaPassWoRd", "paulo@gmail.com", "Biologo");
        ructrl.registarUtilizador();
        ructrl.getRegistoUtilizadores().confirmaUtilizador("paulosilva2131");
        String user = "paulosilva2131";
        AlterarPerfilUtilizadorController instance = new AlterarPerfilUtilizadorController(ce, user);
        System.out.println("getDadosUtilizador");
        String[] expResult = ce.getRegistoUtilizador().getUtilizador(user).getDadosUtilizador();
        String[] result = instance.getDadosUtilizador(user);
        assertArrayEquals(expResult, result);

    }

    /**
     * Test of setDadosAlterados method, of class
     * AlterarPerfilUtilizadorController.
     */
    @Test
    public void testSetDadosAlterados() {
        System.out.println("setDadosAlterados");
        CentroExposicoes ce = new CentroExposicoes();
        RegistarUtilizadorController ructrl = new RegistarUtilizadorController(ce);
        RegistoUtilizadores ru = ructrl.getRegistoUtilizadores();
        ructrl.novoUtilizador();
        ructrl.setDadosUtilizador("Paulo Silva", "paulosilva2131", "minhaPassWoRd", "paulo@gmail.com", "Biologo");
        ructrl.registarUtilizador();
        ructrl.getRegistoUtilizadores().confirmaUtilizador("paulosilva2131");
        String user = "paulosilva2131";
        AlterarPerfilUtilizadorController instance = new AlterarPerfilUtilizadorController(ce, user);
        String username = "paulosilva2131";
        String nome = "Paulo Silva";
        String email = "paulo@gmail.com";
        String resposta = "Biologo";
        boolean expResult = false;
        boolean result = instance.setDadosAlterados(username, nome, email, resposta);
        assertEquals(expResult, result);
    }

    /**
     * Test of setPASSWORD method, of class AlterarPerfilUtilizadorController.
     */
    @Test
    public void testSetPASSWORD() {
        System.out.println("setPASSWORD");
        CentroExposicoes ce = new CentroExposicoes();
        RegistarUtilizadorController ructrl = new RegistarUtilizadorController(ce);
        RegistoUtilizadores ru = ructrl.getRegistoUtilizadores();
        ructrl.novoUtilizador();
        ructrl.setDadosUtilizador("Paulo Silva", "paulosilva2131", "minhaPassWoRd", "paulo@gmail.com", "Biologo");
        ructrl.registarUtilizador();
        ructrl.getRegistoUtilizadores().confirmaUtilizador("paulosilva2131");
        String user = "paulosilva2131";
        AlterarPerfilUtilizadorController instance = new AlterarPerfilUtilizadorController(ce, user);
        String password = "minhaPassWoRd";
        instance.setPASSWORD(password);

    }

    /**
     * Test of registarUtilizadorAlterado method, of class
     * AlterarPerfilUtilizadorController.
     */
    @Test
    public void testRegistarUtilizadorAlterado() {
        System.out.println("registarUtilizadorAlterado");
         CentroExposicoes ce = new CentroExposicoes();
        RegistarUtilizadorController ructrl = new RegistarUtilizadorController(ce);
        RegistoUtilizadores ru = ructrl.getRegistoUtilizadores();
        ructrl.novoUtilizador();
        ructrl.setDadosUtilizador("Paulo Silva", "paulosilva2131", "minhaPassWoRd", "paulo@gmail.com", "Biologo");
        ructrl.registarUtilizador();
        ructrl.getRegistoUtilizadores().confirmaUtilizador("paulosilva2131");
        String user = "paulosilva2131";
        AlterarPerfilUtilizadorController instance = new AlterarPerfilUtilizadorController(ce, user);
        instance.registarUtilizadorAlterado();

    }

}
