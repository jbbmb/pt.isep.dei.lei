package laundryManagement;
/** @author João Borges, 1150475 - LEI @ ISEP */

public abstract class cards {
    
    // Super variables
    String clientName;
    String taxID;
    int numberPieces;
    double monthlyDebt;
    
    // Default super variable values
    static final String DEFAULT_CLIENTNAME = "nulo";
    static final String DEFAULT_TAXID = "nulo";
    
    // Super constructors
    public cards(){
        this.clientName = DEFAULT_CLIENTNAME;
        this.taxID = DEFAULT_TAXID;
        this.numberPieces = 0;
        this.monthlyDebt = 0;
    }
    
    public cards(String clientName, String taxID){
        this.clientName = clientName;
        this.taxID = taxID;
        this.numberPieces = 0;
        this.monthlyDebt = 0;
    }
    
    // Information gets and sets of super variables
    public String getName(){
        return clientName;
    }
    
    public void setName(String clientName){
        this.clientName = clientName;
    }
    
    public String getTaxID(){
        return taxID;
    }
    
    public void setTaxID(String taxID){
        this.taxID = taxID;
    }
    
    public int getNumberPieces(){
        return numberPieces;
    }
    
    public double getMonthlyDebt(){
        return monthlyDebt;
    }
    
    // Information stored on super class
    @Override
    public String toString(){
        return "Nome: " +clientName +"\nNúmero de contribuinte: " +taxID +"\n";
    }
    
    // Function methods to be implemented on each class
    public abstract double monthlyPayment();
    
    public abstract void resetMonth();
    
}