import java.util.Scanner;
//num 1
public class LabExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the number to search: ");
        int searchValue = scanner.nextInt();
        int count = 0;
        for (int num : arr) {
            if (num == searchValue) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println(searchValue + " appears " + count + " times in the array.");
        } else {
            System.out.println(searchValue + " is not found in the array.");
        }

        scanner.close();
    }
}

