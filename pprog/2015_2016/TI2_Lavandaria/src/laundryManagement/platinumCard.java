package laundryManagement;
/** @author João Borges, 1150475 - LEI @ ISEP */

public class platinumCard extends discountCards {
    
    // Class variables
    private String cardID;
    private static int platinumCardCount;
    private double platinumBasePrice = 0.5;
    private static double monthlyFee = 50;
    private static double discount = 0.2;
    private int piecePlafond = 200;
    static int minimumRequiredPlatinum = 100;
    static double discountFee = 0.1;
    
    // Default class variable values
    private static final String DEFAULT_CARDID = "CSD-Platina-X";
    
    // Constructors
    public platinumCard(){
        this.clientName = DEFAULT_CLIENTNAME;
        this.taxID = DEFAULT_TAXID;
        this.numberPieces = 0;
        this.cardID = DEFAULT_CARDID;
    }
    
    public platinumCard(String clientName, String taxID){
        this.clientName = clientName;
        this.taxID = taxID;
        this.numberPieces = 0;
        platinumCardCount++;
        this.cardID = "CSD-Ouro-" + platinumCardCount;
    }
    
    // Information gets
    public String getCardID(){
        return cardID;
    }
    
    public int getPlatinumCardCount(){
        return platinumCardCount;
    }
    
    // Information sets     
    public void setPlatinumBasePrice(double platinumBasePrice){
        this.platinumBasePrice = platinumBasePrice;
        System.out.println("Preço base por peça dos cartões platina alterado com sucesso!");
    }
    
    public void setMinimumRequiredPlatinum(int minimumRequiredPlatinum){
        this.minimumRequiredPlatinum = minimumRequiredPlatinum;
        System.out.println("Número de peças para desconto nas mensalidade dos cartões platina alterado com sucesso!");
    }
    
    public void setDiscountFee(int discountFee){
        this.discountFee = discountFee;
        System.out.println("Desconto aplicado nas mensalidade dos cartões platina alterado com sucesso!");
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
        } else {
            numberPieces++;
        }
    }
    
    @Override
    public double monthlyPayment() {
        monthlyDebt = (monthlyFee + ((platinumBasePrice - (discount * platinumBasePrice)) * numberPieces));
        if (numberPieces > minimumRequiredPlatinum){
            return (monthlyDebt - (discountFee * monthlyFee));
        } else {
            return monthlyDebt;
        }
    }
    
    @Override
    public void resetMonth(){
        this.monthlyDebt = 0;
        this.piecePlafond = piecePlafond;
        System.out.println("Mês reiniciado para o cliente com o cartão " +cardID +" com sucesso!");
    }
   
}