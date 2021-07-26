package EleicaoPartido;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VotoEletronicoUI extends JFrame {
    
    // Para correr
    public static void main(String[] args) {
        VotoEletronicoUI janela = new VotoEletronicoUI("Votar eletronicamente");
    }
    
    private VotoEletronicoUI(String nomeJanela){
        super(nomeJanela);
        criarComponentes();
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
    
    private void criarComponentes(){
        JPanel painelTopo = criarPainelTopo();
        JPanel painelCentro = criarPainelCentro();
        JPanel painelBaixo = criarPainelBaixo();
        add(painelTopo, BorderLayout.NORTH);
        add(painelCentro, BorderLayout.CENTER);
        add(painelBaixo, BorderLayout.SOUTH);
    }
    
    private JPanel criarPainelTopo(){
        JPanel painel = new JPanel();
        // Falta código
        return painel;
    }
    
    private JPanel criarPainelCentro(){
        JPanel painel = new JPanel();
        // Falta código
        return painel;
    }
    
    private JPanel criarPainelBaixo(){
        JPanel painel = new JPanel();
        JButton botaoVotar = criarBotaoVotar();
        painel.add(botaoVotar);
        return painel;
    }
    
    private JButton criarBotaoVotar(){
        JButton votar = new JButton("Votar");
        votar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        return votar;
    }
    
}