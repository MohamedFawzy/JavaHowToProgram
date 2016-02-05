package chapter3;

/**
 * @author Mohamed fawzy
 * @copyright GPL
 */
public class GradeBook
{
    private String courseName;

    public GradeBook()
    {

    }

    public GradeBook(String name)
    {
        courseName = name;
    }

    /**
     *
     * @return string
     */
    public String getCourseName()
    {
        return courseName;
    }

    /**
     * @param  courseName
     * @return void
     */
    public void setCourseName(String courseName)
    {
        this.courseName = courseName;
    }

    public void displayMessage()
    {
        System.out.printf("Welcome to grade book for %s!\n", getCourseName());
    }
}
