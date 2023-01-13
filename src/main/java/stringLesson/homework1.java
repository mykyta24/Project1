package stringLesson;

public class homework1 {

    public String trueA = "apple";
    public String trueB = "applecation";
    public static void main(String[] args) {
        homework1 first = new homework1();
        boolean success = first.compareFirst("apple" , "applecation");

    }
    public boolean compareFirst(String a, String b) {
        boolean success = false;
        if (a == null || b == null) {
            System.out.println("Cannot compare Strings");
        }
        else if (trueB.contains(trueA)){
                System.out.println(a + " is the part of " + b);
        } else if (a.equalsIgnoreCase(trueA) || a.equalsIgnoreCase(trueB)) {
            System.out.println("The Strings are the same");
        }
        else {
            success = true;
        }
        return success;
    }


}
