import java.util.*;

public class ItinearyTickets {  
    public static String getStart(HashMap<String, String> tickets){
        HashMap<String, String> reverseMap = new HashMap<>();  // To -> From

        for(String key: tickets.keySet()){
            reverseMap.put(tickets.get(key), key);
        }

        for(String key: tickets.keySet()){
            if(!reverseMap.containsKey(key)){
                return key;  // Starting point
            }
        }
        return null;  // No valid starting point found
    }
    public static void main(String[] args) { //0(n)
        HashMap<String, String> tickets = new HashMap<>();  //From -> To
        tickets.put("Chennai", "Banglore");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);
        System.out.print("Starting point: " + start);

        for(String key: tickets.keySet()){
            System.out.print(" -> " + tickets.get(start));
            start = tickets.get(start);
        }
        System.out.println();
    }
}
