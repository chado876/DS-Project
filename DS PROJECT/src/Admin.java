import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Admin {
	

	public void addPlace(Place place) {
		

		int autoid=0;
		Scanner in = new Scanner(System.in);
			
		
			//prompt for place attributes
		
	String name = JOptionPane.showInputDialog("Enter the name of the place: ");
	place.setName(name);
	
	String desc = JOptionPane.showInputDialog("Enter a short description of the place: ");
	place.setDescription(desc);
	
	String addr = JOptionPane.showInputDialog("Enter the address of the place: ");
	place.setAddress(addr);
	
	String Pcode = JOptionPane.showInputDialog("Enter the code of the place: ");
	int pcode = Integer.parseInt(Pcode);
	place.setPcode(pcode);
	
	String url = JOptionPane.showInputDialog("Enter the url of a photo of the place: ");
	place.setPhotolink(url);
	
	String ma = JOptionPane.showInputDialog("Enter the main attraction of the place: ");
	place.setMainattr(ma);
	
	String openh = JOptionPane.showInputDialog("Enter opening hours of the place: ");
	place.setOpenhours(openh);
	
	String Cost = JOptionPane.showInputDialog("Enter the cost of entry of the place: ");
	int cost = Integer.parseInt(Cost);
	place.setCost(cost);
	
	String cnum = JOptionPane.showInputDialog("Enter the contact number of the place: ");
	place.setContactnum(cnum);
	
	autoid++;
	place.setId(autoid);

	storePlace(place);
		
	}
	
	public void storePlace(Place place) {
		try{
			FileWriter fileObject = new FileWriter("Places.txt",true);
			
			fileObject.write(place.id + " ");
			fileObject.write(place.name + " ");
			fileObject.write(place.description + " ");
			fileObject.write(place.address + " ");
			fileObject.write(place.pcode + " ");
			fileObject.write(place.photolink + " ");
			fileObject.write(place.mainattr + " ");
			fileObject.write(place.openhours + " ");
			fileObject.write(place.cost + " ");
			fileObject.write(place.contactnum + " ");
			fileObject.write("\n" + " ");
			
			fileObject.close();
			
			} catch(IOException e){
				System.out.println("Could not open file");
			}
	}
	
	
	public void viewPlace(Place place) {
		
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
				
				place.Display();
				//System.out.println(place.id + "\t" + place.name + "\t" + place.description + "\t" + place.address + "\t" + place.pcode + "\t" + place.photolink + "\t" + place.mainattr + "\t" + place.openhours + "\t" + place.cost + "\t" + place.contactnum );
			}
			fileObj.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found");
		}
	}
	
}
