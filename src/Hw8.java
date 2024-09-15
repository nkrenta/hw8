import java.util.Arrays;
import java.util.Scanner;

public class Hw8 {

    public static int scanner() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static void main(String[] args) {

        //Task 1
        System.out.println("Task 1");

        int[] firstArray = {1, 2, 3};
        double[] secondArray = {1.57, 7.654, 9.986};

        System.out.println("Input number of elements in the third array:");
        int thirdArraySize = scanner();
        int[] thirdArray = new int[thirdArraySize];
        for (int i = 0; i < thirdArraySize; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            thirdArray[i] = scanner();
        }
        System.out.println("Array number 3: " + Arrays.toString(thirdArray));

        System.out.println();

        //Task 2
        System.out.println("Task 2");

        System.out.println("Array number 1: " + Arrays.toString(firstArray));
        System.out.println("Array number 2: " + Arrays.toString(secondArray));
        System.out.println("Array number 3: " + Arrays.toString(thirdArray));

        System.out.println();

        //Task 3
        System.out.println("Task 3");

        System.out.println("Reverted first array:");
        for (int i = firstArray.length; i > 0; i--) {
            if (i > 1) {
                System.out.print(firstArray[i - 1] + ", ");
            } else {
                System.out.println(firstArray[i - 1]);
            }
        }
        System.out.println();

        System.out.println("Reverted second array:");
        for (int i = secondArray.length; i > 0; i--) {
            if (i > 1) {
                System.out.print(secondArray[i - 1] + ", ");

            } else {
                System.out.println(secondArray[i - 1]);
            }

        }
        System.out.println();

        System.out.println("Reverted third array:");
        for (int i = thirdArray.length; i > 0; i--) {
            if (i > 1) {
                System.out.print(thirdArray[i - 1] + ", ");
            } else {
                System.out.println(thirdArray[i - 1]);
            }
        }
        System.out.println();

        System.out.println();

        //Task 4
        System.out.println("Task 4");

        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] % 2 != 0) {
                firstArray[i] += 1;
            }
        }
        System.out.println("First array after modifications: " + Arrays.toString(firstArray));
    }
}
