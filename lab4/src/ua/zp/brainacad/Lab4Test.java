package ua.zp.brainacad;

import java.util.Arrays;

/**
 * This is prototype for Lab 4.
 */
public class Lab4Test {

    public static void main(String[] args) {

        // PART 1
        // 1.1)
        float[] firstArray;// TODO init it's array by new with size 4.
        firstArray = new float[4];

        firstArray [0] = 5;
        firstArray [3] = 13;

        // TODO insert some value to start of array and to end of array.

        int[] intArray = {1,5,3,78,5,6}; // TODO init and fill it's array with any values. Use {} syntax.

        // 1.2)
        int[] intArrayCopy = Arrays.copyOf(intArray, 6); // TODO copy "intArray". Use copyOf...

        // 1.3)
        // TODO sort "intArrayCopy", use Arrays sort.
        Arrays.sort(intArrayCopy);
        // 1.4)
        // TODO print "intArrayCopy", use Arrays toString.
        System.out.println(Arrays.toString(intArrayCopy));
        // 1.5)
        // TODO compare "intArray"  and "intArrayCopy", use Arrays equals. Print "Arrays equals" or "Arrays not equals".
        Arrays.equals(intArray,intArrayCopy);
        if (intArray==intArrayCopy) {
        System.out.println("Arrays equals");
        } else {
            System.out.println("Arrays not equals");
        }

        // PART 2
        int[] testArray = {1, 3, 5, 7, 8, 6, 4, 2, 0};

        // Print array values in cycle.
        for (int value: testArray) {
            System.out.println(value + " ");
       }

        // 2.1)
        // TODO calc sum of all array elements and print result.
        int[] testArraySum = {};
        testArraySum = Arrays.copyOf(testArray, testArray.length);
        int sumArr = 0;
        for (int value: testArraySum) {
            sumArr += value;
            System.out.println (value + " = " + sumArr);

        }

        // 2.2)
        // TODO calc sum of all numbers with odd indexes and print result.
        int [] testOddNum = Arrays.copyOf(testArray, testArray.length);
        int sumOdd = 0;
        for (int value: testOddNum) {
            if (value % 2 == 0) {
                System.out.println();
            } else {
                sumOdd += value;
                System.out.println("Сумма нечетных чисел =" + sumOdd);
            }
        }

        // 2.3)
        // TODO find max value in array.
        int[] testArraySumMax = {};
        testArraySumMax = Arrays.copyOf(testArray, testArray.length);
        Arrays.sort(testArraySumMax);
        int max = testArraySumMax[testArraySumMax.length-1];
        System.out.println(max);





        // PART 3

        //3.1
        // TODO create two-dimensional array with size [3][4]

        //3.2
        // TODO fill array with any numbers in cycles.

        //3.3
        // TODO calc sum of all array elements and print result.


        // PART 4*

        long[][] matrix = new long[9][9];

        int ratio = 0;
        for (long[] row: matrix ) {
            Arrays.fill(row, ++ratio);
        }

        int sum = 0;
        // TODO* calc sum only max and min values of matrix by expression: 2 < i <= 5 and only every third j value.
        System.out.println(sum);
    }
}