import java.util.Arrays;

public class StudentArray {

    public static void main(String[] args) {
        int numberOfStudents = 4;
        System.out.println(Arrays.toString(createStudentArray(numberOfStudents)));
    }

    public static String[] createStudentArray(int numberOfStudents) {

        String[] students = new String[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++){
            students[i] = "Student " + i;
        }

        return students;
    }
}
