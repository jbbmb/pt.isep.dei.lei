/**
 * @author João Borges, 1150475
 */
package taxpayer;

public class Unemployed extends TaxPayer {
    
    private int monthsUnemployed;
    
    private static final int DEFAULT_MONTHS_UNEMPLOYED = 0;
    
    private static float otherIncomeTax = 2;

    public Unemployed(String name, String address, float otherIncome, int monthsUnemployed) {
        super(name, address, otherIncome);
        this.monthsUnemployed = monthsUnemployed;
    }
    
    public Unemployed() {
        super();
        this.monthsUnemployed = DEFAULT_MONTHS_UNEMPLOYED;
    }
    
    public void setMonthsUnemployed(int monthsUnemployed) {
        this.monthsUnemployed = monthsUnemployed;
    }

    public static void setOtherIncomeTax(float otherIncomeTax) {
        Unemployed.otherIncomeTax = otherIncomeTax;
    }
    
    public int getMonthsUnemployed() {
        return monthsUnemployed;
    }

    public static float getOtherIncomeTax() {
        return otherIncomeTax;
    }
    
    @Override
    public String toString() {
        return String.format("UNEMPLOYED %n%s %nNumber of months unemployed: %d %nOther income tax: %.1f%%", super.toString(), monthsUnemployed, otherIncomeTax);
    }
    
    @Override
    public float calculateTax() {
        float taxResult = (getOtherIncome() * otherIncomeTax) / 100;
        return taxResult;
    }
    
}