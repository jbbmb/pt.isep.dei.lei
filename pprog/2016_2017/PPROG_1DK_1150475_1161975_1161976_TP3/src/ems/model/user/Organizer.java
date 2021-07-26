package ems.model.user;
// STATUS: DONE
// ISSUES: NONE

import java.io.Serializable;

/**
 * Class that represents an Organizer.
 * @author 1DK_1150475_1161975_1161976
 */
public class Organizer extends User implements Serializable {
    
    public Organizer(String name, String email){
        super(name, email);
    }
    
    public Organizer(){
        super();
    }
    
    @Override
    public String toString(){
        return String.format("USER INFORMATION\nSystem role: Organizer\n%s", super.toString());
    }
    
}