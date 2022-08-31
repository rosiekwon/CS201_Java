package project;

public class CTAStationProject extends GeoLocationProject {
	
	
	// This class manage the properties of each station individually
	
	// I created variables for each element of the CTA Station
	// Also I created an instance variable for each CTA line to organize the stations easier in the app
	
	
	// Instance variables
	private String name;
	private String location;
	private boolean wheelchair;
	private int red;
	private int green;
	private int blue;
	private int brown;
	private int purple;
	private int pink;
	private int orange;
	private int yellow;
	
	
	
	// Default constructor
	public CTAStationProject() {
			super();
			name = "Station";
			wheelchair = true;
			location = "elevated";
			red = -1;
			green = -1;
			blue = -1;
			brown = -1;
			purple = -1;
			pink = -1;
			orange = -1;
			yellow = -1;
		}
	
	
	// Non-default constructor
	public CTAStationProject(String name, double lat, double lng, String location, boolean wheelchair, int red, int green, int blue, int brown, int purple, int pink, int orange, int yellow) {
		super(lat,lng);
		setName(name);
		setLocation(location);
		this.wheelchair = wheelchair;
		setRed(red);
		setGreen(green);
		setBlue(blue);
		setBrown(brown);
		setPurple(purple);
		setPink(pink);
		setOrange(orange);
		setYellow(yellow);
	}
	
	// Getteres and Setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public boolean isWheelchair() {
		return wheelchair;
	}

	public void setWheelchair(boolean wheelchair) {
		this.wheelchair = wheelchair;
	}

	public int getRed() {
		return red;
	}

	public void setRed(int red) {
		this.red = red;
	}

	public int getGreen() {
		return green;
	}

	public void setGreen(int green) {
		this.green = green;
	}

	public int getBlue() {
		return blue;
	}

	public void setBlue(int blue) {
		this.blue = blue;
	}

	public int getBrown() {
		return brown;
	}

	public void setBrown(int brown) {
		this.brown = brown;
	}

	public int getPurple() {
		return purple;
	}

	public void setPurple(int purple) {
		this.purple = purple;
	}

	public int getPink() {
		return pink;
	}

	public void setPink(int pink) {
		this.pink = pink;
	}

	public int getOrange() {
		return orange;
	}

	public void setOrange(int orange) {
		this.orange = orange;
	}

	public int getYellow() {
		return yellow;
	}

	public void setYellow(int yellow) {
		this.yellow = yellow;
	}
	
	

	// toString method
	public String toString() {
		return name + " (" + super.getLat() + ", " + super.getLng() + ") " + "Wheelchair access: " + wheelchair + ", " + "location: " + location;
	}

	
	// equals method
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		CTAStationProject other = (CTAStationProject) obj;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (wheelchair != other.wheelchair)
			return false;
		return true;
	}
	
	
	

}
