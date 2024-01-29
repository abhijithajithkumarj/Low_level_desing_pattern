package patterns.singleTone;

import patterns.singleTone.SecretClubhouse;

public class SingletonExample {
    public static void main(String[] args) {
        // Get the clubhouse instance
        SecretClubhouse clubhouse1 = SecretClubhouse.getInstance();
        // Hold a secret meeting
        clubhouse1.holdSecretMeeting();

        // Get the clubhouse instance again
        SecretClubhouse clubhouse2 = SecretClubhouse.getInstance();
        // Verify that both instances are the same
        System.out.println("Are both instances the same? " + (clubhouse1 == clubhouse2));
    }
}