package GoodService;
// Status: DONE
// Issues: NONE

/**
 * Class that represents all Restaurants.
 * @author João Borges, 1150475
 */
public class Restaurant extends TaxableEntity implements AveragePriceService {
    
    // Object variables
    private float pricePerPerson;
    private TypeOfFood category;
    public enum TypeOfFood{PORTUGUESE, ITALIAN, CHINESE, OTHER};
    
    // Default object variables
    private static final float DEFAULT_PRICE_PER_PERSON = 0;
    private static final TypeOfFood DEFAULT_CATEGORY = TypeOfFood.PORTUGUESE;
    
    // Class constructors
    /**
     * Creates a restaurant with custom values.
     * @param name Restaurant name
     * @param address Restaurant address
     * @param taxNumber Restaurant tax number
     * @param pricePerPerson Restaurant's price per person
     * @param category Restaurant category
     */
    public Restaurant(String name, String address, int taxNumber, float pricePerPerson, String category){
        super(name, address, taxNumber);
        this.pricePerPerson = pricePerPerson;
        String aux = category.toUpperCase();
        this.category = TypeOfFood.valueOf(aux);
    }
    
    /**
     * Creates a restaurant with default values.
     */
    public Restaurant(){
        super();
        this.pricePerPerson = DEFAULT_PRICE_PER_PERSON;
        this.category = DEFAULT_CATEGORY;
    }

    /**
     * Gets the restaurant's category/type of food.
     * @return type of food
     */
    public TypeOfFood getCategory() {
        return category;
    }

    /**
     * Sets a new average price per person.
     * @param pricePerPerson average price per person
     */
    public void setPricePerPerson(float pricePerPerson) {
        this.pricePerPerson = pricePerPerson;
    }

    /**
     * Sets a new category/type of food.
     * @param category 
     */
    public void setCategory(String category) {
        String aux = category.toUpperCase();
        this.category = TypeOfFood.valueOf(aux);
    }
    
    /**
     * Gets the restaurant's average price per person.
     * @return average price per person
     */
    @Override
    public float getAveragePricePerPerson() {
        return pricePerPerson;
    }
    
    @Override
    public String toString(){
        if(this.getAveragePricePerPerson() == 0){
            switch (this.getCategory()) {
            case PORTUGUESE:
                return String.format("%s\n\nType: Restaurant\nCategory: Portuguese traditional food\nPricing information unavailable!\n\nOther information\nTax number: %d", super.toString(), this.getTaxNumber());
            case ITALIAN:
                return String.format("%s\n\nType: Restaurant\nCategory: Italian food\nPricing information unavailable!\n\nOther information\nTax number: %d", super.toString(), this.getTaxNumber());
            case CHINESE:
                return String.format("%s\n\nType: Restaurant\nCategory: Chinese food\nPricing information unavailable!\n\nOther information\nTax number: %d", super.toString(), this.getTaxNumber());
            case OTHER:
                return String.format("%s\n\nType: Restaurant\nCategory: Other\nPricing information unavailable!\n\nOther information\nTax number: %d", super.toString(), this.getTaxNumber());
            default:
                return String.format("%s\n\nType: Restaurant\nCategory: Other\nPricing information unavailable!\n\nOther information\nTax number: %d", super.toString(), this.getTaxNumber());
            }
        } else switch (this.getCategory()) {
            case PORTUGUESE:
                return String.format("%s\n\nType: Restaurant\nCategory: Portuguese traditional food\nAverage price per person: %.2f€\n\nOther information\nTax number: %d", super.toString(), this.getAveragePricePerPerson(), this.getTaxNumber());
            case ITALIAN:
                return String.format("%s\n\nType: Restaurant\nCategory: Italian food\nAverage price per person: %.2f€\n\nOther information\nTax number: %d", super.toString(), this.getAveragePricePerPerson(), this.getTaxNumber());
            case CHINESE:
                return String.format("%s\n\nType: Restaurant\nCategory: Chinese food\nAverage price per person: %.2f€\n\nOther information\nTax number: %d", super.toString(), this.getAveragePricePerPerson(), this.getTaxNumber());
            case OTHER:
                return String.format("%s\n\nType: Restaurant\nCategory: Other\nAverage price per person: %.2f€\n\nOther information\nTax number: %d", super.toString(), this.getAveragePricePerPerson(), this.getTaxNumber());
            default:
                return String.format("%s\n\nType: Restaurant\nCategory: Other\nAverage price per person: %.2f€\n\nOther information\nTax number: %d", super.toString(), this.getAveragePricePerPerson(), this.getTaxNumber());
            }
    }
    
}