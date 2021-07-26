package lapr.project.ui;

import java.sql.Date;
import java.util.ArrayList;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Demonstracao;
import lapr.project.model.Exposicao;
import lapr.project.model.ExposicaoEstadoCriada;
import lapr.project.model.GestorExposicoes;
import lapr.project.model.ListaDemonstracoes;
import lapr.project.model.Organizador;
import lapr.project.model.Recurso;
import lapr.project.model.RegistoGestorExposicoes;
import lapr.project.model.Utilizador;

/** @author Nuno Bettencourt <nmb@isep.ipp.pt> on 24/05/16. */

public class SOGE {

    /**
     * Private constructor to hide implicit public one.
     */
    private SOGE() {
        // SOGE's main class
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        /* Create and display the form */
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        java.awt.EventQueue.invokeLater(() -> {
            CentroExposicoes centro = new CentroExposicoes();
            RegistoGestorExposicoes registoGestores = new RegistoGestorExposicoes();
            ListaDemonstracoes listaDemonstracoes = new ListaDemonstracoes();
            ArrayList<Recurso> listaRecursos = new ArrayList<>();

            Utilizador util = new Utilizador("Nome da Nocas", "nocas", "123",
                    "emailnocas@email.com", "LAPR2");

            Utilizador util2 = new Utilizador("Nome do Utilizador", "gestor", "012",
                    "emailgestor@email.com", "Centro");
            Utilizador util3 = new Utilizador("Bruno", "bruno", "234",
                    "emailbruno@email.com", "ISEP");

            Exposicao exp1 = new Exposicao(centro, "Hello from the other side", "hello",
                    Date.valueOf("2016-08-16"), Date.valueOf("2016-08-17"), "rua dos totos",
                    Date.valueOf("2016-06-11"), Date.valueOf("2016-07-15"), Date.valueOf("2016-07-18"));
            
            Exposicao exp2 = new Exposicao(centro, "Nao", "hello",
                    Date.valueOf("2016-08-16"), Date.valueOf("2016-08-17"), "rua dos totos",
                    Date.valueOf("2016-07-11"), Date.valueOf("2016-07-15"), Date.valueOf("2016-07-18"));

            CandidaturaExposicao cand1 = new CandidaturaExposicao("isep", "rua", "916789876", 30, 50, "catos, caes", "nocas");
            CandidaturaExposicao cand2 = new CandidaturaExposicao("lapr", "rua", "916789876", 30, 50, "catos, gatos", "nocas");
            CandidaturaExposicao cand3 = new CandidaturaExposicao("lapr2", "rua", "916789876", 30, 50, "catos, gatos, raposas", "nocas");
            
            
            exp1.getListaCandidaturas().addCandidaturaExposicao(cand1);
            exp1.getListaCandidaturas().addCandidaturaExposicao(cand2);
            exp2.getListaCandidaturas().addCandidaturaExposicao(cand3);
            
            Recurso rec = new Recurso("agua");
            Recurso rec2 = new Recurso("comida");
            centro.getListaRecursos().addRecurso(rec);
            centro.getListaRecursos().addRecurso(rec2);
            listaRecursos.add(rec);
            listaRecursos.add(rec2);

            Demonstracao demonstracao = new Demonstracao("demonst", "demonstracao 1");
            Demonstracao demonstracao2 = new Demonstracao("demonst2", "demonstracao 2");

            centro.getRegistoExposicoes().getListaExposicoes().add(exp1);
            centro.getRegistoExposicoes().getListaExposicoes().add(exp2);
            exp1.getListaDemonstracoes().getListaDemonstracoes().add(demonstracao);
            exp1.getListaDemonstracoes().getListaDemonstracoes().add(demonstracao2);
            exp1.setEstadoExp(new ExposicaoEstadoCriada(exp1));

            centro.getRegistoUtilizador().getListaUtilizadores().add(util);
            centro.getRegistoUtilizador().getListaUtilizadores().add(util2);
            centro.getRegistoUtilizador().getListaUtilizadores().add(util3);
            centro.getRegistoGestores().getListaGestores().
                    add(new GestorExposicoes(util2));
            exp1.getListaOrganizadores().getListaOrganizadores().add(new Organizador(util3));

            new LoginUI(centro).setVisible(true);
        });

        System.out.println("[JVM] SYSTEM MESSAGE: Process initiated without any critical exceptions. Thank you for using SOGE!");

    }

}