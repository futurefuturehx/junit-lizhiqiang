package junit;
import coursetest.*;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class stubTest {
    
    public stubTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testCalculateTotalCredit() {
       // System.out.println("calculateTotalPrice");
        stubMyCredit stub=new stubMyCredit();
        xuanke msc = new xuanke(stub);

        course g1=new course(1,"软件工程",4.00);
        course g2=new course(2,"操作系统",5.00);
        course g3=new course(3,"数据库",3.00);
        msc.addCourse(g1);
        msc.addCourse(g2);
        msc.addCourse(g3);
        Double expResult = 12.00;
        Double result = msc.calculateTotalCredit();
        assertEquals(expResult, result,0);
    }
}
