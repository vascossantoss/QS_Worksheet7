import org.example.CU;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class CUTest {

    private CU cu;

    @BeforeEach
    public void setUp() {
        cu = new CU("Software Quality", 3);
    }

    @Test
    public void testInsertMarkCU() {
        cu.insertMarkCU(1, 16.0);
        assertEquals(16.0, cu.searchStudent(1));
    }

    @Test
    public void testSearchStudentNotFound() {
        assertEquals(-1.0, cu.searchStudent(10), "Should return -1.0 for student not found");
    }

    @ParameterizedTest
    @CsvSource({
            "1, 10.0",
            "2, 14.5",
            "3, 19.0"
    })
    public void testInsertMultipleMarks(int studentNum, double mark) {
        cu.insertMarkCU(studentNum, mark);
        assertEquals(mark, cu.searchStudent(studentNum));
    }

    @Test
    public void testAverageCU() {
        cu.insertMarkCU(1, 10.0);
        cu.insertMarkCU(2, 15.0);
        cu.insertMarkCU(3, 20.0);

        assertEquals(15.0, cu.averageCU(), 0.01, "Average should be calculated correctly");
    }

    @ParameterizedTest
    @CsvSource({
            "1, 10.0, true",
            "2, 9.0, false",
            "3, 9.6, true"
    })
    public void testIsApproved(int studentNum, double mark, boolean expected) {
        cu.insertMarkCU(studentNum, mark);
        assertEquals(expected, cu.isApproved(studentNum));
    }

    @Test
    public void testIsApprovedStudentNotFound() {
        assertFalse(cu.isApproved(10), "Should return false for non-existent student");
    }
}
