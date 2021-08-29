package challenge26;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {8, 4, 23, 42, 16, 15};
        int[] arr2 = {20,18,12,8,5,-2};
        int[] arr3 = {5,12,7,5,5,7};
        int[] arr4 = {2,3,5,7,13,11};
        for (int i = 0; i < insertionSort(arr).length; i++) {
            System.out.print(insertionSort(arr)[i] + " -> ");
        }
        System.out.println();
        for (int i = 0; i < insertionSort(arr2).length; i++) {
            System.out.print(insertionSort(arr2)[i] + " -> ");
        }
        System.out.println();
        for (int i = 0; i < insertionSort(arr3).length; i++) {
            System.out.print(insertionSort(arr3)[i] + " -> ");
        }
        System.out.println();
        for (int i = 0; i < insertionSort(arr4).length; i++) {
            System.out.print(insertionSort(arr4)[i] + " -> ");
        }
    }

    public static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int temp = arr[i];
            while (j >= 0 && temp < arr[j]) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
        return arr;
    }
}
