package Models;

import static com.google.common.base.MoreObjects.toStringHelper;
import com.google.common.base.Objects;

public class User {
	 
	//declares instance variables
	public String firstName;
	public String lastName;
	public String age;
	public String gender;
	public String occupation;
	
	public User() 
	{
		
	}
	//constructor for  objects of class User
	public User(String firstName, String lastName, String age, String gender, String occupation)
	{
		this.firstName = firstName;
		this.lastName  = lastName;
		this.age = age;
		this.gender = gender;
		this.occupation = occupation;	
	}
	//returns data of object
	@Override
	public String toString() {
		return toStringHelper(this).addValue(firstName)
								.addValue(lastName)
								.addValue(age)
								.addValue(gender)
								.addValue(occupation)
								.toString();
	}
	//collection that contains pair of objects
	@Override  
	  public int hashCode()  
	  {  
	     return Objects.hashCode(this.firstName, this.lastName, this.age, this.gender, this.occupation);  
	  }
	//compares two characteristics individually
	@Override
	  public boolean equals(final Object obj)
	  {
	    if (obj instanceof User)
	    {
	      final User other = (User) obj;
	      return Objects.equal(firstName, other.firstName) 
	          && Objects.equal(lastName,  other.lastName)
	          && Objects.equal(age,     other.age)
	          && Objects.equal(gender,  other.gender)
	      	  && Objects.equal(occupation,  other.occupation);
	    }
	    else
	    {
	      return false;
	    }
	  }
}
