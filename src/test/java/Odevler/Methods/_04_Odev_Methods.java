package Odevler.Methods;

public class _04_Odev_Methods {
    //      4. create a method that can calculate the grade of the student based on the score
// score >= 90 grade 'A'
// score >= 80 grade 'B'
// score >= 70 grade 'C'
// score >= 60 grade 'D'
// score < 60 grade 'F'


    public static void main(String[] args) {
      calculateGrade(70);
      calculateGradeWithReturn(25);
    }
    public static void calculateGrade(int score){
        if(score>=90)
            System.out.println(score+" = A ");
        else if (score>=80)
             System.out.println(score+" = B ");
          else if (score>=70)
              System.out.println(score+" = C ");
           else if (score>=60)
                System.out.println(score+" = D ");
             else
                 System.out.println(score+" = F ");
    }
    public static String calculateGradeWithReturn(int score){
        String result="";
        if(score>=90)
            System.out.println(score+" = A ");
        else if (score>=80)
            System.out.println(score+" = B ");
        else if (score>=70)
            System.out.println(score+" = C ");
        else if (score>=60)
            System.out.println(score+" = D ");
        else
            System.out.println(score+" = F ");
        return result;
    }


}
