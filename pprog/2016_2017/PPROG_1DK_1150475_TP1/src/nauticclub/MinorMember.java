package nauticclub;
// Status: DONE
// Issues: NONE

import java.util.Calendar;

/**
 * Class that represents all minor members.
 * @author João Borges, 1150475
 */
public class MinorMember extends YoungMember {

    // Declaration of object variables
    private double monthlyDebt;
    private String guardianName;
    
    // Declaration of default values for object variables
    private static final String DEFAULT_GUARDIAN_NAME = "No guardian name on file.";
    
    // Declaration of class wide variables
    private static double minorDiscount = 0.2;
    
    /**
     * Creates a Minor Member with customs fields and one class.
     * @param name
     * @param taxPayerID
     * @param dateOfBirth 
     * @param guardianName 
     */
    public MinorMember(String name, String taxPayerID, String dateOfBirth, String guardianName){
        super(name, taxPayerID, dateOfBirth);
        String[] dateData = dateOfBirth.split("/");
        int yearOfBirth = Integer.parseInt(dateData[2]);
        if(((Calendar.getInstance().get(Calendar.YEAR))-yearOfBirth) > 18){
            throw new IllegalArgumentException("Member needs to be under 18 years old to be a Minor!");
        }else{
            this.monthlyDebt = YoungMember.getMonthlyBaseAmount();
            this.guardianName = guardianName;
        }
    }
    
    /**
     * Creates a Minor Member with all fields set to default.
     */
    public MinorMember(){
        super();
        this.monthlyDebt = YoungMember.getMonthlyBaseAmount();
        this.guardianName = DEFAULT_GUARDIAN_NAME;
        System.out.println("WARNING: please set date of birth for this person in order to calculate monthly fees!");
    }

    /**
     * Gets the calculated monthly debt.
     * @return monthly debt of Senior Member
     */
    public double getMonthlyDebt() {
        this.monthlyDebt = calculateMonthlyFee();
        return monthlyDebt;
    }

    /**
     * Sets the monthly debt for a Minor Member.
     * @param monthlyDebt 
     */
    public void setMonthlyDebt(double monthlyDebt) {
        this.monthlyDebt = monthlyDebt;
    }

    /**
     * Gets the guardian's name of a Minor Member.
     * @return guardian name
     */
    public String getGuardianName() {
        return guardianName;
    }

    /**
     * Sets the guardian's name of a Minor Member.
     * @param guardianName 
     */
    public void setGuardianName(String guardianName) {
        this.guardianName = guardianName;
    }

    /**
     * Gets the current minor discount.
     * @return minor discount
     */
    public static double getMinorDiscount() {
        return minorDiscount;
    }

    /**
     * Sets the minor discount.
     * @param minorDiscount 
     */
    public static void setMinorDiscount(double minorDiscount) {
        MinorMember.minorDiscount = minorDiscount;
    }
    
    /**
     * Summarizes all information for a given young member.
     * @return string with member's name, tax payer ID, date of birth, number of classes, monthly debt due and guardian name.
     */
    @Override
    public String toString() {
        return String.format("ID: MMinor-%d%n%s%nMonthly Debt: %.02f€%nGuardian's name: %s", super.getInternalID(), super.toString(), this.getMonthlyDebt(), this.getGuardianName());
    }
    
    @Override
    public double calculateMonthlyFee() {
        double feeDebt = ((YoungMember.getMonthlyBaseAmount()) - (YoungMember.getMonthlyBaseAmount() * getMinorDiscount()) + ((this.getNumberOfClasses())*(YoungMember.getCostPerClass())));
        return feeDebt;
    }
    
}