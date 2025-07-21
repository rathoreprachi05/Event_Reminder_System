import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;


public class Executer{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        reminderManager rm = new reminderManager();

        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        while(true){
            System.out.println("+----------------------------+");
            System.out.println("|         Event Menu         |");
            System.out.println("+----------------------------+");
            System.out.println("|   1. Add event             |");
            System.out.println("+----------------------------+");
            System.out.println("|   2. Display events        |");
            System.out.println("+----------------------------+");
            System.out.println("|   3. Show occured events   |");
            System.out.println("+----------------------------+");
            System.out.println("|   4. Remove event          |");
            System.out.println("+----------------------------+");
            System.out.println("|   5. Exit                  |");
            System.out.println("+----------------------------+");

            System.out.print("\nEnter your choice number: ");
            int ch = sc.nextInt();
            switch (ch){
                case 1:
                    System.out.print("Event title: ");
                    String t = sc.nextLine();
                    sc.nextLine();
                    System.out.print("Event Description: ");
                    String d = sc.nextLine();
                    System.out.print("Event date in yyyy-mm-dd format: ");
                    String date = sc.nextLine();
                    LocalDate date2 = LocalDate.parse(date, pattern);
                    rm.addEvent(new Event(t, d, date2));
                    break;
                
                case 2:
                    rm.viewEvents();
                    break;

                case 3:
                    rm.showEventAlreadyHappened();
                    break;
                
                case 4:
                    rm.viewEvents();
                    int ind = sc.nextInt();
                    rm.removeEvent(ind);
                    break;

                case 5:
                    return;
                
                default:
                    System.out.println("Not a valid input!");
                    break;
            }
        } 
    }
}