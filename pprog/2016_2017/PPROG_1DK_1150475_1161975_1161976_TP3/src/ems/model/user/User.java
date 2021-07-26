package ems.model.user;
// STATUS: DONE
// ISSUES: NONE

import java.io.Serializable;

/**
 * Class that represents all system users.
 * @author 1DK_1150475_1161975_1161976
 */
public abstract class User implements Serializable {

    // Object variables
    private String name;
    private String email;

    // Class variables
    private static final String DEFAULT_NAME = "John Doe";
    private static final String DEFAULT_EMAIL = "john.doe@ems.com";

    /**
     * Creates a new custom user.
     * @param name User's full name
     * @param email User's internal e-mail
     */
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
    
    /**
     * Creates an empty user with all fields set to default.
     */
    public User() {
        this.name = DEFAULT_NAME;
        this.email = DEFAULT_EMAIL;
    }

    /**
     * Gets the user's full name.
     * @return user's name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the user's internal e-mail.
     * @return user's email
     */
    public String getEmail() {
        return email;
    }
    
    /**
     * Sets the user's full name.
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the user's internal e-mail.
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    /**
     * Prints out all user information.
     * @return all user data
     */
    @Override
    public String toString(){
        return String.format("Full name: %s\nE-mail address: %s", this.getName(), this.getEmail());
    }
 
}