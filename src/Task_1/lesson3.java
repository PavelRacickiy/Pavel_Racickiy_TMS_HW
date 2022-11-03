package Task_1;

import java.util.Scanner;

public class lesson3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int loopValue = 0;

        System.out.println("число" + n);
        if (n < 15 && n > 0 ) {
            System.out.println("1 Группа");
            loopValue = 1;
        }
        if (n < 30 && n >= 15){
            System.out.println("2 Группа");
            loopValue = 2;
        }
        if (n >= 30){
            System.out.println("3 Группа");
            loopValue = 3;
        }
        if (n <= 0 ) {
            System.out.println("не в диапозоне, проверь введенное число");
        }

        for (int i = 0; i < loopValue; i++) {
            System.out.println("Привет, начинки для гробов!");
        }
    }
}