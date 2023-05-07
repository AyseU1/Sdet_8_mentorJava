package Odevler.Methods;

public class _01_Odev_methods {

    //  1. create a method that can print odd numbers between 1~100 in a same line saperated by space

    public static void main(String[] args) {
        oddNumbers();
        System.out.println();
        oddNumbersWithReturn();
    }
    public static void oddNumbers() {
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
    public static String oddNumbersWithReturn() {
        String result = "";
        int i;
        for ( i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }return result;
    }
}




