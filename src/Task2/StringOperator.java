package Task2;

import java.util.Arrays;
import java.util.Comparator;

public class StringOperator {
    private String[] strings;

    public StringOperator(String[] strings) {
        this.strings = strings;
        operation();
    }
    private void operation(){
        Arrays.sort(strings, Comparator.comparingInt(String::length));
    }
    public void print(){
        System.out.println(Arrays.toString(strings));
    }
}
