package Models;

public class User {
	
	public String firstName;
	public String lastName;
	public String age;
	public String gender;
	public String occupation;
	
	public User() 
	{
		
	}

	public User(String firstName, String lastName, String age, String gender, String occupation)
	{
		this.firstName = firstName;
		this.lastName  = lastName;
		this.age = age;
		this.gender = gender;
		this.occupation = occupation;		
	}
	public String toString() {
		return age;
		
	}
	
}
