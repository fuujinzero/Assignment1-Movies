package models;

import static org.junit.Assert.*;

import org.junit.Test;

import Models.Rating;


public class RatingTest {
	
	 Rating d134 = new Rating ("d134", "e423", "9.5");
	 
	 @Test
	  public void testCreate()
	  {
	    assertEquals ("d134",               d134.userID);
	    assertEquals ("e423",            d134.movieID);
	    assertEquals ("9.5", 					  d134.movieRating);    
	  }
	 

	 
	 @Test
	  public void testToString()
	  {
	    assertEquals ("Rating{d134, e423, 9.5}", d134.toString());
	  }

}
