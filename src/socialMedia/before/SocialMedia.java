package socialMedia.before;

import java.util.Random;

public class SocialMedia {

    private Integer[] profiles;

    public void searchActiveSocialMedias() {
        this.profiles = new Integer[4];
        Random r = new Random();
        int profileScount = 0;
        for(int i = 0; i < profiles.length; i ++) {
            if(r.nextInt(2) == 1) {
                profiles[profileScount++] = i;
            }

            System.out.println(String.format("Found %d profiles on social media......", profileScount));
        }
    }

    public void profilesFound(Integer number) {

        System.out.println(String.format("Profile &d: ", number));
        for(int i = 0; i < profiles.length; i++) {
            if(profiles[i] == number) {
                System.out.println("okay");
                return;
            }
        }

        System.out.println("No profiles found!");
    }
    
}
