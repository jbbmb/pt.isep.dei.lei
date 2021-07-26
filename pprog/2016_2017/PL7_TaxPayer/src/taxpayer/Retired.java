/**
 * @author João Borges, 1150475
 */
package taxpayer;

public class Retired extends WorkPayerWithWorkIncome {
    
    private static float workIncomeTax = 1;
    private static float otherIncomeTax = 3;
    
    public Retired(String name, String address, float otherIncome, float workIncome) {
        super(name, address, otherIncome, workIncome);
    }
    
    public Retired(){
        super();
    }

    public static void setWorkIncomeTax(float workIncomeTax) {
        Retired.workIncomeTax = workIncomeTax;
    }

    public static void setOtherIncomeTax(float otherIncomeTax) {
        Retired.otherIncomeTax = otherIncomeTax;
    }

    public static float getWorkIncomeTax() {
        return workIncomeTax;
    }

    public static float getOtherIncomeTax() {
        return otherIncomeTax;
    }
    
    @Override
    public String toString() {
        return String.format("RETIRED %n%s", super.toString());
    }
    
    @Override
    public float calculateTax() {
        float taxResult = ((getWorkIncome() * workIncomeTax) + (getOtherIncome() * otherIncomeTax)) / 100;
        return taxResult;
    }
    
}