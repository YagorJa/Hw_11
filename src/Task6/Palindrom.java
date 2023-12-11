package Task6;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введите строку: ");
        String vvodimayaStr = scanner.nextLine();


        String[] words = vvodimayaStr.split("\\s+");


        System.out.print("Введите номер слова для проверки (целое число от 1 до " + words.length + "): ");
        int wordIndex = scanner.nextInt();


        if (wordIndex < 1 || wordIndex > words.length) {
            System.out.println("Ошибка: введен некорректный номер слова.");
            return;
        }

        String selectedWord = words[wordIndex - 1];


        if (isPalindrome(selectedWord)) {
            System.out.println("Слово '" + selectedWord + "' является палиндромом.");
        } else {
            System.out.println("Слово '" + selectedWord + "' не является палиндромом.");
        }
    }


    private static boolean isPalindrome(String word) {
        String reversedWord = new StringBuilder(word).reverse().toString();
        return word.equalsIgnoreCase(reversedWord);
    }
}


