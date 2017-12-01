package CourseEnrollment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ClientCourse {

    private CourseList courseList;
    private Scanner scanner;
    private Validate validate;
    private FileIO fileIO;

    ClientCourse() {
        courseList = new CourseList();
        scanner = new Scanner(System.in);
        validate = new Validate();
        fileIO = new FileIO();
        //courseList.addCourse(new Course("HND Software Development")); // no longer needed
        //courseList.addCourse(new Course("HND Networking"));
        fileIO.readData(courseList); // Call the readData method to initialize the objects of stored data
    }

    /**
     * This method is to be used between the user and the system. It prints a list of
     * options and takes input which determines what methods will be called.
     * @param
     */
    public void interacter(String displayMessage) {
        System.out.println(displayMessage + "\n");

        printMenuList();
        int input = validate.validateInteger();
        //scanner.nextLine(); // clear the rest of the line for next scanner input.

        switch(input) {
            case 1 :
                courseList.printCourses();
                break;
            case 2 :
                courseSelector().addStudent(addStudentInputLoop());
                break;
            case 3 :
                courseSelector().printStudents();
                break;
            case 4 :
                courseSelector().addSubject(addSubjectInputLoop());
                break;
            case 5 :
                courseSelector().printSubjects();
                break;
            case 6 : // The if statements are to get the output from the remove methods
                if (courseSelector().removeStudent(addStudentInputLoop())) {
                    System.out.println("Student removed successfully");
                }else
                    System.out.println("\n Unable to remove student");
                break;
            case 7 :
                if (courseSelector().removeSubject(addSubjectInputLoop())) {
                    System.out.println("Subject removed successfully");
                }else
                    System.out.println("\n Unable to remove subject");
                break;
        }

        //fake recursion
        if (input > 8 || input < 1) {
            interacter("Invalid option, enter another choice");
        }
        else if (input == 8) {
            saveData();
            System.out.println("Goodbye");
            scanner.close();
        }
        else
            interacter("\n" + "Process complete, enter another option or press 8 to exit");
    }

    public void printMenuList() {
        System.out.println("1- List available courses");
        System.out.println(("2- Add Students to a course"));
        System.out.println("3- List the students available in a course");
        System.out.println("4- Add subjects to a course");
        System.out.println("5- List subjects in a course");
        System.out.println("6- Remove a student from a course");
        System.out.println("7- Remove a subject from a course");
        System.out.println("8- exit");
    }

    /**
     * This method takes user input and seraches for a match in the course array.
     * It then returns the course object if it's a match, otherwise it keeps looping.
     * MAYBE i SHOULD FIX THE LOOP!
     * @return
     */
    public Course courseSelector() {
        //Scanner scanner = new Scanner(System.in);
        Course matchingCourse;
        while (true) {
            System.out.println("Please enter a course?");
            // search the courses array for a match
            matchingCourse = courseList.courseSearch(scanner.nextLine());
            // if the user input is a match from the courses array then
            // matching course will contain a course object.
            if (matchingCourse != null) {
                break;
            }else
                System.out.println("That's not a registered course. Try again.");
        }
        return matchingCourse;
    }

    /**
     * A method to create a loop and pass input to the makeStudent() method in the
     * Course class. Returns a student object with the data input by the user on the
     * CMD-line.
     * SHOULD THIS BE IT'S OWN CLASS?
     */
    public Student addStudentInputLoop() {

        String name = "";
        String sex = ""; // variables to pass input
        int age = 0;
        int matricNo = 0;

        // / the loop will run and collect all the data in sequential order
        while (true) {
            boolean noErrors = true; // boolean to identify if there has been an input error

            try {
                System.out.println("Enter name:");
                name = scanner.nextLine();
                System.out.println("Enter age:");
                age = validate.validateInteger();
                //scanner.nextLine(); // to avoid the skipping of the next scanner input
                System.out.println("Enter sex:");
                sex = scanner.nextLine();
                System.out.println("Enter matriculation number:");
                matricNo = validate.validateInteger();
                //scanner.nextLine();
            }catch (InputMismatchException e) {
                System.out.println("Please enter the the right format");
                noErrors = false; // change noError state to false coz error occurred
            }

            if (noErrors) {
                break; // loop will only break if error is true
            }
        }
        // finally, make the student and then return it.
        Student student = makeStudent(name, sex, age, matricNo);
        return student;
    }

    /**
     * This is the same as the above method but it is specific to the subject object.
     * @return Subject
     */
    public Subject addSubjectInputLoop() {
        String nameOfSubject = "";
        // / the loop will run and collect all the data in sequential order
        while (true) {
            boolean noErrors = true; // boolean to identify if there has been an input error

            try {
                System.out.println("Enter name of the subject:");
                nameOfSubject = scanner.nextLine();
            }catch (InputMismatchException e) {
                System.out.println("Please enter the the right format");
            }

            if (noErrors) {
                break; // loop will only break if error is true
            }
        }
        Subject subject = new Subject();
        subject.setNameOfSubject(nameOfSubject);
        return subject;
    }

    /**
     * Method to make creating a student quicker and more readable.
     * returns student object.
     */
    public Student makeStudent(String name, String sex, int age, int matricNo) {
        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        student.setSex(sex);
        student.setMatriculationNumber(matricNo);
        return student;
    }

    /**
     * Method to save the current state of the program to a text file. Uses the FileIO
     * class methods and a state variable to know if the state of the program has been
     * changes (edited).
     */
    public void saveData() {
        fileIO.writeCourses(courseList.getCourses()); // uses the getter() to get a ref to courses array
    }

    /* This has been taken out because there is no need for the student to have
    a subject, therefor i can just user a makeStudent() to take parameters as used above.
     */
    
    /*
    public Person makePerson(String name, String sex, int age) {
        Person person = new Student();
        person.setAge(age);
        person.setName(name);
        person.setSex(sex);
        return person;
    }
    /**
     * Quick method to turn a person into a student
     */
    /*
    public Student makeStudent(Person person, int matric, Subject subject){

    }
    */

}
