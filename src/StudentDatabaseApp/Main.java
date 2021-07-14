package StudentDatabaseApp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Ask for how many new users we want to add to database
        System.out.print("Enter number of new students to enroll: ");
        Scanner in = new Scanner (System.in);
        int studentsNum = in.nextInt();
        Student[] students = new Student[studentsNum];

        //Create N number of new students
        for (int n = 0; n < studentsNum; n++) {
            students[n] = new Student();
            students[n].enrollment();
            students[n].payTuition();
        }

        for (int n = 0; n < studentsNum; n++) {
            System.out.println(students[n].toString());
        }
    }

}
