/**
 * @author João Borges, 1150475
 */
package taxpayer;

public abstract class TaxPayer {
    
    private String name;
    private String address;
    private float otherIncome;
    
    private static final String DEFAULT_NAME = "No name on file.";
    private static final String DEFAULT_ADDRESS = "No address on file.";
    private static final float DEFAULT_OTHER_INCOME = 0;
    
    public TaxPayer(String name, String address, float otherIncome) {
        this.name = name;
        this.address = address;
        this.otherIncome = otherIncome;
    }
    
    public TaxPayer() {
        this.name = DEFAULT_NAME;
        this.address = DEFAULT_ADDRESS;
        this.otherIncome = DEFAULT_OTHER_INCOME;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setOtherIncome(float otherIncome) {
        this.otherIncome = otherIncome;
    }
    
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public float getOtherIncome() {
        return otherIncome;
    }
    
    @Override
    public String toString() {
        return String.format("Name: %s %nAddress: %s %nOther income: %.2f€", name, address, otherIncome);
    }
    
    public abstract float calculateTax();
    
}