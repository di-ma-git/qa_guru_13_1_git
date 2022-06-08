package guru.qa;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class FirstTest {

    @Test
    void firstTest{
        Assertion.assertFalse(3 < 2)

    }

    @Test
    void firstTest{
        Assertion.assertFalse(3 < 1)

    }
}
