package Task_1;
import java.util.Scanner;
public class lesson3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("число" + n);



        if (n <15 && n >0 ) {
            System.out.println("1 Группа");
        }
        if (n <30 && n >= 15){
            System.out.println("2 Группа");
        }
        if (n >= 30){
            System.out.println("3 Группа");
        }
        if (n <=0 ) {
            System.out.println("не в диапозоне, проверь введенное число");
        }

        System.out.println("Привет, начинки для гробов!");
    }
}