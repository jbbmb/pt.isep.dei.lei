/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import java.util.List;
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
public class ListaAtribuicoesTest {
    
    public ListaAtribuicoesTest() {
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
     * Test of getListaAtribuicoes method, of class ListaAtribuicoes.
     */
    @Test
    public void testGetListaAtribuicoes() {
        System.out.println("getListaAtribuicoes");
        ListaAtribuicoes instance = new ListaAtribuicoes();
        ArrayList<Atribuicao> expResult = new ArrayList<>();
        ArrayList<Atribuicao> result = instance.getListaAtribuicoes();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLISTA_ATRIBUICAO method, of class ListaAtribuicoes.
     */
    @Test
    public void testSetLISTA_ATRIBUICAO() {
        System.out.println("setLISTA_ATRIBUICAO");
        ArrayList<Atribuicao> listaAtribuicao = new ArrayList<>();
        ListaAtribuicoes instance = new ListaAtribuicoes();
        instance.setListaAtribuicao(listaAtribuicao);
    }

    /**
     * Test of getCandidaturasAtribuidas method, of class ListaAtribuicoes.
     */
    @Test
    public void testGetCandidaturasAtribuidas() {
        System.out.println("getCandidaturasAtribuidas");
        FAE fae = new FAE();
        ListaAtribuicoes instance = new ListaAtribuicoes();
        List<Candidatura> expResult = instance.getCandidaturasAtribuidas(fae);
        List<Candidatura> result = instance.getCandidaturasAtribuidas(fae);
        assertEquals(expResult, result);
    }

    /**
     * Test of addAtribuicao method, of class ListaAtribuicoes.
     */
    @Test
    public void testAddAtribuicao() {
        System.out.println("addAtribuicao");
        Atribuicao atribuicao = new Atribuicao(new FAE(), new CandidaturaExposicao());
        ListaAtribuicoes instance = new ListaAtribuicoes();
        instance.addAtribuicao(atribuicao);
    }


    
}
