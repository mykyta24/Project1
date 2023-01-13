package stringLesson;

public class Homework {
    public static void main(String[] args) {
        Homework compare = new Homework();
        boolean success = compare.compareFirst("book" , "tree");

    }
    public boolean compareFirst(String name1, String name2) {
        boolean success = false;
        if (name1 == null || name2 == null) {
            System.out.println("Cannot compare Strings");
        }

        return success;
    }

}
