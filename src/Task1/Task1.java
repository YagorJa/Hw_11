package Task1;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите 3 строки:");
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[3];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }
        int max = strings[0].length();
        String taSamaya = strings[0];
        int min = strings[0].length();
        String shorty = strings[0];
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() > max) {
                max = strings[i].length();
                taSamaya = strings[i];
            }
            if (strings[i].length() < min) {
                min = strings[i].length();
                shorty = strings[i];
            }
        }
        System.out.println(Arrays.toString(strings));
        System.out.println("Самая длинная: " + taSamaya + "/ её длина:" + max);
        System.out.println("Самая короткая: " + shorty + " /её длина:" + min);
    }

}