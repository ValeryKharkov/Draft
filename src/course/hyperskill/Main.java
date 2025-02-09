package course.hyperskill;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void fillArray() {
        int n = 10;
        int[] numbers;
        numbers = new int[n];
        Arrays.fill(numbers, 10);
        System.out.println(Arrays.toString(numbers));
    }

    public static void lengthArray() {
        int[] array = new int[10];
        int lenght = array.length;
        System.out.println(lenght);

        array[0] = 10;
    }

    public static void squaresArray() {
        int n = 10;
        int[]squares = new int[n];
        System.out.println(Arrays.toString(squares));

        for (int i = 0; i < squares.length; i++) {
            squares[i] = i * i;
        }
        System.out.println(Arrays.toString(squares));
    }

    public static void checkOrder() {
        int[] numbers = {1, 2, 3, 4, 5};
        boolean isBroken = false;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[i - 1]) {
                isBroken = true;
                break;
            }
        }

        if (isBroken) {
            System.out.println("BROKEN");
        } else {
            System.out.println("NOT BROKEN");
        }
    }

    public static void scannerArray() {
        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt();
        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));
    }

    public static void sumElement() {
        int[] numbers = {1, 2, 3};

        int sum = 0;
        for (int i = 0; i <= numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println(sum);
    }

    public static void sumElementGreaterNumber() {
        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt(); // reading a length
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt(); // read the next number of the array
        }

        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < len; i++) {
            if (array[i] > n) {
                sum = sum + array[i];
            }
        }

        System.out.println(sum);
    }

    public static void multiplicationTwoAdjacentElements() {
        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt(); // reading a length
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt(); // read the next number of the array
        }
        int multi = 1;
        int max = 0;

        for (int i = 0; i < len - 1; i++) {
            multi = array[i] * array[i + 1];

            if (multi >= max) {
                max = multi;
            }
        }

        System.out.println(max);
    }

    public static void checkNumberChars(){
        char[] chars = { 'a', 'b', 'c', 'd', 'e' };
        for (int i = 3; i < chars.length; i++) { System.out.println(chars[i]); }
    }

    public static void main(String[] args) {
//        fillArray();
//        lengthArray();
//        squaresArray();
//        checkOrder();
//        scannerArray();
//        sumElement();
//        sumElementGreaterNumber();
//        multiplicationTwoAdjacentElements();
        checkNumberChars();

    }
}

