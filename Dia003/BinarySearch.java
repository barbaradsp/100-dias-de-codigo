public class BinarySearch {
    public static void main(String[] args) {
        int[] array = initializeArray(100000);
        int target = 57873;

        long startTime = System.nanoTime();
        int result = binarySearch(array, target);
        long endTime = System.nanoTime();

        System.out.println("Element " + target + " found at index: " + result);

        long totalTime = endTime - startTime;
        System.out.println("Execution time: " + totalTime + " nanoseconds");

    }

    // Initialize an array with integer values from 1 to 100000
    public static int[] initializeArray(int arrayLenght) {
        int[] array = new int[arrayLenght];

        for (int i = 0; i < arrayLenght; i++) {
            array[i] = i + 1;
        }

        return array;
    }

    // Performs a binary search on a numerical array to find the index of a target value
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (array[middle] == target) {
                return middle;
            }
            if (array[middle] > target) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        return -1;
    }
}
