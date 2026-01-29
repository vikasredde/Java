import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] grades = new int[5]; // initial size
        int count = 0;

        int sum = 0;
        int highest = Integer.MIN_VALUE;
        int passed = 0;

        while (true) {
            int grade = sc.nextInt();

            if (grade == -1) {
                break;
            }

            // resize array if full
            if (count == grades.length) {
                int[] temp = new int[grades.length * 2];
                System.arraycopy(grades, 0, temp, 0, grades.length);
                grades = temp;
            }

            grades[count++] = grade;

            sum += grade;
            if (grade > highest) highest = grade;
            if (grade >= 60) passed++;
        }

        double average = (count > 0) ? (double) sum / count : 0;

        System.out.println("Average: " + average);
        System.out.println("Highest: " + highest);
        System.out.println("Passed: " + passed);
    }
}
