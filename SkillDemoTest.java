import static org.junit.Assert.*;
import org.junit.*;


public class SkillDemoTest {
    @Test
    public void testAdd(){
        assertEquals(5, SkillDemo.add(2, 3)); //test pass, because the expected value is correct
    }
}
