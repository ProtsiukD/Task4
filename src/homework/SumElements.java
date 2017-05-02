package homework;

/**
 * Created by prots on 29.04.2017.
 */
public class SumElements {
    public int sumFirstFiveElement(int[] array) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            if (array[i] > 0) {
                sum += array[i];
            }
        }
        return sum;
    }

    public int sumLastFiveElement(int[] array) {
        int sum = 0;
        for (int i = 5; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array = {1, -2, 45, -78, 99, -234, 546, -464, 464, 777};
        SumElements sumElements = new SumElements();
        System.out.println(sumElements.sumFirstFiveElement(array));
        System.out.println(sumElements.sumLastFiveElement(array));
    }
}
