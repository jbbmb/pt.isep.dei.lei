package GoodService;
// Status: DONE
// Issues: NONE

/**
 * Class that represents all taxable entities.
 * @author João Borges, 1150475
 */
public abstract class TaxableEntity extends Entity {
    
    // Object variables
    private int taxNumber;
    
    // Default object variables
    private static final int DEFAULT_TAX_NUMBER = 123456789;
    
    // Class constructors
    public TaxableEntity(String name, String address, int taxNumber){
        super(name, address);
        this.taxNumber = taxNumber;
    }
    
    public TaxableEntity(){
        super();
        this.taxNumber = DEFAULT_TAX_NUMBER;
    }
    
    /**
     * Gets the entity's tax number.
     * @return tax number
     */
    public int getTaxNumber() {
        return taxNumber;
    }
    
    /**
     * Sets a new entity tax number.
     * @param taxNumber tax number
     */
    public void setTaxNumber(int taxNumber) {
        this.taxNumber = taxNumber;
    }
    
}