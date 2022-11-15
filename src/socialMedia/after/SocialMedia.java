package socialMedia.after;

import java.util.Iterator;
import java.util.Random;

public class SocialMedia implements Iterable<Integer> {

    private Integer[] profiles;

    public void searchActiveSocialMedias() {
        this.profiles = new Integer[4];
        Random r  = new Random();
        int profileScount = 0;
        for(int i = 0; i < profiles.length; i++) {
            if(r.nextInt(2) == 1) {
                profiles[profileScount++] = i;
            }
        }
        System.out.println(String.format("Found %d profiles on social media......", profileScount));
    }

    public Iterator<Integer> iterator() {
        return new ProfileIterator(profiles);
    }
    
}
