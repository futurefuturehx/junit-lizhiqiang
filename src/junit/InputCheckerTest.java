package junit;
import test.InputChecker;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class InputCheckerTest {
    private double inputNumber;
    private boolean isbeishu;

    public InputCheckerTest(double inputNumber, boolean isbeishu) {
        super();
        this.inputNumber = inputNumber;
        this.isbeishu = isbeishu;
    }

    @Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] {
                { 2.5, true },
                { 0.4, false },
                { 3.6, false },
                {4.0,true},
                {6.8,false}
        };
        return Arrays.asList(data);
    }

    @Test
    public void test() {
        System.out.println("inputNumber: " + inputNumber + "; isbeishu: " + isbeishu);
        InputChecker NumberChecker = new InputChecker();
        // Step 5: use variables in test code
        boolean actualResult = NumberChecker.isbeishu(inputNumber);
        assertEquals(isbeishu, actualResult);
    }
}