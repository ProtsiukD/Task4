package practical_task;

import java.util.Scanner;

/**
 * Created by prots on 27.04.2017.
 */
public class Array1 {
    public static int maxNumber(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int totalSumPositive(int[] array) {
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                suma += array[i];
            }
        }
        return suma;
    }

    public static int totalAmountNegative(int[] array) {
        int amount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                amount++;
            }
        }
        return amount;
    }

    public static String compareNum(int[] array) {
        int amount = 0, sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sum++;
            }
            if (array[i] < 0) {
                amount++;
            }
        }
        String tmp="";
        if(sum>amount){
             tmp="Number positive elements "+sum;
        }
        if(sum<amount) {
             tmp = "Number negative elements "+amount;
        }
        if(sum==amount)  {
            tmp = "Negative = positive"+amount+" "+sum;
        }
        return tmp;
    }

    public static void main(String[] args) {
        int[] array = {1, -34, -25, 67, -98, 0, 64, -21, 12, 40};
        System.out.println("Max element = " + maxNumber(array));
        System.out.println("Sum positive element " + totalSumPositive(array));
        System.out.println("Amount negative elements " + totalAmountNegative(array));
        System.out.println(compareNum(array));
    }
}