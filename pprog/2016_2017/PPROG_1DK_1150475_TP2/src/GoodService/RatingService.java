package GoodService;
// Status: READY

/**
 * Interface that allows ratings within the GoodService software.
 * @author João Borges, 1150475
 */
public interface RatingService {
    
    public static final int WEAK = 1;
    public static final int OK = 2;
    public static final int GOOD = 3;
    public static final int GREAT = 4;
    public static final int EXCELLENT = 5;
    
    public abstract float getRating();
    public abstract void updateRating(int val);
    
}