package CourseEnrollment;

import java.io.*;
import java.util.Scanner;

public class FileIO {

    private Scanner scanner;
    private File file; // this is the file that will be used by the program

    FileIO() {
        this.file = new File("courseEnrollmentData.txt");
    }


    public void writeCourses(Course[] courses) {
        try {
            PrintWriter out = new PrintWriter(new FileWriter(file));
            for (Course course : courses) {
                if (courses != null) {
                    out.write("course-name: ");
                    out.write(course.getCourseTitle() + "\n");
                    writeStudents(course.getStudents(), out);
                    writeSubjects(course.getSubjects(), out);
                }
            }
            out.flush(); // Flush the buffer!!!
        }catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error saving course to file");
        }
    }
    public void writeStudents(Student[] array, PrintWriter out) {
        try {
            for (Student student : array){
                if (student != null) { // the null check is necessary because it is a regular array, not arrayList
                    out.write("\tStudent \n");
                    out.write("\t\tmatriculation-No: ");
                    out.write(Integer.toString(student.getMatriculationNumber())+ "\n"); // change int to string
                    out.write("\t\tname: ");
                    out.write(student.getName()+ "\n");
                    out.write("\t\tage: ");
                    out.write(Integer.toString(student.getAge())+ "\n"); // Change the int to string
                    out.write("\t\tsex: ");
                    out.write(student.getSex()+ "\n");
                }
            }
            out.flush();
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error saving to file");
        }

    }

    public void writeSubjects(Subject[] array, PrintWriter out) {
        try {
            for (Subject subject : array) {
                if (subject != null) {
                    out.write("\tSubject \n");
                    out.write("\t\tsubject-name: ");
                    out.write(subject.getNameOfSubject()+ "\n");
                }
            }
            out.flush();
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error saving to file");
        }

    }

    /**
     * takes the CourseList class as input. Uses a Scanner
     * with the default space as the delimiter to iterate through the text file,
     * then initializes the objects accordingly to the CourseList class.
     * @param courseList
     */
    public void readData(CourseList courseList) {
        try {
            Scanner scanner = new Scanner(new FileReader(file));
            Course course = null; // global course object for the other if else statements to access to add objects to
            while(scanner.hasNext()) {
                 // This is the course that the scanner is currently on. It's global for else if statements to access
               String currentWord = scanner.next();
                if (currentWord.equals("course-name:")) {
                    // added the substring to get rid of the space at the start of the course-name
                    String courseName = scanner.nextLine().substring(1);
                    course = new Course(courseName);
                   courseList.addCourse(course);// adds the course to courses, but still have reference to it
                                                // until a new course object is created.
                }
                else if (currentWord.equals("Student")) {
                    Student student = new Student();
                    if (scanner.next().equals("matriculation-No:")) {
                        String studentNo = scanner.nextLine().substring(1);
                        student.setMatriculationNumber(Integer.parseInt(studentNo));// change the String to int
                    }
                    if (scanner.next().equals("name:")) {
                        String name = scanner.nextLine().substring(1);
                        student.setName(name);
                    }
                    if (scanner.next().equals("age:")) {
                        String age = scanner.nextLine().substring(1);
                        student.setAge(Integer.parseInt(age));
                    }
                    if (scanner.next().equals("sex:")) {
                        String sex = scanner.nextLine().substring(1);
                        student.setSex(sex);
                    }
                    course.addStudent(student); // add the subject to the course object
                }
                else if (currentWord.equals("Subject")) {
                    Subject subject = new Subject();
                    if (scanner.next().equals("subject-name:")) {
                        String subjectName = scanner.nextLine().substring(1);
                        subject.setNameOfSubject(subjectName);
                    }
                    course.addSubject(subject);
                }
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
