import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentArrayTest {
    @Test
    public void TestStudentArray () {
        // given
        String[] expected = {"Student 0", "Student 1", "Student 2", "Student 3"};
        // when
        int numberOfStudents = 4;
        String[] actual = StudentArray.createStudentArray(numberOfStudents);
        // then
        Assertions.assertArrayEquals(expected, actual);
    }

}
