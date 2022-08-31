package project;

import java.io.File;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;

       

public class FinalProjectApp {
	
	public static void main(String[] args) {	
		
		try {
			
			File file = new File("src/project/CTAStops.csv");
			Scanner scFile = new Scanner(file);
			
			// Declare an initial array in order to read the file
			CTAStationProject[] stationsArray = new CTAStationProject[141];
			
			// List for each line
			// The stations will be organized according to their CTA line
			ArrayList<CTAStationProject> redList = new ArrayList<CTAStationProject>();
			ArrayList<CTAStationProject> greenList = new ArrayList<CTAStationProject>();
			ArrayList<CTAStationProject> blueList = new ArrayList<CTAStationProject>();
			ArrayList<CTAStationProject> brownList = new ArrayList<CTAStationProject>();
			ArrayList<CTAStationProject> purpleList = new ArrayList<CTAStationProject>();
			ArrayList<CTAStationProject> pinkList = new ArrayList<CTAStationProject>();
			ArrayList<CTAStationProject> orangeList = new ArrayList<CTAStationProject>();
			ArrayList<CTAStationProject> yellowList = new ArrayList<CTAStationProject>();
			
			// All the stations are stored here
			ArrayList<CTAStationProject> stationsList = new ArrayList<CTAStationProject>();
			
			int i = 0;
			
			// Reading the first two lines of the file
			// their types do not match with my constructor
			String line = scFile.nextLine();
			line = scFile.nextLine();
			
			// Loop to store the data from the file in the array
			while (scFile.hasNextLine()) {
				
				line = scFile.nextLine();
				
				// Parsing all the data
				String stationName  = line.split(",")[0];
				double stationLat = Double.parseDouble(line.split(",")[1]);
				double stationLng = Double.parseDouble(line.split(",")[2]);
				String stationLocation  = line.split(",")[3];
				boolean stationWheelchair = Boolean.parseBoolean(line.split(",")[4]);
	        	int stationRed = Integer.parseInt(line.split(",")[5]);
				int stationGreen = Integer.parseInt(line.split(",")[6]);
				int stationBlue = Integer.parseInt(line.split(",")[7]);
				int stationBrown = Integer.parseInt(line.split(",")[8]);
				int stationPurple = Integer.parseInt(line.split(",")[9]);
				int stationPink = Integer.parseInt(line.split(",")[10]);
				int stationOrange = Integer.parseInt(line.split(",")[11]);
				int stationYellow = Integer.parseInt(line.split(",")[12]);
				
				// Storing the data in the array using my constructor
				stationsArray[i] = new CTAStationProject(stationName, stationLat, stationLng,stationLocation, stationWheelchair, stationRed, stationGreen, stationBlue, stationBrown, stationPurple, stationPink, stationOrange, stationYellow);
				
				// List to store all the stations
				stationsList.add(stationsArray[i]);
				
				
				// Separating the array by the color of each station
				// Then, adding them to its respective list
				if (stationRed > -1) {
					redList.add(stationsArray[i]);
			} 
				if (stationGreen > -1) {
					greenList.add(stationsArray[i]);
			} 
				if (stationBlue > -1) {
					blueList.add(stationsArray[i]);
			} 
				if (stationBrown > -1) {
					brownList.add(stationsArray[i]);
			} 
				if (stationPurple > -1) {
					purpleList.add(stationsArray[i]);
			} 
				if (stationPink > -1) {
					pinkList.add(stationsArray[i]);
			} 
				if (stationOrange > -1) {
					orangeList.add(stationsArray[i]);
			}
				if (stationYellow > -1) {
					yellowList.add(stationsArray[i]);
				}
				
				i++;	
			}
			
			// I will use this objects to look up for a specific station
			CTARouteProject redObject = new CTARouteProject("Red Line", redList);
			CTARouteProject greenObject = new CTARouteProject("Red Line", greenList);
			CTARouteProject blueObject = new CTARouteProject("Red Line", blueList);
			CTARouteProject brownObject = new CTARouteProject("Red Line", brownList);
			CTARouteProject purpleObject = new CTARouteProject("Red Line", purpleList);
			CTARouteProject pinkObject = new CTARouteProject("Red Line", pinkList);
			CTARouteProject orangeObject = new CTARouteProject("Red Line", orangeList);
			CTARouteProject yellowObject = new CTARouteProject("Red Line", yellowList);
			CTARouteProject stationsObject = new CTARouteProject("stations", stationsList);
			
			
			
			scFile.close();
		
			Scanner sc = new Scanner(System.in).useDelimiter("\\n");;
			
			// Declare the value -1 to execute the loop
			int optionSelected = -1; 
			
			while (optionSelected != 8) {
				
				// Menu
				System.out.println("Select one of the following opitons: ");
			    System.out.println("1. Look up for stations by line");
				System.out.println("2. Add a new station");
				System.out.println("3. Modify an existing station");
				System.out.println("4. Remove an existing station");
				System.out.println("5. Search for a station");
				System.out.println("6. Find the nearest station");
				System.out.println("7. Route planner");
		     	System.out.println("8. Exit");
				
				optionSelected = sc.nextInt();
				
			
				// Option 1: 
				// Prints the stations of the line selected by the user		
				if (optionSelected == 1) {
					
					// Prompt the user for a CTA line
					System.out.println("Type one of the following CTA lines: ");
					System.out.println("Blue, Brown, Green, Red, Purple, Pink, Orange, Yellow");
					String userLine = sc.next();
					
					// Compare the string entered by the user the name of the line
					// Then, print the CTA line entered by the user
					if (userLine.equalsIgnoreCase("Red")) {
						for (i=0; i<redList.size(); i++ ) {
							System.out.println(redList.get(i));
							} 
						System.out.println("");
						
					} else if (userLine.equalsIgnoreCase("Green")) {
						for (i=0; i<greenList.size(); i++ ) {
							System.out.println(greenList.get(i));
							} 
						System.out.println("");
						
					} else if (userLine.equalsIgnoreCase("Blue")) {
						for (i=0; i<blueList.size(); i++ ) {
							System.out.println(blueList.get(i));
							} 
						System.out.println("");
						
					} else if (userLine.equalsIgnoreCase("brown")) {
						for (i=0; i<brownList.size(); i++ ) {
							System.out.println(brownList.get(i));
							} 
						System.out.println("");
						
					} else if (userLine.equalsIgnoreCase("Purple")) {
						for (i=0; i<purpleList.size(); i++ ) {
							System.out.println(purpleList.get(i));
							} 
						System.out.println("");
						
					} else if (userLine.equalsIgnoreCase("Pink")) {
						for (i=0; i<pinkList.size(); i++ ) {
							System.out.println(pinkList.get(i));
							} 
						System.out.println("");
						
					} else if (userLine.equalsIgnoreCase("Orange")) {
						for (i=0; i<orangeList.size(); i++ ) {
							System.out.println(orangeList.get(i));
							} 
						System.out.println("");
						
					} else if (userLine.equalsIgnoreCase("Yellow")) {
						for (i=0; i<yellowList.size(); i++ ) {
							System.out.println(yellowList.get(i));
							} 
						System.out.println("");
						
					} else {
						System.out.println("Line does not exist");
						System.out.println("");
					}
					
					
					// Option 2:
					// Add a new station
				} else if (optionSelected == 2) {
					
					// Prompt the user for the station's information
					System.out.print("Name of the station: ");
					String newName = sc.next();
					System.out.print("Enter the lattitude: ");
					double newLat = sc.nextDouble();
					System.out.print("Enter the longitud: ");
					double newLng = sc.nextDouble();
					System.out.print("Station location: ");
					String newLocation = sc.next();
					System.out.print("Does it have wheelchair access? (Yes/No) ");
					String newWheelchair = sc.next();
					System.out.print("Line color: ");
					String newLine = sc.next();
					System.out.println("");
					// Declare  initial values to the varibales wheelchair and the CTA line colors
					// These values will change according to what the user enters
					boolean booleanWheelchair = false;
					int newRed = -1;
					int newGreen = -1;
					int newBlue = -1;
					int newBrown = -1;
					int newPurple = -1;
					int newPink = -1;
					int newOrange = -1;
					int newYellow = -1;
					// Converting the string entered by the user (yes or no)
					// to boolean values in order to match with my constructor
					if (newWheelchair.equalsIgnoreCase("yes")) {
						booleanWheelchair = true;
					} else if  (newWheelchair.equalsIgnoreCase("no")) {
						booleanWheelchair = false;
					} else { 
						// If the user doesn't enter yes or no correctly,
						// by default wheelchair will be equal to false
					   System.out.println("Error adding wheelchair access correctly");
					}
					
				
					// Here, I change the value of the integers decleared above 
					// according to the CTA line entered by the user
					// For example, if the user entered red
					// The value of newRed is the size of the red list + 1
					// NOTE: My program only adds stations to the last place of the list
					if (newLine.equalsIgnoreCase("red")) {
						 newRed = redList.size() + 1;
						
					} else if (newLine.equalsIgnoreCase("green")) {
						 newGreen = greenList.size() + 1;
						
					} else if (newLine.equalsIgnoreCase("blue")) {
						 newBlue = blueList.size() + 1;
						
				    } else if (newLine.equalsIgnoreCase("brown")) {
				    	 newBrown = brownList.size() + 1;
				    	
				    } else if (newLine.equalsIgnoreCase("purple")) {
				    	 newPurple = purpleList.size() + 1;
				    	
				    } else if (newLine.equalsIgnoreCase("pink")) {
				    	 newPink = pinkList.size() + 1;

				    } else if (newLine.equalsIgnoreCase("orange")) {
				    	 newOrange = orangeList.size() + 1;
				    	
				    } else if (newLine.equalsIgnoreCase("yellow")) {
				         newYellow  = yellowList.size()+1;
				         
				    } else {
				    	System.out.println("Error adding station, Line not founded");
				    	
				    }
					 // Calling my constructor 
					stationsArray[i] = new CTAStationProject(newName, newLat, newLng, newLocation, booleanWheelchair, newRed, newGreen, newBlue, newBrown, newPurple, newPink, newOrange, newYellow);

					// If the value of the CTA line is greater than -1
					// Then, add it to its respective CTA line
					// Also I added the new station to a common list for the calcDistance method
					// Finally it prints a message 
					if (newRed > -1) {
						redList.add(stationsArray[i]);
						System.out.println("Station added");
						
				} 
					if (newGreen > -1) {
						greenList.add(stationsArray[i]);
						stationsList.add(stationsArray[i]);
						System.out.println("Station added");	
				} 
					if (newBlue > -1) {
						blueList.add(stationsArray[i]);
						System.out.println("Station added");
						stationsList.add(stationsArray[i]);
						
				} 
					if (newBrown > -1) {
						brownList.add(stationsArray[i]);
						System.out.println("Station added");
						stationsList.add(stationsArray[i]);	
				} 
					if (newPurple > -1) {
						purpleList.add(stationsArray[i]);
						System.out.println("Station added");
						stationsList.add(stationsArray[i]);
						
				} 
					if (newPink > -1) {
						pinkList.add(stationsArray[i]);
						System.out.println("Station added");
						stationsList.add(stationsArray[i]);
				} 
					if (newOrange > -1) {
						orangeList.add(stationsArray[i]);
						System.out.println("Station added");
						stationsList.add(stationsArray[i]);
						
				}
					if (newYellow > -1) {
						yellowList.add(stationsArray[i]);
						System.out.println("Station added");
						stationsList.add(stationsArray[i]);
					}
					
					
					
					System.out.println("");
					
					
				// Option 3:
				// Modify station
				} else if (optionSelected == 3) {
					
					// Prompt the user for the nee informatoin
			        System.out.print("Station line: ");
			        String modLine = sc.next();
					System.out.print("Stations index: ");
					int index = sc.nextInt();
					System.out.print("Station new name: ");
					String modName = sc.next();
					System.out.print("Lattitude: ");
					double modLat = sc.nextDouble();
					System.out.print("Longitude: ");
					double modLng = sc.nextDouble();
					System.out.print("Wheelchair access: (Yes/No) ");
					String modWh = sc.next();
					System.out.print("Location: ");
					String modLoc = sc.next();
					System.out.print("");
					
					// By default wheelchair access is false
					boolean booleanWh = false;
					
					// However if when asked the user type yes, it will be true
					if (modWh.equalsIgnoreCase("Yes")) 
						 booleanWh = true;
					
					// I use the CTAStationProject type array to store the new date
					// Then I use the set comand to modify the CTA line list and also the list of all stations

						if (modLine.equalsIgnoreCase("red")) {
					        stationsArray[i] = new CTAStationProject(modName, modLat, modLng, modLoc, booleanWh, index, -1, -1, -1, -1, -1, -1, -1);
					        redList.set(index, stationsArray[i]);
					        stationsList.set(index, stationsArray[i]);
					
						} else if(modLine.equalsIgnoreCase("green")) {
							stationsArray[i] = new CTAStationProject(modName, modLat, modLng, modLoc, booleanWh, -1, index, -1, -1, -1, -1, -1, -1);
							greenList.set(index, stationsArray[i]);
							stationsList.set(index, stationsArray[i]);
							
						} else if(modLine.equalsIgnoreCase("blue")) {
							stationsArray[i] = new CTAStationProject(modName, modLat, modLng, modLoc, booleanWh, -1, -1, index, -1, -1, -1, -1, -1);
							blueList.set(index, stationsArray[i]);
							stationsList.set(index, stationsArray[i]);
							
						} else if(modLine.equalsIgnoreCase("brown")) {
							stationsArray[i] = new CTAStationProject(modName, modLat, modLng, modLoc, booleanWh, -1, -1, -1, index, -1, -1, -1, -1);
							brownList.set(index, stationsArray[i]);
							stationsList.set(index, stationsArray[i]);
							
						} else if(modLine.equalsIgnoreCase("purple")) {
							stationsArray[i] = new CTAStationProject(modName, modLat, modLng, modLoc, booleanWh, -1, -1, -1, -1, index, -1, -1, -1);
							purpleList.set(index, stationsArray[i]);
							stationsList.set(index, stationsArray[i]);
							
						} else if(modLine.equalsIgnoreCase("pink")) {
							stationsArray[i] = new CTAStationProject(modName, modLat, modLng, modLoc, booleanWh, -1, -1, -1, -1, -1, index, -1, -1);
							pinkList.set(index, stationsArray[i]);
							stationsList.set(index, stationsArray[i]);
							
						} else if(modLine.equalsIgnoreCase("orange")) {
							stationsArray[i] = new CTAStationProject(modName, modLat, modLng, modLoc, booleanWh, -1, -1, -1, -1, -1, -1, index, -1);
							orangeList.set(index, stationsArray[i]);
							stationsList.set(index, stationsArray[i]);
							
						} else if(modLine.equalsIgnoreCase("yellow")) {
							stationsArray[i] = new CTAStationProject(modName, modLat, modLng, modLoc, booleanWh, -1, -1, -1, -1, -1, -1, -1, index);
							yellowList.set(index, stationsArray[i]);
							stationsList.set(index, stationsArray[i]);
							
						}
	
					
						System.out.println("");
					
					
					
					
				// Option 4:
				// Remove station
				} else if (optionSelected == 4) {
					
					// Prompt the user for the name of the station to remove
					System.out.print("Name of the station: ");
					System.out.println("");
					String stationRemove = sc.next();
					
					// Comfirm to remove station
					System.out.println("Are you sure you want to delete " + stationRemove + "?");
					System.out.print("Enter 'Yes' or 'No' ");
					String confirmation = sc.next();
					
					if (confirmation.equalsIgnoreCase("yes")) {
					
						
				   if (greenObject.lookupStation(stationRemove) == null && yellowObject.lookupStation(stationRemove) == null && orangeObject.lookupStation(stationRemove) == null && pinkObject.lookupStation(stationRemove) == null && purpleObject.lookupStation(stationRemove) == null && brownObject.lookupStation(stationRemove) == null && blueObject.lookupStation(stationRemove) == null && redObject.lookupStation(stationRemove) == null){
						     System.out.println("Station not founded");
						} 
				    // If the station exists on the CTA line
					// Remove the element that belongs to that index 
				   else if (greenObject.lookupStation(stationRemove) != null) {
						greenList.remove(greenObject.lookupStation(stationRemove));
						stationsList.remove(greenObject.lookupStation(stationRemove));
						stationsList.remove(stationsObject.lookupStation(stationRemove));
						System.out.println("Station removed from the green line");
						
						
					} else if (redObject.lookupStation(stationRemove) != null) {
						redList.remove(redObject.lookupStation(stationRemove));
						stationsList.remove(redObject.lookupStation(stationRemove));
						stationsList.remove(stationsObject.lookupStation(stationRemove));
						System.out.println("Station removed from the red line");
						
						
					} else if (blueObject.lookupStation(stationRemove) != null) {
						blueList.remove(blueObject.lookupStation(stationRemove));
						stationsList.remove(blueObject.lookupStation(stationRemove));
						stationsList.remove(stationsObject.lookupStation(stationRemove));
						System.out.println("Station removed from the blue line");
						
						
					} else if (brownObject.lookupStation(stationRemove) != null) {
						brownList.remove(brownObject.lookupStation(stationRemove));
						stationsList.remove(brownObject.lookupStation(stationRemove));
						stationsList.remove(stationsObject.lookupStation(stationRemove));
						System.out.println("Station removed from the brown line");
						
						
					} else if (purpleObject.lookupStation(stationRemove) != null) {
						purpleList.remove(purpleObject.lookupStation(stationRemove));
						stationsList.remove(purpleObject.lookupStation(stationRemove));
						stationsList.remove(stationsObject.lookupStation(stationRemove));
						System.out.println("Station removed from the purple line");
						
						
					} else  if (pinkObject.lookupStation(stationRemove) != null) {
						pinkList.remove(pinkObject.lookupStation(stationRemove));
						stationsList.remove(pinkObject.lookupStation(stationRemove));
						stationsList.remove(stationsObject.lookupStation(stationRemove));
						System.out.println("Station removed from the pink line");
						
						
					} else if (orangeObject.lookupStation(stationRemove) != null) {
						orangeList.remove(orangeObject.lookupStation(stationRemove));
						stationsList.remove(orangeObject.lookupStation(stationRemove));
						stationsList.remove(stationsObject.lookupStation(stationRemove));
						System.out.println("Station removed from the orange line");
						
						
					} else if (yellowObject.lookupStation(stationRemove) != null) {
						yellowList.remove(yellowObject.lookupStation(stationRemove));
						stationsList.remove(yellowObject.lookupStation(stationRemove));
						stationsList.remove(stationsObject.lookupStation(stationRemove));
						 System.out.println("Station removed from the yellow line");
					} else {
						
						
					 } 
						
					} else if (confirmation.equalsIgnoreCase("no")) {
						
					}
					
					
					System.out.println("");
					
				
				// Opiton 5:
				// Look up a station
				} else if (optionSelected == 5) {
					
					System.out.println("Station name: ");
					String stationUser = sc.next();
				
				
					// I look if the station exits in any CTA line
					// using the CTARoutePorject objects I created above
					// I don't use else if in order to print multiple stations with the same name
					
					if (greenObject.lookupStation(stationUser) != null) {
						System.out.println("CTA line: Green");
						System.out.println(greenObject.lookupStation(stationUser));
						System.out.println(""); 
					} else {
						
					} if (redObject.lookupStation(stationUser) != null) {
						System.out.println("CTA line: Red");
						System.out.println(redObject.lookupStation(stationUser));
						System.out.println("");
					} else {
						
					} if (blueObject.lookupStation(stationUser) != null) {
						System.out.println("CTA line: Blue");
						System.out.println(blueObject.lookupStation(stationUser));
						System.out.println("");
					} else {
						
					} if (brownObject.lookupStation(stationUser) != null) {
						System.out.println("CTA line: Brown");
						System.out.println(brownObject.lookupStation(stationUser));
						System.out.println("");
					} else {
						
					} if (purpleObject.lookupStation(stationUser) != null) {
						System.out.println("CTA line: Purple");
						System.out.println(purpleObject.lookupStation(stationUser));
						System.out.println("");
					} else {
						
					} if (pinkObject.lookupStation(stationUser) != null) {
						System.out.println("CTA line: Pink");
						System.out.println(pinkObject.lookupStation(stationUser));
						System.out.println("");
					} else {
						
					} if (orangeObject.lookupStation(stationUser) != null) {
						System.out.println("CTA line: Orange");
						System.out.println(orangeObject.lookupStation(stationUser));
						System.out.println("");
					} else {
						
					} if (yellowObject.lookupStation(stationUser) != null) {
						System.out.println("CTA line: Yellow");
						System.out.println(yellowObject.lookupStation(stationUser));
						System.out.println("");
					} else {
						
						
						// If the station is null for every CTA line means that it does not exits
						if (greenObject.lookupStation(stationUser) == null && yellowObject.lookupStation(stationUser) == null && orangeObject.lookupStation(stationUser) == null && pinkObject.lookupStation(stationUser) == null && purpleObject.lookupStation(stationUser) == null && brownObject.lookupStation(stationUser) == null && blueObject.lookupStation(stationUser) == null && redObject.lookupStation(stationUser) == null) {
							System.out.println("Station not founded");
							System.out.println("");
							}
					}
					
					
				// Option 6:
				// Find the nearest staion
				} else if (optionSelected == 6) {
					
					System.out.print("Enter a latitude: ");
				    double lat = sc.nextDouble();
				    System.out.print("Enter a longitud: ");
				    double lng = sc.nextDouble();
				    
				    double nearDistance = stationsList.get(0).calcDistance(lat, lng);
				    
				    System.out.println("");
				   
				    int minimum = 0;
				    
				    for (i=0; i<stationsList.size(); i++) {
				    	
				    	double currentDist = stationsList.get(i).calcDistance(lat, lng);
				    	
				    	if (currentDist < nearDistance) {
				    		minimum = i;
				    		nearDistance = currentDist;
				    	}
				    		
				    }
				   
				    System.out.println("The nearest station is: " );
				    System.out.println(stationsList.get(minimum));
				    System.out.println("");
				    
				
				// Option 7: Route Planner
				    
				    // CODE STRUCTURE
				    // For this option I use the methods from the class CTARouteProject
				    // First, I Prompt the user for 2 stations
				    // Then, If one of the names enetered are not a station exit
				    // Then, it evaluates if there are multiple stations with the same name as station A
				    // If that's true, it prints the stations founded so the user can type the CTA line he wants
				    // Then, if there are also multiple stations with the same name as station B
				    // It will repeat the process above but for station B
				    // If it only finds one station with the name of station B it will skip that part
				    // If it did not find any repeated name it will jump to the last part of the code which generate the routes for the non-repeated stations
				    
				    // PATH GENERETOR CODE EXPLENATION
				    // The code evaluates CTA line by CTA line
				    // For example:
				    // After asking the user for Station A and Station B
				    // It looks if the station A entered is in the purple line list 
				    // If not, it looks if the station is in the red line
				    // It keeps looking line by line until it finds the station in a list
				    // For this example let's suppose that it found it in the red line list
				    // Then, after finding the station A
				    // It also looks for station B line by line.
				    // Similarly to station A, It looks for station B in every line until it finds it
				    // For example, if it finds it in the blue line list
				    // the output would be:
				    
				    // Start: Station A (red line) 
				    // Transfer at: "station from the method called"
				    // Finish: Station B (blue line)
	
				    // In other words, it looks for "station A" list by list (each CTA line has one list) 
				    // After it finds station A in a list
				    // It looks for station B also list by list
				    // When it finds both, it prints the output
				
				} else if (optionSelected == 7) {
					System.out.print("Station A: ");
					String stationA = sc.next();
					System.out.print("Station B: ");
					String stationB = sc.next();
					
					
				
					
					// If the names entered are not on the stations List
					System.out.println("");
					if (stationsObject.lookupStation(stationA) == null || stationsObject.lookupStation(stationB) == null) {
						System.out.println("Station not founded");
						
					
						
						
					// Multiple stations with same name cases
						
						// First if station A has the same name for multiple stations enter to this if statement
					} else if (stationA.equalsIgnoreCase("harlem") || stationA.equalsIgnoreCase("oak park") || stationA.equalsIgnoreCase("addison") || stationA.equalsIgnoreCase("montrose") || stationA.equalsIgnoreCase("irving park") || stationA.equalsIgnoreCase("belmont") || stationA.equalsIgnoreCase("california") || stationA.equalsIgnoreCase("western") || stationA.equalsIgnoreCase("damen") || stationA.equalsIgnoreCase("chicago") || stationA.equalsIgnoreCase("grand") || stationA.equalsIgnoreCase("clinton") || stationA.equalsIgnoreCase("pulaski") || stationA.equalsIgnoreCase("cicero") || stationA.equalsIgnoreCase("austin") || stationA.equalsIgnoreCase("central") || stationA.equalsIgnoreCase("kedzie") || stationA.equalsIgnoreCase("ashland") || stationA.equalsIgnoreCase("47th") || stationA.equalsIgnoreCase("garfield") || stationA.equalsIgnoreCase("halsted")) {
						System.out.println("I found the following stations with name: " + stationA);
						
						// look up station method to print the repeated stations
						if (greenObject.lookupStation(stationA) != null) {
							System.out.println("CTA line: Green");
							System.out.println(greenObject.lookupStation(stationA));
							System.out.println(""); 
						} else {
							
						} if (redObject.lookupStation(stationA) != null) {
							System.out.println("CTA line: Red");
							System.out.println(redObject.lookupStation(stationA));
							System.out.println("");
						} else {
							
						} if (blueObject.lookupStation(stationA) != null) {
							System.out.println("CTA line: Blue");
							System.out.println(blueObject.lookupStation(stationA));
							System.out.println("");
						} else {
							
						} if (brownObject.lookupStation(stationA) != null) {
							System.out.println("CTA line: Brown");
							System.out.println(brownObject.lookupStation(stationA));
							System.out.println("");
						} else {
							
						} if (purpleObject.lookupStation(stationA) != null) {
							System.out.println("CTA line: Purple");
							System.out.println(purpleObject.lookupStation(stationA));
							System.out.println("");
						} else {
							
						} if (pinkObject.lookupStation(stationA) != null) {
							System.out.println("CTA line: Pink");
							System.out.println(pinkObject.lookupStation(stationA));
							System.out.println("");
						} else {
							
						} if (orangeObject.lookupStation(stationA) != null) {
							System.out.println("CTA line: Orange");
							System.out.println(orangeObject.lookupStation(stationA));
							System.out.println("");
						} else {
							
						} if (yellowObject.lookupStation(stationA) != null) {
							System.out.println("CTA line: Yellow");
							System.out.println(yellowObject.lookupStation(stationA));
							System.out.println("");
						} else {		}
						
						System.out.println("Type the CTA line of the station you are looking for: ");
						
						String multA = sc.next();
						
						// If Station B also has the same name for multiple stations enter to this if statement
						if (stationB.equalsIgnoreCase("harlem") || stationB.equalsIgnoreCase("oak park") || stationB.equalsIgnoreCase("addison") || stationB.equalsIgnoreCase("montrose") || stationB.equalsIgnoreCase("irving park") || stationB.equalsIgnoreCase("belmont") || stationB.equalsIgnoreCase("california") || stationB.equalsIgnoreCase("western") || stationB.equalsIgnoreCase("damen") || stationB.equalsIgnoreCase("chicago") || stationB.equalsIgnoreCase("grand") || stationB.equalsIgnoreCase("clinton") || stationB.equalsIgnoreCase("pulaski") || stationB.equalsIgnoreCase("cicero") || stationB.equalsIgnoreCase("austin") || stationB.equalsIgnoreCase("central") || stationB.equalsIgnoreCase("kedzie") || stationB.equalsIgnoreCase("ashland") || stationB.equalsIgnoreCase("47th") || stationB.equalsIgnoreCase("garfield") || stationB.equalsIgnoreCase("halsted") ) {
							System.out.println("I founde the following statinos with name " + stationB);
							
							// look up station method to print the repeated stations
							if (greenObject.lookupStation(stationB) != null) {
								System.out.println("CTA line: Green");
								System.out.println(greenObject.lookupStation(stationB));
								System.out.println(""); 
							} else {
								
							} if (redObject.lookupStation(stationB) != null) {
								System.out.println("CTA line: Red");
								System.out.println(redObject.lookupStation(stationB));
								System.out.println("");
							} else {
								
							} if (blueObject.lookupStation(stationB) != null) {
								System.out.println("CTA line: Blue");
								System.out.println(blueObject.lookupStation(stationB));
								System.out.println("");
							} else {
								
							} if (brownObject.lookupStation(stationB) != null) {
								System.out.println("CTA line: Brown");
								System.out.println(brownObject.lookupStation(stationB));
								System.out.println("");
							} else {
								
							} if (purpleObject.lookupStation(stationB) != null) {
								System.out.println("CTA line: Purple");
								System.out.println(purpleObject.lookupStation(stationB));
								System.out.println("");
							} else {
								
							} if (pinkObject.lookupStation(stationB) != null) {
								System.out.println("CTA line: Pink");
								System.out.println(pinkObject.lookupStation(stationB));
								System.out.println("");
							} else {
								
							} if (orangeObject.lookupStation(stationB) != null) {
								System.out.println("CTA line: Orange");
								System.out.println(orangeObject.lookupStation(stationB));
								System.out.println("");
							} else {
								
							} if (yellowObject.lookupStation(stationB) != null) {
								System.out.println("CTA line: Yellow");
								System.out.println(yellowObject.lookupStation(stationB));
								System.out.println("");
							} else {		}
							
							System.out.println("Type the CTA line of the station you are looking for");
							
							String multB = sc.next();
							
							
							if (multB.equalsIgnoreCase("red")) {
								if (redObject.lookupStation(stationB) != null && redObject.lookupStation(stationA) != null) {
									stationsObject.lake(stationA, stationB);
										
										// Red to Yellow
									} else if (redObject.lookupStation(stationB) != null && yellowObject.lookupStation(stationA) != null) {
										stationsObject.lake(stationA, stationB);
										
										// Red to brown
									} else if (redObject.lookupStation(stationB) != null && brownObject.lookupStation(stationA) != null) {
										stationsObject.lake(stationA, stationB);
										
										// Red to green
									} else if (redObject.lookupStation(stationB) != null && greenObject.lookupStation(stationA) != null) {
										stationsObject.lake(stationA, stationB);
										
										// Red to blue
									} else if (redObject.lookupStation(stationB) != null && blueObject.lookupStation(stationA) != null) {
										stationsObject.lake(stationA, stationB);
										
										// Red to pink
									} else if (redObject.lookupStation(stationB) != null && pinkObject.lookupStation(stationA) != null) {
										stationsObject.lake(stationA, stationB);
										
										// Red to orange
									} else if (redObject.lookupStation(stationB) != null && orangeObject.lookupStation(stationA) != null) {
										stationsObject.lake(stationA, stationB);
										
										// Red to purple
									} else if (redObject.lookupStation(stationB) != null && purpleObject.lookupStation(stationA) != null) {
										stationsObject.lake(stationA, stationB);
									} else {
										System.out.println("Station does not exit on " + multB + " line" );
									}
								
								
							} else if (multB.equalsIgnoreCase("yellow")) {
								if (yellowObject.lookupStation(stationB) != null && redObject.lookupStation(stationA) != null) {
									stationsObject.lake(stationA, stationB);
										
										// Yellow to Yellow
									} else if (yellowObject.lookupStation(stationB) != null && yellowObject.lookupStation(stationA) != null) {
										stationsObject.lake(stationA, stationB);
										
										// Yellow to brown
									} else if (yellowObject.lookupStation(stationB) != null && brownObject.lookupStation(stationA) != null) {
										stationsObject.lake(stationA, stationB);
										
										// Yellow to green
									} else if (yellowObject.lookupStation(stationB) != null && greenObject.lookupStation(stationA) != null) {
										stationsObject.lake(stationA, stationB);
										
										// Yellow to blue
									} else if (yellowObject.lookupStation(stationB) != null && blueObject.lookupStation(stationA) != null) {
										stationsObject.lake(stationA, stationB);
										
										// Yellow to pink
									} else if (yellowObject.lookupStation(stationB) != null && pinkObject.lookupStation(stationA) != null) {
										stationsObject.yellowToPink(stationA, stationB);
										
										// Yellow to orange
									} else if (yellowObject.lookupStation(stationB) != null && orangeObject.lookupStation(stationA) != null) {
										stationsObject.lake(stationA, stationB);
										
										// Yellow to purple
									} else if (yellowObject.lookupStation(stationB) != null && purpleObject.lookupStation(stationA) != null) {
										stationsObject.lake(stationA, stationB);
									} else {
										System.out.println("Station does not exit on " + multB + " line");
									}
								
							} else if (multB.equalsIgnoreCase("brown")) {
								if (brownObject.lookupStation(stationB) != null && redObject.lookupStation(stationA) != null) {
									stationsObject.lake(stationA, stationB);
										
										// Brown to Yellow
									} else if (brownObject.lookupStation(stationB) != null && yellowObject.lookupStation(stationA) != null) {
										stationsObject.lake(stationA, stationB);
										
										// Brown to brown
									} else if (brownObject.lookupStation(stationB) != null && brownObject.lookupStation(stationA) != null) {
										stationsObject.lake(stationA, stationB);
										
										// Brown to green
									} else if (brownObject.lookupStation(stationB) != null && greenObject.lookupStation(stationA) != null) {
										stationsObject.lake(stationA, stationB);
										
										// Brown to blue
									} else if (brownObject.lookupStation(stationB) != null && blueObject.lookupStation(stationA) != null) {
										stationsObject.lake(stationA, stationB);
										
										// Brown to pink
									} else if (brownObject.lookupStation(stationB) != null && pinkObject.lookupStation(stationA) != null) {
										stationsObject.lake(stationA, stationB);
										
										// Brown to orange
									} else if (brownObject.lookupStation(stationB) != null && orangeObject.lookupStation(stationA) != null) {
										stationsObject.lake(stationA, stationB);
										
										// Brown to purple
									} else if (brownObject.lookupStation(stationB) != null && purpleObject.lookupStation(stationA) != null) {
										stationsObject.lake(stationA, stationB);
									} else {
										System.out.println("Station does not exit on " + multB + " line" );
									}
								
							} else if (multB.equalsIgnoreCase("green")) {
								if (greenObject.lookupStation(stationB) != null && redObject.lookupStation(stationA) != null) {
									stationsObject.lake(stationA, stationB);
										
										// Green to Yellow
									} else if (greenObject.lookupStation(stationB) != null && yellowObject.lookupStation(stationA) != null) {
										stationsObject.lake(stationA, stationB);
										
										// Green to brown
									} else if (greenObject.lookupStation(stationB) != null && brownObject.lookupStation(stationA) != null) {
										stationsObject.lake(stationA, stationB);
										
										// Green to green
									} else if (greenObject.lookupStation(stationB) != null && greenObject.lookupStation(stationA) != null) {
										stationsObject.lake(stationA, stationB);
										
										// Green to blue
									} else if (greenObject.lookupStation(stationB) != null && blueObject.lookupStation(stationA) != null) {
										stationsObject.lake(stationA, stationB);
										
										// Green to pink
									} else if (greenObject.lookupStation(stationB) != null && pinkObject.lookupStation(stationA) != null) {
										stationsObject.lake(stationA, stationB);
										
										// Green to orange
									} else if (greenObject.lookupStation(stationB) != null && orangeObject.lookupStation(stationA) != null) {
										stationsObject.lake(stationA, stationB);
										
										// Green to purple
									} else if (greenObject.lookupStation(stationB) != null && purpleObject.lookupStation(stationA) != null) {
										stationsObject.lake(stationA, stationB);
									} else {
										System.out.println("Station does not exit on " + multB + " line" );
									}
								
							} else if (multB.equalsIgnoreCase("blue")) {
								if (blueObject.lookupStation(stationB) != null && redObject.lookupStation(stationA) != null) {
									stationsObject.blueToRed(stationA, stationB);
										
										// Blue to Yellow
									} else if (blueObject.lookupStation(stationB) != null && yellowObject.lookupStation(stationA) != null) {
										stationsObject.lake(stationA, stationB);
										
										// Blue to brown
									} else if (blueObject.lookupStation(stationB) != null && brownObject.lookupStation(stationA) != null) {
										stationsObject.lake(stationA, stationB);
										
										// Blue to green
									} else if (blueObject.lookupStation(stationB) != null && greenObject.lookupStation(stationA) != null) {
										stationsObject.lake(stationA, stationB);
										
										// Blue to blue
									} else if (blueObject.lookupStation(stationB) != null && blueObject.lookupStation(stationA) != null) {
										stationsObject.lake(stationA, stationB);
										
										// Blue to pink
									} else if (blueObject.lookupStation(stationB) != null && pinkObject.lookupStation(stationA) != null) {
										stationsObject.lake(stationA, stationB);
										
										// Blue to orange
									} else if (blueObject.lookupStation(stationB) != null && orangeObject.lookupStation(stationA) != null) {
										stationsObject.lake(stationA, stationB);
										
										// Blue to purple
									} else if (blueObject.lookupStation(stationB) != null && purpleObject.lookupStation(stationA) != null) {
										stationsObject.lake(stationA, stationB);
									} else {
										System.out.println("Station does not exit on " + multB + " line" );
									}
								
							} else if (multB.equalsIgnoreCase("pink")) {
								if (pinkObject.lookupStation(stationB) != null && redObject.lookupStation(stationA) != null) {
									stationsObject.lake(stationA, stationB);
										
										// Pink to Yellow
									} else if (pinkObject.lookupStation(stationB) != null && yellowObject.lookupStation(stationA) != null) {
										stationsObject.lake(stationA, stationB);
										
										// Pink to brown
									} else if (pinkObject.lookupStation(stationB) != null && brownObject.lookupStation(stationA) != null) {
										stationsObject.lake(stationA, stationB);
										
										// Pink to green
									} else if (pinkObject.lookupStation(stationB) != null && greenObject.lookupStation(stationA) != null) {
										stationsObject.lake(stationA, stationB);
										
										// Pink to blue
									} else if (pinkObject.lookupStation(stationB) != null && blueObject.lookupStation(stationA) != null) {
										stationsObject.lake(stationA, stationB);
										
										// Pink to pink
									} else if (pinkObject.lookupStation(stationB) != null && pinkObject.lookupStation(stationA) != null) {
										stationsObject.lake(stationA, stationB);
										
										// Pink to orange
									} else if (pinkObject.lookupStation(stationB) != null && orangeObject.lookupStation(stationA) != null) {
										stationsObject.lake(stationA, stationB);
										
										// Pink to purple
									} else if (pinkObject.lookupStation(stationB) != null && purpleObject.lookupStation(stationA) != null) {
										stationsObject.lake(stationA, stationB);
									} else {
										System.out.println("Station does not exit on " + multB + " line" );
									}
								
							} else if (multB.equalsIgnoreCase("orange")) {
								if (orangeObject.lookupStation(stationB) != null && redObject.lookupStation(stationA) != null) {
									stationsObject.lake(stationA, stationB);
										
										// Orange to Yellow
									} else if (orangeObject.lookupStation(stationB) != null && yellowObject.lookupStation(stationA) != null) {
										stationsObject.lake(stationA, stationB);
										
										// Orange to brown
									} else if (orangeObject.lookupStation(stationB) != null && brownObject.lookupStation(stationA) != null) {
										stationsObject.lake(stationA, stationB);
										
										// Orange to green
									} else if (orangeObject.lookupStation(stationB) != null && greenObject.lookupStation(stationA) != null) {
										stationsObject.lake(stationA, stationB);
										
										// Orange to blue
									} else if (orangeObject.lookupStation(stationB) != null && blueObject.lookupStation(stationA) != null) {
										stationsObject.lake(stationA, stationB);
										
										// Orange to pink
									} else if (orangeObject.lookupStation(stationB) != null && pinkObject.lookupStation(stationA) != null) {
										stationsObject.lake(stationA, stationB);
										
										// Orange to orange
									} else if (orangeObject.lookupStation(stationB) != null && orangeObject.lookupStation(stationA) != null) {
										stationsObject.lake(stationA, stationB);
										
										// Orange to purple
									} else if (orangeObject.lookupStation(stationB) != null && purpleObject.lookupStation(stationA) != null) {
										stationsObject.lake(stationA, stationB);
									} else {
										System.out.println("Station does not exit on " + multB + " line" );
									}
								
							} else if (multB.equalsIgnoreCase("purple")) {
								if (purpleObject.lookupStation(stationB) != null && redObject.lookupStation(stationB) != null) {
									stationsObject.lake(stationA, stationB);
									
									// Purple to Yellow
								} else if (purpleObject.lookupStation(stationB) != null && yellowObject.lookupStation(stationA) != null) {
									stationsObject.lake(stationA, stationB);
									
									// Purple to brown
								} else if (purpleObject.lookupStation(stationB) != null && brownObject.lookupStation(stationA) != null) {
									stationsObject.lake(stationA, stationB);
									
									// Purple to green
								} else if (purpleObject.lookupStation(stationB) != null && greenObject.lookupStation(stationA) != null) {
									stationsObject.lake(stationA, stationB);
									
									// Purple to blue
								} else if (purpleObject.lookupStation(stationB) != null && blueObject.lookupStation(stationA) != null) {
									stationsObject.lake(stationA, stationB);
									
									// Purple to pink
								} else if (purpleObject.lookupStation(stationB) != null && pinkObject.lookupStation(stationA) != null) {
									stationsObject.lake(stationA, stationB);
									
									// Purple to orange
								} else if (purpleObject.lookupStation(stationB) != null && orangeObject.lookupStation(stationA) != null) {
									stationsObject.lake(stationA, stationB);
									
									// Purple to purple
								} else if (purpleObject.lookupStation(stationB) != null && purpleObject.lookupStation(stationA) != null) {
									stationsObject.lake(stationA, stationB);
								} else {
									System.out.println("Station does not exit on " + multB + " line" );
								}
								
							
								
							}
								
								
								
							
							
							// If the name of station B doesnt repeat
							
							// Red to red
						} else if (multA.equalsIgnoreCase("red")) {
							if (redObject.lookupStation(stationA) != null && redObject.lookupStation(stationB) != null) {
								stationsObject.redToRed(stationA, stationB);
							
							
									// Red to Yellow
								} else if (redObject.lookupStation(stationA) != null && yellowObject.lookupStation(stationB) != null) {
									stationsObject.redToYellow(stationA, stationB);
								
						
									// Red to brown
								} else if (redObject.lookupStation(stationA) != null && brownObject.lookupStation(stationB) != null) {
									stationsObject.redToBrown(stationA, stationB);
								
					
									// Red to green
								} else if (redObject.lookupStation(stationA) != null && greenObject.lookupStation(stationB) != null) {
									stationsObject.redToGreen(stationA, stationB);
									
									// Red to blue
								} else if (redObject.lookupStation(stationA) != null && blueObject.lookupStation(stationB) != null) {
									stationsObject.redToBlue(stationA, stationB);
									
									
									// Red to pink
								} else if (redObject.lookupStation(stationA) != null && pinkObject.lookupStation(stationB) != null) {
									stationsObject.redToPink(stationA, stationB);
									
									// Red to orange
								} else if (redObject.lookupStation(stationA) != null && orangeObject.lookupStation(stationB) != null) {
									stationsObject.redToOrange(stationA, stationB);
									
									// Red to purple
								} else if (redObject.lookupStation(stationA) != null && purpleObject.lookupStation(stationB) != null) {
									stationsObject.redToPurple(stationA, stationB);
								} else {
									System.out.println("Station not found in " + stationA + " line");
								}
							
							
						} else if (multA.equalsIgnoreCase("yellow")) {
							if (yellowObject.lookupStation(stationA) != null && redObject.lookupStation(stationB) != null) {
								stationsObject.yellowToRed(stationA, stationB);
									
									// Yellow to Yellow
								} else if (yellowObject.lookupStation(stationA) != null && yellowObject.lookupStation(stationB) != null) {
									stationsObject.yellowToYellow(stationA, stationB);
									
									// Yellow to brown
								} else if (yellowObject.lookupStation(stationA) != null && brownObject.lookupStation(stationB) != null) {
									stationsObject.yellowToBrown(stationA, stationB);
									
									// Yellow to green
								} else if (yellowObject.lookupStation(stationA) != null && greenObject.lookupStation(stationB) != null) {
									stationsObject.yellowToGreen(stationA, stationB);
									
									// Yellow to blue
								} else if (yellowObject.lookupStation(stationA) != null && blueObject.lookupStation(stationB) != null) {
									stationsObject.yellowToBlue(stationA, stationB);
									
									// Yellow to pink
								} else if (yellowObject.lookupStation(stationA) != null && pinkObject.lookupStation(stationB) != null) {
									stationsObject.yellowToPink(stationA, stationB);
									
									// Yellow to orange
								} else if (yellowObject.lookupStation(stationA) != null && orangeObject.lookupStation(stationB) != null) {
									stationsObject.yellowToOrange(stationA, stationB);
									
									// Yellow to purple
								} else if (yellowObject.lookupStation(stationA) != null && purpleObject.lookupStation(stationB) != null) {
									stationsObject.yellowToPurple(stationA, stationB);
								} else {
									System.out.println("Station not found in " + stationA + " line");
								}
							
						} else if (multA.equalsIgnoreCase("brown")) {
							if (brownObject.lookupStation(stationA) != null && redObject.lookupStation(stationB) != null) {
								stationsObject.brownToRed(stationA, stationB);
									
									// Brown to Yellow
								} else if (brownObject.lookupStation(stationA) != null && yellowObject.lookupStation(stationB) != null) {
									stationsObject.brownToYellow(stationA, stationB);
									
									// Brown to brown
								} else if (brownObject.lookupStation(stationA) != null && brownObject.lookupStation(stationB) != null) {
									stationsObject.brownToBrown(stationA, stationB);
									
									// Brown to green
								} else if (brownObject.lookupStation(stationA) != null && greenObject.lookupStation(stationB) != null) {
									stationsObject.brownToGreen(stationA, stationB);
									
									// Brown to blue
								} else if (brownObject.lookupStation(stationA) != null && blueObject.lookupStation(stationB) != null) {
									stationsObject.brownToBlue(stationA, stationB);
									
									// Brown to pink
								} else if (brownObject.lookupStation(stationA) != null && pinkObject.lookupStation(stationB) != null) {
									stationsObject.brownToPink(stationA, stationB);
									
									// Brown to orange
								} else if (brownObject.lookupStation(stationA) != null && orangeObject.lookupStation(stationB) != null) {
									stationsObject.brownToOrange(stationA, stationB);
									
									// Brown to purple
								} else if (brownObject.lookupStation(stationA) != null && purpleObject.lookupStation(stationB) != null) {
									stationsObject.brownToPurple(stationA, stationB);
								} else {
									System.out.println("Station not found in " + stationB + " line");
								}
							
						} else if (multA.equalsIgnoreCase("green")) {
							if (greenObject.lookupStation(stationA) != null && redObject.lookupStation(stationB) != null) {
								stationsObject.GreenToRed(stationA, stationB);
									
									// Green to Yellow
								} else if (greenObject.lookupStation(stationA) != null && yellowObject.lookupStation(stationB) != null) {
									stationsObject.GreenToYellow(stationA, stationB);
									
									// Green to brown
								} else if (greenObject.lookupStation(stationA) != null && brownObject.lookupStation(stationB) != null) {
									stationsObject.GreenToBrown(stationA, stationB);
									
									// Green to green
								} else if (greenObject.lookupStation(stationA) != null && greenObject.lookupStation(stationB) != null) {
									stationsObject.GreenToGreen(stationA, stationB);
									
									// Green to blue
								} else if (greenObject.lookupStation(stationA) != null && blueObject.lookupStation(stationB) != null) {
									stationsObject.GreenToBlue(stationA, stationB);
									
									// Green to pink
								} else if (greenObject.lookupStation(stationA) != null && pinkObject.lookupStation(stationB) != null) {
									stationsObject.GreenToPink(stationA, stationB);
									
									// Green to orange
								} else if (greenObject.lookupStation(stationA) != null && orangeObject.lookupStation(stationB) != null) {
									stationsObject.GreenToOrange(stationA, stationB);
									
									// Green to purple
								} else if (greenObject.lookupStation(stationA) != null && purpleObject.lookupStation(stationB) != null) {
									stationsObject.GreenToPurple(stationA, stationB);
								} else {
									System.out.println("Station not found in " + stationA + " line");
								}
							
						} else if (multA.equalsIgnoreCase("blue")) {
							if (blueObject.lookupStation(stationA) != null && redObject.lookupStation(stationB) != null) {
								stationsObject.blueToRed(stationA, stationB);
									
									// Blue to Yellow
								} else if (blueObject.lookupStation(stationA) != null && yellowObject.lookupStation(stationB) != null) {
									stationsObject.blueToRed(stationA, stationB);
									
									// Blue to brown
								} else if (blueObject.lookupStation(stationA) != null && brownObject.lookupStation(stationB) != null) {
									stationsObject.blueToBrown(stationA, stationB);
									
									// Blue to green
								} else if (blueObject.lookupStation(stationA) != null && greenObject.lookupStation(stationB) != null) {
									stationsObject.blueToGreen(stationA, stationB);
									
									// Blue to blue
								} else if (blueObject.lookupStation(stationA) != null && blueObject.lookupStation(stationB) != null) {
									stationsObject.blueToBlue(stationA, stationB);
									
									// Blue to pink
								} else if (blueObject.lookupStation(stationA) != null && pinkObject.lookupStation(stationB) != null) {
									stationsObject.blueToPink(stationA, stationB);
									
									// Blue to orange
								} else if (blueObject.lookupStation(stationA) != null && orangeObject.lookupStation(stationB) != null) {
									stationsObject.blueToOrange(stationA, stationB);
									
									// Blue to purple
								} else if (blueObject.lookupStation(stationA) != null && purpleObject.lookupStation(stationB) != null) {
									stationsObject.blueToPurple(stationA, stationB);
								} else {
									System.out.println("Station not found in " + stationA + " line");
								}
							
						} else if (multA.equalsIgnoreCase("pink")) {
							if (pinkObject.lookupStation(stationA) != null && redObject.lookupStation(stationB) != null) {
								stationsObject.pinkToRed(stationA, stationB);

									// Pink to Yellow
								} else if (pinkObject.lookupStation(stationA) != null && yellowObject.lookupStation(stationB) != null) {
									stationsObject.pinkToYellow(stationA, stationB);
									
									// Pink to brown
								} else if (pinkObject.lookupStation(stationA) != null && brownObject.lookupStation(stationB) != null) {
									stationsObject.pinkToBrown(stationA, stationB);
									
									// Pink to green
								} else if (pinkObject.lookupStation(stationA) != null && greenObject.lookupStation(stationB) != null) {
									stationsObject.pinkToGreen(stationA, stationB);
									
									// Pink to blue
								} else if (pinkObject.lookupStation(stationA) != null && blueObject.lookupStation(stationB) != null) {
									stationsObject.pinkToBlue(stationA, stationB);
									
									// Pink to pink
								} else if (pinkObject.lookupStation(stationA) != null && pinkObject.lookupStation(stationB) != null) {
									stationsObject.pinkToPink(stationA, stationB);
									
									// Pink to orange
								} else if (pinkObject.lookupStation(stationA) != null && orangeObject.lookupStation(stationB) != null) {
									stationsObject.pinkToOrange(stationA, stationB);
									
									// Pink to purple
								} else if (pinkObject.lookupStation(stationA) != null && purpleObject.lookupStation(stationB) != null) {
									stationsObject.pinkToPurple(stationA, stationB);
								} else {
									System.out.println("Station not found in " + stationA + " line");
								}
							
						} else if (multA.equalsIgnoreCase("orange")) {
							if (orangeObject.lookupStation(stationA) != null && redObject.lookupStation(stationB) != null) {
							     stationsObject.orangeToRed(stationA, stationB);
									
									// Orange to Yellow
								} else if (orangeObject.lookupStation(stationA) != null && yellowObject.lookupStation(stationB) != null) {
									stationsObject.orangeToYellow(stationA, stationB);
									
									// Orange to brown
								} else if (orangeObject.lookupStation(stationA) != null && brownObject.lookupStation(stationB) != null) {
									stationsObject.orangeToBrown(stationA, stationB);
									
									// Orange to green
								} else if (orangeObject.lookupStation(stationA) != null && greenObject.lookupStation(stationB) != null) {
									stationsObject.orangeToGreen(stationA, stationB);
									
									// Orange to blue
								} else if (orangeObject.lookupStation(stationA) != null && blueObject.lookupStation(stationB) != null) {
									stationsObject.orangeToBlue(stationA, stationB);
									
									// Orange to pink
								} else if (orangeObject.lookupStation(stationA) != null && pinkObject.lookupStation(stationB) != null) {
									stationsObject.orangeToPink(stationA, stationB);
									
									// Orange to orange
								} else if (orangeObject.lookupStation(stationA) != null && orangeObject.lookupStation(stationB) != null) {
									stationsObject.orangeToOrange(stationA, stationB);
									
									// Orange to purple
								} else if (orangeObject.lookupStation(stationA) != null && purpleObject.lookupStation(stationB) != null) {
									stationsObject.orangeToPurple(stationA, stationB);
								} else {
									System.out.println("Station not found in " + stationA + " line");
								}
							
						} else if (multA.equalsIgnoreCase("purple")) {
							if (purpleObject.lookupStation(stationA) != null && redObject.lookupStation(stationB) != null) {
								stationsObject.purpleToRed(stationA, stationB);
								
								// Purple to Yellow
							} else if (purpleObject.lookupStation(stationA) != null && yellowObject.lookupStation(stationB) != null) {
								stationsObject.purpleToYellow(stationA, stationB);
								
								// Purple to brown
							} else if (purpleObject.lookupStation(stationA) != null && brownObject.lookupStation(stationB) != null) {
								stationsObject.purpleToBrown(stationA, stationB);
								
								// Purple to green
							} else if (purpleObject.lookupStation(stationA) != null && greenObject.lookupStation(stationB) != null) {
								stationsObject.purpleToGreen(stationA, stationB);
								
								// Purple to blue
							} else if (purpleObject.lookupStation(stationA) != null && blueObject.lookupStation(stationB) != null) {
								stationsObject.purpleToBlue(stationA, stationB);
								
								// Purple to pink
							} else if (purpleObject.lookupStation(stationA) != null && pinkObject.lookupStation(stationB) != null) {
								stationsObject.purpleToPink(stationA, stationB);
								
								// Purple to orange
							} else if (purpleObject.lookupStation(stationA) != null && orangeObject.lookupStation(stationB) != null) {
								stationsObject.purpleToOrange(stationA, stationB);
								
								// Purple to purple
							} else if (purpleObject.lookupStation(stationA) != null && purpleObject.lookupStation(stationB) != null) {
								stationsObject.purpleToPurple(stationA, stationB);
							} else {
								System.out.println("Station not found in " + stationA + " line");
							}
							
						
						}
							
						
							
							
						
						// If staion A doesn't have multiple stations that match with the entered name
						// But station B does have multiple stations with the entered name
						// It will execute this part of the program
							
							
						} else if ((stationA!="Harlem" && stationA!="Oak Park" && stationA!="Addison" && stationA!="Montrose" && stationA!="Irving Park" && stationA!="Belmont" && stationA!="California" && stationA!="Western" && stationA!="Damen" && stationA!="Chicago" && stationA!="Grand" && stationA!="Clinton" && stationA!="Pulaski" && stationA!="Cicero" && stationA!="Austin" && stationA!="Central" && stationA!="Kedzie" && stationA!="Ashland" && stationA!="47th" && stationA!="Garfield" && stationA!="halsted") && (stationB.equalsIgnoreCase("harlem") || stationB.equalsIgnoreCase("oak park") || stationB.equalsIgnoreCase("addison") || stationB.equalsIgnoreCase("montrose") || stationB.equalsIgnoreCase("irving park") || stationB.equalsIgnoreCase("belmont") || stationB.equalsIgnoreCase("california") || stationB.equalsIgnoreCase("western") || stationB.equalsIgnoreCase("damen") || stationB.equalsIgnoreCase("chicago") || stationB.equalsIgnoreCase("grand") || stationB.equalsIgnoreCase("clinton") || stationB.equalsIgnoreCase("pulaski") || stationB.equalsIgnoreCase("cicero") || stationB.equalsIgnoreCase("austin") || stationB.equalsIgnoreCase("central") || stationB.equalsIgnoreCase("kedzie") || stationB.equalsIgnoreCase("ashland") || stationB.equalsIgnoreCase("47th") || stationB.equalsIgnoreCase("garfield") || stationB.equalsIgnoreCase("halsted"))) {
							
						
							System.out.println("Multiple stations with the name " + stationB);
							
							if (greenObject.lookupStation(stationB) != null) {
								System.out.println("CTA line: Green");
								System.out.println(greenObject.lookupStation(stationB));
								System.out.println(""); 
							} else {
								
							} if (redObject.lookupStation(stationB) != null) {
								System.out.println("CTA line: Red");
								System.out.println(redObject.lookupStation(stationB));
								System.out.println("");
							} else {
								
							} if (blueObject.lookupStation(stationB) != null) {
								System.out.println("CTA line: Blue");
								System.out.println(blueObject.lookupStation(stationB));
								System.out.println("");
							} else {
								
							} if (brownObject.lookupStation(stationB) != null) {
								System.out.println("CTA line: Brown");
								System.out.println(brownObject.lookupStation(stationB));
								System.out.println("");
							} else {
								
							} if (purpleObject.lookupStation(stationB) != null) {
								System.out.println("CTA line: Purple");
								System.out.println(purpleObject.lookupStation(stationB));
								System.out.println("");
							} else {
								
							} if (pinkObject.lookupStation(stationB) != null) {
								System.out.println("CTA line: Pink");
								System.out.println(pinkObject.lookupStation(stationB));
								System.out.println("");
							} else {
								
							} if (orangeObject.lookupStation(stationB) != null) {
								System.out.println("CTA line: Orange");
								System.out.println(orangeObject.lookupStation(stationB));
								System.out.println("");
							} else {
								
							} if (yellowObject.lookupStation(stationB) != null) {
								System.out.println("CTA line: Yellow");
								System.out.println(yellowObject.lookupStation(stationB));
								System.out.println("");
							} else {		}
							
							System.out.println("Type the CTA line of the station you are looking for: ");
								String second = sc.next();
								
								if (second.equalsIgnoreCase("red")) {
									if (redObject.lookupStation(stationB) != null && redObject.lookupStation(stationA) != null) {
										stationsObject.lake(stationA, stationB);
											
											// Red to Yellow
										} else if (redObject.lookupStation(stationB) != null && yellowObject.lookupStation(stationA) != null) {
											System.out.println("Start: " + stationA + " (Yellow line)");
											System.out.println("Transfer at: Howard");
											System.out.println("Start: " + stationB + " (Red line)");
											
											// Red to brown
										} else if (redObject.lookupStation(stationB) != null && brownObject.lookupStation(stationA) != null) {
											stationsObject.lake(stationA, stationB);
											
											// Red to green
										} else if (redObject.lookupStation(stationB) != null && greenObject.lookupStation(stationA) != null) {
											stationsObject.lake(stationA, stationB);
											
											// Red to blue
										} else if (redObject.lookupStation(stationB) != null && blueObject.lookupStation(stationA) != null) {
											stationsObject.lake(stationA, stationB);
											
											// Red to pink
										} else if (redObject.lookupStation(stationB) != null && pinkObject.lookupStation(stationA) != null) {
											stationsObject.lake(stationA, stationB);
											
											// Red to orange
										} else if (redObject.lookupStation(stationB) != null && orangeObject.lookupStation(stationA) != null) {
											stationsObject.lake(stationA, stationB);
											
											// Red to purple
										} else if (redObject.lookupStation(stationB) != null && purpleObject.lookupStation(stationA) != null) {
											stationsObject.lake(stationA, stationB);
										} else {
											System.out.println("Station not found in " + second + " line");
										}
									
									
								} else if (second.equalsIgnoreCase("yellow")) {
									if (yellowObject.lookupStation(stationB) != null && redObject.lookupStation(stationA) != null) {
										stationsObject.lake(stationA, stationB);
											
											// Yellow to Yellow
										} else if (yellowObject.lookupStation(stationB) != null && yellowObject.lookupStation(stationA) != null) {
											stationsObject.yellow(stationA, stationB);
											
											// Yellow to brown
										} else if (yellowObject.lookupStation(stationB) != null && brownObject.lookupStation(stationA) != null) {
											stationsObject.lake(stationA, stationB);
											
											// Yellow to green
										} else if (yellowObject.lookupStation(stationB) != null && greenObject.lookupStation(stationA) != null) {
											stationsObject.lake(stationA, stationB);
											
											// Yellow to blue
										} else if (yellowObject.lookupStation(stationB) != null && blueObject.lookupStation(stationA) != null) {
											stationsObject.lake(stationA, stationB);
											
											// Yellow to pink
										} else if (yellowObject.lookupStation(stationB) != null && pinkObject.lookupStation(stationA) != null) {
											stationsObject.lake(stationA, stationB);
											
											// Yellow to orange
										} else if (yellowObject.lookupStation(stationB) != null && orangeObject.lookupStation(stationA) != null) {
											stationsObject.lake(stationA, stationB);
											
											// Yellow to purple
										} else if (yellowObject.lookupStation(stationB) != null && purpleObject.lookupStation(stationA) != null) {
											stationsObject.lake(stationA, stationB);
										} else {
											System.out.println("Station not found in " + second + " line");
										}
									
								} else if (second.equalsIgnoreCase("brown")) {
									if (brownObject.lookupStation(stationB) != null && redObject.lookupStation(stationA) != null) {
										stationsObject.lake(stationA, stationB);
											
											// Brown to Yellow
										} else if (brownObject.lookupStation(stationB) != null && yellowObject.lookupStation(stationA) != null) {
											stationsObject.yellow(stationA, stationB);
											
											// Brown to brown
										} else if (brownObject.lookupStation(stationB) != null && brownObject.lookupStation(stationA) != null) {
											stationsObject.lake(stationA, stationB);
											
											// Brown to green
										} else if (brownObject.lookupStation(stationB) != null && greenObject.lookupStation(stationA) != null) {
											stationsObject.lake(stationA, stationB);
											
											// Brown to blue
										} else if (brownObject.lookupStation(stationB) != null && blueObject.lookupStation(stationA) != null) {
											stationsObject.lake(stationA, stationB);
											
											// Brown to pink
										} else if (brownObject.lookupStation(stationB) != null && pinkObject.lookupStation(stationA) != null) {
											stationsObject.lake(stationA, stationB);
											
											// Brown to orange
										} else if (brownObject.lookupStation(stationB) != null && orangeObject.lookupStation(stationA) != null) {
											stationsObject.lake(stationA, stationB);
											
											// Brown to purple
										} else if (brownObject.lookupStation(stationB) != null && purpleObject.lookupStation(stationA) != null) {
											stationsObject.lake(stationA, stationB);
										} else {
											System.out.println("Station not found in " + second + " line");
										}
									
								} else if (second.equalsIgnoreCase("green")) {
									if (greenObject.lookupStation(stationB) != null && redObject.lookupStation(stationA) != null) {
										stationsObject.lake(stationA, stationB);
											
											// Green to Yellow
										} else if (greenObject.lookupStation(stationB) != null && yellowObject.lookupStation(stationA) != null) {
											stationsObject.yellow(stationA, stationB);
											
											// Green to brown
										} else if (greenObject.lookupStation(stationB) != null && brownObject.lookupStation(stationA) != null) {
											stationsObject.lake(stationA, stationB);
											
											// Green to green
										} else if (greenObject.lookupStation(stationB) != null && greenObject.lookupStation(stationA) != null) {
											stationsObject.lake(stationA, stationB);
											
											// Green to blue
										} else if (greenObject.lookupStation(stationB) != null && blueObject.lookupStation(stationA) != null) {
											stationsObject.lake(stationA, stationB);
											
											// Green to pink
										} else if (greenObject.lookupStation(stationB) != null && pinkObject.lookupStation(stationA) != null) {
											stationsObject.lake(stationA, stationB);
											
											// Green to orange
										} else if (greenObject.lookupStation(stationB) != null && orangeObject.lookupStation(stationA) != null) {
											stationsObject.lake(stationA, stationB);
											
											// Green to purple
										} else if (greenObject.lookupStation(stationB) != null && purpleObject.lookupStation(stationA) != null) {
											stationsObject.lake(stationA, stationB);
										} else {
											System.out.println("Station not found in " + second + " line");
										}
									
									
								} else if (second.equalsIgnoreCase("blue")) {
									if (blueObject.lookupStation(stationB) != null && redObject.lookupStation(stationA) != null) {
										stationsObject.lake(stationA, stationB);
											
											// Blue to Yellow
										} else if (blueObject.lookupStation(stationB) != null && yellowObject.lookupStation(stationA) != null) {
											stationsObject.yellow(stationA, stationB);
											
											// Blue to brown
										} else if (blueObject.lookupStation(stationB) != null && brownObject.lookupStation(stationA) != null) {
											stationsObject.lake(stationA, stationB);
											
											// Blue to green
										} else if (blueObject.lookupStation(stationB) != null && greenObject.lookupStation(stationA) != null) {
											stationsObject.lake(stationA, stationB);
											
											// Blue to blue
										} else if (blueObject.lookupStation(stationB) != null && blueObject.lookupStation(stationA) != null) {
											stationsObject.lake(stationA, stationB);
											
											// Blue to pink
										} else if (blueObject.lookupStation(stationB) != null && pinkObject.lookupStation(stationA) != null) {
											stationsObject.lake(stationA, stationB);
											
											// Blue to orange
										} else if (blueObject.lookupStation(stationB) != null && orangeObject.lookupStation(stationA) != null) {
											stationsObject.lake(stationA, stationB);
											
											// Blue to purple
										} else if (blueObject.lookupStation(stationB) != null && purpleObject.lookupStation(stationA) != null) {
											stationsObject.lake(stationA, stationB);
										} else {
											System.out.println("Station not found in " + second + " line");
										}
									
								} else if (second.equalsIgnoreCase("pink")) {
									if (pinkObject.lookupStation(stationB) != null && redObject.lookupStation(stationA) != null) {
										stationsObject.lake(stationA, stationB);
											
											// Pink to Yellow
										} else if (pinkObject.lookupStation(stationB) != null && yellowObject.lookupStation(stationA) != null) {
											stationsObject.yellow(stationA, stationB);
											
											// Pink to brown
										} else if (pinkObject.lookupStation(stationB) != null && brownObject.lookupStation(stationA) != null) {
											stationsObject.lake(stationA, stationB);
											
											// Pink to green
										} else if (pinkObject.lookupStation(stationB) != null && greenObject.lookupStation(stationA) != null) {
											stationsObject.lake(stationA, stationB);
											
											// Pink to blue
										} else if (pinkObject.lookupStation(stationB) != null && blueObject.lookupStation(stationA) != null) {
											stationsObject.lake(stationA, stationB);
											
											// Pink to pink
										} else if (pinkObject.lookupStation(stationB) != null && pinkObject.lookupStation(stationA) != null) {
											stationsObject.lake(stationA, stationB);
											
											// Pink to orange
										} else if (pinkObject.lookupStation(stationB) != null && orangeObject.lookupStation(stationA) != null) {
											stationsObject.lake(stationA, stationB);
											
											// Pink to purple
										} else if (pinkObject.lookupStation(stationB) != null && purpleObject.lookupStation(stationA) != null) {
											stationsObject.lake(stationA, stationB);
										} else {
											System.out.println("Station not found in " + second + " line");
										}
									
								} else if (second.equalsIgnoreCase("orange")) {
									if (orangeObject.lookupStation(stationB) != null && redObject.lookupStation(stationA) != null) {
										stationsObject.lake(stationA, stationB);
											
											// Orange to Yellow
										} else if (orangeObject.lookupStation(stationB) != null && yellowObject.lookupStation(stationA) != null) {
											stationsObject.yellow(stationA, stationB);
											
											// Orange to brown
										} else if (orangeObject.lookupStation(stationB) != null && brownObject.lookupStation(stationA) != null) {
											stationsObject.lake(stationA, stationB);
											
											// Orange to green
										} else if (orangeObject.lookupStation(stationB) != null && greenObject.lookupStation(stationA) != null) {
											stationsObject.lake(stationA, stationB);
											
											// Orange to blue
										} else if (orangeObject.lookupStation(stationB) != null && blueObject.lookupStation(stationA) != null) {
											stationsObject.lake(stationA, stationB);
											
											// Orange to pink
										} else if (orangeObject.lookupStation(stationB) != null && pinkObject.lookupStation(stationA) != null) {
											stationsObject.lake(stationA, stationB);
											
											// Orange to orange
										} else if (orangeObject.lookupStation(stationB) != null && orangeObject.lookupStation(stationA) != null) {
											stationsObject.lake(stationA, stationB);
											
											// Orange to purple
										} else if (orangeObject.lookupStation(stationB) != null && purpleObject.lookupStation(stationA) != null) {
											stationsObject.lake(stationA, stationB);
										} else {
											System.out.println("Station not found in " + second + " line");
										}
									
								} else if (second.equalsIgnoreCase("purple")) {
									if (purpleObject.lookupStation(stationB) != null && redObject.lookupStation(stationA) != null) {
										stationsObject.lake(stationA, stationB);
										
										// Purple to Yellow
									} else if (purpleObject.lookupStation(stationB) != null && yellowObject.lookupStation(stationA) != null) {
										stationsObject.yellow(stationA, stationB);
										
										// Purple to brown
									} else if (purpleObject.lookupStation(stationB) != null && brownObject.lookupStation(stationA) != null) {
										stationsObject.lake(stationA, stationB);
										
										// Purple to green
									} else if (purpleObject.lookupStation(stationB) != null && greenObject.lookupStation(stationA) != null) {
										stationsObject.lake(stationA, stationB);
										
										// Purple to blue
									} else if (purpleObject.lookupStation(stationB) != null && blueObject.lookupStation(stationA) != null) {
										stationsObject.lake(stationA, stationB);
										
										// Purple to pink
									} else if (purpleObject.lookupStation(stationB) != null && pinkObject.lookupStation(stationA) != null) {
										stationsObject.lake(stationA, stationB);
										
										// Purple to orange
									} else if (purpleObject.lookupStation(stationB) != null && orangeObject.lookupStation(stationA) != null) {
										stationsObject.lake(stationA, stationB);
										
										// Purple to purple
									} else if (purpleObject.lookupStation(stationB) != null && purpleObject.lookupStation(stationA) != null) {
										stationsObject.lake(stationA, stationB);
										
									} else {
										System.out.println("Station is not on entered CTA line");
									}
								}
						
								
								
								
								
	
						
						
						
						
						
						
						
						
						// Non-special cases
					
								
						// CTA line: Purple
						// Purple to Red
					} else if (purpleObject.lookupStation(stationA) != null && redObject.lookupStation(stationB) != null) {
						stationsObject.purpleToRed(stationA, stationB);
						
						// Purple to Yellow
					} else if (purpleObject.lookupStation(stationA) != null && yellowObject.lookupStation(stationB) != null) {
						stationsObject.purpleToYellow(stationA, stationB);
						
						// Purple to brown
					} else if (purpleObject.lookupStation(stationA) != null && brownObject.lookupStation(stationB) != null) {
						stationsObject.purpleToBrown(stationA, stationB);
						
						// Purple to green
					} else if (purpleObject.lookupStation(stationA) != null && greenObject.lookupStation(stationB) != null) {
						stationsObject.purpleToGreen(stationA, stationB);
						
						// Purple to blue
					} else if (purpleObject.lookupStation(stationA) != null && blueObject.lookupStation(stationB) != null) {
						stationsObject.purpleToBlue(stationA, stationB);
						
						// Purple to pink
					} else if (purpleObject.lookupStation(stationA) != null && pinkObject.lookupStation(stationB) != null) {
						stationsObject.purpleToPink(stationA, stationB);
						
						// Purple to orange
					} else if (purpleObject.lookupStation(stationA) != null && orangeObject.lookupStation(stationB) != null) {
						stationsObject.purpleToOrange(stationA, stationB);
						
						// Purple to purple
					} else if (purpleObject.lookupStation(stationA) != null && purpleObject.lookupStation(stationB) != null) {
						stationsObject.purpleToPurple(stationA, stationB);
						
						
						
						// CTA line: Green
						 // Green to red
					   } else if (greenObject.lookupStation(stationA) != null && redObject.lookupStation(stationB) != null) {
					     stationsObject.GreenToRed(stationA, stationB);
							
							// Green to Yellow
						} else if (greenObject.lookupStation(stationA) != null && yellowObject.lookupStation(stationB) != null) {
							stationsObject.GreenToYellow(stationA, stationB);
							
							// Green to brown
						} else if (greenObject.lookupStation(stationA) != null && brownObject.lookupStation(stationB) != null) {
							stationsObject.GreenToBrown(stationA, stationB);
							
							// Green to green
						} else if (greenObject.lookupStation(stationA) != null && greenObject.lookupStation(stationB) != null) {
							stationsObject.GreenToGreen(stationA, stationB);
							
							// Green to blue
						} else if (greenObject.lookupStation(stationA) != null && blueObject.lookupStation(stationB) != null) {
							stationsObject.GreenToBlue(stationA, stationB);
							
							// Green to pink
						} else if (greenObject.lookupStation(stationA) != null && pinkObject.lookupStation(stationB) != null) {
							stationsObject.GreenToPink(stationA, stationB);
							
							// Green to orange
						} else if (greenObject.lookupStation(stationA) != null && orangeObject.lookupStation(stationB) != null) {
							stationsObject.GreenToOrange(stationA, stationB);
							
							// Green to purple
						} else if (greenObject.lookupStation(stationA) != null && purpleObject.lookupStation(stationB) != null) {
							stationsObject.GreenToPurple(stationA, stationB);
							
							
							
							// CTA line: red
							// Red to red
						 } else if (redObject.lookupStation(stationA) != null && redObject.lookupStation(stationB) != null) {
							 stationsObject.redToRed(stationA, stationB);
								
								// Red to Yellow
							} else if (redObject.lookupStation(stationA) != null && yellowObject.lookupStation(stationB) != null) {
								stationsObject.redToYellow(stationA, stationB);
								
								// Red to brown
							} else if (redObject.lookupStation(stationA) != null && brownObject.lookupStation(stationB) != null) {
								stationsObject.redToBrown(stationA, stationB);
								
								// Red to green
							} else if (redObject.lookupStation(stationA) != null && greenObject.lookupStation(stationB) != null) {
								stationsObject.redToGreen(stationA, stationB);
								
								// Red to blue
							} else if (redObject.lookupStation(stationA) != null && blueObject.lookupStation(stationB) != null) {
								stationsObject.redToBlue(stationA, stationB);
								
								// Red to pink
							} else if (redObject.lookupStation(stationA) != null && pinkObject.lookupStation(stationB) != null) {
								stationsObject.redToPink(stationA, stationB);
								
								// Red to orange
							} else if (redObject.lookupStation(stationA) != null && orangeObject.lookupStation(stationB) != null) {
								stationsObject.redToOrange(stationA, stationB);
								
								// Red to purple
							} else if (redObject.lookupStation(stationA) != null && purpleObject.lookupStation(stationB) != null) {
								stationsObject.redToPurple(stationA, stationB);
								
								
								
								
								// Blue to red
							}		else if (blueObject.lookupStation(stationA) != null && redObject.lookupStation(stationB) != null) {
								stationsObject.blueToRed(stationA, stationB);
									
									// Blue to Yellow
								} else if (blueObject.lookupStation(stationA) != null && yellowObject.lookupStation(stationB) != null) {
									stationsObject.blueToYellow(stationA, stationB);
									
									// Blue to brown
								} else if (blueObject.lookupStation(stationA) != null && brownObject.lookupStation(stationB) != null) {
									stationsObject.blueToBrown(stationA, stationB);
									
									// Blue to green
								} else if (blueObject.lookupStation(stationA) != null && greenObject.lookupStation(stationB) != null) {
									stationsObject.blueToGreen(stationA, stationB);
									
									// Blue to blue
								} else if (blueObject.lookupStation(stationA) != null && blueObject.lookupStation(stationB) != null) {
									stationsObject.blueToBlue(stationA, stationB);
									
									// Blue to pink
								} else if (blueObject.lookupStation(stationA) != null && pinkObject.lookupStation(stationB) != null) {
									stationsObject.blueToPink(stationA, stationB);
									
									// Blue to orange
								} else if (blueObject.lookupStation(stationA) != null && orangeObject.lookupStation(stationB) != null) {
									stationsObject.blueToOrange(stationA, stationB);
									
									// Blue to purple
								} else if (blueObject.lookupStation(stationA) != null && purpleObject.lookupStation(stationB) != null) {
									stationsObject.blueToPurple(stationA, stationB);
									
									
									
									// Orange to red
								}  else if (orangeObject.lookupStation(stationA) != null && redObject.lookupStation(stationB) != null) {
									stationsObject.orangeToRed(stationA, stationB);
										
										// Orange to Yellow
									} else if (orangeObject.lookupStation(stationA) != null && yellowObject.lookupStation(stationB) != null) {
										stationsObject.orangeToYellow(stationA, stationB);
										
										// Orange to brown
									} else if (orangeObject.lookupStation(stationA) != null && brownObject.lookupStation(stationB) != null) {
										stationsObject.orangeToBrown(stationA, stationB);
										
										// Orange to green
									} else if (orangeObject.lookupStation(stationA) != null && greenObject.lookupStation(stationB) != null) {
										stationsObject.orangeToGreen(stationA, stationB);
										
										// Orange to blue
									} else if (orangeObject.lookupStation(stationA) != null && blueObject.lookupStation(stationB) != null) {
										stationsObject.orangeToBlue(stationA, stationB);
										
										// Orange to pink
									} else if (orangeObject.lookupStation(stationA) != null && pinkObject.lookupStation(stationB) != null) {
										stationsObject.orangeToPink(stationA, stationB);
										
										// Orange to orange
									} else if (orangeObject.lookupStation(stationA) != null && orangeObject.lookupStation(stationB) != null) {
										stationsObject.orangeToOrange(stationA, stationB);
										
										// Orange to purple
									} else if (orangeObject.lookupStation(stationA) != null && purpleObject.lookupStation(stationB) != null) {
										stationsObject.orangeToPurple(stationA, stationB);
										
										
										
										
										//Pink to red
									}  else if (pinkObject.lookupStation(stationA) != null && redObject.lookupStation(stationB) != null) {
										stationsObject.pinkToRed(stationA, stationB);
											
											// Pink to Yellow
										} else if (pinkObject.lookupStation(stationA) != null && yellowObject.lookupStation(stationB) != null) {
											stationsObject.pinkToYellow(stationA, stationB);
											
											// Pink to brown
										} else if (pinkObject.lookupStation(stationA) != null && brownObject.lookupStation(stationB) != null) {
											stationsObject.pinkToBrown(stationA, stationB);
											
											// Pink to green
										} else if (pinkObject.lookupStation(stationA) != null && greenObject.lookupStation(stationB) != null) {
											stationsObject.pinkToBlue(stationA, stationB);
											
											// Pink to blue
										} else if (pinkObject.lookupStation(stationA) != null && blueObject.lookupStation(stationB) != null) {
											stationsObject.pinkToGreen(stationA, stationB);
											
											// Pink to pink
										} else if (pinkObject.lookupStation(stationA) != null && pinkObject.lookupStation(stationB) != null) {
											stationsObject.pinkToPink(stationA, stationB);
											
											// Pink to orange
										} else if (pinkObject.lookupStation(stationA) != null && orangeObject.lookupStation(stationB) != null) {
											stationsObject.pinkToOrange(stationA, stationB);
											
											// Pink to purple
										} else if (pinkObject.lookupStation(stationA) != null && purpleObject.lookupStation(stationB) != null) {
											stationsObject.pinkToPurple(stationA, stationB);
											
											
											
											
											// Brown to red
										} else if (brownObject.lookupStation(stationA) != null && redObject.lookupStation(stationB) != null) {
											stationsObject.brownToRed(stationA, stationB);
												
												// Brown to Yellow
											} else if (brownObject.lookupStation(stationA) != null && yellowObject.lookupStation(stationB) != null) {
												stationsObject.brownToYellow(stationA, stationB);
												
												// Brown to brown
											} else if (brownObject.lookupStation(stationA) != null && brownObject.lookupStation(stationB) != null) {
												stationsObject.brownToBrown(stationA, stationB);
												
												// Brown to green
											} else if (brownObject.lookupStation(stationA) != null && greenObject.lookupStation(stationB) != null) {
												stationsObject.brownToGreen(stationA, stationB);
												
												// Brown to blue
											} else if (brownObject.lookupStation(stationA) != null && blueObject.lookupStation(stationB) != null) {
												stationsObject.brownToBlue(stationA, stationB);
												
												// Brown to pink
											} else if (brownObject.lookupStation(stationA) != null && pinkObject.lookupStation(stationB) != null) {
												stationsObject.brownToPink(stationA, stationB);
												
												// Brown to orange
											} else if (brownObject.lookupStation(stationA) != null && orangeObject.lookupStation(stationB) != null) {
												stationsObject.brownToOrange(stationA, stationB);
												
												// Brown to purple
											} else if (brownObject.lookupStation(stationA) != null && purpleObject.lookupStation(stationB) != null) {
												stationsObject.brownToPurple(stationA, stationB);
												
												
												
												
												// Yellow to red
											}  else if (yellowObject.lookupStation(stationA) != null && redObject.lookupStation(stationB) != null) {
												stationsObject.yellowToRed(stationA, stationB);
													
													// Yellow to Yellow
												} else if (yellowObject.lookupStation(stationA) != null && yellowObject.lookupStation(stationB) != null) {
													stationsObject.yellowToYellow(stationA, stationB);
													
													// Yellow to brown
												} else if (yellowObject.lookupStation(stationA) != null && brownObject.lookupStation(stationB) != null) {
													stationsObject.yellowToBrown(stationA, stationB);
													
													// Yellow to green
												} else if (yellowObject.lookupStation(stationA) != null && greenObject.lookupStation(stationB) != null) {
													stationsObject.yellowToGreen(stationA, stationB);
													
													// Yellow to blue
												} else if (yellowObject.lookupStation(stationA) != null && blueObject.lookupStation(stationB) != null) {
													stationsObject.yellowToBlue(stationA, stationB);
													
													// Yellow to pink
												} else if (yellowObject.lookupStation(stationA) != null && pinkObject.lookupStation(stationB) != null) {
													stationsObject.yellowToPink(stationA, stationB);
												
													
													// Yellow to orange
												} else if (yellowObject.lookupStation(stationA) != null && orangeObject.lookupStation(stationB) != null) {
													stationsObject.yellowToOrange(stationA, stationB);
													
													// Yellow to purple
												} else if (yellowObject.lookupStation(stationA) != null && purpleObject.lookupStation(stationB) != null) {
													stationsObject.orangeToPurple(stationA, stationB);
												}
						
					
					
					System.out.println("");
					
				} else {
					
				}
			}
				
			sc.close();
			
			
		} catch(IOException e) {
			System.out.println("Error reading the file");
		}

	}

}
