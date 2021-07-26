package car4rent;
/** @author João Borges (1150475) - LEI @ ISEP */

public class veiculoTests {
    public static void main(String[] args) {
        
        veiculo veiculo1 = new veiculo();
        System.out.println(veiculo1.toString());
        veiculo1.classificacaoVeiculo();
        veiculo1.calcularImpostoCirculacao();

        veiculo veiculo2 = new veiculo("88-23-TX", 2014, 6, 250, 30);
        System.out.println(veiculo2.toString());
        veiculo2.classificacaoVeiculo();
        veiculo2.calcularImpostoCirculacao();
        
        veiculo veiculo3 = new veiculo("54-DF-90", 2002, 8, 200, 30, 3);
        System.out.println(veiculo3.toString());
        veiculo3.classificacaoVeiculo();
        veiculo3.calcularImpostoCirculacao();
        
        
        /** Alterando apenas os valores de referência das classificações... */
        veiculo veiculo4 = new veiculo();
        System.out.println(veiculo4.toString());
        veiculo4.classificacaoVeiculo(3, 20);
        veiculo4.calcularImpostoCirculacao();
        
        veiculo veiculo5 = new veiculo("88-23-TX", 2014, 6, 250, 30);
        System.out.println(veiculo5.toString());
        veiculo5.classificacaoVeiculo(3, 20);
        veiculo5.calcularImpostoCirculacao();
        
        veiculo veiculo6 = new veiculo("54-DF-90", 2002, 8, 200, 30, 3);
        System.out.println(veiculo6.toString());
        veiculo6.classificacaoVeiculo(3, 20);
        veiculo6.calcularImpostoCirculacao();
    }
}