package GoodService;
// Status: DONE
// Issues: NONE

/**
 * Class that represents all accommodation services.
 * @author João Borges, 1150475
 */
public abstract class Accommodation extends TaxableEntity implements AccommodationService {

    // Object variables
    private boolean transferService;
    
    // Class constructors
    /**
     * Creates a new accommodation service with custom values.
     * @param name service name
     * @param address service address
     * @param taxNumber service tax number
     * @param transferService transfer service availability
     */
    public Accommodation(String name, String address, int taxNumber, boolean transferService){
        super(name, address, taxNumber);
        this.transferService = transferService;
    }
    
    /**
     * Creates a new accommodation service with default values.
     */
    public Accommodation(){
        super();
        this.transferService = AccommodationService.DEFAULT_SERVICE;
    }

    /**
     * Sets the transfer service availability.
     * @param transferService transfer service availability
     */
    public void setTransferService(boolean transferService) {
        this.transferService = transferService;
    }
    
    /**
     * Checks if accommodation offers transfer service.
     * @return transfer service availability
     */
    @Override
    public boolean validateTransferService() {
        return transferService;
    }
    
    /**
     * Resumes all object information.
     * @return all information
     */
    @Override
    public String toString(){
       if(this.validateTransferService() == true){
           return String.format("%s\n\nTax number: %d\nAvailable services: Transfer", super.toString(), this.getTaxNumber());
       } else return String.format("%s\n\nTax number: %d\nAvailable services:", super.toString(), this.getTaxNumber());
    }
    
}