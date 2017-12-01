package CourseEnrollment;

/**
 * This class has generic features for other classes such as Student and Teacher
 */

/**
 * @author MAl-Sabbagh
 *
 */
public class Person
{
    private String name;
    private int age;
    private String sex;

    public Person()
    {
        // TODO Auto-generated constructor stub
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public int getAge()
    {
        return age;
    }

    public void setSex(String sex)
    {
        this.sex = sex;
    }

    public String getSex()
    {
        return sex;
    }

    public String displayDetails()
    {
        return "\n Name is: "+getName();
    }

    public void details()
    {

    }
}
