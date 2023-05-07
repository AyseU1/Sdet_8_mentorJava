package day_02_Object_StringClass;

public class C03_StringClassMethods {
    public static void main(String[] args) {

        //length();
        String dil="Java";//String pool icerisinde bir obje olusturduk
        System.out.println(dil.length());

        dil="python";//String pool icerisinde bir obje olusturduk
        System.out.println();

        System.out.println(dil.charAt((dil.length()-1)));
        dil=dil.toUpperCase();
        System.out.println(dil);

        //concat() dil=PYHTON


    }
}
