package ems.model.algorithm;
// STATUS: DONE
// ISSUES: NONE

import ems.model.Event;
import ems.model.EventAssignment;
import ems.model.user.ESE;
import ems.model.user.User;
import java.util.Collections;
import java.util.List;

/**
 * Distributes ESEs according to experience.
 * @author 1DK_1150475_1161975_1161976
 */
public class ExperienceDistributionAlgorithm implements Algorithm {

    @Override
    public boolean doDistribution(List<Event> eventList) {
        
        List<User> availableWorkerListUnsorted = eventList.get(0).getFairCenter().getUserRegistry().getUserList();
  
        int noOfESE = 0;
        for (int i = 0; i < availableWorkerListUnsorted.size(); i++)
        {
            if (availableWorkerListUnsorted.get(i) instanceof ESE)
            {
                noOfESE++;
            }
        }
      
        int numberOfWorkersInEachEvent = noOfESE / eventList.size();
            if(numberOfWorkersInEachEvent < 1)
            {
                return false;
            }
            else{

                int noOfEvents = eventList.size(); 
                int counter = 0;
                boolean[] DistributionSuccess = new boolean[noOfEvents];
                Collections.sort(eventList, (Event one, Event two) -> {
                    if(one.getLevelImportance().ordinal() > two.getLevelImportance().ordinal())
                        return -1;
                    else return 1;
                });
               for (int i = 0; i < eventList.size(); i++)
               {
                   DistributionSuccess[i] = Solve(eventList.get(i),numberOfWorkersInEachEvent);
               }
               for (int i = 0; i < DistributionSuccess.length; i++)
               {
                   if( DistributionSuccess[i] == true ){
                       counter++;
                   } 
               }
            return counter == noOfEvents;
                    
	}
    }
    
    private boolean Solve(Event ev, int numberOfWorkersInEachEvent){
         
    if (!FindUnassignedPlacesInEvent(ev))
       return true;

    List<User> availableWorkerListSorted = ev.getFairCenter().getUserRegistry().sortListByESEexp(ev.getFairCenter().getUserRegistry().getUserList());
     
    for (int i = 0; i < availableWorkerListSorted.size(); i++)
    {        
        if (isSafe(availableWorkerListSorted.get(i),ev, numberOfWorkersInEachEvent))
        {
            
                EventAssignment ea = new EventAssignment(ev,((ESE)availableWorkerListSorted.get(i)));
                ev.getEventAssignmentRegistry().getEventAssignmentList().add(ea);
                ev.getEventESERegistry().getEventESEList().add(((ESE)availableWorkerListSorted.get(i)));
                ((ESE)availableWorkerListSorted.get(i)).addToCounterOfEvents(1);
                
            if (Solve(ev, numberOfWorkersInEachEvent))
                return true;
           
            
                ev.getEventAssignmentRegistry().getEventAssignmentList().remove(ea);
                ev.getEventESERegistry().getEventESEList().remove(((ESE)availableWorkerListSorted.get(i)));
                ((ESE)availableWorkerListSorted.get(i)).substractFromCounterOfEvents(1);
           
        }
    }
    return false; 
    }
    
    private boolean FindUnassignedPlacesInEvent(Event ev){
        return ev.getEventESERegistry().getEventESEList().size()<3;
    }
    
    private boolean isSafe(User user, Event ev, int numberOfWorkersInEachEvent){
        return (user instanceof ESE && !(ev.getEventESERegistry().getEventESEList().contains((ESE) user)) && ((ESE)user).getCounterOfEvents() < ((ESE)user).getMAX_NUMBER_OF_EVENTS() && ev.getEventAssignmentRegistry().getEventAssignmentList().size() < numberOfWorkersInEachEvent);
    }
    
}