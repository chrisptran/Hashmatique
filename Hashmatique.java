import java.util.HashMap;

public class Hashmatique {
    
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();

        trackList.put("Go Go Go", "I want to go");
        trackList.put("Who Me", "Yes it is you");
        trackList.put("The One", "Are you the one for me");
        trackList.put("All I Want", "Was for someone like you");

        System.out.println(trackList.get("Go Go Go"));

        for (String key : trackList.keySet()) {
            System.out.println(String.format("Track: %s - Lyrics: %s", key, trackList.get(key)));
        }
    }
}