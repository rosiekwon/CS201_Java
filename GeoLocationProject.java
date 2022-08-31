package project;

public class GeoLocationProject {
	
	
	// This class manage the latitude and longitude varibales
	// Also the calcDistance method is in this class

	
	// Instance variables
		private double lat;
		private double lng;

		
		// Default constructor
		public GeoLocationProject() {
			setLat(0);
			setLng(36);

		}
		
		// Non default constructors
		public GeoLocationProject(double lat, double lng) {
			setLat(lat);
			setLng(lng);
		}	
		
		//Mutators
		public void setLat(double lat) {
			this.lat = lat;
		}
		public void setLng(double lng) {
			this.lng = lng;
	}
		
		// Accessors (Getters)
		public double getLat() {
		return lat;
		}
		
		public double getLng() {
			return lng;
			}

		
		// toString method
		public String toString() {
			return lat + "," + lng;
			
		}
		
		// Return true if the latitude is between -90 and 90
		public boolean latRange() {
			if (lat >= -90 && lat <= 90)
				return true;
			else
				return false;
		}
		
		
		// Return true if longitude is -180 and 180
		public boolean lngRange() {
			if (lng >= -90 && lng <= 90)
				return true;
			else
				return false;
		}
	
		
		// equals method
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			GeoLocationProject other = (GeoLocationProject) obj;
			if (Double.doubleToLongBits(lat) != Double.doubleToLongBits(other.lat))
				return false;
			if (Double.doubleToLongBits(lng) != Double.doubleToLongBits(other.lng))
				return false;
			return true;
		}

				// calcDistance
				public double calcDistance(double lat1, double lng1) {
					return Math.sqrt(Math.pow(getLat() - lat1,2)+Math.pow(getLng() - lng1,2));
				}
				
				//calcDistance
				public double calcDistance(GeoLocationProject g) {
					return Math.sqrt(Math.pow(getLat()-g.getLat(),2)+Math.pow(getLng()-g.getLng(),2));
				}

}

