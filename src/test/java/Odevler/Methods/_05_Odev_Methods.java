package Odevler.Methods;

public class _05_Odev_Methods {

//  5. create a method named calculator that passes three arguments (num1, num2, mathOperator),
//      prints the calculation result

    public static void main(String[] args) {
        hesapMakinasi(23,6,"+");
        hesapMakinasi(43,89,"-");
        hesapMakinasi(46,8,"/");
        hesapMakinasi(56,98,"*");
    }
    public static void hesapMakinasi(double num1,double num2,String matOperator){
        double result;
        if (matOperator=="+") {
            result = num1 + num2;
            System.out.println("result = " + result);
        } else if (matOperator=="-") {
            result=num1-num2;
            System.out.println("result = " + result);
        } else if (matOperator=="*") {
            result=num1*num2;
            System.out.println("result = " + result);
        } else if (matOperator=="/") {
            result=num1/num2;
            System.out.println("result = " + result);
        }
    }
 /*   public static char hesapMakinasiWithReturn(double num1,double num2,char matOperator){
        c
        return
    */


}
