/**
 * @author João Borges, 1150475
 */
package taxpayer;

public class CompanyEmployee extends WorkPayerWithWorkIncome {
    
    private String companyName;
    
    private static final String DEFAULT_COMPANY_NAME = "No company name on file.";
    
    private static float workIncomeBoundary = 30000;
    private static float workIncomeTax1 = 1;
    private static float workIncomeTax2 = 2;
    private static float otherIncomeTax = 2;
    
    public CompanyEmployee(String name, String address, float otherIncome, float workIncome, String companyName) {
        super(name, address, otherIncome, workIncome);
        this.companyName = companyName;
    }
    
    public CompanyEmployee() {
        super();
        this.companyName = DEFAULT_COMPANY_NAME;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public static void setWorkIncomeBoundary(float workIncomeBoundary) {
        CompanyEmployee.workIncomeBoundary = workIncomeBoundary;
    }

    public static void setWorkIncomeTax1(float workIncomeTax1) {
        CompanyEmployee.workIncomeTax1 = workIncomeTax1;
    }

    public static void setWorkIncomeTax2(float workIncomeTax2) {
        CompanyEmployee.workIncomeTax2 = workIncomeTax2;
    }

    public static void setOtherIncomeTax(float otherIncomeTax) {
        CompanyEmployee.otherIncomeTax = otherIncomeTax;
    }

    public String getCompanyName() {
        return companyName;
    }

    public static String getDEFAULT_COMPANY_NAME() {
        return DEFAULT_COMPANY_NAME;
    }

    public static float getWorkIncomeBoundary() {
        return workIncomeBoundary;
    }

    public static float getWorkIncomeTax1() {
        return workIncomeTax1;
    }

    public static float getWorkIncomeTax2() {
        return workIncomeTax2;
    }

    public static float getOtherIncomeTax() {
        return otherIncomeTax;
    }

    @Override
    public String toString() {
        return String.format("COMPANY EMPLOYEE %n%s %nCompany name: %s", super.toString(), companyName);
    }
    
    @Override
    public float calculateTax() {
        float taxResult;
        if(getWorkIncome()>workIncomeBoundary){
            taxResult = ((getWorkIncome() * workIncomeTax2) + (getOtherIncome() * otherIncomeTax)) / 100;
        } else taxResult = ((getWorkIncome() * workIncomeTax1) + (getOtherIncome() * otherIncomeTax)) / 100;
        return taxResult;
    }

}