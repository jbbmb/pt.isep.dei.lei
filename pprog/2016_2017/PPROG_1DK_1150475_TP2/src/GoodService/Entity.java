package GoodService;
// Status: DONE
// Issues: NONE

/**
 * Class that represents all the registered entities.
 * @author João Borges, 1150475
 */
public abstract class Entity implements RatingService {

    // Object variables
    private String name;
    private String address;
    private int entityPoints;
    private int timesEvaluated;
    
    // Default values of object variables
    private static final String DEFAULT_NAME = "No name on file.";
    private static final String DEFAULT_ADDRESS = "No address on file.";
    private static final int DEFAULT_ENTITY_POINTS = 0;
    private static final int DEFAULT_TIMES_EVALUATED = 0;
    
    // Class constructors
    /**
     * Creates an entity with custom values and starts rating at zero.
     * @param name Entity name
     * @param address Entity address
     */
    public Entity(String name, String address){
        this.name = name;
        this.address = address;
        this.entityPoints = DEFAULT_ENTITY_POINTS;
        this.timesEvaluated = DEFAULT_TIMES_EVALUATED;
    }
    
    /**
     * Creates an entity with default values and starts rating at zero.
     */
    public Entity(){
        this.name = DEFAULT_NAME;
        this.address = DEFAULT_ADDRESS;
        this.entityPoints = DEFAULT_ENTITY_POINTS;
        this.timesEvaluated = DEFAULT_TIMES_EVALUATED;
    }

    /**
     * Gets the entity name.
     * @return Entity name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the entity address.
     * @return Entity address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Gets the total of points earned by the entity.
     * @return Entity points
     */
    public int getEntityPoints() {
        return entityPoints;
    }

    /**
     * Gets the total of time the entity has been evaluated.
     * @return Times the entity has been evaluated
     */
    public int getTimesEvaluated() {
        return timesEvaluated;
    }
    
    /**
     * Sets a new name for the entity.
     * @param name Entity name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets a new address for the entity.
     * @param address Entity address
     */
    public void setAddress(String address) {
        this.address = address;
    }
    
    /**
     * Gets the entity rating.
     * @return Entity rating
     */
    @Override
    public float getRating() {
        float currentRating = 0;
        if(this.getTimesEvaluated() == 0){
            return currentRating;
        } else currentRating = (this.getEntityPoints())/(this.getTimesEvaluated());
        return currentRating;
    }

    /**
     * Updates the entity rating with the customer's opinion.
     * @param val 
     */
    @Override
    public void updateRating(int val) {
        this.entityPoints = this.entityPoints + val;
        this.timesEvaluated++;
    }
    
    /**
     * Resumes all object information.
     * @return all information
     */
    @Override
    public String toString(){
        return String.format("%s | %s\nCurrent rating: %.1f", this.getName(), this.getAddress(), this.getRating());
    }
    
}