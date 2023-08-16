public class LinearSearch {
    public static void main(String[] args) {
        int[] array = initializeArray(100000);
        int target = 57873;

        long startTime = System.nanoTime();
        int result = linearSearch(array, target);
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

    // Performs a linear search on a numerical array to find the index of a target value
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }

        return -1;
    }
}