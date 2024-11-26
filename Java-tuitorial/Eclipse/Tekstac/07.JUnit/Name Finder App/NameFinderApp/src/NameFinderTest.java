
import java.util.*;

import org.junit.BeforeClass;
import org.junit.Assert;
import org.junit.Test;

public class NameFinderTest {
	
	static List<String> namelist = new ArrayList<String>();
	static  NameFinder nameFinder  = null;
	
	@BeforeClass
	public static void setUp(){
		
		namelist.add("Arun");
		namelist.add("Ashwin");
		namelist.add("Anil");
		namelist.add("Akash");
		namelist.add("Azhar");
		
		nameFinder=new NameFinder();
	}
    @Test
	public void test11FindNameWhenExists() {
		try{
		    Assert.assertTrue("Present",nameFinder.findName(namelist,"Anil"));
		}catch(NameNotFoundException e){
		    Assert.assertTrue(true);
		}
	}
	@Test
	public void test12FindNameWhenNotExists() {
		try{
		    Assert.assertFalse("Not Present",nameFinder.findName(namelist,"Ajay"));
		}catch(NameNotFoundException e){
		    Assert.assertTrue(true);
		}
	}

}
