/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author grupo18
 */
public class RegistoUtilizadoresTest {

    @Test
    public void testeValida() {
        RegistoUtilizadores reg = new RegistoUtilizadores();
        Utilizador u = reg.novoUtilizador();
        u.setNome("Teste");
        reg.getListaUtilizadores().add(u);
        assertEquals(false, reg.valida(u));
    }

}
