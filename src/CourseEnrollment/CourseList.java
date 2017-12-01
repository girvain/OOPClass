package CourseEnrollment;

public class CourseList extends ArrayTool{

    private Course[] courses;

    CourseList() {
        courses = new Course[2];
    }

    public void addCourse(Course course) {
        addToArray(course, courses);
    }

    /**
     * This method creates a string array, then iterates through the
     * courses and appends the course title to the array using the
     * array tool method printArray.
     */
    public void printCourses() {
       String[] coursesTemp = new String[courses.length];
       for(Course i : courses) {
           addToArray(i.getCourseTitle(), coursesTemp);
       }
        printArray(coursesTemp);
    }

    /**
     * Method to take a string input and return a course obejct if it is the same
     * as the input. returns null if there is no match.
     * @param input
     * @return
     */
    public Course courseSearch(String input) {
        for(Course i: courses) {
            if (i.getCourseTitle().toLowerCase().equals(input.toLowerCase())) {
                return i;
            }
        }
        return null;
    }

    public Course[] getCourses() {
        return courses;
    }
}
