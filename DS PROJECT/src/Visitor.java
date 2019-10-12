
public class Visitor {

	public void viewPhrases() {
		
		System.out.print("Creole Phrase \t\t\t\t");
		System.out.print("English Translation \n");
		System.out.print("Gimme all a di place dem inna \t\t");
		System.out.print("Give me all the places in \n");
		System.out.print("Which part have di cheapest \t\t");
		System.out.print("Where has the cheapest");
		//3 more
		}
	
	public String parishPlaces(Place place) {
		
		
		String parish = null;
		
		if(place.pcode == 1) {
			parish = "Kingston & St.Andrew";
		}
		if(place.pcode == 2) {
			parish = "St.Thomas";
		}
		
		//do up to trelawny. therefore there should be 13 if statements in total
		return parish;
		
	}
	
	
	public Place attractions(Place place,String attraction) {
		
		if(attraction == "Jerk Chicken") {
			if(place.mainattr == attraction) {
				return place;
			}
		}
		return place;
	}
	
	public static void main(String[] args) {
		Visitor visitor = new Visitor();
		visitor.viewPhrases();
	}
}
