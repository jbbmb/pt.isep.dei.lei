package GoodService;
// Status: READY

/**
 * Interface that handles hotels within the GoodService software.
 * @author João Borges, 1150475
 */
public interface HotelService {
    
    public static final String ONE_STAR = "*";
    public static final String TWO_STARS = "**";
    public static final String THREE_STARS = "***";
    public static final String FOUR_STARS = "****";
    public static final String FIVE_STARS = "*****";
    public static final String DEFAULT_CATEGORY = ONE_STAR;
    
    public abstract boolean validateGuideService();
    public abstract boolean validateSPAService();
    
}