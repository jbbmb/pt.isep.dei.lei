package nauticclub;
// Status: DONE
// Issues: NONE

/**
 * Class that represents all young members.
 * @author João Borges, 1150475
 */
public abstract class YoungMember extends Member {
    
    // Declaration of object variables
    private int numberOfClasses;
    
    // Declaration of class wide variables
    private static float monthlyBaseAmount = 100;
    private static float costPerClass = 25;
    
    /**
     * Creates a Young Member with customs fields and one class.
     * @param name
     * @param taxPayerID
     * @param dateOfBirth 
     */
    public YoungMember(String name, String taxPayerID, String dateOfBirth){
        super(name, taxPayerID, dateOfBirth);
        this.numberOfClasses = 1;
    }
    
    /**
     * Creates a Young Member with all fields set to default.
     */
    public YoungMember(){
        super();
        this.numberOfClasses = 1;
    }

    /**
     * Gets the number of classes the Young Member has done.
     * @return total number of classes done
     */
    public int getNumberOfClasses() {
        return numberOfClasses;
    }

    /**
     * Sets the number of classes done by the Young Member.
     * @param numberOfClasses 
     */
    public void setNumberOfClasses(int numberOfClasses) {
        this.numberOfClasses = numberOfClasses;
    }

    /**
     * Gets the monthly base amount that is added to the bill.
     * @return monthly base amount added
     */
    public static float getMonthlyBaseAmount() {
        return monthlyBaseAmount;
    }

    /**
     * Sets the monthly base amount that is added to the bill.
     * @param monthlyBaseAmount 
     */
    public static void setMonthlyBaseAmount(float monthlyBaseAmount) {
        YoungMember.monthlyBaseAmount = monthlyBaseAmount;
    }

    /**
     * Gets the cost per class for Young Members.
     * @return cost per class
     */
    public static float getCostPerClass() {
        return costPerClass;
    }

    /**
     * Sets the cost per class for Young Members.
     * @param costPerClass 
     */
    public static void setCostPerClass(float costPerClass) {
        YoungMember.costPerClass = costPerClass;
    }
    
    /**
     * Adds a class to the Young Member.
     * @return new number of current classes taken
     */
    public int addClass(){
        this.numberOfClasses = numberOfClasses + 1;
        return numberOfClasses;
    }
    
    /**
     * Summarizes all information for a given young member.
     * @return string with member's name, tax payer ID, date of birth and number of classes done
     */
    @Override
    public String toString(){
        return String.format("%s%nNumber of classes taken: %02d", super.toString(), getNumberOfClasses());
    }
    
    /**
     * Calculates the monthly fee a certain member has to pay.
     * @return monthly fee in debt
     */
    @Override
    public abstract double calculateMonthlyFee();
    
}