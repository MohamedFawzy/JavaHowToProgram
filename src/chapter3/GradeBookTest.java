package chapter3;

import java.util.Scanner;

/**
 * @author Mohamed fawzy
 * @copyright GPL
 */
public class GradeBookTest
{
    public static void main(String[] args)
    {
        // scanner user input command line
        Scanner input = new Scanner(System.in);
        // grade object
        GradeBook gradeBook = new GradeBook();
        // print message for user
        System.out.println("Enter course name:");
        // read user input as string
        String nameOfCourse = input.nextLine();
        // set course name in gradebook object
        gradeBook.setCourseName(nameOfCourse);
        // print message with object
        gradeBook.displayMessage();
    }
}
