package DSA;

public class BubbleSort {
    public static void main(String[] args) {

        int[] array = {1,3,5,7,4,3,19,12};

        Bubblesort(array);

        for (int i : array) {
            System.out.println(i + " ");
        }
    }

    private static void Bubblesort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }
            }
        }
    }
}
