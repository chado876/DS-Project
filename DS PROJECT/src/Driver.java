import javax.swing.JOptionPane;

public class Driver {

	public static void main(String[] args) {
		
		
			System.out.println("\t\t\t Main Menu");
			System.out.println("\n ");
			System.out.println("\t 1. Log in as Admin");
			System.out.println("\t 2. Log in as Visitor");
			System.out.println("\t 3. Exit");
			
			String opt1 = JOptionPane.showInputDialog("Select an option:  ");
			int mainOpt = Integer.parseInt(opt1);
			
			if(mainOpt == 1) {
				int adminOpt = 0;
					do {
				System.out.println("\t\t\t Admin Menu");
				System.out.println("\n ");
				System.out.println("\t 1. Add a place");
				System.out.println("\t 2. View Places");
				System.out.println("\t 3. Exit");
				
				String opt2 = JOptionPane.showInputDialog("Select an option:  ");
			    adminOpt = Integer.parseInt(opt2);
				
				Admin adminObj = new Admin();
				Place place = new Place();
				
					if(adminOpt == 1) {
						int res = 0;	
						do {
						
							adminObj.addPlace(place);
							
							String Res = JOptionPane.showInputDialog("Would you like to add another place? 1 for yes  ");
							res = Integer.parseInt(Res);
						} while(res == 1);
							}
					
					if(adminOpt == 2) {
						adminObj.viewPlace(place);
					}
					
						}while(adminOpt != 3);
					}
				
						
			if(mainOpt == 2) {
				int visitorOpt = 0;
				do {
					System.out.println("\t\t\t Visitor Menu");
					System.out.println("\n ");
					System.out.println("\t 1. View Jamaican Creole Phrases");
					System.out.println("\t 2. View Places");
					System.out.println("\t 3. View Attractions");
					System.out.println("\t 4. Exit");
					String opt2 = JOptionPane.showInputDialog("Select an option:  ");
				    visitorOpt = Integer.parseInt(opt2);
					
					if (visitorOpt == 1) {
						Visitor visitor = new Visitor();
						visitor.viewPhrases();
					}
					
					if (visitorOpt == 2) {
						Visitor visitor = new Visitor();
						visitor.searchPlace();
					}
					
					if (visitorOpt == 3) {
						Visitor visitor = new Visitor();
						visitor.requestCheapest();
					}
				} while (visitorOpt != 4);
			}
			
			if(mainOpt == 3) {
				
			}
			
		

	}

}
