package com.softserve.academy;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //int array[] = new array[10];
        int array[] = {1, -6, 3, -11, 8, 33, 17, -25, 21, 10};
        int imax = 0, i = 0, sum = 0, j, positiveAmount, negativeAmount;
        int max = array[0];
        while (i < array.length) {

            if (array[i] > max) {
                max = array[i];
                imax = i;
            }
            i++;
        }
        System.out.print("Maximum = " + max);
        System.out.println(" is in " + (imax + 1) + " place");

        sum = 0;
        //int array1[] = {1, -6, 3, -11, 8, 33, 17, -25, 21, 10};
        for (j = 0; j < array.length; j++) {
            if (array[j] > 0) {
                sum += array[j];
                //System.out.println(array[j]);
            }
        }

        System.out.println("Sum = " + sum);

        positiveAmount = 0;
        for (int a : array) {
            if (a > 0) { positiveAmount++; }
        }
        System.out.println("Positive mount = " + positiveAmount);
        negativeAmount = 0;
        for (int a : array) {
            if (a < 0) { negativeAmount++; }
        }
        System.out.println("Negative mount = " + negativeAmount);

        if (positiveAmount > negativeAmount) {
            System.out.println("Додатніх значень більше від'ємних");
        } else {
            System.out.println("Від'ємних значень більше додатніх");
        }
    }
}
