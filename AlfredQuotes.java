import java.text.SimpleDateFormat;
import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        String guestGreetingString = String.format("Hello %s, how are you?", name);

        return guestGreetingString;
    }

    public String fullNameGuestGreeting(String firstName, String lastName) {
        String greeting = new String("Hello, ");
        String firstNamePlus = firstName.concat(" ");
        String firstAndLastNames = firstNamePlus.concat(lastName);
        String firstAndLastNameGreeting = greeting.concat(firstAndLastNames);
        firstAndLastNameGreeting = firstAndLastNameGreeting.concat(", how are you?");
        return firstAndLastNameGreeting;
    }
    // two methods cannot hhave the same signature, ie. name and parameters
    public String guestGreeting(String name, String dayPeriod) {
        if(dayPeriod.equals("morning") || dayPeriod.equals("afternoon") || dayPeriod.equals("evening")){
            String timeGreeting = new String("Good " + dayPeriod + ", " + name);
            return timeGreeting;
        }
        return "Invalid time of day. Time must be either morning, afternoon, or evening";
    }
    
    public String dateAnnouncement() {
        // YOUR CODE HERE
        Date date = new Date();
        String announcementA = "The current time is: ";
        String dateAndTimeAnnouncement = announcementA.concat(date.toString());
        return dateAndTimeAnnouncement;
    }
    
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        // if the idexOf(Alexis) is greater than 1:
        // then return snarky response
        // if indexOf(Alfred) > 1:
        // then return obliging response
        // else return reductive response
        if (conversation.indexOf("Alexis") >= 0){
            return "It's snarkin' time";
        }
        else if(conversation.indexOf("Alfred") >= 0){
            return "It's obligin' time";
        }
        else if(conversation.indexOf("morbin") >=0){
            return "It's morbin time";
        }
        else{
            return "It's clobberin' time";
        }
    }

    public String evenOddResponse(Integer input) {
        if (input % 2 == 0) {
            return "Even better!";
        }
        return "How odd.";
    }
}

