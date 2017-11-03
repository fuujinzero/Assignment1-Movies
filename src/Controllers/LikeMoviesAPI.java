package Controllers;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import Models.Movie;
import Models.Rating;
import Models.User;
import utils.Serializer;

public class LikeMoviesAPI {
	
	
	private Serializer serializer;

	public LikeMoviesAPI() {
	 
	}
	
	 public LikeMoviesAPI(Serializer serializer)
	  {
	    this.serializer = serializer;
	  }

	  @SuppressWarnings("unchecked")
	  public void load() throws Exception
	  {
	    serializer.read();
	    ratings = (Map<String, Rating>) serializer.pop();
	    movieNew      = (Map<String, Movie>)   serializer.pop();
	    movieUsers      = (Map<String, User>)     serializer.pop();
	  }

	  void store() throws Exception
	  {
	    serializer.push(movieUsers);
	    serializer.push(movieNew);
	    serializer.push(ratings);
	    serializer.write(); 
	  }

	private Map<String, User> movieUsers = new HashMap<String, User>();	
	private Map<String, Movie> movieNew = new HashMap<String, Movie>();
	private Map<String, Rating> ratings = new HashMap<String, Rating>();
	
	public Collection<User> getUsers ()
	  {
	    return movieUsers.values();
	  }
	// method to  create a new user
	public User adduser(String firstName, String lastName, String age, String gender, String occupation) 
	{
		User user = new User(firstName, lastName, age, gender, occupation);
		movieUsers.put(firstName, user);
		return user;
	}
	//gets users my their last name
	 public User getUsersByLname(String lastName) 
	  {
		 return movieUsers.get(lastName);
	  }
//deletes a user
	public void removeUsers(String firstName)
	{
		movieUsers.remove(firstName);
	}
	//method to add a movie
	public Movie addMovie(String title, String year, String url)
	{
		Movie movie = new Movie(title, year, url);
				movieNew.put(title, movie);
		return movie;
	}
	//method to add rating to movie along with displaying users id and the id of the movie
	public Rating addRating(String userID, String movieID, String movieRating)
	{
		Rating rating = new Rating(userID, movieID, movieRating);
		ratings.put(userID, rating);
		return(rating);
	}
	//gets a movie based on its id
	public Rating getMovie(String movieID) {
		return ratings.get(movieID);
	}
	//gets rating based on the users id
	public Rating getUserRatings(String userID) {
		return ratings.get(userID);
	}
	//calls a movie by its title
	public Movie getMovieByTitle(String title) {
		return movieNew.get(title);
	}
	//gets a movie by the year its released
	public Movie getMovieByYear(String year) {
		return movieNew.get(year);
	}
	//reads files from CSV file
	public void initialLoad() {
		String delims = "[|]";
		Scanner scanner = new Scanner(new File("./moviedata_small/users5.dat"));
		while (scanner.hasNextLine()) {
		String[] data = scanner.nextLine().split(delims);
		User movieUsers = new User(data[0],data[1],data[2], delims, delims);
		movieUsers.adduser(User);
		}
		scanner.close();
		
	}
	
	@SuppressWarnings("unchecked")
	  void load(File file) throws Exception
	  {
	    ObjectInputStream is = null;
	    try
	    {
	      XStream xstream = new XStream(new DomDriver());
	      is = xstream.createObjectInputStream(new FileReader(file));
	      movieUsers      = (Map<String, User>)     is.readObject();
	      movieNew      = (Map<String, Movie>)   is.readObject();
	      ratings = (Map<String, Rating>) is.readObject();
	    }
	    finally
	    {
	      if (is != null)
	      {
	        is.close();
	      }
	    }
	  }

	  void store(File file) throws Exception
	  {
	    XStream xstream = new XStream(new DomDriver());
	    ObjectOutputStream out = xstream.createObjectOutputStream(new FileWriter(file));
	    out.writeObject(movieUsers);
	    out.writeObject(movieNew);
	    out.writeObject(ratings);
	    out.close(); 
	  }
	  
	  

}
