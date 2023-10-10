import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String alinur;
        final int num = 54;
        String word =" Homework ";
        alinur = num + word;
        System.out.println(alinur);


        if (num > 0) {
            System.out.println("Вы сохранили положительное число");
        } else if (num < 0) {
            System.out.println("Вы сохранили отрицательное число");
        }else {
            System.out.println("Вы сохранили ноль");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя:");
        String text = scanner.nextLine();
        System.out.println(text + " привет");
    }
}