package day_01_Methods;

public class C04_CustomsMethodsPractise {

    //a function that can check if a number is odd number or even number
    public static void main(String[] args) {

        System.out.println(addOrEven(15));


    }


 /*   public static void addOrEven(int number){
        if (number%2==0){
            System.out.println(number+" is an even number");

        }else
            System.out.println(number+" is an odd number");

    }*/
    public static String addOrEven(int num){
        String result="";
        if (num%2==0){
            result="number even";

        }else
            result="number odd";
        return result;

    }

}
