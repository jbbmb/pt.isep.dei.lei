package ems.controller;
// STATUS: DONE
// ISSUES: NONE

import ems.model.Event;
import ems.model.FairCenter;
import ems.model.algorithm.EqualDistributionAlgorithm;
import ems.model.algorithm.ExperienceDistributionAlgorithm;
import ems.model.algorithm.PreferredESEDistributionAlgorithm;
import ems.model.user.User;
import ems.utils.AppDataAssistant;
import java.io.IOException;

/**
 * Class responsible for managing AssignStaff UI.
 * @author 1DK_1150475_1161975_1161976
 */
public class AssignStaffController {
    
    // Class variables
    private final FairCenter fairCenter;
    private Event activeEvent;
    
    public AssignStaffController(FairCenter fairCenter) {
        this.fairCenter = fairCenter;
        this.activeEvent = null;
    }
    
    public User getOrganizer(){
        return fairCenter.getActiveUser();
    }
    
    public Event getActiveEvent() {
        return activeEvent;
    }

    public void setActiveEvent(Event activeEvent) {
        this.activeEvent = activeEvent;
    }
    
    public boolean applyDistribution(int distributionOption) throws IOException {
        boolean status = false;
        switch (distributionOption) {
            case 3:
                PreferredESEDistributionAlgorithm preferred = new PreferredESEDistributionAlgorithm();
                status = preferred.doDistribution(fairCenter.getEventRegistry().getEventList());
                break;
            case 2:
                ExperienceDistributionAlgorithm experience = new ExperienceDistributionAlgorithm();
                status = experience.doDistribution(fairCenter.getEventRegistry().getEventList());
                break;
            case 1:
                EqualDistributionAlgorithm equal = new EqualDistributionAlgorithm();
                status = equal.doDistribution(fairCenter.getEventRegistry().getEventList());
                break;
            default:
                break;
        }
        AppDataAssistant.saveChanges(fairCenter);
        return status;
    }
    
    public String distributionResult(int distributionOption) {
        String summary = null;
        switch (distributionOption) {
            case 3:
                PreferredESEDistributionAlgorithm preferred = new PreferredESEDistributionAlgorithm();
                summary = preferred.returnListOfAssignments(fairCenter.getEventRegistry().getEventList());
                break;
            case 2:
                ExperienceDistributionAlgorithm experience = new ExperienceDistributionAlgorithm();
                summary = experience.returnListOfAssignments(fairCenter.getEventRegistry().getEventList());
                break;
            case 1:
                EqualDistributionAlgorithm equal = new EqualDistributionAlgorithm();
                summary = equal.returnListOfAssignments(fairCenter.getEventRegistry().getEventList());
                break;
            default:
                break;
        }
        return summary;
    }
    
}