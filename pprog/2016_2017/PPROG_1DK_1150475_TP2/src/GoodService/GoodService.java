package GoodService;
// Status: DONE
// Issues: NONE

import java.util.ArrayList;
import java.util.List;

/**
 * Class that represents the GoodService company.
 * @author João Borges, 1150475
 */
public class GoodService {
    
    // Object variables
    private String name;
    private String phone;
    private int taxNumber;
    private List<Entity> registeredEntities;
    
    // Default values of object variables
    private static final String DEFAULT_NAME = "GoodService";
    private static final String DEFAULT_PHONE = "No phone on file.";
    private static final int DEFAULT_TAX_NUMBER = 123456789;
    
    // Class constructors
    /**
     * Creates an instance of the GoodService company with custom values.
     * @param name Name of company
     * @param phone Phone number of company
     * @param taxNumber Tax number of company
     */
    public GoodService(String name, String phone, int taxNumber){
        this.name = name;
        this.phone = phone;
        this.taxNumber = taxNumber;
        this.registeredEntities = new ArrayList<>();
    }
    
    /**
     * Creates an instance of the GoodService company with default values.
     */
    public GoodService(){
        this.name = DEFAULT_NAME;
        this.phone = DEFAULT_PHONE;
        this.taxNumber = DEFAULT_TAX_NUMBER;
        this.registeredEntities = new ArrayList<>();
    }

    // Variable gets
    /**
     * Get company name.
     * @return Company name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets company phone number.
     * @return company phone number
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Gets company tax number.
     * @return company tax number
     */
    public int getTaxNumber() {
        return taxNumber;
    }

    /**
     * Gets the list of registered entities.
     * @return List of registered entities
     */
    public List<Entity> getRegisteredEntities() {
        return registeredEntities;
    }
    
    // Variable sets
    /**
     * Sets a new company name.
     * @param name Company name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets a new company phone number.
     * @param phone Company phone number
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Sets a new company tax number.
     * @param taxNumber Company tax number
     */
    public void setTaxNumber(int taxNumber) {
        this.taxNumber = taxNumber;
    }

    /**
     * Adds a new entity to the official list of entities.
     * @param entity new entity
     */
    public void insertEntity(Entity entity){
        registeredEntities.add(entity);
    }
    
    /**
     * Resumes all object information.
     * @return all information
     */
    @Override
    public String toString(){
        return String.format("GoodService Company Information\nName: %s\nPhone number: %s\nTax number: %d\nNumber of registered entities: %d", this.getName(), this.getPhone(), this.getTaxNumber(), this.getRegisteredEntities().size());
    }
    
}