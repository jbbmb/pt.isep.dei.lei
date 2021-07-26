package nauticclub;
// Status: DONE
// Issues: NONE

/**
 * Class that represents all members.
 * @author João Borges, 1150475
 */
public abstract class Member {
    
    // Declaration of object variables
    private String name;
    private String taxPayerID;
    private String dateOfBirth;
    private int internalID;

    // Declaration of default values for object variables
    private static final String DEFAULT_NAME = "No name on file.";
    private static final String DEFAULT_TAX_PAYER_ID = "No tax payer ID on file.";
    private static final String DEFAULT_DATE_OF_BIRTH = "No date of birth on file.";
    
    // Declaration of class wide variables
    private static int internalCount = 0;
    
    /**
     * Creates a Member with customs fields.
     * @param name 
     * @param taxPayerID 
     * @param dateOfBirth 
     */
    public Member(String name, String taxPayerID, String dateOfBirth){
        internalCount++;
        this.internalID = internalCount;
        this.name = name;
        this.taxPayerID = taxPayerID;
        this.dateOfBirth = dateOfBirth;
    }
    
    /**
     * Creates a Member with all fields set to default.
     */
    public Member(){
        internalID++;
        this.internalID = internalCount;
        this.name = DEFAULT_NAME;
        this.taxPayerID = DEFAULT_TAX_PAYER_ID;
        this.dateOfBirth = DEFAULT_DATE_OF_BIRTH;
    }
    
    /**
     * Gets the member's internal ID number.
     * @return internal ID number
     */
    public int getInternalID() {
        return internalID;
    }
    
    /**
     * Gets the member's name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the member's name.
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the member's tax payer ID number.
     * @return tax payer ID number
     */
    public String getTaxPayerID() {
        return taxPayerID;
    }

    /**
     * Sets the member's tax payer ID number.
     * @param taxPayerID 
     */
    public void setTaxPayerID(String taxPayerID) {
        this.taxPayerID = taxPayerID;
    }

    /**
     * Gets the member's date of birth.
     * @return date of birth
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the member's date of birth.
     * @param dateOfBirth 
     */
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    /**
     * Summarizes all information for a given member.
     * @return string with member's name, tax payer ID and date of birth
     */
    @Override
    public String toString(){
        return String.format("Name: %s%nTax Payer ID: %s%nDate of birth: %s", getName(), getTaxPayerID(), getDateOfBirth());
    }
    
    /**
     * Calculates the monthly fee a certain member has to pay.
     * @return monthly fee in debt
     */
    public abstract double calculateMonthlyFee();
    
}