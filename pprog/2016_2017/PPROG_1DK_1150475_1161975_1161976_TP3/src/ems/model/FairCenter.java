package ems.model;
// STATUS: DONE
// ISSUES: NONE

import ems.model.registry.EventRegistry;
import ems.model.user.User;
import ems.model.registry.UserRegistry;
import java.io.Serializable;

/**
 * Class representative of the fair center.
 * @author 1DK_1150475_1161975_1161976
 */
public class FairCenter implements Serializable {

    private String centerName;
    private String centerAddress;
    private final EventRegistry eventRegistry;
    private final UserRegistry userRegistry;
    private User activeUser;

    private static final String DEFAULT_CENTER_NAME = "Default Center";
    private static final String DEFAULT_CENTER_ADDRESS = "No address registered";
    
    public FairCenter() {
        this.centerName = DEFAULT_CENTER_NAME;
        this.centerAddress = DEFAULT_CENTER_ADDRESS;
        this.eventRegistry = new EventRegistry();
        this.userRegistry= new UserRegistry();
        this.activeUser = null;
    }
    
    public String getCenterName() {
        return centerName;
    }

    public String getCenterAddress() {
        return centerAddress;
    }

    public EventRegistry getEventRegistry() {
        return eventRegistry;
    }
    
    public UserRegistry getUserRegistry() {
        return userRegistry;
    }

    public User getActiveUser() {
        return activeUser;
    }
    
    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }

    public void setCenterAddress(String centerAddress) {
        this.centerAddress = centerAddress;
    }

    public void setActiveUser(User activeUser) {
        this.activeUser = activeUser;
    }
    
}