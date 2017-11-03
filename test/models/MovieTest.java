package models;

import static org.junit.Assert.*;

import org.junit.Test;

import Models.Movie;


public class MovieTest {
	
	
	 Movie lotr = new Movie ("lotr", "2001", "urlputhere");
	 
	 @Test
	  public void testCreate()
	  {
	    assertEquals ("lotr",               lotr.title);
	    assertEquals ("2001",            lotr.year);
	    assertEquals ("urlputhere", 					  lotr.url);   

	  }
	 

	 
	 @Test
	  public void testToString()
	  {
	    assertEquals ("Movie{lotr, 2001, urlputhere}", lotr.toString());
	  }

}
