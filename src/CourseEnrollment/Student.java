package CourseEnrollment;

/**
 * Student class holding information about students
 */

/**
 * @author MAl-Sabbagh
 *
 */
public class Student extends Person
{
    int matriculationNumber;
    //This is an identifier (variable) of type subject. Here we are
    //assuming that each student is going to take only one subject
    private Subject subjectTaken;
    public Student()
    {
        // TODO Auto-generated constructor stub
    }

    public void details()
    {

        System.out.print("Please enter the name of the student: ");
        setName(Validate.validateString());

        System.out.print("Please enter the age of the student: ");
        setAge(Validate.validateInteger());

        subjectTaken=new Subject();
        //kick start the process of getting details for the Subject.
        getSubjectTaken().details(getName());
    }

    public void setMatriculationNumber(int matriculationNumber)
    {
        this.matriculationNumber = matriculationNumber;
    }

    public int getMatriculationNumber()
    {
        return matriculationNumber;
    }

    public String getMatriculationNumberAsString() {
        return Integer.toString(matriculationNumber);
    }

    //Start the process of filling subject details
    public void setSubjectTaken()
    {
        //Instantiate the Subject object passing it the name of the student taking this subject
        //subjectTaken = new Subject(getName());
    }

    public Subject getSubjectTaken()
    {
        return subjectTaken;
    }

    public String displayDetails()
    {
        return "\n Name of Student: "+getName()+
                "\n Age of Student: "+ getAge()+
                "\n Student Matriculation number: " + getMatriculationNumber();
                //getSubjectTaken().displayDetails();

    }

}
