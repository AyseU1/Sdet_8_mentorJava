package day_02_Object_StringClass;

public class C04_StringEqualsIgnoreCase {
    public static void main(String[] args) {

        String s1="Merhaba";
        String s2="MERhaba";
        System.out.println(s1==s2);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.isBlank());

    }
}
