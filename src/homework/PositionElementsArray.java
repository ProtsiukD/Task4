package homework;

/**
 * Created by prots on 29.04.2017.
 */
public class PositionElementsArray {
    private static int index;
    public int positionSecondPositiveElement(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > 0 && array[j] > 0) {
                    index = j;
                }
            }
        }
        return index;
    }

    public int minAndPosition(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] array = {-56, 32, 89, -23, -90};
        PositionElementsArray positionElementsArray = new PositionElementsArray();
        System.out.println(positionElementsArray.positionSecondPositiveElement(array));
        System.out.println(positionElementsArray.minAndPosition(array)+" "+index);
    }
}