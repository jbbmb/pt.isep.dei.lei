package ems.model.algorithm;
//STATUS: READY

import ems.model.Event;
import java.util.List;

/**
 * Interface that sets rules for all distribution algorithms.
 * @author 1DK_1150475_1161975_1161976
 */
public interface Algorithm {
    
    /**
     * Distributes ESEs among the existing applications according to the active algorithm.
     * @param eventList list containing all events and their information
     * @return true if distribution possible and completed, false if otherwise
     */
    boolean doDistribution(List<Event> eventList);
    
    default String returnListOfAssignments(List<Event> eventList){
        StringBuilder sb = new StringBuilder();  
        for (int i = 0; i < eventList.size(); i++){     
           for(int j = 0; j < eventList.get(i).getEventAssignmentRegistry().getEventAssignmentList().size(); j++){
               sb.append(eventList.get(i).getEventAssignmentRegistry().getEventAssignmentList().get(j).toString()); 
           }
        }
        String msg ="Algorithm cannot be executed";
        if(sb.length() == 0)
            return sb.append(msg).toString();
        else return sb.toString();
    }
    
}