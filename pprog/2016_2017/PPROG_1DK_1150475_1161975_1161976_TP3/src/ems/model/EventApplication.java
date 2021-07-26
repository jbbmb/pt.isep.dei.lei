package ems.model;
// STATUS: DONE
// ISSUES: NONE

import java.io.Serializable;

/**
 * Class that represents an applications to an event.
 * @author 1DK_1150475_1161975_1161976
 */
public class EventApplication implements Serializable {
    
    private final FairCenter fairCenter;
    private final String representativeName;
    private String businessName;
    private String businessAddress;
    private String description;
    private int phoneNumber;
    private int wantedArea;
    private int invitesNumber;
    private ApplicationDecision decision;
    
    private static final String DEFAULT_BUSINESS_NAME = "No business name on file.";
    private static final String DEFAULT_BUSINESS_ADDRESS = "No business address on file.";
    private static final String DEFAULT_DESCRIPTION = "No description on file.";
    private static final int DEFAULT_PHONE_NUMBER = 123456789;
    private static final int DEFAULT_WANTED_AREA = 0;
    private static final int DEFAULT_INVITES_WANTED = 0;
    
    public EventApplication(FairCenter fairCenter, String businessName, String businessAddress, String description, int phoneNumber, int wantedArea, int invitesNumber){
        this.fairCenter = fairCenter;
        this.representativeName = fairCenter.getActiveUser().getName();
        this.businessName = businessName;
        this.businessAddress = businessAddress;
        this.description = description;
        this.phoneNumber = phoneNumber;
        this.wantedArea = wantedArea;
        this.invitesNumber = invitesNumber;
        this.decision = null;
    }
    
    public EventApplication(FairCenter fairCenter){
        this.fairCenter = fairCenter;
        this.representativeName = fairCenter.getActiveUser().getName();
        this.businessName = DEFAULT_BUSINESS_NAME;
        this.businessAddress = DEFAULT_BUSINESS_ADDRESS;
        this.description = DEFAULT_DESCRIPTION;
        this.phoneNumber = DEFAULT_PHONE_NUMBER;
        this.wantedArea = DEFAULT_WANTED_AREA;
        this.invitesNumber = DEFAULT_INVITES_WANTED;
        this.decision = null;
    }

    public String getRepresentativeName() {
        return representativeName;
    }
    
    public String getBusinessName() {
        return businessName;
    }

    public String getBusinessAddress() {
        return businessAddress;
    }

    public String getDescription() {
        return description;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public int getWantedArea() {
        return wantedArea;
    }

    public int getInvitesNumber() {
        return invitesNumber;
    }

    public ApplicationDecision getDecision() {
        if(this.decision == null){
            return null;
        } else return decision;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public void setBusinessAddress(String businessAddress) {
        this.businessAddress = businessAddress;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setWantedArea(int wantedArea) {
        this.wantedArea = wantedArea;
    }

    public void setInvitesNumber(int invitesNumber) {
        this.invitesNumber = invitesNumber;
    }

    public void setDecision(ApplicationDecision decision) {
        this.decision = decision;
    }
    
    @Override
    public String toString(){
        if(getDecision() == null){
            return String.format("Event Application by %s\nBusiness name: %s\nBusiness address: %s\nPhone number: %d\nDescription: %s\nRequested a total of %d m2 of area and %s invites.\nNo decision has been made regarding this application.", getRepresentativeName(), getBusinessName(), getBusinessAddress(), getPhoneNumber(), getDescription(), getWantedArea(), getInvitesNumber());
        } else return String.format("Event Application by %s\nBusiness name: %s\nBusiness address: %s\nPhone number: %d\nDescription: %s\nRequested a total of %d m2 of area and %s invites.\n%s", getRepresentativeName(), getBusinessName(), getBusinessAddress(), getPhoneNumber(), getDescription(), getWantedArea(), getInvitesNumber(), getDecision().toString());
    }
    
}