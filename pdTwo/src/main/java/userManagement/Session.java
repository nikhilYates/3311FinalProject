package userManagement;

public class Session {

    private final String email;

    private Session(String email) {
        this.email = email;
    }

    public static Session login(String email, String password) {
        ;   // login logic using csv file
        return new Session(email); // null if not valid
    }

    public static boolean signup(String email, String password, User type) {
        ;   // sign up logic using csv file and doing some basic validation, maybe
        return true; // false if not valid
    }
}