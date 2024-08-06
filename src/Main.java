import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 1.
        printThreeWords();
        // 2.
        checkSumSign();
        // 3.
        printColor();
        // 4.
        compareNumbers();
        // 5.
        System.out.println(sumLimited(0, 5));
        // 6.
        positiveOrNegative(0);
        // 7.
        System.out.println(ifNegativeOrPositive(-1));
        // 8.
        outputLinesByNumber("Line", 2);
        // 9.
        System.out.println(ifIntercalaryYear(2024));
        // 10.
        int[] arr1 = {1, 0, 1, 1, 0, 1, 0, 1};
        System.out.println("Исходный массив\t\t\t" + Arrays.toString(arr1));
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 1) arr1[i] = 0;
            else arr1[i] = 1;
        }
        System.out.println("Преобразованный массив\t" + Arrays.toString(arr1));
        // 11.
        int[] arr2 = new int[100];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1;
        }
        System.out.println("Заполненный массив\t" + Arrays.toString(arr2));
        // 12.
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Исходный массив\t\t\t" + Arrays.toString(arr3));
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) arr3[i] *= 2;
        }
        System.out.println("Преобразованный массив\t" + Arrays.toString(arr3));
        // 13.
        int[][] table = new int[5][5];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[0].length; j++) {
                if (i == j) table[i][j] = 1;
                else if (i == table[0].length - 1 - j && j == table.length - i - 1) table[i][j] = 1;
                else table[i][j] = 0;
            }
            System.out.println(Arrays.toString(table[i]));
        }
        System.out.println(Arrays.toString(lenArrayFilledInitiaValue(5, 5)));
    }
    // 1.
    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }
    // 2.
    public static void checkSumSign() {
        int a = -1, b = 1;
        if (a + b >= 0) System.out.println("Сумма положительная");
        else System.out.println("Сумма отрицательная");
    }
    // 3.
    public static void printColor() {
        int value = 0;
        if (value <= 0) System.out.println("Красный");
        else if (value <= 100) System.out.println("Желтый");
        else System.out.println("Зеленыи");
    }
    // 4.
    public static void compareNumbers() {
        int a = 0, b = 0;
        if (a >= b) System.out.println("a >= b");
        else System.out.println("a < b");
    }
    // 5.
    public static boolean sumLimited(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) return true;
        else return false;
    }
    // 6.
    public static void positiveOrNegative(int a) {
        System.out.print("Число " + a);
        if (a >= 0) System.out.println(" положительное");
        else System.out.println(" отрицательное");
    }
    // 7.
    public static boolean ifNegativeOrPositive(int a) {
        if (a < 0) return true;
        else return false;
    }
    // 8.
    public static void outputLinesByNumber(String text, int n) {
        while (n != 0) {
            System.out.println(text);
            n--;
        }
    }
    // 9.
    public static boolean ifIntercalaryYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) return true;
        else return false;
    }
    // 14.
    public static int[] lenArrayFilledInitiaValue(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) arr[i] = initialValue;
        return arr;
    }
}