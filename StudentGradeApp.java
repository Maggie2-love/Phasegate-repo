
import java.util.Scanner;

public class StudentGradeApp {

    public static int calculateTotal(int[] scores) {

        int total = 0;

        for (int index = 0; index < scores.length; index++) {
            total += scores[index];
        }

        return total;
    }

    public static double calculateAverage(int total, int subjects) {

        return (double) total / subjects;
    }

    public static int calculatePosition(int student, int[] totals) {

        int position = 1;

        for (int index = 0; index < totals.length; index++) {

            if (totals[index] > totals[student]) {
                position++;
            }
        }

        return position;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("How many students do you have?: ");
        int studentNumber = input.nextInt();

        System.out.print("How many subjects do they offer?: ");
        int subjectNumber = input.nextInt();
        
        System.out.println("\nSaving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Saved successfully!");
        

       
        int[][] scores = new int[studentNumber][subjectNumber];

        
        int[] totals = new int[studentNumber];

        double[] averages = new double[studentNumber];


        for (int student = 0; student < studentNumber; student++) {

            System.out.println("\nStudent " + (student + 1));

            for (int subject = 0; subject < subjectNumber; subject++) {

              
              System.out.println("Entering scores for student " + (student + 1));

              System.out.print("Enter score for subject " + (subject + 1) + ": ");

                scores[student][subject] = input.nextInt();
            }

            totals[student] = calculateTotal(scores[student]);

            averages[student] = calculateAverage(
                totals[student], subjectNumber
            );
        }

        System.out.println("\nSaving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Saved successfully!");
        
        
        System.out.println("\n=================================================");
        System.out.printf("%-10s", "STUDENT");

        for (int subject = 0; subject < subjectNumber; subject++) {
            System.out.printf("%-9s", "SUB" + (subject + 1));
        }

        System.out.printf("%-8s%-8s%-8s%n", "TOT", "AVE", "POS");
        System.out.println("===================================================");

        for (int student = 0; student < studentNumber; student++) {

            System.out.printf("%-10s", "Student " + (student + 1));

            for (int subject = 0; subject < subjectNumber; subject++) {
                System.out.printf("%-9d", scores[student][subject]);
            }

            int position = calculatePosition(student, totals);

            System.out.printf(
                "%-8d%-8.2f%-8d%n",
                totals[student],
                averages[student],
                position
            );
        }

        


{

{
        
        System.out.println("======================================================");
        System.out.println("                                                      ");
        System.out.println("======================================================");
       
        }
       }
    
}

}  




