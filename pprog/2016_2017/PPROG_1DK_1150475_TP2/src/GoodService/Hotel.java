package GoodService;
// Status: DONE
// Issues: NONE

/**
 * Class that represents all hotels.
 * @author João Borges, 1150475
 */
public class Hotel extends Accommodation implements HotelService {

    // Object variables
    private String category;
    private boolean guideServiceAvailability;
    private boolean SPAServiceAvailability;
    
    // Default object variables
    private static final boolean GUIDE_SERVICE_DEFAULT_AVAILABILITY = false;
    private static final boolean SPA_SERVICE_DEFAULT_AVAILABILITY = false;
    
    // Class constructors
    /**
     * Creates a new Hotel with custom values.
     * @param name Hotel name
     * @param address Hotel address
     * @param taxNumber Hotel tax number
     * @param transferService Hotel Transfer Service Availability
     * @param category number of stars
     * @param guideServiceAvailability Hotel Guide Service Availability
     * @param SPAServiceAvailability Hotel SPA Service Availability
     */
    public Hotel(String name, String address, int taxNumber, boolean transferService, String category, boolean guideServiceAvailability, boolean SPAServiceAvailability){
        super(name, address, taxNumber, transferService);
        this.category = category;
        this.guideServiceAvailability = guideServiceAvailability;
        this.SPAServiceAvailability = SPAServiceAvailability;
    }
    
    /**
     * Creates a new Hotel with default values.
     */
    public Hotel(){
        super();
        this.category = HotelService.DEFAULT_CATEGORY;
        this.guideServiceAvailability = GUIDE_SERVICE_DEFAULT_AVAILABILITY;
        this.SPAServiceAvailability = SPA_SERVICE_DEFAULT_AVAILABILITY;
    }

    /**
     * Gets the hotel category.
     * @return number of stars
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the hotel category.
     * @param category number of stars
     */
    public void setCategory(String category) {
        if(category.endsWith("*") && category.length()<=5){
            this.category = category;
        } else System.out.println("\n\nWARNING\nInvalid hotel category!\n\n");
    }
    
    /**
     * Sets the availability of the hotel's Guide service.
     * @param guideServiceAvailability availability
     */
    public void setGuideServiceAvailability(boolean guideServiceAvailability) {
        this.guideServiceAvailability = guideServiceAvailability;
    }

    /**
     * Sets the availability of the hotel's SPA service.
     * @param SPAServiceAvailability availability
     */
    public void setSPAServiceAvailability(boolean SPAServiceAvailability) {
        this.SPAServiceAvailability = SPAServiceAvailability;
    }
    
    /**
     * Checks the availability of Guide Service in the selected hotel.
     * @return guide service availability
     */
    @Override
    public boolean validateGuideService() {
        return guideServiceAvailability;
    }

    /**
     * Checks the availability of SPA Service in the selected hotel.
     * @return SPA service availability
     */
    @Override
    public boolean validateSPAService() {
        return SPAServiceAvailability;
    }
    
    @Override
    /**
     * Resumes all Hotel information.
     * @return hotel info
     */
    public String toString() {
        if(this.validateGuideService() == true){
            if(this.validateSPAService() == true){
                return String.format("%s Guide SPA\nCategory: %s", super.toString(), this.getCategory());
            } else return String.format("%s Guide\nCategory: %s", super.toString(), this.getCategory());
        } else if(this.validateSPAService() == true){
                return String.format("%s SPA\nCategory: %s", super.toString(), this.getCategory());
            } else if(this.validateTransferService() == true){
                return String.format("%s\nCategory: %s", super.toString(), this.getCategory());
            } else return String.format("%s None\nCategory: %s", super.toString(), this.getCategory());
    }
    
}