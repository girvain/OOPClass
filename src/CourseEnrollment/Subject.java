package CourseEnrollment;

/**
 *Subject class - Each subject is taught by one teacher and is taken by many students
 */

/**
 * @author MAl-Sabbagh
 *
 */
public class Subject
{
    private String nameOfSubject;
    private int examMark;
    private String examGrade;
    //private Lecturer lecturer=new Lecturer();
    private Lecturer lecturer;

    public Subject()
    {

    }

    public void details(String nameOfStudent) //Constructor that takes the name of the student as a parameter
    {
        System.out.print("Please enter the name of the subject taken by "+ nameOfStudent+": ");
        setNameOfSubject(Validate.validateString());
        System.out.print("Please enter the mark achived for the subject "+ getNameOfSubject()+": ");
        setExamMark(Validate.validateInteger());
        setExamGrade();

        //kick start the process of getting details for the Subject.
        lecturer=new Lecturer();
        getLecturer().details(getNameOfSubject());
    }

    public void setNameOfSubject(String nameOfSubject)
    {
        this.nameOfSubject = nameOfSubject;
    }

    public String getNameOfSubject()
    {
        return nameOfSubject;
    }

    public void setExamMark(int examMark)
    {
        this.examMark = examMark;
    }

    public int getExamMark()
    {
        return examMark;
    }

    public void setExamGrade()
    {
        //call the gradeCalcualtor method() to work out the grade based on the mark achieved
        examGrade = gradeCalculator();
    }

    public String getExamGrade()
    {
        return examGrade;
    }

    public String gradeCalculator()
    {
        String gradeAchieved="fail";
        if (this.getExamMark()<50)
        {
            gradeAchieved="fail";
        }
        else if(this.getExamMark() >=50 && this.getExamMark()<60)
        {
            gradeAchieved="C";
        }

        else if(this.getExamMark()>=60 && this.getExamMark()<70)
        {
            gradeAchieved="B";
        }
        else if (this.getExamMark()>=70 && this.getExamMark()<80)
        {
            gradeAchieved="A";
        }

        else if(this.getExamMark() >=80)
        {
            gradeAchieved="A+";
        }
        return gradeAchieved;
    }


    //public void setLecturer(String nameOfLecturer)
    public void setLecturer()
    {
        //Call the Lecturer constructor passing it the name of the subject as a parameter
        //lecturer = new Lecturer(getNameOfSubject());
    }

    public Lecturer getLecturer()
    {
        return lecturer;
    }

    public String displayDetails()
    {
        return "\n Name of Subject: "+ getNameOfSubject()+
                getLecturer().displayDetails(getNameOfSubject())+
                "\n Score Achieved: "+ getExamMark()+
                "\n Grade Achieved: "+getExamGrade();
    }
}
