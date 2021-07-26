package ems.model;
// STATUS: DONE
// ISSUES: NONE

import ems.model.registry.EventApplicationRegistry;
import ems.model.registry.EventAssignmentRegistry;
import ems.model.registry.EventESERegistry;
import ems.model.user.Organizer;
import ems.utils.Date;
import java.io.Serializable;

/**
 * Class that represents an event.
 * @author 1DK_1150475_1161975_1161976
 */
public class Event implements Serializable {
    
    public static enum LevelImportance {
        LOW, MEDIUM, HIGH
    }
    
    private final FairCenter fairCenter;
    private Organizer organizer;
    private final int eventID;
    private String title;
    private String description;
    private Date startDate;
    private Date endDate;
    private LevelImportance levelImportance;
    private int preferredNumberOfESE;
    private final EventApplicationRegistry eventApplicationRegistry;
    private final EventESERegistry eventESERegistry;
    private final EventAssignmentRegistry eventAssignmentRegistry;
    
    private static int EVENT_ID = 0;
    private static final String DEFAULT_TITLE = "No title on file.";
    private static final String DEFAULT_DESCRIPTION = "No description on file.";
    private static final Date DEFAULT_DATE = null;
    private static final int PREFERRED_NUMBER_OF_ESE = 2;
    
    public Event(FairCenter fairCenter, String title, String description, int startDay, int startMonth, int startYear, int endDay, int endMonth, int endYear, String levelImportance,int preferredNumberOfESE){
        this.fairCenter = fairCenter;
        this.organizer = null;
        EVENT_ID++;
        this.eventID = EVENT_ID;
        this.title = title;
        this.description = description;
        Date startDateAux = new Date(startDay, startMonth, startYear);
        this.startDate = startDateAux;
        Date endDateAux = new Date(endDay, endMonth, endYear);
        this.endDate = endDateAux;
        this.levelImportance = LevelImportance.valueOf(levelImportance.toUpperCase());
        this.preferredNumberOfESE = preferredNumberOfESE;
        this.eventApplicationRegistry = new EventApplicationRegistry();
        this.eventESERegistry = new EventESERegistry();
        this.eventAssignmentRegistry = new EventAssignmentRegistry();
    }
    
    public Event(FairCenter fairCenter){
        this.fairCenter = fairCenter;
        this.organizer = null;
        EVENT_ID++;
        this.eventID = EVENT_ID;
        this.title = DEFAULT_TITLE;
        this.description = DEFAULT_DESCRIPTION;
        this.startDate = DEFAULT_DATE;
        this.endDate = DEFAULT_DATE;
        this.levelImportance = LevelImportance.LOW;
        this.eventApplicationRegistry = new EventApplicationRegistry();
        this.eventESERegistry = new EventESERegistry();
        this.eventAssignmentRegistry = new EventAssignmentRegistry();
        this.preferredNumberOfESE = PREFERRED_NUMBER_OF_ESE;
    }
    
    public FairCenter getFairCenter() {
        return fairCenter;
    }
    
    public Organizer getOrganizer() {
        return organizer;
    }
    
    public int getEventID() {
        return eventID;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public LevelImportance getLevelImportance() {
        return levelImportance;
    }
    
    public int getPreferredNumberOfESE() {
        return preferredNumberOfESE;
    }
    
    public EventApplicationRegistry getEventApplicationRegistry() {
        return eventApplicationRegistry;
    }

    public EventESERegistry getEventESERegistry() {
        return eventESERegistry;
    }

    public EventAssignmentRegistry getEventAssignmentRegistry() {
        return eventAssignmentRegistry;
    }

    public void setOrganizer(Organizer organizer) {
        this.organizer = organizer;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    
    public void setLevelImportance(String levelImportance) {
        this.levelImportance = LevelImportance.valueOf(levelImportance.toUpperCase());
    }

    public void setLevelImportance(LevelImportance levelImportance) {
        this.levelImportance = levelImportance;
    }

    public void setPreferredNumberOfESE(int preferredNumberOfESE) {
        this.preferredNumberOfESE = preferredNumberOfESE;
    }
    
    @Override
    public String toString(){
        return String.format("EVENT #%d (%s PRIORITY)\nCreated by: Event Manager\nTitle: %s\nDescription: %s\nFrom %s to %s.\nTotal of %d applications submitted.\nTotal of %d assigned ESEs.", getEventID(), getLevelImportance().toString().toUpperCase(), getTitle(), getDescription(), getStartDate().toAnoMesDiaString(), getEndDate().toAnoMesDiaString(), getEventApplicationRegistry().getEventApplicationList().size(), getEventESERegistry().getEventESEList().size());
    }
    
}