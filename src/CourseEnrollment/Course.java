package CourseEnrollment;

public class Course extends ArrayTool{

    private String courseTitle;
    private Student[] students;
    private Subject[] subjects;

    /**
     * Constructor
     * @param courseTitle
     */
    Course(String courseTitle) {
        this.courseTitle = courseTitle;
        students = new Student[30];
        subjects = new Subject[30];
    }

    /**
     * Method to print the students in the course
     * @return
     */
    public void printStudents() {
        System.out.println("The students in this course are:");
        //printArray(students);
        for(Student i : students) {
            if (i != null) {
                System.out.println(i.displayDetails());
            }
        }
    }

    /**
     * Method to print the subjects in the course
     * @return
     */
    public void printSubjects() {
        System.out.println("The subjects in this course are:");
        for(Subject i : subjects) {
            if (i != null) {
                System.out.println(i.getNameOfSubject());
            }
        }
    }

    /**
     * methods to add to the specific arrays in this class, using addToArray()
     * from ArrayTool class.
     * @param subject
     */
    public void addSubject(Subject subject) {
        addToArray(subject, subjects);
    }

    public void addStudent(Student student) {
        addToArray(student, students);
    }

    /**
     * Methods to remove a student and subject from the course by name.
     *                          NOT IN USE!
     * @return
     */
    public boolean removeStudent(String name, int matricNo) {
        for(Student i: students) {
            if (i.getName().toLowerCase().equals(name.toLowerCase()) &&
                    i.getMatriculationNumber() == matricNo) {
                i = null;
                return true;
            }
        }
        return false;
    }

    /**
     * Method to remove a student by using all the details of the student. This
     * is done by using the makeStudent() before it is used, then by comparison.
     * Returns true or false to indicate the success. The != at the start of the method
     * is nessessary because a null pointer exception will occur if a getter is called
     * from a null object.
     */
    public boolean removeStudent(Student student) {
        for(int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                if (students[i].getName().equals(student.getName()) &&
                        students[i].getMatriculationNumber() == student.getMatriculationNumber()) {
                    students[i] = null;
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Method to remove a student by using all the details of the student. This
     * is done by using the makeStudent() before it is used, then by comparison.
     * Returns true or false to indicate the success.
     */
    public boolean removeSubject(Subject subject) {
        for(int i = 0; i < subjects.length; i++) {
            if (subjects[i] != null) {
                if (subjects[i].getNameOfSubject().equals(subject.getNameOfSubject())) {
                    subjects[i] = null;
                    return true;
                }
            }
        }
        return false;
    }


    /* Setters and Getters */

    public String getCourseTitle() {
        return courseTitle;
    }

    public Student[] getStudents() {
        return students;
    }


    public void addStudent(Student[] students) {
        this.students = students;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

}
