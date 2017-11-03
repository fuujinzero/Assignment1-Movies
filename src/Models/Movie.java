package Models;

import static com.google.common.base.MoreObjects.toStringHelper;
import com.google.common.base.Objects;

public class Movie {
	//declares instance variables
	public String title;
	public String year;
	public String url;
	
	
	public Movie() 
	{
		
	}
	
	//constructor for  objects of class Movie
	public Movie(String title, String year, String url)
	{
		this.title = title;
		this.year = year;
		this.url = url;
	}
	//returns data of object
	@Override  
	public String toString() {
		return toStringHelper(this).addValue(title)
								   .addValue(year)
								   .addValue(url)
							       .toString();
		
	}
	//collection that contains pair of objects
	@Override  
	  public int hashCode()  
	  {  
	     return Objects.hashCode(this.title, this.year, this.url);  
	  }
	//compares two characteristics individually
	@Override
	  public boolean equals(final Object obj)
	  {
	    if (obj instanceof Movie)
	    {
	      final Movie other = (Movie) obj;
	      return Objects.equal(title, other.title) 
	          && Objects.equal(year,  other.year)
	          && Objects.equal(url,     other.url);

	    }
	    else
	    {
	      return false;
	    }
	  }
	
}
