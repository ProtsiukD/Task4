package homework;

import java.util.Scanner;

/**
 * Created by prots on 29.04.2017.
 */
public class NumberOfMonth {
    public static void main(String[] args) {
        String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "December"};
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter number month");
        int number = scanner.nextInt();

        String tmp = "";
        for (int i = 0; i < month.length; i++) {
            if (i == number - 1 && number >= 1 && number <= 12) {
                tmp = month[i] + " " + days[i] + " days.";
            }
        }

        System.out.println(tmp);
    }
}