package string.task3;

public class DeleteDuplChar {

    public static void main(String[] args) {
        // Напишите программу, которая удаляет повторяющиеся символы из строки
        deleteDuplCharFromTxt("aabbcc");
    }

    private static void deleteDuplCharFromTxt(String text) {

        StringBuilder textNoDupl = new StringBuilder();

        System.out.println(text);

        for (int i = 0; i < text.length(); i++) {

            if (textNoDupl.indexOf(String.valueOf(text.charAt(i))) < 0) {

                textNoDupl.append(text.charAt(i));
            }
        }

        System.out.println(textNoDupl);
    }
}
