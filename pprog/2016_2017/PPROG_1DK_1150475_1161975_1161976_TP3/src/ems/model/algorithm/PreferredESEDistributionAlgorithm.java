package ems.model.algorithm;
// STATUS: DONE
// ISSUES: NONE

import ems.model.Event;
import ems.model.EventAssignment;
import ems.model.user.ESE;
import ems.model.user.User;
import java.util.List;

/**
 * Distributes according to event's requirements.
 * @author 1DK_1150475_1161975_1161976
 */
public class PreferredESEDistributionAlgorithm implements Algorithm {
    
    @Override
    public boolean doDistribution(List<Event> eventList) {
        
        List<User> availableWorkerList = eventList.get(0).getFairCenter().getUserRegistry().getUserList();
        int totalNoOfPreferredNoOfESE = 0;       
        for (int i = 0; i < eventList.size(); i++)
        {
            totalNoOfPreferredNoOfESE += eventList.get(i).getPreferredNumberOfESE();
        }
        
        int noOfESE = 0;
        for (int i = 0; i < availableWorkerList.size(); i++)
        {
            if (availableWorkerList.get(i) instanceof ESE)
            {
                noOfESE++;
            }
        }
            
        if(totalNoOfPreferredNoOfESE > noOfESE)
        {
            return false;
            
        }else{
        
        for (int i = 0; i < eventList.size(); i++)
        {
            int preferredNoOfESE = eventList.get(i).getPreferredNumberOfESE();
                  
                for (int j = 0; j < availableWorkerList.size(); j++)
                {
                    if(eventList.get(i).getEventESERegistry().getEventESEList().size() < preferredNoOfESE)
                    { 
                        if (availableWorkerList.get(j) instanceof ESE)
                        {
                            if (!(eventList.get(i).getEventESERegistry().getEventESEList().contains(((ESE)availableWorkerList.get(j)))))
                            {
                                if (((ESE)availableWorkerList.get(j)).getCounterOfEvents() < ((ESE)availableWorkerList.get(j)).getMAX_NUMBER_OF_EVENTS())
                                {
                                    EventAssignment ea = new EventAssignment(eventList.get(i),((ESE)availableWorkerList.get(j)));
                                    eventList.get(i).getEventAssignmentRegistry().getEventAssignmentList().add(ea);
                                    eventList.get(i).getEventESERegistry().getEventESEList().add(((ESE)availableWorkerList.get(j)));
                                    ((ESE)availableWorkerList.get(j)).addToCounterOfEvents(1);
                                }
                            }
                        }
                    }
                }   
        } 
        }      
      return true;
    }  

}