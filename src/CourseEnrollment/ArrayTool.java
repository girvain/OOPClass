package CourseEnrollment;

public class ArrayTool {

    /**
     * Another generic method for adding to an array. It takes an object and
     * an array of the same type (needs fixed for type mismatch) and searches
     * for an empty space, then adds the content to array. Returns false if
     * array is full, true is successful.
     * @return
     */
    public <T> boolean addToArray(T content, T[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = content;
                return true;
            }
        }
        return false; // This part is only reached if there was no match
    }

    /**
     * This is a method to remove content from an array. It works by taking
     * an input and an array, then searching for it in the array. If there
     * is a match is will set that value to null.
     * Returns true if affective.
     * @return
     */
    public <T> boolean removeFromArray(T content, T[] array) {
        for (int i = 0; i < array.length; i++) {
            // checks if the content object is the same any object in array
            if (content.equals(array[i])) {
                array[i] = null;
                return true;
            }
        }
        return false;
    }


    /**
     * Method to check if input is a string
     */
    public <T> boolean isString(T input) {
        if (input instanceof String) {
            return true;
        }
        else
            return false;
    }

    /**
     * method to print the content of an array, uses a generic so it
     * can print any array. Should be used inside another specific method.
     * The two T's are diferenct, one is a returntype.
     * @return
     */
    public <T> void printArray(T[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                System.out.println(array[i]);
            }
        }

    }
}
