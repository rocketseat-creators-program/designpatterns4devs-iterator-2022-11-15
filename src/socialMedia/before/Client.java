package socialMedia.before;

public class Client {
    
    public static void main(String[] args) {
        SocialMedia socialMedia = new SocialMedia();
        socialMedia.searchActiveSocialMedias();

        for(int i = 1; i < 4; i++) {
            socialMedia.profilesFound(i);
        }
    }
}
