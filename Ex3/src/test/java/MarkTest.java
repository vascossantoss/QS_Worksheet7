import org.example.Mark;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MarkTest {

    @Test
    public void testMarkCreation() {
        Mark mark = new Mark(123, 18.5);
        assertEquals(123, mark.getNumStudent());
        assertEquals(18.5, mark.getMark());
    }

    @Test
    public void testSettersAndGetters() {
        Mark mark = new Mark(123, 18.5);
        mark.setNumStudent(456);
        mark.setMark(15.0);

        assertEquals(456, mark.getNumStudent());
        assertEquals(15.0, mark.getMark());
    }
}
