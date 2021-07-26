/**
 * @author João Borges, 1150475
 */
package taxpayer;

public class WorkPayerWithWorkIncome extends TaxPayer {

    private float workIncome;
    
    private static final float DEFAULT_WORK_INCOME = 0;
    
    public WorkPayerWithWorkIncome(String name, String address, float otherIncome, float workIncome) {
        super(name, address, otherIncome);
        this.workIncome = workIncome;
    }
    
    public WorkPayerWithWorkIncome() {
        super();
        this.workIncome = DEFAULT_WORK_INCOME;
    }

    public void setWorkIncome(float workIncome) {
        this.workIncome = workIncome;
    }

    public float getWorkIncome() {
        return workIncome;
    }
    
    @Override
    public String toString(){
        return String.format("WORK PAYER WITH WORK INCOME %n%s %nWork income: %.2f€", super.toString(), workIncome);
    }
    
    @Override
    public float calculateTax() {
        return getOtherIncome() * workIncome / 100; // Check if formula is correct
    }

}