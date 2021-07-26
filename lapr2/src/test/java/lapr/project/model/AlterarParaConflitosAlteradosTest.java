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
public class AlterarParaConflitosAlteradosTest {
    
    public AlterarParaConflitosAlteradosTest() {
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
     * Test of run method, of class AlterarParaConflitosAlterados.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        Exposicao expo = new Exposicao();
        expo.setEstadoExp(new ExposicaoEstadoConflitosDetetados(expo));
        AlterarParaConflitosAlterados instance = new AlterarParaConflitosAlterados(expo);
        instance.run();
    }
    
}
