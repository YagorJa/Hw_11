package Task3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

    System.out.println("Введите 3 строки:");
    Scanner scanner = new Scanner(System.in);
    String[] strings = new String[3];
        for (int i = 0; i < strings.length; i++) {
        strings[i] = scanner.nextLine();
    }
      StringOperator operator = new StringOperator(strings);

    }
}
