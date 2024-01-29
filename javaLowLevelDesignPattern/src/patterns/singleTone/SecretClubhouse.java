package patterns.singleTone;

public class SecretClubhouse {
    // Private static variable to hold the single instance of the clubhouse
    private static SecretClubhouse instance;


    // Private constructor to prevent instantiation from outside
    private SecretClubhouse() {
        System.out.println("Creating our secret clubhouse!");
    }

    // Method to get the single instance of the clubhouse
    public static SecretClubhouse getInstance() {
        // Lazy initialization: create the instance only when needed
        System.out.println(instance+"checking ++++++++++++++");
        if (instance == null) {
            instance = new SecretClubhouse();
        }
        return instance;
    }

    // Example method of the clubhouse
    public void holdSecretMeeting() {
        System.out.println("Welcome to our secret meeting!");
    }
}

