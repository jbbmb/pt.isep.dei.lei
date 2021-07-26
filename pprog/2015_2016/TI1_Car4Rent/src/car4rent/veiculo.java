package car4rent;
/** @author João Borges (1150475) - LEI @ ISEP */

import java.util.Calendar;

public class veiculo {
    
    /** Needed variables */
    private String matricula;
    private int anoDeRegisto;
    private int consumo;
    private int autonomia;
    private int cilindrada;
    private int taxaAmbiental;
    private int menorValorReferencia;
    private int maiorValorReferencia;
    
    
    /** Default values of said variables */
    private static final String DEFAULT_MATRICULA = "inexistente";
    private static final int DEFAULT_ANODEREGISTO = 0;
    private static final int DEFAULT_CONSUMO = 0;
    private static final int DEFAULT_AUTONOMIA = 0;
    private static final int DEFAULT_CILINDRADA = 0;
    private static final int DEFAULT_TAXAAMBIENTAL = 1;
    private static final int DEFAULT_MENORVALORREFERENCIA = 1;
    private static final int DEFAULT_MAIORVALORREFERENCIA = 20;
    
    
    /** Object constructors */
    public veiculo(){
        matricula = DEFAULT_MATRICULA;
        anoDeRegisto = DEFAULT_ANODEREGISTO;
        consumo = DEFAULT_CONSUMO;
        autonomia = DEFAULT_AUTONOMIA;
        cilindrada = DEFAULT_CILINDRADA;
        taxaAmbiental = DEFAULT_TAXAAMBIENTAL;
    }
    
    public veiculo(String matricula){
        this.matricula = matricula;
        anoDeRegisto = DEFAULT_ANODEREGISTO;
        consumo = DEFAULT_CONSUMO;
        autonomia = DEFAULT_AUTONOMIA;
        cilindrada = DEFAULT_CILINDRADA;
        taxaAmbiental = DEFAULT_TAXAAMBIENTAL;
    }
    
    public veiculo(String matricula, int anoDeRegisto){
        this.matricula = matricula;
        this.anoDeRegisto = anoDeRegisto;
        consumo = DEFAULT_CONSUMO;
        autonomia = DEFAULT_AUTONOMIA;
        cilindrada = DEFAULT_CILINDRADA;
        taxaAmbiental = DEFAULT_TAXAAMBIENTAL;
    }
    
    public veiculo(String matricula, int anoDeRegisto, int consumo){
        this.matricula = matricula;
        this.anoDeRegisto = anoDeRegisto;
        this.consumo = consumo;
        autonomia = DEFAULT_AUTONOMIA;
        cilindrada = DEFAULT_CILINDRADA;
        taxaAmbiental = DEFAULT_TAXAAMBIENTAL;
    }
    
    public veiculo(String matricula, int anoDeRegisto, int consumo, int autonomia){
        this.matricula = matricula;
        this.anoDeRegisto = anoDeRegisto;
        this.consumo = consumo;
        this.autonomia = autonomia;
        cilindrada = DEFAULT_CILINDRADA;
        taxaAmbiental = DEFAULT_TAXAAMBIENTAL;
    }
    
    public veiculo(String matricula, int anoDeRegisto, int consumo, int autonomia, int cilindrada){
        this.matricula = matricula;
        this.anoDeRegisto = anoDeRegisto;
        this.consumo = consumo;
        this.autonomia = autonomia;
        this.cilindrada = cilindrada;
        taxaAmbiental = DEFAULT_TAXAAMBIENTAL;
    }
    
    public veiculo(String matricula, int anoDeRegisto, int consumo, int autonomia, int cilindrada, int taxaAmbiental){
        this.matricula = matricula;
        this.anoDeRegisto = anoDeRegisto;
        this.consumo = consumo;
        this.autonomia = autonomia;
        this.cilindrada = cilindrada;
        this.taxaAmbiental = taxaAmbiental;
    }
    
    
    /** Get variable values */
    public void getMatricula(){
        System.out.println("A matrícula deste veículo é " + matricula + ".");
    }
    
    public void getAnoDeRegisto(){
        System.out.println("Este veículo foi registado no ano " + anoDeRegisto + ".");
    }
    
    public void getConsumo(){
        System.out.println("O consumo deste veículo é " + consumo + "l/km.");
    }
    
    public void getAutonomia(){
        System.out.println("A autonomia deste veículo é " + autonomia + "km.");
    }
    
    public void getCilindrada(){
        System.out.println("A cilindrada deste veículo é " + cilindrada + "cc.");
    }

    public void getTaxaAmbiental(){
        System.out.println("A taxa ambiental aplicada a este veículo é de " + taxaAmbiental + "%.");
    }
    
    public String toString(){
        return "A matrícula do veículo é " + matricula + " e foi registado no ano " + anoDeRegisto + ". Tem um consumo de " + consumo + "l/km, uma autonomia de " + autonomia + "km e uma cilindrada de " + cilindrada + "cc. A taxa ambiental em vigor para este veículo é de " + taxaAmbiental + "%.";
    }
    
    
    /** Set variable values */
    public void setMatricula(String matricula){
        this.matricula = matricula;
        System.out.println("Matrícula alterada com sucesso para " + matricula +"!");
    }
    
    public void setAnoDeRegisto(int anoDeRegisto){
        this.anoDeRegisto = anoDeRegisto;
        System.out.println("Ano de registo alterado com sucesso para " + anoDeRegisto +"!");
    }
    
    public void setConsumo(int consumo){
        this.consumo = consumo;
        System.out.println("Consumo alterado com sucesso para " + consumo +"l/km!");
    }
    
    public void setAutonomia(int autonomia){
        this.autonomia = autonomia;
        System.out.println("Autonomia alterada com sucesso para " + autonomia +"km!");
    }
    
    public void setCilindrada(int cilindrada){
        this.cilindrada = cilindrada;
        System.out.println("Cilindrada alterada com sucesso para " + cilindrada +"cc!");
    }

    public void setTaxaAmbiental(int taxaAmbiental){
        this.taxaAmbiental = taxaAmbiental;
        System.out.println("Taxa ambiental alterada com sucesso para " + taxaAmbiental +"%!");
    }
    
    
    /** Function methods */
    public void calcularImpostoCirculacao(){
        int impostoCirculacao = (taxaAmbiental * cilindrada);
        System.out.println("O imposto de circulação a aplicar sobre este veículo é de " + impostoCirculacao + "€.");
    }
    
    public void classificacaoVeiculo(){
        int year = Calendar.getInstance().get(Calendar.YEAR);
        if ((year - anoDeRegisto)<DEFAULT_MENORVALORREFERENCIA){
            System.out.println("Este veículo é recente.");}
            else if ((year - anoDeRegisto)>DEFAULT_MAIORVALORREFERENCIA){
                System.out.println("Este veículo é clássico.");}
                else System.out.println("Este veículo é contemporâneo.");
    }
    
    public void classificacaoVeiculo(int menorValorReferencia, int maiorValorReferencia){
        this.menorValorReferencia = menorValorReferencia;
        this.maiorValorReferencia = maiorValorReferencia;
        int year = Calendar.getInstance().get(Calendar.YEAR);
        if ((year - anoDeRegisto)<menorValorReferencia){
            System.out.println("Dados os valores de referência indicados, este veículo é recente.");}
            else if ((year - anoDeRegisto)>maiorValorReferencia){
                System.out.println("Dados os valores de referência indicados, este veículo é clássico.");}
                else System.out.println("Dados os valores de referência indicados, este veículo é contemporâneo.");
    }
    
}