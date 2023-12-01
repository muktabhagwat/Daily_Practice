package practice;

import java.util.*;

public class fun_demo {
    static int[] array;

    public static void accept() {
        // Accept the array
        int size, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array:");// size of array
        size = sc.nextInt();
        array = new int[size];
        System.out.println("Enter Array element:");// accept the array
        for (i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
    }

    public static void display(int array[]) {
        // Display array
        int i;
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void greatest(int array[]) {
        // Find greatest element in array
        int i, max = array[0];
        for (i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("The Greatest Number is" + max);
    }

    public static void smallest(int array[]) {
        // Find smallest element in array
        int i, min = array[0];
        for (i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("The Smallest Number is" + min);
    }

    public static void ascending(int array[]) {
        // Sort array in ascending order
        int i, j, temp;
        for (i = 0; i < array.length - 1; i++) {
            for (j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("After Sorting Ascending order");
        display(array);
    }

    public static void descending(int array[]) {
        // Sorting array in descending order
        int i, j, temp;
        for (i = 0; i < array.length - 1; i++) {
            for (j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("After Sorting Descending order");
        display(array);
    }

    public static void main(String[] args) {
        accept();
        display(array);
        greatest(array);
        smallest(array);
        ascending(array);
        descending(array);
    }
}
