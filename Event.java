import java.time.LocalDate;

/*
 * 1. Title
 * 2. Description
 * 3. Date
 * 4. Status(done/pending)
 */

public class Event{
    private String title;
    private String Description;
    private LocalDate date;
    private boolean isCompleted;

    public Event(String title, String Description, LocalDate date){
        this.title = title;
        this.Description = Description;
        this.date = date;
        isCompleted = false;
    }

    public String showTitle(){
        return this.title;
    }
    public String showDescription(){
        return this.Description;
    }
    public LocalDate getDate(){
        return this.date;
    }
    public boolean getEventStatus(){
        return isCompleted;
    }

    public void setEventStatus(boolean flag){
        this.isCompleted = flag;
    }
}


