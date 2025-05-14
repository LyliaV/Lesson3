package string.task4;

public class DisplayNameAge {

    public static void main(String[] args) {
        // Напишите программу, которая принимает строку с именем и возрастом, а затем форматирует её в виде:
        // «Имя: [имя], Возраст: [возраст]»
        formStrNameAge("Петя 25");
    }

    private static void formStrNameAge(String nameAge) {

        System.out.println(nameAge);

        String[] info = nameAge.split(" ");

        if (info.length != 2) {
            System.out.println("Неверно введены данные Имя и Возраст");
            return;
        }

        System.out.println("Имя: " + info[0] + ", Возраст: " + info[1]);
    }
}
