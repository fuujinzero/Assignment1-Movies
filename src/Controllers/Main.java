package Controllers;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import Models.Movie;
import Models.Rating;
import Models.User;
import utils.FileLogger;
import utils.Serializer;
import utils.XMLSerializer;


public class Main {
	
	public static void main(String[] args)throws Exception
	{
		 FileLogger logger = FileLogger.getLogger();
		    logger.log("Creating user list");
		    
		    File  datastore = new File("datastore2.xml");
		    Serializer serializer = new XMLSerializer(datastore);

		    LikeMoviesAPI likemoviesAPI = new LikeMoviesAPI(serializer);
		    if (datastore.isFile())
		    {
		    	likemoviesAPI.load();
		    }
		//ordered collections for each object    
		List<User> movieUsers = new ArrayList<User>();
		List<Movie> movieNew = new ArrayList<Movie>();
		List<Rating> ratings = new ArrayList<Rating>();
		
		logger.log("Serializing contacts to XML");
		//outputs a colelction of user  objects in a .xml file
		XStream xstream = new XStream(new DomDriver());
	    ObjectOutputStream out = xstream.createObjectOutputStream(new FileWriter("datastore.xml"));
	    out.writeObject(movieUsers);
	    out.close();
		 logger.log("Finished - shutting down");
		 
		 int choice = 0;
		//main menu
		 System.out.println("Welcome to movies4u");
		 System.out.println();
		 System.out.println("**** Menu ****");
		 do {
		 System.out.println("1.Create a new user");
		 choice = EasyScanner.nextInt();
		 switch(choice)
		 {
		 case '1': 
		 }
		 choice= EasyScanner.nextInt();
	}
		 while(choice !=8);
		 }

}
