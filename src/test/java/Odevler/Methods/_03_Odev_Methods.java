package Odevler.Methods;

public class _03_Odev_Methods {
    //      3. create a method that can check if a person is eligible to vote
//    Ex:
//         eligibleToVote(19, "TR");
//
//   output:
//        You are  eligible to vote!

    public static void main(String[] args) {
        eligibleToVote(21);
        eligibleToVoteWithReturn(13);
    }
    public static void eligibleToVote(int age){
        if (age>=19)
            System.out.println("You are eligible to vote");
        else
            System.out.println("You are not eligible to vote");
    }
    public static String eligibleToVoteWithReturn(int age){
        String result="";
        if (age>=19)
            System.out.println("You are eligible to vote");
        else
            System.out.println("You are not eligible to vote");
        return result;
    }

}
