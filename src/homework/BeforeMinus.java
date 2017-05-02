package homework;

import java.util.Scanner;

/**
 * Created by prots on 01.05.2017.
 */
public class BeforeMinus {
    public int sum(int[] array) {
        int sum = 0;
        for (int a : array) {
            if (a % 2 == 0) {
                sum += a;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            if (array[i] < 0) {
                break;
            }
        }
        BeforeMinus beforeMinus = new BeforeMinus();
        System.out.println(beforeMinus.sum(array));
    }
}