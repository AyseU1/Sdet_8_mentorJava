package day_01_Methods;

public class C08_Task2 {
    public static void main(String[] args) {
        //      4. create a method that can calculate the grade of the student based on the score
// score >= 90 grade 'A'
// score >= 80 grade 'B'
// score >= 70 grade 'C'
// score >= 60 grade 'D'
// score < 60 grade 'F'

        grades(89);
        System.out.println(gradesWithReturn(95));

    }
    public static void grades(int score) {
        char grade;
        if (score >= 90)
            grade = 'A';
        else if (score >= 80)
            grade = 'B';
        else if (score >= 90)
            grade = 'C';
        else
            grade = 'F';
        System.out.println("Your score is " + score + " your grade is " + grade);
    }
    public static char gradesWithReturn(int score){
        char grade;
        if (score >= 90)
            grade = 'A';
        else if (score >= 80)
            grade = 'B';
        else if (score >= 90)
            grade = 'C';
        else
            grade = 'F';
        return grade;
    }
}