package nauticclub;
// Status: DONE
// Issues: NONE

import java.util.Calendar;

/**
 * Class that represents all adult members.
 * @author João Borges, 1150475
 */
public class AdultMember extends YoungMember {

    // Declaration of object variables
    private boolean isClubLeader;
    private double monthlyDebt;
    
    /**
     * Creates an Adult Member with customs fields and one class.
     * @param name
     * @param taxPayerID
     * @param dateOfBirth 
     */
    public AdultMember(String name, String taxPayerID, String dateOfBirth){
        super(name, taxPayerID, dateOfBirth);
        String[] dateData = dateOfBirth.split("/");
        int yearOfBirth = Integer.parseInt(dateData[2]);
        if(((Calendar.getInstance().get(Calendar.YEAR))-yearOfBirth) < 18){
            throw new IllegalArgumentException("Member needs to be at least 18 years old to be an Adult!");
        }else{
            this.isClubLeader = false;
            this.monthlyDebt = YoungMember.getMonthlyBaseAmount();
        }
    }
    
    /**
     * Creates an Adult Member with all fields set to default.
     */
    public AdultMember(){
        super();
        this.isClubLeader = false;
        this.monthlyDebt = YoungMember.getMonthlyBaseAmount();
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
     * Changes the status of Club Leader for a given Adult member.
     * @param isClubLeader 
     */
    public void setIsClubLeader(boolean isClubLeader) {
        this.isClubLeader = isClubLeader;
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
     * Summarizes all information for a given young member.
     * @return string with member's name, tax payer ID, date of birth, Club Leader status, monthly debt due and number of classes.
     */
    @Override
    public String toString() {
        if(this.getIsClubLeader() == true){
            return String.format("ID: MAdult-%d%n%s%nMember IS a Club Leader and doesn't pay monthly fee.", super.getInternalID(), super.toString());
        }else{
            return String.format("ID: MAdult-%d%n%s%nMember IS NOT a Club Leader.%nMonthly Debt: %.02f€", super.getInternalID(), super.toString(), this.getMonthlyDebt());
        }
    }
    
    /**
     * Calculates the monthly debt.
     * @return monthly debt of Adult Member
     */
    @Override
    public double calculateMonthlyFee() {
        double feeDebt = ((YoungMember.getMonthlyBaseAmount()) + ((this.getNumberOfClasses())*(YoungMember.getCostPerClass())));
        return feeDebt;
    }
    
}