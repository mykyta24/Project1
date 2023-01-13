package Module5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mainHome {
    public static void main(String[] args) {
        mainHome homework = new mainHome();
        homework.daysOfWeek(0);

    }

    public void daysOfWeek(int a) {
        HashMap<Integer, String> days = new HashMap<Integer, String>();

        days.put(1, "Monday");
        days.put(2, "Tuesday");
        days.put(3, "Wednesday");
        days.put(4, "Thursday");
        days.put(5, "Friday");
        days.put(6, "Saturday");
        days.put(7, "Sunday");
        System.out.println(days.get(4));


    }


}






