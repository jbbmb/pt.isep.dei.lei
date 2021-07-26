package nauticclub;
// Status: DONE
// Issues: NONE

import java.util.Calendar;

/**
 * Class that represents all senior members.
 * @author João Borges, 1150475
 */
public class SeniorMember extends Member {

    // Declaration of object variables
    private boolean isClubLeader;
    private double monthlyDebt;
    private double seniorDiscount;
    
    // Declaration of class wide variables
    private static float monthlyBaseAmount = 150;
    
    /**
     * Creates a Senior Member with customs fields.
     * @param name
     * @param taxPayerID
     * @param dateOfBirth 
     */
    public SeniorMember(String name, String taxPayerID, String dateOfBirth){
        super(name, taxPayerID, dateOfBirth);
        String[] dateData = dateOfBirth.split("/");
        int yearOfBirth = Integer.parseInt(dateData[2]);
        if(((Calendar.getInstance().get(Calendar.YEAR))-yearOfBirth) < 60){
            throw new IllegalArgumentException("Member needs to be at least 60 years old to be a Senior!");
        }else{
            this.isClubLeader = false;
            this.monthlyDebt = monthlyBaseAmount;
            this.seniorDiscount = 0;
        }
    }
    
    /**
     * Creates a Young Member with all fields set to default.
     */
    public SeniorMember(){
        super();
        this.isClubLeader = false;
        this.monthlyDebt = monthlyBaseAmount;
        this.seniorDiscount = 0;
        System.out.println("WARNING: please set date of birth for this person in order to calculate monthly fees!");
    }

    /**
     * Checks if a senior member is a Club Leader.
     * @return true if it is a Club Leader
     */
    public boolean getIsClubLeader() {
        return isClubLeader;
    }

    /**
     * Changes the status of Club Leader for a given Senior member.
     * @param isClubLeader 
     */
    public void setIsClubLeader(boolean isClubLeader) {
        this.isClubLeader = isClubLeader;
    }
    
    /**
     * Gets the monthly base amount for Senior members.
     * @return Senior monthly base
     */
    public static float getMonthlyBaseAmount() {
        return monthlyBaseAmount;
    }
    
    /**
     * Sets the Senior monthly base.
     * @param monthlyBaseAmount 
     */
    public static void setMonthlyBaseAmount(float monthlyBaseAmount) {
        SeniorMember.monthlyBaseAmount = monthlyBaseAmount;
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
     * Sets the monthly debt for a Senior Member.
     * @param monthlyDebt 
     */
    public void setMonthlyDebt(double monthlyDebt) {
        this.monthlyDebt = monthlyDebt;
    }

    /**
     * Get senior discount of a certain Senior Member.
     * @return senior member discount
     */
    public double getSeniorDiscount() {
        return seniorDiscount;
    }

    /**
     * Set senior discount.
     * @param seniorDiscount 
     */
    public void setSeniorDiscount(double seniorDiscount) {
        this.seniorDiscount = seniorDiscount;
    }
    
    /**
     * Summarizes all information for a given young member.
     * @return string with member's name, tax payer ID, date of birth, Club Leader status and monthly debt due.
     */
    @Override
    public String toString() {
        if(this.getIsClubLeader() == true){
            return String.format("ID: MSenior-%d%n%s%nMember IS a Club Leader and doesn't pay monthly fee.", super.getInternalID(), super.toString());
        }else{
            return String.format("ID: MSenior-%d%n%s%nMember IS NOT a Club Leader.%nMonthly Debt: %.02f€", super.getInternalID(), super.toString(), this.getMonthlyDebt());
        }
    }
    
    /**
     * Calculates the monthly debt.
     * @return monthly debt of Senior Member
     */
    @Override
    public double calculateMonthlyFee() {
        String memberDateOfBirth = this.getDateOfBirth();
        String[] dateData = memberDateOfBirth.split("/");
        int yearOfBirth = Integer.parseInt(dateData[2]);
        int age = ((Calendar.getInstance().get(Calendar.YEAR))-yearOfBirth);
        int ageDigit = (age/10);
        this.seniorDiscount = ((ageDigit-5)*0.1);
        double feeDebt = 0;
        if(this.getIsClubLeader() == true){
            return feeDebt;
        }else{
            feeDebt = (getMonthlyBaseAmount() - (getMonthlyBaseAmount() * this.seniorDiscount));
            return feeDebt;
        }
    }
    
}