package ex4;

import java.util.ArrayList;
import java.util.function.Predicate;

public class StringFilter {
    
    public static Iterable<String> select(Iterable<String> iterable, Predicate<String> pred) {
        ArrayList<String> result = new ArrayList<>();
        for(String item : iterable)
            if(pred.test(item))
                result.add(item);
        return result;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("");
        list.add("b");
        list.add("");

        Iterable<String> nonEmpty = select(list, s -> !s.isEmpty());
        
        System.out.println("Strings não vazias:");  // a b
        for (String s : nonEmpty) {
            System.out.println(s);
        }
    }
}
