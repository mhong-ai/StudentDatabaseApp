package StudentDatabaseApp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeLevel;
    private String studentID;
    private String courses;
    private int tuitionBalance=0;
    private static int costOfCourse = 600;
    private static int id = 10000;


    // ask for user input: how many students will be added
    public Student () {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.print("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student grade level: ");
        this.gradeLevel = in.nextInt();

        setStudentID();
    }

    //generate an ID
    private void setStudentID() {
        //based on grade level +  ID
        id++;
        this.studentID = gradeLevel + "" + id;

    }
    //Enroll in courses
    public void enrollment() {
        // initiate a loop, user hits 0
        do {
            System.out.println("Enter course to enroll (type q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("q")) {
                courses = courses + "\n " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else {
                break;
            }
        } while (1 != 0);
    }
    //View balance
    public void viewBalance() {
        System.out.println("Your balance is: $" + tuitionBalance);
    }

    //pay tuition
    public void payTuition() {
        viewBalance();
        System.out.println("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int pay = in.nextInt();
        tuitionBalance = tuitionBalance - pay;
        System.out.println("Thank you for your payment: $" + pay);
        viewBalance();
    }

    //show student status
    public String toString() {
        return "Name: " + firstName + " " + lastName +
                "\nGrade Level: " + gradeLevel +
                "\nStudent ID: " + studentID +
                "\nCourses enrolled:" + courses +
                "\nBalance: $" +tuitionBalance;
    }

}
