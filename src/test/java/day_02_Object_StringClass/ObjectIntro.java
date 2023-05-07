package day_02_Object_StringClass;

public class ObjectIntro {
    public static void main(String[] args) {
        int num1=4;
        int num2=5;

        int result=num1+num2;
        System.out.println("result = " + result);

        System.out.println(sum(5,9));

        Calculator calc=new Calculator();
        System.out.println(calc.sum());
        System.out.println(calc.num4);


    }
    public static int sum(int i,int i2){
        return i+i2;
    }
}
class Calculator{
    int num4=5;
    public int sum(){
        System.out.println("In add");
        return 0;
    }



}
