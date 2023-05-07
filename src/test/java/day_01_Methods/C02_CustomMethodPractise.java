package day_01_Methods;

public class C02_CustomMethodPractise {
    // a function that can print hello world 5 times==>hellWorld5Times()
    //a function that print Ten to Zero==>countdownTenTOZero()
    // a function that can print  all the even numbers from 1-100==>evenNumbers()


    public static void main(String[] args) {
        helloWorld5Times();
        
        int n=5;
        System.out.println("n = " + n);

        countdownTenTOZero();

        evenNumbers();


    }

    public static void evenNumbers() {
        for (int i = 0; i <=100 ; i+=2) {
            System.out.print( i +" ");
        }

    }

    public static void countdownTenTOZero() {
        for (int i = 10; i >0 ; i--) {
            System.out.println(i);

        }

    }

    public static void helloWorld5Times() {
        for (int i = 0; i <5 ; i++) {
            System.out.println("Hello World");

        }


    }


}
