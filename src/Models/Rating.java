package Models;

public class Rating {
	
	public String userID;
	public String movieID;
	public String rating;
	
	public Rating(String userID, String movieID, String rating)
	{
		this.userID = userID;
		this.movieID = movieID;
		this.rating = rating;
	}

}
