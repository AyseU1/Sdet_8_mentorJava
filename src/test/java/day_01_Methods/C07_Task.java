package day_01_Methods;

public class C07_Task {
    public static void main(String[] args) {
        //  1. create a method that can print odd numbers between 1~100 in a same line saperated by space

        oddNumbers();
        System.out.println();
        System.out.println(oddNumbersWithReturn());
    }
    public static void oddNumbers(){
        for (int i = 1; i <100 ; i+=2) {
            System.out.print(i+" ");
        }
    }
    public static String oddNumbersWithReturn(){
        String result="";
        for (int i = 1; i <100 ; i+=2) {
            result+=i+" ";
        }
        return result;
    }


}
