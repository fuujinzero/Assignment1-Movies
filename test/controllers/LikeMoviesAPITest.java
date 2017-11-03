package controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Controllers.LikeMoviesAPI;
import Models.User;

import static models.Fixtures.User;
import static models.Fixtures.Movie;
import static models.Fixtures.Rating;




public class LikeMoviesAPITest {
	
	private LikeMoviesAPI moviemaker;
	
	 @Before
	  public void setup()
	  {
		 moviemaker = new LikeMoviesAPI();
	    for (User user : users)
	    {
	    	moviemaker.adduser(user.firstName, user.lastName, user.age, user.gender, user.occupation);
	    }
	  }

	  @After
	  public void tearDown()
	  {
		  moviemaker = null;
	  }

	  @Test
	  public void testUser()
	  {
	    assertEquals (users.length, moviemaker.getUsers().size());
	    moviemaker.adduser("homer", "simpson", "homer@simpson.com", "secret");
	    assertEquals (users.length+1, moviemaker.getUsers().size());
	    assertEquals (users[0], moviemaker.getUsersByLname(users[0].lastName));
	  }  

	  @Test
	  public void testUsers()
	  {
	    assertEquals (users.length, moviemaker.getUsers().size());
	    for (User user: users)
	    {
	      User eachUser = moviemaker.getUsersByLname(user.lastName);
	      assertEquals (user, eachUser);
	      assertNotSame(user, eachUser);
	    }
	  }

	  @Test
	  public void testRemoveUsers()
	  {
	    assertEquals (users.length, moviemaker.getUsers().size());
	    User kate = moviemaker.getUsersByLname("willson");
	    moviemaker.removeUsers(kate.firstName);
	    assertEquals (users.length-1, moviemaker.getUsers().size());    
	  }  
}
