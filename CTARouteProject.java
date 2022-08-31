package project;

import java.util.ArrayList;

public class CTARouteProject extends CTAStationProject {
	
	
	
	// This class manage the generation of CTA Routes
	// The method to find stations is in this class
	// As well as all the methods required to generate the paths between the stations
	
	
	
	
	    // Instance variables
		private String name;
		private ArrayList<CTAStationProject> stops;
		
		
		// Default constructor
		
		public CTARouteProject() {
		super();
		name = "Station";
		stops = new ArrayList<CTAStationProject>();
		}
		
		// Non-default constructor
		public CTARouteProject(String name, ArrayList<CTAStationProject> stops) {
			setName(name);
			setStops(stops);
		}

		
		// Getters and Setters
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public ArrayList<CTAStationProject> getStops() {
			return stops;
		}

		public void setStops(ArrayList<CTAStationProject> stops) {
			this.stops = stops;
		}
		
		// to String method
		public String toString() {
			return name;
		}
		
		// equals method
		public boolean equals(CTARouteProject a) {
			if (!name.equals(a.getName())) {
				return false;
			} else {
				return true;
			}
		}
		
		
		
		//look up Station
		public CTAStationProject lookupStation(String name) {
			for (int i = 0; i<stops.size(); i++) {
				if(stops.get(i).getName().equals(name)) {
					return stops.get(i);
				}
					
			}
				return null;
		}
		
		
		
		
		
		// Methods to print the CTA routes between two stations
		// I did a series of methods that connect CTA line by CTA line
		
		
		//methods for CTA line: Purple
		
		// Purple to red
		public void purpleToRed(String stationA, String stationB) {
		System.out.println("Start: " + stationA + " (Purple line)");
		System.out.println("Transfer at: Howard");
		System.out.println("Finish: " + stationB + " (Red line)");
		}
		// Purple to yellow
		public void purpleToYellow(String stationA, String stationB) {
		System.out.println("Start: " + stationA + " (Purple line)");
		System.out.println("Transfer at: Howard");
		System.out.println("Finish: " + stationB + " (Yellow line)");
		}
		// Purple to brown
		public void purpleToBrown(String stationA, String stationB) {
			System.out.println("Start: " + stationA + " (Purple line)");
			System.out.println("Transfer at: Belmont");
			System.out.println("Finish: " + stationB + " (Brown line)");
		}
		// Purple to green
		public void purpleToGreen(String stationA, String stationB) {
		System.out.println("Start: " + stationA + " (Purple line)");
		System.out.println("Transfer at: Adams/Wabash");
		System.out.println("Finish: " + stationB + " (Green line)");
		}
		// Purple to blue
		public void purpleToBlue(String stationA, String stationB) {
		System.out.println("Start: " + stationA + " (Purple line)");
		System.out.println("Transfer at: Clark/Lake");
		System.out.println("Finish: " + stationB + " (Blue line)");
		}
		// Purple to pink
		public void purpleToPink(String stationA, String stationB) {
		System.out.println("Start: " + stationA + " (Purple line)");
		System.out.println("Transfer at: Clark/Lake");
		System.out.println("Finish: " + stationB + " (Pink line)");
		}
		// Purple to orange
		public void purpleToOrange(String stationA, String stationB) {
		System.out.println("Start: " + stationA + " (Purple line)");
		System.out.println("Transfer at: Clark/Lake");
		System.out.println("Finish: " + stationB + " (Orange line)");
		}
		// Purple to purple
		public void purpleToPurple(String stationA, String stationB) {
		System.out.println("Start: " + stationA + " (Purple line)");
		System.out.println("Finish: " + stationB + " (Purple line)");
		}
		
		
		// Methods for CTA line: Green line
		
		// Green to red
		public void GreenToRed(String stationA, String stationB) {
			 System.out.println("Start: " + stationA + " (Green line)");
		     System.out.println("Transfer at: Roosevelt");
		     System.out.println("Finish: " + stationB + " (Red line)");
		}
		// Green to yellow
		public void GreenToYellow(String stationA, String stationB) {
		System.out.println("Start: " + stationA + " (Green line)");
		System.out.println("Transfer at: Roosevelt to Red line");
		System.out.println("Transfer at: Howard");
		System.out.println("Finish: " + stationB + " (Yellow line)");
		}
		// Green to brown
		public void GreenToBrown(String stationA, String stationB) {
		System.out.println("Start: " + stationA + " (Green line)");
		System.out.println("Transfer at: Adams/Wabash");
		System.out.println("Finish: " + stationB + " (Brown line)");
		}
		// Green to green
		public void GreenToGreen(String stationA, String stationB) {
		System.out.println("Start: " + stationA + " (Green line)");
		System.out.println("Finish: " + stationB + " (Green line)");
		}
		// Green to blue
		public void GreenToBlue(String stationA, String stationB) {
		System.out.println("Start: " + stationA + " (Green line)");
		System.out.println("Transfer at: Clark/Lake");
		System.out.println("Finish: " + stationB + " (Blue line)");
		}
		// Green to pink
		public void GreenToPink(String stationA, String stationB) {
		System.out.println("Start: " + stationA + " (Green line)");
		System.out.println("Transfer at: Clark/Lake");
		System.out.println("Finish: " + stationB + " (Pink line)");
		}
		// Green to orange
		public void GreenToOrange(String stationA, String stationB) {
		System.out.println("Start: " + stationA + " (Green line)");
		System.out.println("Transfer at: Clark/Lake");
		System.out.println("Finish: " + stationB + " (Orange line)");
		}
		// Green to purple
	    public void GreenToPurple(String stationA, String stationB) {
		System.out.println("Start: " + stationA + " (Green line)");
		System.out.println("Transfer at: Adams/Wabash");
		System.out.println("Finish: " + stationB + " (Purple line)");
	    }
	    
	    
	    
	    
	    // Methods for CTA line: Red line
	    
	    // Red to red
	    public void redToRed(String stationA, String stationB) {
	    	System.out.println("Start: " + stationA + " (Red line)");
		    System.out.println("Finish: " + stationB + " (Red line)");
	    }
	    // red to yellow
	    public void redToYellow(String stationA, String stationB) {
	    System.out.println("Start: " + stationA + " (Red line)");
		System.out.println("Transfer at: Howard");
		System.out.println("Finish: " + stationB + " (Yellow line)");
	    }
	    // red to brown
	    public void redToBrown(String stationA, String stationB) {
	    System.out.println("Start: " + stationA + " (Red line)");
		System.out.println("Transfer at: Fullerton");
		System.out.println("Finish: " + stationB + " (Brown line)");
	    }
	    // red to green
	    public void redToGreen(String stationA, String stationB) {
	    System.out.println("Start: " + stationA + " (Red line)");
	     System.out.println("Transfer at: Roosevelt");
		System.out.println("Finish: " + stationB + " (Green line)");
	    }
	    // red to blue
	    public void redToBlue(String stationA, String stationB) {
	    System.out.println("Start: " + stationA + " (Red line)");
		System.out.println("Transfer at: Lake");
		System.out.println("Finish: " + stationB + " (Blue line)");
	    }
	    // red to pink
	    public void redToPink(String stationA, String stationB) {
	    System.out.println("Start: " + stationA + " (Red line)");
		System.out.println("Transfer at: Lake");
		System.out.println("Finish: " + stationB + " (Pink line)");
	    }
	    // red to orange
	    public void redToOrange(String stationA, String stationB) {
	    System.out.println("Start: " + stationA + " (Red line)");
		System.out.println("Transfer at: Roosevelt");
		System.out.println("Finish: " + stationB + " (Orange line)");
	    }
	    // red to purple
	    public void redToPurple(String stationA, String stationB) {
	    System.out.println("Start: " + stationA + " (Red line)");
		System.out.println("Transfer at: Belmont");
		System.out.println("Finish: " + stationB + " (Purple line)");
	    }
	    
	    
	    // Methods for CTA line: Blue line
	    
	    // blue to red
	    public void blueToRed(String stationA, String stationB) {
	    System.out.println("Start: " + stationA + " (Blue line)");
		 System.out.println("Transfer at: Lake");
	     System.out.println("Finish: " + stationB + " (Red line)");
	    }
	    // Blue to yellow
	    public void blueToYellow(String stationA, String stationB) {
	    System.out.println("Start: " + stationA + " (Blue line)");
		System.out.println("Transfer at: Lake to Red Line");
		System.out.println("Transfer at: Howard");
		System.out.println("Finish: " + stationB + " (Yellow line)");
	    }
	    // blue to brown
	    public void blueToBrown(String stationA, String stationB) {
	    System.out.println("Start: " + stationA + " (Blue line)");
		System.out.println("Transfer at: Fullerton");
		System.out.println("Finish: " + stationB + " (Brown line)");
	    }
	    // blue to green
	    public void blueToGreen(String stationA, String stationB) {
	    System.out.println("Start: " + stationA + " (Blue line)");
	     System.out.println("Transfer at: Clark/Lake");
		System.out.println("Finish: " + stationB + " (Green line)");
	    }
	    // BLue to blue
	    public void blueToBlue(String stationA, String stationB) {
	    System.out.println("Start: " + stationA + " (Blue line)");
		System.out.println("Finish: " + stationB + " (Blue line)");
	    }
	    // blue to pink
	    public void blueToPink(String stationA, String stationB) {
	    System.out.println("Start: " + stationA + " (Blue line)");
		System.out.println("Transfer at: Clark/Lake");
		System.out.println("Finish: " + stationB + " (Pink line)");
	    }
	    // blue to orange
	    public void blueToOrange(String stationA, String stationB) {
	    System.out.println("Start: " + stationA + " (Blue line)");
		System.out.println("Transfer at: Clark/Lake");
		System.out.println("Finish: " + stationB + " (Orange line)");
	    } 
	    // blue to purple
	    public void blueToPurple(String stationA, String stationB) {
	    System.out.println("Start: " + stationA + " (Blue line)");
		System.out.println("Transfer at: Clark/Lake");
		System.out.println("Finish: " + stationB + " (Purple line)");
	    }
		
	    
	    
	    
	    // CTA line: Orange
	    
	    // orange to red
	    public void orangeToRed(String stationA, String stationB) {
	    System.out.println("Start: " + stationA + " (Orange line)");
		 System.out.println("Transfer at: Roosevelt");
	     System.out.println("Finish: " + stationB + " (Red line)");
	    }
	    // Orange to yellow
	    public void orangeToYellow(String stationA, String stationB) {
	    System.out.println("Start: " + stationA + " (Orange line)");
		System.out.println("Transfer at: Roosevelt to Red Line");
		System.out.println("Transfer at: Howard");
		System.out.println("Finish: " + stationB + " (Yellow line)"); 
	    } 
	    // Orange to brown
	    public void orangeToBrown(String stationA, String stationB) {
	    System.out.println("Start: " + stationA + " (Orange line)");
		System.out.println("Transfer at: Adams/Wabash");
		System.out.println("Finish: " + stationB + " (Brown line)");
	    } 
	    // orange to green
	    public void orangeToGreen(String stationA, String stationB) {
	    	System.out.println("Start: " + stationA + " (Orange line)");
		     System.out.println("Transfer at: Clark/Lake");
			System.out.println("Finish: " + stationB + " (Green line)");
	    }
	    // orange to blue
	    public void orangeToBlue(String stationA, String stationB) {
	    	System.out.println("Start: " + stationA + " (Orange line)");
			System.out.println("Transfer at: Clark/Lake");
			System.out.println("Finish: " + stationB + " (Blue line)");
	    }
	    // orange to pink
	    public void orangeToPink(String stationA, String stationB) {
	    	System.out.println("Start: " + stationA + " (Orange line)");
			System.out.println("Transfer at: Clark/Lake");
			System.out.println("Finish: " + stationB + " (Pink line)");
	    }
	    // orange to orange
	    public void orangeToOrange(String stationA, String stationB) {
	    	System.out.println("Start: " + stationA + " (Orange line)");
			System.out.println("Finish: " + stationB + " (Orange line)");
	    }
	    // orange to purple
	    public void orangeToPurple(String stationA, String stationB) {
	    	System.out.println("Start: " + stationA + " (Orange line)");
			System.out.println("Transfer at: Clark/Lake");
			System.out.println("Finish: " + stationB + " (Purple line)");
	    }
	    
	    
	    
	    
	    // Methods for CTA line: Pink
	    
	    // pink to red
	    public void pinkToRed(String stationA, String stationB) {
	    	 System.out.println("Start: " + stationA + " (Pink line)");
			 System.out.println("Transfer at: Lake");
		     System.out.println("Finish: " + stationB + " (Red line)");
	    }
	    // pink to yellow
       public void pinkToYellow(String stationA, String stationB) {
    	   System.out.println("Start: " + stationA + " (Pink line)");
			System.out.println("Transfer at: Lake to Red Line");
			System.out.println("Transfer at: Howard");
			System.out.println("Finish: " + stationB + " (Yellow line)");
	    }
	    // pink to brown
       public void pinkToBrown(String stationA, String stationB) {
    	   System.out.println("Start: " + stationA + " (Pink line)");
			System.out.println("Transfer at: Adams/Wabash");
			System.out.println("Finish: " + stationB + " (Brown line)");
	    }
	    // pink to green
       public void pinkToGreen(String stationA, String stationB) {
    	   System.out.println("Start: " + stationA + " (Pink line)");
		     System.out.println("Transfer at: Clark/Lake");
			System.out.println("Finish: " + stationB + " (Green line)");
	    }
	    // pink to blue
       public void pinkToBlue(String stationA, String stationB) {
    	   System.out.println("Start: " + stationA + " (Pink line)");
			System.out.println("Transfer at: Clark/Lake");
			System.out.println("Finish: " + stationB + " (Blue line)");
	    }
	    // pink to pink
       public void pinkToPink(String stationA, String stationB) {
    	   System.out.println("Start: " + stationA + " (Pink line)");
			System.out.println("Finish: " + stationB + " (Pink line)");
	    }
	    // pink to orange
       public void pinkToOrange(String stationA, String stationB) {
    	   System.out.println("Start: " + stationA + " (Pink line)");
			System.out.println("Transfer at: Clark/Lake");
			System.out.println("Finish: " + stationB + " (Orange line)");
	    }
	    // pink to purple
       public void pinkToPurple(String stationA, String stationB) {
    	   System.out.println("Start: " + stationA + " (Pink line)");
			System.out.println("Transfer at: Clark/Lake");
			System.out.println("Finish: " + stationB + " (Purple line)");
	    }
       
       
       
       // Method for CTA line: purple
    // Brown to red
     public void brownToRed(String stationA, String stationB) {
     System.out.println("Start: " + stationA + " (Brown line)");
	 System.out.println("Transfer at: Fullerton");
     System.out.println("Finish: " + stationB + " (Red line)");
     }
		// Brown to Yellow
     public void brownToYellow(String stationA, String stationB) {
		System.out.println("Start: " + stationA + " (Brown line)");
		System.out.println("Transfer at: Belmont to Red Line");
		System.out.println("Transfer at: Howard");
		System.out.println("Finish: " + stationB + " (Yellow line)");
     }
		// Brown to brown
		public void brownToBrown(String stationA, String stationB) {
		System.out.println("Start: " + stationA + " (Brown line)");
		System.out.println("Finish: " + stationB + " (Brown line)");
		}
		// Brown to green
		public void brownToGreen(String stationA, String stationB) {
		System.out.println("Start: " + stationA + " (Brown line)");
	     System.out.println("Transfer at: Adams/Wabash");
		System.out.println("Finish: " + stationB + " (Green line)");
		}
		// Brown to blue
		public void brownToBlue(String stationA, String stationB) {
		System.out.println("Start: " + stationA + " (Brown line)");
		System.out.println("Transfer at: Clark/Lake");
		System.out.println("Finish: " + stationB + " (Blue line)");
		}
		// Brown to pink
		public void brownToPink(String stationA, String stationB) {
		System.out.println("Start: " + stationA + " (Brown line)");
		System.out.println("Transfer at: Washington/Wells");
		System.out.println("Finish: " + stationB + " (Pink line)");
		}
		// Brown to orange
		public void brownToOrange(String stationA, String stationB) {
		System.out.println("Start: " + stationA + " (Brown line)");
		System.out.println("Transfer at: Washington/Wells");
		System.out.println("Finish: " + stationB + " (Orange line)");
		}
		// Brown to purple
		public void brownToPurple(String stationA, String stationB) {
		System.out.println("Start: " + stationA + " (Brown line)");
		System.out.println("Transfer at: Washington/Wells");
		System.out.println("Finish: " + stationB + " (Purple line)");
		}
		
		
		
		// CTA line: yellow
		// Yellow to red
      public void yellowToRed(String stationA, String stationB) {
      System.out.println("Start: " + stationA + " (Yellow line)");
	  System.out.println("Transfer at: Howard");
      System.out.println("Finish: " + stationB + " (Red line)");
       }
		// Yellow to Yellow
      public void yellowToYellow(String stationA, String stationB) {
		System.out.println("Start: " + stationA + " (Yellow line)");
		System.out.println("Finish: " + stationB + " (Yellow line)");
      }
		
		// Yellow to brown
      public void yellowToBrown(String stationA, String stationB) {
		System.out.println("Start: " + stationA + " (Yellow line)");
		System.out.println("Transfer at: Howard to Purple Line");
		System.out.println("Transfer at: Belmont");
		System.out.println("Finish: " + stationB + " (Brown line)");
      }
		
		// Yellow to green
      public void yellowToGreen(String stationA, String stationB) {
		System.out.println("Start: " + stationA + " (Yellow line)");
		System.out.println("Transfer at: Howard to Purple Line");
		System.out.println("Transfer at: Clark/Lake");
		System.out.println("Finish: " + stationB + " (Green line)");
      }
		
		// Yellow to blue
      public void yellowToBlue(String stationA, String stationB) {
		System.out.println("Start: " + stationA + " (Yellow line)");
		System.out.println("Transfer at: Howard to Purple Line");
		System.out.println("Transfer at: Clark/Lake");
		System.out.println("Finish: " + stationB + " (Blue line)");
      }
		
		// Yellow to pink
      public void yellowToPink(String stationA, String stationB) {
		System.out.println("Start: " + stationA + " (Yellow line)");
		System.out.println("Transfer at: Howard to Purple Line");
		System.out.println("Transfer at: Clark/Lake");
		System.out.println("Finish: " + stationB + " (Pink line)");
      }
		
		// Yellow to orange
      public void yellowToOrange(String stationA, String stationB) {
		System.out.println("Start: " + stationA + " (Yellow line)");
		System.out.println("Transfer at: Howard to Purple Line");
		System.out.println("Transfer at: Clark/Lake");
		System.out.println("Finish: " + stationB + " (Orange line)");
      }
		
		// Yellow to purple
      public void yellowToPurple(String stationA, String stationB) {
		System.out.println("Start: " + stationA + " (Yellow line)");
		System.out.println("Transfer at: Howard");
		System.out.println("Finish: " + stationB + " (Purple line)");
	}
      
      
      // Many stations arrive to lake therefore it is easier to create its own method
      // Special case
      public void lake(String stationA, String stationB) {
    	  System.out.println("Start: " + stationA );
  		System.out.println("Transfer at: Lake");
  		System.out.println("Finish: " + stationB );
      }
      
      // Yellow line special case
      public void yellow(String stationA, String stationB) {
    	  System.out.println("Start: " + stationA);
    	  System.out.println("Transfer at: Howard to Purple line");
    	  System.out.println("Transfer at: Lake");
    	  System.out.println("Finish: " + stationB);
      }
	
		
		

}

