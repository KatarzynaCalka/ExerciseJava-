package com.exerciseTable;

public class Main {
    public static void main(String[] args) {

        int[] tab = {15, 4, -4, -15, 7};
        int[] tab1 = {1, 1, 1, 1, 1};
        int[] tab2 = {2, 2, 2, 2, 2};

        System.out.println("EXERCISE 01");
        TableUtils.printElementsOfTab(tab);

        System.out.println("EXERCISE 02");
        System.out.println(TableUtils.getMax(tab));

        System.out.println("EXERCISE 03");
        System.out.println(TableUtils.getMin(tab));

        System.out.println("EXERCISE 04");
        System.out.println(TableUtils.getSum(tab));

        System.out.println("EXERCISE 05");
        TableUtils.printElementsOfTab(TableUtils.getMaxMinAndSum(tab));

        System.out.println("EXERCISE 06");
        TableUtils.printElementsOfTab(TableUtils.getLarger(tab1, tab2));
    }
}