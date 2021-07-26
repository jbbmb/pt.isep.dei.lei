package GoodService;
// Status: DONE
// Issues: NONE

/**
 * Class that represents all POI (Points Of Interest).
 * @author João Borges, 1150475
 */
public class POI extends Entity {
    
    // Object variables
    private TypeOfPOI category;
    public enum TypeOfPOI{CLASSIC, CONTEMPORARY, SQUARE, OTHER};
    
    // Default object variables
    private static final TypeOfPOI DEFAULT_CATEGORY = TypeOfPOI.OTHER;
    
    // Class constructors
    /**
     * Creates a new POI with custom values.
     * @param name POI name
     * @param address POI address
     * @param category POI category
     */
    public POI(String name, String address, String category){
        super(name, address);
        String aux = category.toUpperCase();
        this.category = TypeOfPOI.valueOf(aux);
    }
    
    /**
     * Creates a POI with default values.
     */
    public POI(){
        super();
        this.category = DEFAULT_CATEGORY;
    }

    /**
     * Gets the category/type of a POI.
     * @return category of POI
     */
    public TypeOfPOI getCategory() {
        return category;
    }

    /**
     * Sets the category/type of a POI.
     * @param category new category of POI
     */
    public void setCategory(String category) {
        String aux = category.toUpperCase();
        this.category = TypeOfPOI.valueOf(aux);
    }
    
    /**
     * Resumes all object information.
     * @return all information
     */
    @Override
    public String toString() {
        switch (this.getCategory()) {
            case CLASSIC:
                return String.format("%s\n\nType: Point Of Interest\nCategory: Classic monument", super.toString());
            case CONTEMPORARY:
                return String.format("%s\n\nType: Point Of Interest\nCategory: Contemporary monument", super.toString());
            case SQUARE:
                return String.format("%s\n\nType: Point Of Interest\nCategory: Square", super.toString());
            case OTHER:
                return String.format("%s\n\nType: Point Of Interest\nCategory: Other", super.toString());
            default:
                return String.format("%s\n\nType: Point Of Interest\nCategory: Other", super.toString());
        }
    }
    
}