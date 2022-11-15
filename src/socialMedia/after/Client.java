package socialMedia.after;

public class Client {
    
    public static void main(String[] args) {
        SocialMedia socialMedia = new SocialMedia();
        socialMedia.searchActiveSocialMedias();
        for(Integer profile: socialMedia) {
            System.out.println(String.format("Speeding at profile #%d", profile));
        }
    }
}
