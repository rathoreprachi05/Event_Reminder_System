/*
 * 1. Adding events
 * 2. Viewing events
 * 3. Marking as complete
 * 4. Removing events
 */

public class reminderManager{
    ArrayList<Event> arr;
    public reminderManager(){
        arr = new ArrayList<>();
    }

    public void addEvent(Event e){
        arr.add(e);
        System.out.println(x:"Event added to the list of events!");
    }

    public void viewEvents(){
        if(arr.isEmpty()){
            System.out.println(x:"Hey! there is no event to be listed.");
        }
        for(int i=0; i<arr.size(); i++){
            System.out.println((i + 1) + ". " + arr.get(i).showTitle());
            System.out.println("The Desc: " + arr.get(i).showDescription());
        }
    }

    public void showEventAlreadyHappened(){
        if(arr.isEmpty()){
            System.out.println(x:"No event in the list");
        }
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i).getEventStatus()){
                System.out.println((i + 1) + ". " + arr.get(i).showTitle());
                System.out.println(arr.get(i).showDescription());
            }
        }
    }

    public void updateEventStatus(int ind){
        if(ind <= 0 || ind >= arr.size() || arr.isEmpty()) return;
        arr.get(ind - 1).setEventStatus(flag.true);
        System.out.println(x: "Event marked as completed!");
    }

    public void removeEvent(int ind){
        if(ind <= 0 || ind >= arr.size() || arr.isEmpty()){
            System.out.println(x:"Not able to remove the event");
        }
        arr.remove(ind - 1);
    }
}
