package ems.controller;
// STATUS: DONE
// ISSUES: NONE

import ems.model.FairCenter;
import ems.model.user.User;

/**
 * Responsible for the control of the sign in UI.
 * @author 1DK_1150475_1161975_1161976
 */
public class SignInController {
    
    // Class variables
    private final FairCenter fairCenter;
    
    public SignInController(FairCenter fairCenter){
        this.fairCenter = fairCenter;
    }
    
    public User validateSession(String inputEmail){
        User userAux = null;
        for(int i = 0; i<fairCenter.getUserRegistry().getUserList().size(); i++){
            if(inputEmail.equalsIgnoreCase(fairCenter.getUserRegistry().getUserList().get(i).getEmail())){
                userAux = fairCenter.getUserRegistry().getUserList().get(i);
                return userAux;
            }
        }
        return userAux;
    }
    
}