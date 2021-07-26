<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SOGE.UIs;

/**
 *
 * @author Débora Costa
 */
public class Main {

=======

package SOGE.UIs;

import SOGE.CentroExposicoes;
import SOGE.Demonstracao;
import SOGE.Exposicao;
import SOGE.RegistoExposicoes;
import SOGE.Utilizador;

/**
 *
 * @author Luis Gouveia
 */
public class Main {


    
>>>>>>> 7cae77da489a08f349cea6471566ea11bdb09f32
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
<<<<<<< HEAD
        // TODO code application logic here
=======
        
        CentroExposicoes centroExposicoes = new CentroExposicoes();
        Exposicao exp1 = new Exposicao("hello", "exposicao sobre adele", "28-05-2016", "29-05-2016");
        Exposicao exp2 = new Exposicao("hearth", "exposicao sobre a terra", "28-05-2017", "29-05-2017");
        RegistoExposicoes re = new RegistoExposicoes();
        re.addExposicao(exp2);
        re.addExposicao(exp1);
        Demonstracao dem1 = new Demonstracao("AudioVisual");
        Utilizador ut1 = new Utilizador("0001");
        
        centroExposicoes.setRegistoExposicoes(re);
        MenuUI menu = new MenuUI(centroExposicoes);
        menu.run();
>>>>>>> 7cae77da489a08f349cea6471566ea11bdb09f32
    }
    
}
