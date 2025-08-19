public class QuickSort {
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }
    public static int partition(int[] array, int low, int high) {
        int pivot = array[high]; 
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }
    public static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] data = { 10, 7, 8, 9, 1, 5 };
        System.out.println("Unsorted array:");
        printArray(data);

        quickSort(data, 0, data.length - 1);

        System.out.println("Sorted array:");
        printArray(data);
    }
}
