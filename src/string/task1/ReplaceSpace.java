package string.task1;

public class ReplaceSpace {

    public static void main(String[] args) {

// Напишите программу, которая заменяет все пробелы в строке на символ подчеркивания (_)
        replace_Space("В абапе строки проще");
    }

    private static void replace_Space(String text) {

        System.out.println("Старая строка: " + text);

        System.out.println("Новая строка: " + text.replace(" ", "_"));

    }
}
