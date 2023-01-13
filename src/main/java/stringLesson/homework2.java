package stringLesson;

public class homework2 {
        public String trueUsername = "apple";
        public String truePassword = "tree";
        public static void main(String[] args) {
            homework1 compare = new homework1();
            boolean success = compare.compareFirst("apple" , "tree");

        }
        public boolean compareFirst(String username, String password) {
            boolean success = false;
            if (username == null || password == null) {
                System.out.println("Cannot compare Strings");
            }
            else if (username.equals(trueUsername) && password.equals(truePassword)) {
                System.out.println("The Strings are the same");
            }
            else {
                success = true;
            }
            return success;
        }

    }

