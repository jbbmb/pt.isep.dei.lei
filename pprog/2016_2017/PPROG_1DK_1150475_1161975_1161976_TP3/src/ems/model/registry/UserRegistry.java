package ems.model.registry;
// STATUS: DONE
// ISSUES: NONE

import ems.model.user.ESE;
import ems.model.user.User;
import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;

/**
 * Class that registries all fair center users.
 * @author 1DK_1150475_1161975_1161976
 */
public class UserRegistry implements Registry, Serializable {
    
    private final List<User> userList;
    
    public UserRegistry(){
        this.userList = new ArrayList<>();
    }

    public List<User> getUserList() {
        return userList;
    }
    
    public void addUser(User user){
        if (!validate(user)){
            this.userList.add(user);
        }
    }

    public boolean validate(User user){
        return this.userList.contains(user);
    }
    
    public List<User> sortListByESEexp(List<User> userList){
    
    Collections.sort(userList, new Comparator<User>() {
        @Override
        public int compare(User one, User two) {
            if (one instanceof ESE && two instanceof ESE) {           
            if(((ESE)one).getExperienceLevel()>((ESE)two).getExperienceLevel()){
                return -1;
            }
            else {
                return 1;
            }
        }
        return 0;
       }
    });
    return userList;
   }

}