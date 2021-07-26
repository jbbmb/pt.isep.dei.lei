package ems.controller;
// STATUS: DONE
// ISSUES: NONE

import ems.model.FairCenter;
import ems.utils.AppDataAssistant;
import java.io.IOException;

/**
 * Class responsible for managing dashboardPanel UI.
 * @author 1DK_1150475_1161975_1161976
 */
public class DashboardController {
    
    // Class variables
    private final FairCenter fairCenter;
    
    public DashboardController(FairCenter fairCenter){
        this.fairCenter = fairCenter;
    }
    
    public String updateCenterName(){
        String nameAux = fairCenter.getCenterName();
        return nameAux;
    }
    
    public String updateCenterAddress(){
        String addressAux = fairCenter.getCenterAddress();
        return addressAux;
    }
    
    public String updateUserName(){
        String nameAux = fairCenter.getActiveUser().getName();
        return nameAux;
    }
    
    public String updateUserEmail(){
        String nameAux = fairCenter.getActiveUser().getEmail();
        return nameAux;
    }
    
    public String updateEventsScheduled(){
        return Integer.toString(this.fairCenter.getEventRegistry().getEventList().size());
    }
    
    public String updateUsersRegistered(){
        return Integer.toString(this.fairCenter.getUserRegistry().getUserList().size());
    }
    
    public String getActiveUserName(){
        return this.fairCenter.getActiveUser().getName();
    }
    
    public String getActiveUserEmail(){
        return this.fairCenter.getActiveUser().getEmail();
    }
    
    public void setNewCenterInfo(String centerName, String centerAddress) throws IOException{
        fairCenter.setCenterName(centerName);
        fairCenter.setCenterAddress(centerAddress);
        AppDataAssistant.saveChanges(fairCenter);
    }
    
    public void setNewUserInfo(String userName, String userEmail) throws IOException{
        fairCenter.getActiveUser().setName(userName);
        fairCenter.getActiveUser().setEmail(userEmail);
        AppDataAssistant.saveChanges(fairCenter);
    }
    
    public void endActiveSession(){
        this.fairCenter.setActiveUser(null);
    }
    
}