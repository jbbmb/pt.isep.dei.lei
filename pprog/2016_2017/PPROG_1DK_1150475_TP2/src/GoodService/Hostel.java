package GoodService;
// Status: DONE
// Issues: NONE

import utilities.Time;

/**
 * Class that represents all hostels.
 * @author João Borges, 1150475
 */
public class Hostel extends Accommodation {
    
    // Object variables
    private Time receptionOpeningHours;
    private Time receptionClosingHours;
    
    // Default values for object variables
    private static final Time DEFAULT_RECEPTION_OPENING_HOURS = new Time(8, 0, 0);
    private static final Time DEFAULT_RECEPTION_CLOSING_HOURS = new Time(20, 0, 0);
    
    // Class constructors
    /**
     * Creates a Hostel with custom values.
     * @param name Hostel name
     * @param address Hostel address
     * @param taxNumber Hostel tax number
     * @param transferService Hostel transfer service availability
     * @param receptionOpeningHours Hostel reception opening hours
     * @param receptionClosingHours Hostel reception closing hours
     */
    public Hostel(String name, String address, int taxNumber, boolean transferService, Time receptionOpeningHours, Time receptionClosingHours){
        super(name, address, taxNumber, transferService);
        this.receptionOpeningHours = receptionOpeningHours;
        this.receptionClosingHours = receptionClosingHours;
    }
    
    /**
     * Creates a hostel with default values.
     */
    public Hostel(){
        super();
        this.receptionOpeningHours = DEFAULT_RECEPTION_OPENING_HOURS;
        this.receptionClosingHours = DEFAULT_RECEPTION_CLOSING_HOURS;
    }

    /**
     * Gets the hostel's reception opening hours.
     * @return opening hours
     */
    public String getReceptionOpeningHours() {
        return receptionOpeningHours.toString();
    }
    
    /**
     * Gets the hostel's reception closing hours.
     * @return closing hours
     */
    public String getReceptionClosingHours() {
        return receptionClosingHours.toString();
    }

    /**
     * Sets the hostel's reception opening hours.
     * @param receptionOpeningHours new opening hours
     */
    public void setReceptionOpeningHours(Time receptionOpeningHours) {
        this.receptionOpeningHours = receptionOpeningHours;
    }

    /**
     * Sets the hostel's reception closing hours.
     * @param receptionClosingHours new closing hours
     */
    public void setReceptionClosingHours(Time receptionClosingHours) {
        this.receptionClosingHours = receptionClosingHours;
    }
    
    @Override
    public String toString(){
        if(this.validateTransferService() == false){
            return String.format("%s None\nReception hours: %s - %s", super.toString(), this.getReceptionOpeningHours(), this.getReceptionClosingHours());
        } else return String.format("%s\nReception hours: %s - %s", super.toString(), this.getReceptionOpeningHours(), this.getReceptionClosingHours());
    }
    
}