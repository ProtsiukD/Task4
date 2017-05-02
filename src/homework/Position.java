package homework;

/**
 * Created by prots on 29.04.2017.
 */
public class Position {
    private static int index;
    public int positionSecondPositiveElement(int[] array) {
        int index = -1;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > 0 && array[j] > 0) {
                    index=j;
                }
                break;
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
        int[] array = {-56, 2, 89, -23, 90};
        Position position = new Position();
        System.out.println(position.positionSecondPositiveElement(array));
        System.out.println(position.minAndPosition(array)+" "+index);
    }
}