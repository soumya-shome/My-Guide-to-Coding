import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Assert;
import org.junit.Test;

public class CustomerTest {

    static Customer c=null;
    
	@BeforeClass
	public static void setUp() throws Exception {
	
	}
	
	@AfterClass
	public static  void tearDown() throws Exception {
		
	}
	@Test
	public void testCollectMembershipFeesForNormal(){

        //fill code
        c=new Customer(101,"Rahul","7271123","Normal");
        Assert.assertEquals(0,c.collectMembershipFees(),0.0f);
	}
	
    @Test
	public void testCollectMembershipFeesForGold() {
        //fill code
        c=new Customer(102,"Raj","823872","Gold");
        Assert.assertEquals(75000,c.collectMembershipFees(),0.0f);
	}
	
    @Test
	public void testCollectMembershipFeesForPlatinum() {

        //fill code
        c=new Customer(103,"Rohan","8726123","Platinum");
        Assert.assertEquals(125000,c.collectMembershipFees(),0.0f);
	}


}
