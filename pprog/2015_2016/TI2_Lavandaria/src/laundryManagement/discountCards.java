package laundryManagement;
/** @author João Borges, 1150475 - LEI @ ISEP */

public abstract class discountCards extends cards {
    
    // Variables of this abstract class
    static double monthlyFee;
    static double discount;
    int piecePlafond;
    
    // Information gets
    public double getMonthlyFee(){
        return monthlyFee;
    }
    
    public double getDiscount(){
        return discount;
    }
        
    public int getPiecePlafond(){
        return piecePlafond;
    }
    
    // Information sets
    public void setMonthlyFee(double monthlyFee){
        this.monthlyFee = monthlyFee;
        System.out.println("Valor da mensalidade fixa alterada com sucesso!");
    }
    
    public void setDiscount(double discount){
        this.discount = discount;
        System.out.println("Valor do desconto sobre o preço base alterado com sucesso!");
    }
        
    public void setPiecePlafond(int piecePlafond){
        this.piecePlafond = piecePlafond;
        System.out.println("Valor do saldo base alterado com sucesso!");
    }

    // Function methods to be implemented on each class
    public abstract void addPiece();
    
}