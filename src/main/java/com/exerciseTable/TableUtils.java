package com.exerciseTable;

public class TableUtils {

    //EXERCISE 01
    public static void printElementsOfTab(int[] tab) {
        int i;
        for (i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }

    //EXERCISE 02
    public static int getMax(int[] tab) {
        int result = tab[0];
        int i;
        for (i = 0; i < tab.length; i++) {
            if (result < tab[i]) {
                result = tab[i];
            }
        }
        return result;
    }

    //EXERCISE 03
    public static int getMin(int[] tab) {
        int result = tab[0];
        int i;
        for (i = 0; i < tab.length; i++) {
            if (result > tab[i]) {
                result = tab[i];
            }
        }
        return result;
    }

    //EXERCISE 04
    public static int getSum(int[] tab) {
        int result = tab[0];
        int i;
        for (i = 1; i < tab.length; i++) {
            result = result + tab[i];
        }
        return result;
    }

    //EXERCISE 05
    public static int[] getMaxMinAndSum(int[] tab) {
        int resultMax = TableUtils.getMax(tab);
        int resultMin = TableUtils.getMin(tab);
        int resultSum = TableUtils.getSum(tab);
        int[] resultTab = {resultMax, resultMin, resultSum};
        return resultTab;
    }

    //EXERCISE 06
    public static int[] getLarger(int[] tab1, int[] tab2) {
        int resultSumTab1 = TableUtils.getSum(tab1);
        int resultSumTab2 = TableUtils.getSum(tab2);
        int[] resultTab;
        if (resultSumTab1 > resultSumTab2) {
            resultTab = tab1;
        }
        else {resultTab = tab2;}
        return resultTab;
    }
}

