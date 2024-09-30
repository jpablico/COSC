import java.util.Arrays;

public class SearchComparison {
    public static void main(String[] args) {
        // Step 1: Create an array of at least 20 integers
        int[] array = {23, 5, 88, 45, 10, 67, 34, 29, 76, 54, 18, 92, 3, 11, 47, 60, 33, 42, 84, 9};
        
        // Step 2: Sort the array using QuickSort
        quickSort(array, 0, array.length - 1);
        System.out.println("Sorted Array: " + Arrays.toString(array));
        
        // Value to search
        int value = 45;

        // Step 3: Perform a sequential search
        int sequentialComparisons = sequentialSearch(array, value);
        System.out.println("Sequential Search Comparisons: " + sequentialComparisons);
        
        // Step 4: Perform a binary search
        int binaryComparisons = binarySearch(array, value);
        System.out.println("Binary Search Comparisons: " + binaryComparisons);
    }

    // Sequential search method
    public static int sequentialSearch(int[] array, int value) {
        int comparisons = 0;
        for (int i = 0; i < array.length; i++) {
            comparisons++;
            if (array[i] == value) {
                System.out.println("Value " + value + " found using sequential search.");
                return comparisons;
            }
        }
        System.out.println("Value " + value + " not found using sequential search.");
        return comparisons;
    }

    // Binary search method
    public static int binarySearch(int[] array, int value) {
        int comparisons = 0;
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            comparisons++;
            int mid = (low + high) / 2;

            if (array[mid] == value) {
                System.out.println("Value " + value + " found using binary search.");
                return comparisons;
            } else if (array[mid] < value) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("Value " + value + " not found using binary search.");
        return comparisons;
    }

    // QuickSort algorithm
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    // Partition method for QuickSort
    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;

                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swap array[i + 1] and array[high] (or pivot)
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }
}