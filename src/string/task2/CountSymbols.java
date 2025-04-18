package string.task2;

public class CountSymbols {

    public static void main(String[] args) {

// Напишите программу, которая подсчитывает количество вхождений каждого символа в строке
        countSymbols("abap");
    }

    private static void countSymbols(String text) {

        StringBuilder changeText = new StringBuilder(text);
//String changeText = text;

        String writeEnd = "";

        for (int i = 0; i < text.length(); i++) {

            int counter = 0;
            int numChar;

            do {
                numChar = changeText.indexOf(String.valueOf(text.charAt(i)));

                if (numChar >= 0) {
                    counter++;
                    changeText.deleteCharAt(numChar);
                }
            }
            while (numChar >= 0);

            if (counter > 0) {
                if (i == 0) {
                    writeEnd = text.charAt(i) + " - " + counter;
                } else {
                    writeEnd = writeEnd + ", " + text.charAt(i) + " - " + counter;
                }
            }
        }

        System.out.println(writeEnd);
    }
}