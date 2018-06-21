package junit;
import Totalscoremock.*;
import org.easymock.EasyMock;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class mockTest {
    
    public mockTest() {
    }
    
    public StuClass cart = null;
    public MyStore storeMock = null;
 
    @Before
    public void initialize()
    {
        cart = new StuClass();
        storeMock = EasyMock.createMock(MyStore.class);
        
        cart.setStore(storeMock);
    }
 
    @Test
    public void testShoppingCart()
    {
      //Initialize mock object with the expected values
      EasyMock.expect(storeMock.getCredits("English")).andReturn(5.00);
      EasyMock.expect(storeMock.getCredits("Math")).andReturn(12.00);
     //EasyMock.expect(storeMock.getPrice("Speakers")).andReturn(30.00);
 
      //Begin testing the ShoppingCart
       EasyMock.replay(storeMock);
       ClassName class1 = new ClassName("English", 1);
       ClassName class2 = new ClassName("Math",1);
       cart.addItem(class1);
       cart.addItem(class2);
       double total = cart.calculateTotalCredits();
       assertEquals("Result",17.00, total,0);
       EasyMock.verify(storeMock);
    }
 
    @After
    public void cleanup()
    {
        cart=null;
        storeMock=null;
    }
}
