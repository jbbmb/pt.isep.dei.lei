package ems.model.user;
// STATUS: DONE
// ISSUES: NONE

import java.io.Serializable;

/**
 * Class that represents an Event Manager.
 * @author 1DK_1150475_1161975_1161976
 */
public class EventManager extends User implements Serializable {
    
    public EventManager(String name, String email){
        super(name, email);
    }
    
    public EventManager(){
        super();
    }
    
    @Override
    public String toString(){
        return String.format("USER INFORMATION\nSystem role: Event Manager\n%s", super.toString());
    }
    
}