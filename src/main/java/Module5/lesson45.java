package Module5;

import java.util.*;

public class lesson45 {
    public static void main(String[] args) {
        lesson45 homework = new lesson45();
        homework.names();

    }

    public void names() {
        ArrayList<String> name = new ArrayList<String>();
        name.add("Steve");
        name.add("Tim");
        name.add("Lucy");
        name.add("Steve");
        name.add("Pat");
        name.add("Angela");
        name.add("Tom");
        name.add("Tim");
        name.add("Anna");
        name.add("Lucy");

        Collections.sort(name);

        List<String> listWithDuplicates = new ArrayList<>(Arrays.asList("Steve","Tim","Lucy","Steve","Pat","Angela","Tom","Tim","Anna","Lucy"));
        Set<String> set = new LinkedHashSet<>(listWithDuplicates);
        List<String> listWithoutDuplicates = new ArrayList<>(set);
        System.out.println(listWithoutDuplicates);







    }
}
