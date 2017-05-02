package homework;

import java.util.Scanner;

/**
 * Created by prots on 29.04.2017.
 */
public class NumberOfMonth {
    public static void main(String[] args) {
        String[] month = {"January","February","March","April","May","June","July","August","September","October","december"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter number month");
        int number=scanner.nextInt();
        for (int i = 0; i<month.length;i++){
            if(i==number-1 && number >=1 && number <= 12){
                System.out.println(month[i]+" "+i);
            }
            else
                System.out.println("Enter the number 1 - 12");
        }
    }
}