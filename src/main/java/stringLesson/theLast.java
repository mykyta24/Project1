package stringLesson;

public class theLast {
    public String trueUserName = "convertation";
    public String truePassword = "convert";

    public static void main(String[] args) {
        theLast homework = new theLast();
        homework.verifyUser("conversation", "convert");
    }

    public boolean verifyUser(String username, String password) {
        boolean success = false;
        if (username.length() == 0 || password.length() == 0) {
            System.out.println("The username or password is empty");
        } else if (username.isBlank() || password.isBlank()) {
            System.out.println("The username or password is blank ");
        } else if (username == null || password == null) {
            System.out.println("The username or password is null ");
        }
         else if (username.charAt(0) == password.charAt(0)) {
            System.out.println(username + "is the part of " + password);
        } else {
            success = true;
        }
        return success;
    }


}
