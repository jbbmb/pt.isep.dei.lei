package ems.model.algorithm;
// STATUS: DONE
// ISSUES: NONE

import ems.model.Event;
import ems.model.EventAssignment;
import ems.model.user.ESE;
import ems.model.user.User;
import java.util.List;

/**
 * Equally distributes ESEs.
 * @author 1DK_1150475_1161975_1161976
 */
public class EqualDistributionAlgorithm implements Algorithm {

    @Override
    public boolean doDistribution(List<Event> eventList) {
        
        int sizeOfEventList = eventList.size();
        int sizeOfAvailableWorkersList=0;
      
        List<User> availableWorkerList = eventList.get(0).getFairCenter().getUserRegistry().getUserList();
        for (int i = 0; i < availableWorkerList.size(); i++){
            if (availableWorkerList.get(i) instanceof ESE){
                sizeOfAvailableWorkersList++;
            }
        }
        
        int numberOfWorkersInEachEvent = sizeOfAvailableWorkersList / sizeOfEventList;
        if(numberOfWorkersInEachEvent < 1){
            return false;
        
        }else{
        for (int i = 0; i < eventList.size(); i++)
        {
           
                
                for (int j = 0; j < availableWorkerList.size(); j++)
                {
                    while(eventList.get(i).getEventESERegistry().getEventESEList().size() < numberOfWorkersInEachEvent)
                    {
                        if (availableWorkerList.get(j) instanceof ESE)
                        {
                            if(!(eventList.get(i).getEventESERegistry().getEventESEList().contains(((ESE)availableWorkerList.get(j))) && (((ESE)availableWorkerList.get(j)).getCounterOfEvents() == ((ESE)availableWorkerList.get(j)).getMAX_NUMBER_OF_EVENTS())))
                            {
                                EventAssignment ea = new EventAssignment(eventList.get(i),((ESE)availableWorkerList.get(j)));
                                eventList.get(i).getEventAssignmentRegistry().getEventAssignmentList().add(ea);
                                eventList.get(i).getEventESERegistry().getEventESEList().add(((ESE)availableWorkerList.get(j)));
                                eventList.get(i).getEventESERegistry().getEventESEList().get(j).addToCounterOfEvents(1);

                            }
                        }                   
                    }
                }
        }
        // return true;
        }
        return true;
   }

}