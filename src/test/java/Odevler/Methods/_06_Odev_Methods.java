package Odevler.Methods;

public class _06_Odev_Methods {
     // 6. verdigimiz bir sayinin faktoryelini hesaplayip

    public static void main(String[] args) {
        faktöriyelHesapla(9);
    }
    public static void faktöriyelHesapla(int num){
        int result=1;
        for (int i = num; i >0 ; i--) {
            result*=i;
        }
        System.out.println("result = " + result);
    }

}
