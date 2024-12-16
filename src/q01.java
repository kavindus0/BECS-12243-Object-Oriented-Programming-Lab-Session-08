public class q01 {
    void calculateGrade(int score){
        if(score >= 90 && score <= 100){
            System.out.println("Your grade is: A");
        } else if (score >= 80 && score <= 89) {
            System.out.println("Your grade is: B");
        } else if (score > 100 || score < 0) {
            System.out.println("Error: Please enter a score between 0 and 100.");
        } else if ( score <= 70) {
            System.out.println("Your grade is: C");
        }
    }

}
