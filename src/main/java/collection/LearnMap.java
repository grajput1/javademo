package collection;

import java.util.HashMap;
import java.util.Map;

public class LearnMap {
    public static void main(String [] args){
        HashMap<String, Long> contacts = new HashMap<String, Long>();
        contacts.put("Mani", 9823759523L);
        contacts.put("Nami", 9823681618L);
        contacts.put("Ganesh", 9823087008L);

        for(String key : contacts.keySet())
            System.out.println(contacts.get(key));

        for(Map.Entry<String, Long> entry: contacts.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}

