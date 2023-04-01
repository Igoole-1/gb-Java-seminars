package lesson_2;

public class Task1 {
    public static void bubbleSorting(int[] sortArr) {
        for (int i = 0; i < sortArr.length - 1; i++) {
            for (int j = 0; j < sortArr.length - 1; j++) {
                if (sortArr[j] > sortArr[j + 1]) {
                    int temp = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = temp;
                }
            }
        }
    }
    public static void printArray () {
        int[] sortArr = {12, 6, 4, 1, 15, 10};
        bubbleSorting(sortArr);
        for (int i = 0; i < sortArr.length; i++) {
            System.out.print(sortArr[i] + "\n");
        }
    }
}
