package models;

import static org.junit.Assert.*;


import org.junit.Test;

import Models.User;


public class UserTest {

	 User bill = new User ("bill", "willson", "23",  "Male", "lazyass");
		
	 @Test
	  public void testCreate()
	  {
	    assertEquals ("bill",               bill.firstName);
	    assertEquals ("willson",            bill.lastName);
	    assertEquals ("23", 					  bill.age);   
	    assertEquals ("Male",		              bill.gender); 
	    assertEquals ("lazyass",              bill.occupation);   
	  }
	 

	 
	 @Test
	  public void testToString()
	  {
	    assertEquals ("User{bill, willson, 23, Male, lazyass}", bill.toString());
	  }
	 
	 @Test
	  public void testEquals()
	  {
	    User bill2 = new User ("bill", "willson", "23",  "Male", "lazyass"); 
	    User bart   = new User ("bart", "willson", "4",  "Male", "none"); 

	    assertEquals(bill, bill);
	    assertEquals(bill, bill2);
	    assertNotEquals(bill, bart);
	  }
}
