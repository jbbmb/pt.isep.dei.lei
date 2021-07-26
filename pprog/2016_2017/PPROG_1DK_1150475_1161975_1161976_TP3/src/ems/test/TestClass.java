package ems.test;
// STATUS: READY

import ems.model.Event;
import ems.model.FairCenter;
import ems.model.algorithm.ExperienceDistributionAlgorithm;
import ems.model.user.ESE;
import ems.model.user.EventManager;
import ems.model.user.Organizer;
import ems.model.user.Representative;

/**
 * Internal test class for the EMS app.
 * @author 1DK_1150475_1161975_1161976
 */
public class TestClass {
    
    public static FairCenter internalTesting(){
        
        // FairCenter
        FairCenter testCenter = new FairCenter();
    
        // User + UserRegistry
        ESE ese1 = new ESE("Employee 1", "ese1@ems.com");
        testCenter.getUserRegistry().addUser(ese1);
        ESE ese2 = new ESE("Employee 2", "ese2@ems.com");
        testCenter.getUserRegistry().addUser(ese2);
        ESE ese3 = new ESE("Employee 3", "ese3@ems.com");
        testCenter.getUserRegistry().addUser(ese3);
        ESE ese4 = new ESE("Employee 4", "ese4@ems.com");
        testCenter.getUserRegistry().addUser(ese3);
        ESE ese5 = new ESE("Employee 5", "ese5@ems.com");
        testCenter.getUserRegistry().addUser(ese3);
        ESE ese6 = new ESE("Employee 6", "ese6@ems.com");
        testCenter.getUserRegistry().addUser(ese3);
        EventManager manager = new EventManager("Manager", "manager@ems.com");
        testCenter.getUserRegistry().addUser(manager);
        Organizer organizer = new Organizer("Organizer", "organizer@ems.com");
        testCenter.getUserRegistry().addUser(organizer);
        Representative representative = new Representative("Representative", "representative@ems.com");
        testCenter.getUserRegistry().addUser(representative);
        
        // Event + EventRegistry
        Event event1 = new Event(testCenter, "Test Event 1", "No description (1) available!", 1, 1, 2018, 31, 12, 2018, "LOW", 4);
        testCenter.getEventRegistry().addEvent(event1);
        Event event2 = new Event(testCenter, "Test Event 2", "No description (2) available!", 1, 1, 2018, 31, 12, 2018, "MEDIUM", 6);
        testCenter.getEventRegistry().addEvent(event2);
        Event event3 = new Event(testCenter, "Test Event 3", "No description (3) available!", 1, 1, 2018, 31, 12, 2018, "HIGH", 8);
        testCenter.getEventRegistry().addEvent(event3);
        
        ExperienceDistributionAlgorithm eda = new ExperienceDistributionAlgorithm();
        eda.doDistribution(testCenter.getEventRegistry().getEventList());
        System.out.println(eda.returnListOfAssignments(testCenter.getEventRegistry().getEventList()));
        // Complete and ready object returned
        return testCenter;
        
    }
    
}