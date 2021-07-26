package GoodService;
// Status: READY

/**
 * Interface that handles accommodation transfers within the GoodService software.
 * @author João Borges, 1150475
 */
public interface AccommodationService {
    
    public static final boolean DEFAULT_SERVICE = false;
    
    public abstract boolean validateTransferService();
    
}