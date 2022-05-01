import static org.junit.Assert.*;
import org.junit.*;


public class SkillDemoTest {
    @Test
    public void testAdd(){
        assertEquals(4, SkillDemo.add(2, 3)); //initially fails, 2+3 = 5, not 4
    }
}
