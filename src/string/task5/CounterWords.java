package string.task5;

public class CounterWords {


    public static void main(String[] args) {
        // Напишите программу, которая подсчитывает количество слов в тексте
        countWords("В абапе строки проще");
    }

    private static void countWords(String text) {

        System.out.println(text);

        String[] textSplit = text.split(" ");

        System.out.println("Количество слов: " + textSplit.length);
    }
}
