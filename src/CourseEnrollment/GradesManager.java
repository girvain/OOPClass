package CourseEnrollment;

/**
 *This is the driver of the project which contains the main method
 *It instantiates an object of type Student.
 *The process is composition, that is, once a Student is instantiated then we get a Subject object
 *which in turn instantiates a Lecturer object.
 @author MAl-Sabbagh
 **/
public class GradesManager
{
    public static void main(String[] args)
    {
        Student[] myStudents;
        System.out.print("Enter the number of students required: ");
        int numOfStudents=Validate.validateInteger();
        myStudents=new Student[numOfStudents];
        String results="Here are the details ...............";
        for (int i=0;i<myStudents.length;i++)
        {
            int n=i+1;
            myStudents[i]=new Student();
            System.out.println("\nFor Student "+(n)+".......");

            //Call the details() method to fill in the details for each student
            details(myStudents[i]);
            //Call the display() method to start filling in a String of the results for each student
            results=results+display(myStudents[i],n);
        }
        System.out.println(results);
    }//main()

    //Entering the details for each Student object (Student, Subject and Lecturer details)
    public static void details(Student student)
    {
        //Enter Details for each Student object
        student.details();
    }//details

    //Display the details for every Student object.
    public static String display(Student student1,int number)
    {
        String displayResults="\n";
        displayResults=displayResults+"\nFor Student "+number+student1.displayDetails()
                +"\n===========================================================";
        return displayResults;
    }
}
