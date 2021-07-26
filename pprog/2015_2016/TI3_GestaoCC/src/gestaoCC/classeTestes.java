package gestaoCC;
/** @author João Borges, 1150475 - LEI @ ISEP */

import gestaoCC.sala.Tipologias;

public class classeTestes {

    public static void main(String[] args) {

        centroCongressos centroCongressos = new centroCongressos("Congressos");

        auditorio auditorio1 = new auditorio("Aud1", "Auditório de música", 300, 400, 10);
        centroCongressos.addEspaco(auditorio1);
        auditorio auditorio2 = new auditorio("Aud2", "Auditório de audiovisuais", 200, 150, 5);
        centroCongressos.addEspaco(auditorio2);
        auditorio auditorio3 = new auditorio("Aud3", "Auditório de artes", 100, 350, 20);
        centroCongressos.addEspaco(auditorio3);
        pavilhao pavilhao1 = new pavilhao("Pav1", "Pavilhao de física", 100, 3);
        centroCongressos.addEspaco(pavilhao1);
        pavilhao pavilhao2 = new pavilhao("Pav2", "Pavilhao 2", 200, 2);
        centroCongressos.addEspaco(pavilhao2);
        sala sala1 = new sala("Sala1", "Sala 300", 100, Tipologias.Circulo, 1);
        centroCongressos.addEspaco(sala1);
        sala sala2 = new sala("Sala2", "Sala 250", 150, Tipologias.U, 2);
        centroCongressos.addEspaco(sala2);
        sala sala3 = new sala("Sala3", "Sala 100", 90, Tipologias.Quadrado, 1);
        centroCongressos.addEspaco(sala3);
        sala sala4 = new sala("Sala4", "Sala 156", 80, Tipologias.Retangular, 1);
        centroCongressos.addEspaco(sala4);
        hall hall = new hall("Hall1", "Hall principal", 30, 10);
        centroCongressos.addEspaco(hall);

        System.out.println("Receita total do CC: " + centroCongressos.calcularReceitas());

        System.out.println("Preço a pagar por espaço: ");
        for (espaco espaco : centroCongressos.getListaEspacos()) {
            System.out.println("Espaço: " + espaco.getIdentificacao()
                    + "| Custo: " + espaco.calcularCustoFinal());
        }

        float SegurancaPrincipal = 0;
        for (espaco espaco : centroCongressos.getListaEspacos()) {
            if (espaco instanceof espacoPrincipal) {
                espacoPrincipal espacoPrincipal = (espacoPrincipal) espaco;
                SegurancaPrincipal += espacoPrincipal.calcularSeguranca();
            }
        }
        System.out.println("\nTotal de custo de segurança de espaços principais: "
                + SegurancaPrincipal);

        float Audiovisuais = 0;
        for (espaco espaco : centroCongressos.getListaEspacos()) {
            if (espaco instanceof sala) {
                sala sala = (sala) espaco;
                Audiovisuais += sala.calcularAudioVisual();
            } else if (espaco instanceof auditorio) {
                auditorio auditorio = (auditorio) espaco;
                Audiovisuais += auditorio.calcularAudioVisual();
            }
        }

        System.out.println("\nTotal de custo de equipamentos audiovisuais: "
                + Audiovisuais);

        float segurancaHalls = 0;
        for (espaco espaco : centroCongressos.getListaEspacos()) {
            if (espaco instanceof hall) {
                hall halls = (hall) espaco;
                segurancaHalls += halls.calcularSeguranca();
            }
        }
        System.out.println("\nTotal de segurança dos Halls: " + segurancaHalls);
    }
    
}