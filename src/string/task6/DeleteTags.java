package string.task6;

public class DeleteTags {

    public static void main(String[] args) {
        // Напишите программу, которая удаляет все HTML теги из строки
        deleteTags("<p>Hello</p>");
    }

    private static void deleteTags(String text) {

        System.out.println(text);

        System.out.println(text.replaceAll("<[^>]*>", ""));
    }
}

