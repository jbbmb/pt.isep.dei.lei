/**
 * @author João Borges, 1150475
 */
package taxpayer;

public class SelfEmployedWorker extends WorkPayerWithWorkIncome{
    
    private String profession;
    
    private static final String DEFAULT_PROFESSION = "No profession on file.";
    
    private static float otherIncomeBoundary = 50000;
    private static float otherIncomeTax1 = 2;
    private static float otherIncomeTax2 = 5;
    private static float workIncomeTax = 3;
    
    public SelfEmployedWorker(String name, String address, float otherIncome, float workIncome, String profession) {
        super(name, address, otherIncome, workIncome);
        this.profession = profession;
    }
    
    public SelfEmployedWorker() {
        super();
        this.profession = DEFAULT_PROFESSION;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public static void setOtherIncomeBoundary(float otherIncomeBoundary) {
        SelfEmployedWorker.otherIncomeBoundary = otherIncomeBoundary;
    }

    public static void setOtherIncomeTax1(float otherIncomeTax1) {
        SelfEmployedWorker.otherIncomeTax1 = otherIncomeTax1;
    }

    public static void setOtherIncomeTax2(float otherIncomeTax2) {
        SelfEmployedWorker.otherIncomeTax2 = otherIncomeTax2;
    }

    public static void setWorkIncomeTax(float workIncomeTax) {
        SelfEmployedWorker.workIncomeTax = workIncomeTax;
    }

    public String getProfession() {
        return profession;
    }

    public static String getDEFAULT_PROFESSION() {
        return DEFAULT_PROFESSION;
    }

    public static float getOtherIncomeBoundary() {
        return otherIncomeBoundary;
    }

    public static float getOtherIncomeTax1() {
        return otherIncomeTax1;
    }

    public static float getOtherIncomeTax2() {
        return otherIncomeTax2;
    }

    public static float getWorkIncomeTax() {
        return workIncomeTax;
    }
    
    @Override
    public String toString() {
        return String.format("SELF EMPLOYED %n%s %nProfession: %s", super.toString(), profession);
    }
    
    @Override
    public float calculateTax() {
        float taxResult;
        if(getOtherIncome()>otherIncomeBoundary){
            taxResult = ((getWorkIncome() * workIncomeTax) + (getOtherIncome() * otherIncomeTax2)) / 100;
        } else taxResult = ((getWorkIncome() * workIncomeTax) + (getOtherIncome() * otherIncomeTax1)) / 100;
        return taxResult;
    }
    
}