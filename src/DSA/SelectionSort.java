package DSA;

public class SelectionSort {
    public static void main(String[] args) {

        int[] array = {9,0,7,6,5,6,7,10};

        Selectionsort(array);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    private static void Selectionsort(int[] array) {
        for (int i = 0; i < array.length -1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }
}
