package laundryManagement;
/** @author João Borges, 1150475 - LEI @ ISEP */

public class goldCard extends discountCards {
    
    // Class variables
    private String cardID;
    private static int goldCardCount;
    private double goldBasePrice = 0.5;
    private static double monthlyFee = 10;
    private static double discount = 0.2;
    private int piecePlafond = 25;
    
    // Default class variable values
    private static final String DEFAULT_CARDID = "CSD-Ouro-X";
    
    // Constructors
    public goldCard(){
        this.clientName = DEFAULT_CLIENTNAME;
        this.taxID = DEFAULT_TAXID;
        this.numberPieces = 0;
        this.cardID = DEFAULT_CARDID;
    }
    
    public goldCard(String clientName, String taxID){
        this.clientName = clientName;
        this.taxID = taxID;
        this.numberPieces = 0;
        goldCardCount++;
        this.cardID = "CSD-Ouro-" + goldCardCount;
    }
    
    // Information gets
    public String getCardID(){
        return cardID;
    }
    
    public int getGoldCardCount(){
        return goldCardCount;
    }
    
    // Information sets     
    public void setGoldBasePrice(double goldBasePrice){
        this.goldBasePrice = goldBasePrice;
        System.out.println("Preço base por peça dos cartões ouro alterado com sucesso!");
    }
    
    // Information stored using this class
    @Override
    public String toString(){
        return super.toString() +"Identificador: " +cardID +"\nNúmero de peças lavadas extra: " +numberPieces +"\nSaldo atual: " +piecePlafond +" peças \nTotal a debitar no próximo mês: " +monthlyPayment() +"€";
    }
    
    // Function methods for objects of this class
    @Override
    public void addPiece(){
        if (piecePlafond > 0){
            piecePlafond--;
        } else numberPieces++;
    }
    
    @Override
    public double monthlyPayment() {
        monthlyDebt = (monthlyFee + ((goldBasePrice - (discount * goldBasePrice)) * numberPieces));
        return monthlyDebt;
    }
    
    @Override
    public void resetMonth(){
        this.monthlyDebt = 0;
        this.numberPieces = 0;
        this.piecePlafond = this.piecePlafond + piecePlafond;
        System.out.println("Mês reiniciado para o cliente com o cartão " +cardID +" com sucesso!");
    }

}