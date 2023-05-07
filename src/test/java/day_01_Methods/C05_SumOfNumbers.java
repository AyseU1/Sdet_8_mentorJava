package day_01_Methods;

public class C05_SumOfNumbers {
    public static void main(String[] args) {

        System.out.println(sumOfNumbers(5,8,9));
      //  sumONumbers();

        System.out.println(sumOfNumbers(4,5));

        System.out.println(sumOfNumbers(4,8,15));


    }

    public static int sumOfNumbers(int i, int i1, int i2) {
        return i+i1+i2;
    }

    public static int sumOfNumbers(int i, int i1) {
        return i+i1;
    }
    public static int sumOfNumbers(int i,int i1,int i2,int i3){
        return i+i1+i2+i3;
    }

    public static double sumONumbers(double d,double d1){
        return d+d1;
    }

}
