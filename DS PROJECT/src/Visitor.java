import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Visitor {

	
	public void viewPhrases() {
		
		System.out.print("Creole Phrase \t\t\t\t");
		System.out.print("English Translation \n");
		System.out.print("Gimme all a di place dem inna \t\t");
		System.out.print("Give me all the places in \n");
		System.out.print("Which part have di cheapest \t\t");
		System.out.print("Where has the cheapest");
		System.out.print("Which part hav di deerest? \t\t");
		System.out.print("Which has the most expensive? \n");
		System.out.print("How much fi it? \t\t");
		System.out.print("What is the cost?\n");
		System.out.print("Just a hold a medz /t/t");
		System.out.print("Just chilling \n");
		}
	
	public String parishPlaces(Place place) {
		
		
		String parish = null;
		
		if(place.pcode == 1) {
			parish = "Kingston & St.Andrew";
		}
		if(place.pcode == 2) {
			parish = "St.Thomas";
		}
		if(place.pcode == 3) {
			parish = "Portland";
		}
		if(place.pcode == 4) {
			parish = "St.Mary";
		}
		if(place.pcode == 5) {
			parish = "St.Catherine";
		}
		if(place.pcode == 6) {
			parish = "Clarendon";
		}
		if(place.pcode == 7) {
			parish = "Manchester";
		}
		if(place.pcode == 8) {
			parish = "St.Ann";
		}
		if(place.pcode == 9) {
			parish = "St.Elizabeth";
		}
		if(place.pcode == 10) {
			parish = "St.James";
		}
		if(place.pcode == 11) {
			parish = "Hanover";
		}
		if(place.pcode == 12) {
			parish = "Westmoreland";
		}
		if(place.pcode == 13) {
			parish = "Trelawny";
		}
		return parish;
		
	}
	
	
	public Place attractions(Place place,String attraction) {
		//scan places from file
		
		if(attraction == "Jerk Chicken") {
			if(place.mainattr == attraction) {
				return place;
			}
		}
		
		if(attraction == "River Tours") {
			if(place.mainattr == attraction) {
				return place;
			}
		}
		
		if(attraction == "Water Slides") {
			if(place.mainattr == attraction) {
				return place;
			}
		}
		
		return place;
	}
	
	public void requestDetails(Request request) {
		
		DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		Date dateobj = new Date();
		
		String date = df.format(dateobj);
		request.setDate(date);
		
		 Random rand = new Random();
		 int id = rand.nextInt(100);
		 request.setReqid(id);
		
		//fname lname email attrgid attr name message req id date and time
		String fname = JOptionPane.showInputDialog("Enter your first name: ");
		request.setFname(fname);
		
		String lname = JOptionPane.showInputDialog("Enter your last name: ");
		request.setLname(lname);
		
		String email = JOptionPane.showInputDialog("Enter your email address: ");
		request.setEmail(email);
		
		String attrname = JOptionPane.showInputDialog("Enter the name of the attraction you are interested in: ");
		request.setAttrname(attrname);
		
		String msg = JOptionPane.showInputDialog("Enter a message: ");
		request.setMessage(msg);
		
	}
	
	public void StoreRequest(Request request) {
		
	}
	
	public void searchPlace() {
		
		int found = 0;
		String [] parishes = new String [13];
		parishes[0] = "Kingston & St.Andrew";
	    parishes[1] = "St.Thomas";
	    parishes[2] = "Portland";
	    parishes[3] ="St.Mary";
	    parishes[4] ="St.Catherine";
	    parishes[5] ="Clarendon";
	    parishes[6] ="Manchester";
	    parishes[7] ="St.Ann";
	    parishes[8] ="St.Elizabeth";
	    parishes[9] ="St.James";
	    parishes[10] ="Hanover";
	    parishes[11] ="Westmoreland";
	    parishes[12] ="Trelawny";
	    
		String searchfor = JOptionPane.showInputDialog("Enter a request: (example: Gimme all a di place dem inna Kingston");
		
		int i;
		for(i=0;i<13;i++) {
		if(searchfor.indexOf(parishes[i])!= -1) {
			int placenum = i + 1;
			Place place = new Place();
			System.out.println(parishes[i]);
			found = 1;
			
			try {
				Scanner fileObj = new Scanner(new File("Places.txt"));
				
				while(fileObj.hasNext()) {
					place.id = fileObj.nextInt();
					place.name = fileObj.next();
					place.description = fileObj.next();
					place.address = fileObj.next();
					place.pcode = fileObj.nextInt();
					place.photolink = fileObj.next();
					place.mainattr = fileObj.next();
					place.openhours = fileObj.next();
					place.cost = fileObj.nextInt();
					place.contactnum = fileObj.next();
					
					if (place.pcode == placenum) {
						System.out.println(place.name);
					}
	
				} 
				fileObj.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("File not found");
			}
			
		} 
		
		}
		
		if (found == 0) {
			System.out.println("Parish not found.");
		}
		
	}
	
	public void requestCheapest() {
		String [] attractions = new String [4];
		attractions[0] = "Jerk Chicken";
		attractions[1] = "Water Slides";
		attractions[2] = "River Tours";
		attractions[3] = "Beaches";
		
		String searchfor = JOptionPane.showInputDialog("Enter a request: (example: Which part have di cheapest Jerk Chicken?");
		
		int i;
		int found = 0;
		for(i=0;i<4;i++) {
		if(searchfor.indexOf(attractions[i])!= -1) {
			String attr = searchfor;
			Place place = new Place();
			found = 1;
			
			try {
				Scanner fileObj = new Scanner(new File("Places.txt"));
				
				while(fileObj.hasNext()) {
					place.id = fileObj.nextInt();
					place.name = fileObj.next();
					place.description = fileObj.next();
					place.address = fileObj.next();
					place.pcode = fileObj.nextInt();
					place.photolink = fileObj.next();
					place.mainattr = fileObj.next();
					place.openhours = fileObj.next();
					place.cost = fileObj.nextInt();
					place.contactnum = fileObj.next();
					
					if (place.mainattr.equals(attr) ) {
						System.out.println(place.name);
						System.out.println(place.address);
						System.out.println(place.contactnum);
						System.out.println(place.mainattr);
					} 
				} 
				fileObj.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("File not found");
			}
			
		} 
		
		}
		
		if (found == 0) {
			System.out.println("Attraction not found.");
		}
		}
	
	public static void main(String[] args) {
		Visitor visitor = new Visitor();
		visitor.viewPhrases();
	}
}
