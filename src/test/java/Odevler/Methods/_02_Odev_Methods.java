package Odevler.Methods;

public class _02_Odev_Methods {

    // 2. create a method that can print even numbers between 1~100 in a same line saperated by space
    public static void main(String[] args) {
        evenNumbers();
        System.out.println();
        evenNumbersWithReturn();
    }
    public static void evenNumbers(){
        for (int i = 0; i <100 ; i++) {
            if (i%2==0)
                System.out.print(i+" ");
        }
    }
    public static boolean evenNumbersWithReturn(){
        boolean result=true;
        for (int i = 0; i <100 ; i++) {
            if (i%2==0)
                System.out.print(i+" ");
        }
        return result;
    }
}
