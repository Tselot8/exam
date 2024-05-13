
public class ArrayOperation {
//num 6
    public static void main(String[] args) {
        int[] array = {3, 7, 1, 9, 4};
        int indexToDelete = 2; // Example: Delete element at index 2

        int[] modifiedArray = deleteElement(array, indexToDelete);

        if (modifiedArray != null) {
            System.out.println("Modified Array:");
            printArray(modifiedArray);
        }
    }

    static int[] deleteElement(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            System.out.println("Invalid index.");
            return arr; // Return the original array unchanged
        }

        int[] result = new int[arr.length - 1];
        int resultIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i != index) {
                result[resultIndex] = arr[i];
                resultIndex++;
            }
        }

        return result;
    }

    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

