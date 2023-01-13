package stringLesson;

public class ReverseString {
    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        reverseString.reverseString("automation");

    }

    public void reverseString(String textToReverse) {
        if (textToReverse == null || textToReverse.isEmpty() || textToReverse.isBlank()) {
            System.out.println("the String is null o empty");
        } else {
            System.out.println(String.format( "The input string is %s",textToReverse));
            String result = "";
            int lastLetter = textToReverse.length() - 1;
            for(int i = lastLetter; i>=0; i-- ){
                result = result +textToReverse.charAt(i);
            }
            System.out.println(result);
        }
    }
}
