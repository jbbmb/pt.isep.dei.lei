package laundryManagement;
/** @author João Borges, 1150475 - LEI @ ISEP */

public class silverCard extends cards {

    // Class variables
    private String cardID;
    private static int silverCardCount;
    private static double silverBasePrice = 0.5;

    // Default variable values
    private static final String DEFAULT_CARDID = "CSD-Prata-X";

    // Constructors
    public silverCard(){
        super();
        this.cardID = DEFAULT_CARDID;
    }

    public silverCard(String clientName, String taxID){
        super(clientName, taxID);
        silverCardCount++;
        this.cardID = "CSD-Prata-" + silverCardCount;
    }

    // Information gets
    public String getCardID(){
        return cardID;
    }

    public int getSilverCardCount(){
        return silverCardCount;
    }

    public double getSilverBasePrice(){
        return silverBasePrice;
    }

    // Information sets
    public void setSilverBasePrice(double silverBasePrice){
        this.silverBasePrice = silverBasePrice;
        System.out.println("Preço base por peça dos cartões prata alterado com sucesso!");
    }

    // Information stored
    @Override
    public String toString(){
        return super.toString() +"Identificador: " +cardID +"\nNúmero de peças lavadas: " +numberPieces +"\nTotal a debitar no próximo mês: " +monthlyPayment() +"€"; 
    }

    // Function methods
    @Override
    public double monthlyPayment(){
        monthlyDebt = (numberPieces * silverBasePrice);
        return monthlyDebt;
    }

    @Override
    public void resetMonth(){
        this.monthlyDebt = 0;
        this.numberPieces = 0;
        System.out.println("Mês reiniciado para o cliente com o cartão " +cardID +" com sucesso!");
    }

    public int addPiece(){
        numberPieces++;
        return numberPieces;
    }
    
}