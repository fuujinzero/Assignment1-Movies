package Models;

import static com.google.common.base.MoreObjects.toStringHelper;
import com.google.common.base.Objects;

public class Rating {
	//declares instance variables
	public String userID;
	public String movieID;
	public String movieRating;
	
	public Rating() 
	{
		
	}
	//constructor for  objects of class Rating
	public Rating(String userID, String movieID, String movieRating)
	{
		this.userID = userID;
		this.movieID = movieID;
		this.movieRating = movieRating;
	}
	//returns data of object
	@Override  
	public String toString() {
		return toStringHelper(this).addValue(userID)
								   .addValue(movieID)
								   .addValue(movieRating)
								   .toString();
		
	}
	//collection that contains pair of objects
	@Override  
	  public int hashCode()  
	  {  
	     return Objects.hashCode(this.userID, this.movieID, this.movieRating);  
	  }
	//compares two characteristics individually
	@Override
	  public boolean equals(final Object obj)
	  {
	    if (obj instanceof Rating)
	    {
	      final Rating other = (Rating) obj;
	      return Objects.equal(userID, other.userID) 
	          && Objects.equal(movieID,  other.movieID)
	          && Objects.equal(movieRating,     other.movieID);
	    }
	    else
	    {
	      return false;
	    }
	  }
}
