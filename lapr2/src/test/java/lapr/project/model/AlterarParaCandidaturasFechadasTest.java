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
public class AlterarParaCandidaturasFechadasTest {
    
    public AlterarParaCandidaturasFechadasTest() {
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
     * Test of run method, of class AlterarParaCandidaturasFechadas.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        Exposicao expo = new Exposicao();
        expo.setEstadoExp(new ExposicaoEstadoCandidaturasExposicaoAbertas(expo));
        AlterarParaCandidaturasFechadas instance = new AlterarParaCandidaturasFechadas(expo);
        instance.run();
    }
    
}
