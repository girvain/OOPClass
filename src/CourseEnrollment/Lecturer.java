package CourseEnrollment;

/**
 * Teacher class - holding information about lecturers teaching subjects
 */

/**
 * @author MAl-Sabbagh
 *
 */
public class Lecturer extends Person
{

    public Lecturer()
    {

    }
    public void details(String nameOfSubject) //compute lecturer details
    {
        // TODO Auto-generated constructor stub
        System.out.print("Please enter the name of the lecturer teaching "+nameOfSubject+": ");
        setName(Validate.validateString());
    }

    public String displayDetails(String nameOfSubject)
    {
        return "\n Name of lecturer teaching "+ nameOfSubject+": "+ getName();
    }
}


