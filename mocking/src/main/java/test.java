import java.util.*;
import java.util.function.Function;


public class test {
    public static void main(String[] args) {
        Function<String, Integer> wordCount = (s) -> s.length();
        System.out.println(wordCount.apply("abhishek"));
    }

}

