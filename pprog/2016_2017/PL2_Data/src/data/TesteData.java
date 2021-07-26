/**
 * @author João Borges, 1150475
 */
package data;

public class TesteData {
    
    public static void main (String [] args){
        
        //Ex. 2a)
        Data data1 = new Data(2017, 2, 23);
        
        //Ex. 2b)
        System.out.println(data1.toString());
        
        //Ex. 2c)
        Data data2 = new Data(1974, 4, 25);
        
        //Ex. 2d)
        System.out.println(data2.toAnoMesDiaString());
        
        //Ex. 2e)
        System.out.println(data1.isMaior(data2));
        
        //Ex. 2f)
        System.out.println(data1.diferenca(1974, 4, 25));
        
        //Ex. 2g)
        System.out.println("Faltam " +data1.diferenca(2017, 12, 24) +" dias para o Natal.");
        
        //Ex. 2h)
        System.out.println(data2.diaDaSemana());
        
        //Ex. i)
            //Através do objeto data2
            System.out.println(data2.isAnoBissexto(data2.getAno()));
            //Através da classe Data
            int anoSelecionado = data2.getAno();
            System.out.println(Data.isAnoBissexto(anoSelecionado));
            
    }
    
}