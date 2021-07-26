package date;
/** @author João Borges (1150475) */

public class dateTests {

    public static void main(String[] args) {

        date data1 = new date(2016, 2, 29);
        System.out.println(data1.toString());
        
        date data2 = new date(1974,4,24);
        System.out.println(data2.toAnoMesDiaString());
        
        System.out.println(data1.isMaior(data2));
        
        System.out.println(data1.diferenca(data2));

        System.out.println(data1.diferenca(2016,12,25));
        
        System.out.println(data2.diaDaSemana());
        
        /**
        data2.isAnoBissexto(1974);
        não é possível executar este comando porque isAnoBissexto() trata-se de um método de classe.
        Assim, deve ser executrado a partir da classe com um int, como se demonstra a seguir.*/
        System.out.println(date.isAnoBissexto(1974));
        
    }
}
