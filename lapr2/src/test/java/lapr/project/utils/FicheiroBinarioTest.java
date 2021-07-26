/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.utils;

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
public class FicheiroBinarioTest {

    public FicheiroBinarioTest() {
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
     * Test of gravar method, of class FicheiroBinario.
     */
    @Test
    public void testGravar() throws Exception {
        System.out.println("gravar");
        String nomeFicheiro = "dados.bin";
        CentroExposicoes centro = new CentroExposicoes();
        FicheiroBinario instance = new FicheiroBinario(centro);
        boolean expResult = true;
        boolean result = instance.gravar(nomeFicheiro);
        assertEquals(expResult, result);
    }

    /**
     * Test of getNomeFicheiroBase method, of class FicheiroBinario.
     */
    @Test
    public void testGetNomeFicheiroBase() {
        System.out.println("getNomeFicheiroBase");
        CentroExposicoes centro = new CentroExposicoes();
        FicheiroBinario instance = new FicheiroBinario(centro);
        String expResult = "dados.bin";
        String result = instance.getNomeFicheiroBase();
        assertEquals(expResult, result);
    }

}
