package ems.model.user;
// STATUS: DONE
// ISSUES: NONE

import java.io.Serializable;

/**
 * Class that represents a Company Representative.
 * @author 1DK_1150475_1161975_1161976
 */
public class Representative extends User implements Serializable {
    
    public Representative(String name, String email){
        super(name, email);
    }
    
    public Representative(){
        super();
    }
    
    @Override
    public String toString(){
        return String.format("USER INFORMATION\nSystem role: Representative\n%s", super.toString());
    }
    
}